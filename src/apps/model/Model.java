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
public class Model {
     public static Connection conectar() {
        Connection conexao;
        String driver = "com.postgresql.jdbc.Driver";
        String url = "jdbc:postgresql://localhost:1227/dbinfox?characterEncoding=utf-8";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
    }
}
