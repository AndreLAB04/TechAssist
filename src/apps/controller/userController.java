/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;

import apps.model.Conexao;
import br.com.bytecare.assistenciatecnica.turma472.telas.*;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andmi
 */
public class userController {
    Connection conexao = Conexao.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    private final telaUsers user;

    public userController(telaUsers user) {
        this.user = user;
    }
    
    public void limparCampos(){
        //limpar campos
        user.getCampoUserId().setText(null);
        user.getCampoNomeUser().setText(null);
        user.getCampoFoneUser().setText(null);
        user.getCampoSenhaUser().setText(null);
        user.getCampoLoginUser().setText(null);
        //desativar campos
        user.getButEditUser().setEnabled(false);
        user.getButRemoveUser().setEnabled(false);
        user.getButAddUser().setEnabled(true);
        user.getButPesquisarUser().setEnabled(true);
    }        
    
    public void addUser() throws SQLException{
        String nome = user.getCampoNomeUser().getText();
        String fone = user.getCampoFoneUser().getText();
        String senha = user.getCampoSenhaUser().getText();
        String login = user.getCampoLoginUser().getText();
        String perfil = user.getCampoPerfilUser().getSelectedItem().toString();
        if(nome.isEmpty() || senha.isEmpty() || login.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        }else{
            try(PreparedStatement pst = conexao.prepareStatement("insert into usuarios (nome_usuario, fone_usuario, senha_usuario, login_usuario, perfil) values(?, ?, ?, ?, ?)")){
                pst.setString(1, nome);
                pst.setString(2, fone);
                pst.setString(3, senha);
                pst.setString(4, login);
                pst.setString(5, perfil);
                //System.out.println("Chegou até aq");
                int adicionado = pst.executeUpdate();
                //System.out.println("Chegou até aq2");
                if (adicionado > 0) {
                    //System.out.println("Chegou até aq tbm3");
                    JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
                    limparCampos();
                }
            }catch (SQLIntegrityConstraintViolationException e1) {
                JOptionPane.showMessageDialog(null, "Login em uso.\nEscolha outro login.");
                user.getCampoLoginUser().setText(null);
                user.getCampoLoginUser().requestFocus();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    public void pesquisarUser() throws SQLException{
        int inputIdUser = Integer.parseInt(user.getCampoUserId().getText());
        System.out.println(inputIdUser);
        try(PreparedStatement pst = conexao.prepareStatement("SELECT id_usuario, nome_usuario, fone_usuario, senha_usuario, login_usuario, perfil FROM public.usuarios where id_usuario=?;")){
            pst.setInt(1, inputIdUser);
            rs=pst.executeQuery();
            if(rs.next()){
                user.getCampoUserId().setText(rs.getString(1));
                user.getCampoNomeUser().setText(rs.getString(2));
                user.getCampoFoneUser().setText(rs.getString(3));
                user.getCampoSenhaUser().setText(rs.getString(4));
                user.getCampoLoginUser().setText(rs.getString(5));
                String adm = rs.getString(6);
                if(adm.equals("Admin")){
                    user.getCampoPerfilUser().setSelectedItem("Admin");
                }else{
                    user.getCampoPerfilUser().setSelectedItem("User");
                }
                
                user.getButAddUser().setEnabled(false);
                user.getButPesquisarUser().setEnabled(false);
                user.getButEditUser().setEnabled(true);
                user.getButRemoveUser().setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            }
        }catch (Exception e2){
            JOptionPane.showMessageDialog(null, e2);
        }
    }
    
    public void editUser() throws SQLException{
        int idUser = Integer.parseInt(user.getCampoUserId().getText());
        String nome = user.getCampoNomeUser().getText();
        String fone = user.getCampoFoneUser().getText();
        String senha = user.getCampoSenhaUser().getText();
        String login = user.getCampoLoginUser().getText();
        String perfil = user.getCampoPerfilUser().getSelectedItem().toString();
        try(PreparedStatement pst = conexao.prepareStatement("update usuarios set nome_usuario=?, fone_usuario=?, senha_usuario=?, login_usuario=?, perfil=? where id_usuario=?;")){
            pst.setString(1, nome);
            pst.setString(2, fone);
            pst.setString(3, senha);
            pst.setString(4, login);
            pst.setString(5, perfil);
            pst.setInt(6, idUser);
            if(nome.isEmpty() || senha.isEmpty() || login.isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
                    limparCampos();
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void removeUser(){
        int idUser = Integer.parseInt(user.getCampoUserId().getText());
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este usuário?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){
            try(PreparedStatement pst = conexao.prepareStatement("delete from usuarios where id_usuario=?")){
                pst.setInt(1, idUser);
                int apagado = pst.executeUpdate();
                if(apagado>0){
                    JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
                    limparCampos();                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(osController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}