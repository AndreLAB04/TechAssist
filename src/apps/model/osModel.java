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
@Table(name="os")
public class osModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_os;
    @Column(nullable = false, length = 200)
    private double valor_os;
    @Column(nullable = true, length = 100)
    private String tipo;
    @Column(nullable = true, length = 200)
    private String equipamento;
    @Column(nullable = false, length = 200)
    private String servico;
    @Column(nullable = false, length = 200)
    private String defeito;
    @Column(nullable = false, length = 200)
    private String tecnico;
    @Column(nullable = false, length = 200)
    private String situacao;
    @Column(nullable = false, length = 200)
    private String data_os;
    @Column(nullable = false)
    private int idcliente;

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
   
    public int getId_os() {
        return id_os;
    }

    public void setId_os(int id_os) {
        this.id_os = id_os;
    }

    public double getValor_os() {
        return valor_os;
    }

    public void setValor_os(double valor_os) {
        this.valor_os = valor_os;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getData_os() {
        return data_os;
    }

    public void setData_os(String data_os) {
        this.data_os = data_os;
    }
}
