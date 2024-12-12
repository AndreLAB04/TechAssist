/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;

import apps.model.Conexao;
import br.com.bytecare.assistenciatecnica.turma472.telas.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author andmi
 */
public class osController {
    Connection conexao = Conexao.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    private final telaOS os;
    
    public osController(telaOS os) {
        this.os = os; // Armazena a instância passada
    }
    
    public void pesquisarCliente() throws SQLException {
        String cliente = os.getClientesOS().getText();
        //System.out.println("Chegou ate aq");
        //System.out.println("Chegou até aq2");
        try(PreparedStatement pst = conexao.prepareStatement("select id_cliente as Id, nome_cliente as Nome, fone_cliente as Fone from clientes where nome_cliente like ?")){
            //System.out.println("Chegou até aq4");
            pst.setString(1, cliente + "%");
            //System.out.println("Chegou até aq5");
            rs = pst.executeQuery();
            //System.out.println("Chegou até aq6");
            os.getTabelaClientes().setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(osController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setarCampos(){
        int setar = os.getTabelaClientes().getSelectedRow();
        os.getIdCliente().setText(os.getTabelaClientes().getModel().getValueAt(setar, 0).toString());
    }
    
    public void emitirOs() throws SQLException {
        telaPrincipal p = new telaPrincipal();
        Date data = new Date();
        java.sql.Date dataa = new java.sql.Date(data.getTime());
        String valor = os.getValorOS().getText();
        String tipo = os.getTipo();
        String equip = os.getEquipOS().getText();
        String servico = os.getServicoOS().getText();
        String defeito = os.getDefeitoOS().getText();
        String tecnico = os.getTecnicoOS().getText();
        String situacao = os.getSituacaoOS().getSelectedItem().toString();
        String idcliente = os.getIdCliente().getText();
        if ((idcliente.isEmpty()) || (equip.isEmpty()) || (defeito.isEmpty()) || (situacao.equals(" ")) || (tipo.isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
            try(PreparedStatement pst = conexao.prepareStatement("insert into os (valor_os, tipo, equipamento, servico, defeito, tecnico, situacao, data_os, idcliente) values(?, ?, ?, ?, ?, ?, ?, ?, ?)")){
                pst.setString(1, valor);
                pst.setString(2, tipo);
                pst.setString(3, equip);
                pst.setString(4, servico);
                pst.setString(5, defeito);
                pst.setString(6, tecnico);
                pst.setString(7, situacao);
                pst.setDate(8, dataa);
                pst.setInt(9, Integer.parseInt(idcliente));
                pst.executeUpdate();
                System.out.println("teste1");
                int adicionado = pst.executeUpdate();
                System.out.println("teste2");
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "OS emitida com sucesso");
                    os.getAddOS().setEnabled(false);
                    os.getSearchOS().setEnabled(false);
                    os.getPrintOS().setEnabled(true);
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    public void pesquisarOS(){
        String numOsS = JOptionPane.showInputDialog("Número da OS");
        int numOs = Integer.parseInt(numOsS);
        try(PreparedStatement pst = conexao.prepareStatement("select id_os, valor_os, tipo, equipamento, servico, defeito, tecnico, situacao, data_os, idcliente from os where id_os=?;")){
            pst.setInt(1, numOs);
            rs=pst.executeQuery();
            if(rs.next()){
                os.getNumOS().setText(rs.getString(1));
                os.getValorOS().setText(rs.getString(2));
                String rbtTipo = rs.getString(3);
                if(rbtTipo.equals("OS")){
                    os.getOsOS().setSelected(true);
                    os.setTipo(rbtTipo);
                }else{
                    os.getOrcamentoOS().setSelected(true);
                    os.setTipo(rbtTipo);
                }       
                os.getEquipOS().setText(rs.getString(4));
                os.getServicoOS().setText(rs.getString(5));
                os.getDefeitoOS().setText(rs.getString(6));
                os.getTecnicoOS().setText(rs.getString(7));
                os.getSituacaoOS().setSelectedItem(rs.getString(8));
                os.getDataOS().setText(rs.getString(9));
                os.getIdCliente().setText(rs.getString(10));
                //ativar e desativar certos campos
                os.getAddOS().setEnabled(false);
                os.getClientesOS().setEnabled(false);
                os.getTabelaClientes().setVisible(false);
                os.getNumOS().setEnabled(false);
                os.getEditOS().setEnabled(true);
                os.getRemoveOS().setEnabled(true);
                os.getPrintOS().setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "OS não cadastrada");
            }
        }catch (SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(null, "OS inválida");
         }catch (Exception e2){
            JOptionPane.showMessageDialog(null, e2);
        }
    }
    
    public void alterarOS(){
        try(PreparedStatement pst = conexao.prepareStatement("update os set valor_os=?, tipo=?, equipamento=?, servico=?, defeito=?, tecnico=?, situacao=?, idcliente=? where id_os=?")){
            pst.setString(1, os.getValorOS().getText().replace(",", "."));
            pst.setString(2, os.getTipo());
            pst.setString(3, os.getEquipOS().getText());
            pst.setString(4, os.getServicoOS().getText());
            pst.setString(5, os.getDefeitoOS().getText());
            pst.setString(6, os.getTecnicoOS().getText());
            pst.setString(7, os.getSituacaoOS().getSelectedItem().toString());
            pst.setInt(8, Integer.parseInt(os.getIdCliente().getText()));
            pst.setInt(9, Integer.parseInt(os.getNumOS().getText()));
            if ((os.getIdCliente().getText().isEmpty()) || (os.getEquipOS().getText().isEmpty()) || (os.getDefeitoOS().getText().isEmpty()) || os.getSituacaoOS().getSelectedItem().equals(" ")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "OS alterada com sucesso");
                    limparCamposOS();          
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void excluirOS(){
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir está OS?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){
            try(PreparedStatement pst = conexao.prepareStatement("delete from os where id_os=?")){
                pst.setInt(1, Integer.parseInt(os.getNumOS().getText()));
                int apagado = pst.executeUpdate();
                if(apagado!=0){
                    JOptionPane.showMessageDialog(null, "OS excluída com sucesso");
                    limparCamposOS();                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(osController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
    public void limparCamposOS(){
        //limpando campos
        os.getNumOS().setText(null);
        os.getDataOS().setText(null);
        os.getClientesOS().setText(null);
        os.getEquipOS().setText(null);
        os.getDefeitoOS().setText(null);
        os.getServicoOS().setText(null);
        os.getTecnicoOS().setText(null);
        os.getValorOS().setText(null);
        //desabilitando e habilitando botões e tabela
        os.getAddOS().setEnabled(true);
        os.getClientesOS().setEnabled(true);
        os.getNumOS().setEnabled(true);
        os.getTabelaClientes().setVisible(true);
        os.getEditOS().setEnabled(false);
        os.getRemoveOS().setEnabled(false);
        os.getPrintOS().setEnabled(false);
    }
}