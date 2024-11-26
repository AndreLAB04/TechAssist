/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;

import java.sql.*;
import apps.model.Conexao;
import br.com.bytecare.assistenciatecnica.turma472.telas.*;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author andmi
 */
public class loginController {
    Connection conexao = Conexao.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    private final telaLogin login;
    String adm;

    public loginController(telaLogin login) {
        this.login = login; // Armazena a instância passada
    }

    public void logar() throws SQLException {
        String username = login.getCampoUser().getText();
        String pw = new String(login.getCampoSenha().getPassword()); // Captura a senha corretamente
        
        System.out.println(username);
        System.out.println(pw);
        
        try (PreparedStatement pst = conexao.prepareStatement("SELECT login_usuario, senha_usuario, adm FROM usuarios WHERE login_usuario=? and senha_usuario=?")) {
            pst.setString(1, username);
            pst.setString(2, pw);
            
            rs = pst.executeQuery();
            //System.out.println(rs.next());
            if (rs.next()) {
                adm = rs.getString(3);
                System.out.println(adm);
                if(adm.equals("Admin")){
                    //funçoes de adm
                    JOptionPane.showMessageDialog(null, "Logado com sucesso.");
                    telaPrincipal principal = new telaPrincipal();
                    principal.getTipoUser().setText(username);
                    principal.getCadastroUser().setEnabled(true);
                    principal.getRelatorio().setEnabled(true);
                    principal.setVisible(true); // Exibe a tela principal
                    login.dispose(); // Fecha a tela de login
                }else{
                    JOptionPane.showMessageDialog(null, "Logado com sucesso.");
                    telaPrincipal principal = new telaPrincipal();
                    principal.getTipoUser().setText(username);
                    principal.getCadastroUser().setEnabled(false);
                    principal.getRelatorio().setEnabled(false);
                    principal.setVisible(true); // Exibe a tela principal
                    login.dispose(); // Fecha a tela de login
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos.");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            // Não feche a conexão aqui se ela for usada em outros lugares
        }
    }
    
    public void cadastrarUser() throws SQLException{
        
    }
}

