/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author andmi
 */
@Entity
@Table(name="clientes")
public class clientesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;
    @Column(nullable = false, length = 200)
    private String nome_cliente;
    @Column(nullable = false, length = 50)
    private String fone_cliente;
    @Column(nullable = true)
    private String endereco_cliente;
    @Column(nullable = true)
    private String email_cliente;
}
