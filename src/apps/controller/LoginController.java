/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;
import apps.DAO.LoginDAO;
import br.com.bytecare.assistenciatecnica.turma472.telas.telaLogin;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author andmi
 */
public class LoginController {
    public void loginUsuario(telaLogin tela) throws SQLException{
        Connection conexao =  new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.login(tela.getCampoUser().getText(), tela.getCampoSenha().getText());
    }
}
