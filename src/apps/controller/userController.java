/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;

import apps.model.Conexao;
import br.com.bytecare.assistenciatecnica.turma472.telas.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        user.getCampoNomeUser().setText(null);
        user.getCampoFoneUser().setText(null);
        user.getCampoSenhaUser().setText(null);
        user.getCampoLoginUser().setText(null);
        //desativar campos
        user.getEditUser().setEnabled(false);
        user.getRemoveUser().setEnabled(false);
    }        
    
    public void addUser() throws SQLException{
        String nome = user.getCampoNomeUser().getText();
        String fone = user.getCampoFoneUser().getText();
        String senha = user.getCampoSenhaUser().getText();
        String login = user.getCampoLoginUser().getText();
        String perfil = user.getCampoPerfilUser().getSelectedItem().toString();
        try(PreparedStatement pst = conexao.prepareStatement("insert into usuarios (nome_usuario, fone_usuario, senha_usuario, login_usuario, adm) values(?, ?, ?, ?, ?)")){
            pst.setString(1, nome);
            pst.setString(2, fone);
            pst.setString(3, senha);
            pst.setString(4, login);
            pst.setString(5, perfil);
            pst.executeQuery();
            if(nome.isEmpty() || senha.isEmpty() || login.isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            }else{
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    try(PreparedStatement stmt = conexao.prepareStatement("select id_usuario from usuarios where nome_usuario=? and fone_usuario=? and senha_usuario=? and login_usuario=? and adm=?;")){
                        stmt.setString(1, nome);
                        stmt.setString(2, fone);
                        stmt.setString(3, senha);
                        stmt.setString(4, login);
                        stmt.setString(5, perfil);
                        String idUser = rs.getString(1);
                        pst.executeQuery();
                        JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso comm id: "+idUser);
                    }
                    
                    limparCampos();
                }
            }
        }
    }
    
    public void pesquisarUser() throws SQLException{
        String inputIdUser = JOptionPane.showInputDialog("Id do Usuario: ");
        System.out.println(inputIdUser);
        try(PreparedStatement pst = conexao.prepareStatement("SELECT * FROM public.usuarios where id_usuario=?;;")){
            pst.setString(1, inputIdUser);
            //rs=pst.executeQuery();
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
                user.getAddUser().setEnabled(false);
                user.getPesquisarUser().setEnabled(false);
                user.getEditUser().setEnabled(true);
                user.getRemoveUser().setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            }
        }catch (Exception e2){
            JOptionPane.showMessageDialog(null, e2);
        }
    }
    
    public void editUser() throws SQLException{
        String idUser = user.getCampoUserId().getText();
        String nome = user.getCampoNomeUser().getText();
        String fone = user.getCampoFoneUser().getText();
        String senha = user.getCampoSenhaUser().getText();
        String login = user.getCampoLoginUser().getText();
        String perfil = user.getCampoPerfilUser().getSelectedItem().toString();
        try(PreparedStatement pst = conexao.prepareStatement("update usuarios set nome_usuario=?, fone_usuario=?, senha_usuario=?, login_usuario=?, adm=? where id_usuario=?")){
            pst.setString(1, nome);
            pst.setString(2, fone);
            pst.setString(3, senha);
            pst.setString(4, login);
            pst.setString(5, perfil);
            pst.setString(6, idUser);
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
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    
    public void removeUser(){
        String idUser = user.getCampoUserId().getText();
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este usuário?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){
            try(PreparedStatement pst = conexao.prepareStatement("delete * from usuario where id_usuario=?")){
                pst.setString(1, idUser);
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