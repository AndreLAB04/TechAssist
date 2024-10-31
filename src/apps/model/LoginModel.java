/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;
/**
 *
 * @author andmi
 */
public class LoginModel {
    private int id_usuario;
    private String nome_usuario;
    private String fone_usuario;
    private String senha_usuario;
    private String login_usuario;
    private boolean adm;

    public LoginModel(String senha_usuario, String login_usuario) {
        this.senha_usuario = senha_usuario;
        this.login_usuario = login_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public String getFone_usuario() {
        return fone_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public String getLogin_usuario() {
        return login_usuario;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public void setFone_usuario(String fone_usuario) {
        this.fone_usuario = fone_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public void setLogin_usuario(String login_usuario) {
        this.login_usuario = login_usuario;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    
    
}