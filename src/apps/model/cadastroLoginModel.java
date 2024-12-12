/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;
import jakarta.persistence.*;
/**
 *
 * @author andmi
 */
@Entity
@Table(name="usuarios")
public class cadastroLoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    @Column(nullable = true, length = 200)
    private String nome_usuario;
    @Column(nullable = true, length = 50)
    private String fone_usuario;
    @Column(nullable = false, length = 16)
    private String senha_usuario;
    @Column(nullable = false, length = 16)
    private String login_usuario;
    @Column(nullable = false, length = 0)
    private String perfil;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getFone_usuario() {
        return fone_usuario;
    }

    public void setFone_usuario(String fone_usuario) {
        this.fone_usuario = fone_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getLogin_usuario() {
        return login_usuario;
    }

    public void setLogin_usuario(String login_usuario) {
        this.login_usuario = login_usuario;
    }

    public String isPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }   
}
