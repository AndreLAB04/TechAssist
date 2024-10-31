/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.DAO;
import apps.controller.Conexao;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author andmi
 */
public class LoginDAO {
    public void login(String senha_usuario, String login_usuario) throws SQLException{
        Connection conexao =  new Conexao().getConnection();
        String sql = "SELECT senha_usuario, login_usuario FROM usuarios WHERE login_usuario = '"+login_usuario+"' AND senha_usuario = '"+senha_usuario+"'";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
        if(rs.next()){
            System.out.println("possui");
        }
        else{
            System.out.println("n possui");
        }
        conexao.close();
    }
}
