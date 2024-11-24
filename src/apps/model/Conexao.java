/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;
import java.sql.*;
/**
 *
 * @author andmi
 */
public class Conexao {
    public static Connection conector(){
        Connection conexao;
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:1227/postgres";
        String user = "postgres";
        String password = "1234";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
