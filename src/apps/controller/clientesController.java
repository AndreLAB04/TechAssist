/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;
import apps.model.Conexao;
import java.sql.*;
import br.com.bytecare.assistenciatecnica.turma472.telas.*;
import java.awt.HeadlessException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author andmi
 */
public class clientesController {
    Connection conexao = Conexao.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    private final telaCliente cli;
    
    public clientesController(telaCliente cli) {
        this.cli = cli;
    }
    
    public void limparCampos(){
        cli.getCampoNomeCli().setText(null);
        cli.getCampoEnderCli().setText(null);
        cli.getCampoFoneCli().setText(null);
        cli.getCampoEmailCli().setText(null);
        cli.getBtnRemoveCliente().setEnabled(false);
        cli.getBtnEditCliente().setEnabled(false);
        cli.getBtnAddClient().setEnabled(true);
    }
    
    public void addCliente(){
        String nome = cli.getCampoNomeCli().getText();
        String endereco = cli.getCampoEnderCli().getText();
        String fone = cli.getCampoFoneCli().getText();
        String email = cli.getCampoEmailCli().getText();
        if(nome.isEmpty() || fone.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        }else{
            try(PreparedStatement pst = conexao.prepareStatement("INSERT INTO clientes(nome_cliente, endereco_cliente, fone_cliente, email_cliente) VALUES (?, ?, ?, ?);")){
                pst.setString(1, nome);
                pst.setString(2, endereco);
                //System.out.println("E: "+endereco);
                pst.setString(3, fone);
                //System.out.println("F: "+fone);
                pst.setString(4, email);
                //System.out.println("Chegou até aq");
                int adicionado = pst.executeUpdate();
                //System.out.println("Chegou até aq2");
                if (adicionado > 0) {
                    //System.out.println("Chegou até aq tbm3");
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                    limparCampos();
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    public void pesquisarClientes(){
        String cliente = cli.getCampoNomeCli().getText();
        try(PreparedStatement pst = conexao.prepareStatement("select id_cliente as Id, nome_cliente as Nome, endereco_cliente as Endereco, fone_cliente as Fone, email_cliente as Email from clientes where nome_cliente like ?")){
            pst.setString(1, cliente + "%");
            rs = pst.executeQuery();
            cli.getTabelaClientes().setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void setarCampos(){
        int setar = cli.getTabelaClientes().getSelectedRow();
        cli.getCampoNomeCli().setText(cli.getTabelaClientes().getModel().getValueAt(setar, 1).toString());
        cli.getCampoEnderCli().setText(cli.getTabelaClientes().getModel().getValueAt(setar, 2).toString());
        cli.getCampoFoneCli().setText(cli.getTabelaClientes().getModel().getValueAt(setar, 3).toString());
        cli.getCampoEmailCli().setText(cli.getTabelaClientes().getModel().getValueAt(setar, 4).toString());
        cli.getBtnAddClient().setEnabled(false);
        cli.getBtnEditCliente().setEnabled(true);
        cli.getBtnRemoveCliente().setEnabled(true);
    }
    
    public void editCliente() throws SQLException{
        String nome = cli.getCampoNomeCli().getText();
        String endereco = cli.getCampoEnderCli().getText();
        String fone = cli.getCampoFoneCli().getText();
        String email = cli.getCampoEmailCli().getText();
        if(nome.isEmpty() || fone.isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        } else {
            try(PreparedStatement pst = conexao.prepareStatement("UPDATE clientes SET nome_cliente=?, endereco_cliente=?, fone_cliente=?, email_cliente=? WHERE nome_cliente=?;")){
                pst.setString(1, nome);
                pst.setString(2, endereco);
                pst.setString(3, fone);
                pst.setString(4, email);
                pst.setString(5, nome);
            } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
                limparCampos();
            }
        }
    }
    
    public void removeUser(){
        String nome = cli.getCampoNomeCli().getText();
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este cliente?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){
            try(PreparedStatement pst = conexao.prepareStatement("DELETE FROM clientes WHERE nome_cliente=?")){
                pst.setString(1, nome);
                int apagado = pst.executeUpdate();
                if(apagado>0){
                    JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso");
                    limparCampos();                    
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(osController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }
}

