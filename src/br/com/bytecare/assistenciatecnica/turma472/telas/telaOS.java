/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.bytecare.assistenciatecnica.turma472.telas;

import br.com.bytecare.assistenciatecnica.turma472.telas.*;
import apps.controller.osController;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.*;
/**
 *
 * @author andmi
 */
public class telaOS extends javax.swing.JInternalFrame {

    /**
     * Creates new form telaaOS
     */
    public telaOS() {
        initComponents();
    }
    
    private String tipo;
    osController cont = new osController(this);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        addOS = new javax.swing.JButton();
        removeOS = new javax.swing.JButton();
        printOS = new javax.swing.JButton();
        tecnicoOS = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numOS = new javax.swing.JTextField();
        dataOS = new javax.swing.JTextField();
        orcamentoOS = new javax.swing.JRadioButton();
        osOS = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        searchOS = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        situacaoOS = new javax.swing.JComboBox<>();
        editOS = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        servicoOS = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        idCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        clientesOS = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        equipOS = new javax.swing.JTextField();
        valorOS = new javax.swing.JTextField();
        defeitoOS = new javax.swing.JTextField();

        setClosable(true);
        setTitle("TechAssist v0.2 - Cadastro Ordem de Serviço");
        setMaximumSize(new java.awt.Dimension(2000, 1200));
        setMinimumSize(new java.awt.Dimension(1014, 716));
        setPreferredSize(new java.awt.Dimension(1014, 716));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("* Status");

        addOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bytecare/assistenciatecnica/turma472/telas/iconeAdd.png"))); // NOI18N
        addOS.setMaximumSize(new java.awt.Dimension(100, 100));
        addOS.setMinimumSize(new java.awt.Dimension(100, 100));
        addOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOSActionPerformed(evt);
            }
        });

        removeOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bytecare/assistenciatecnica/turma472/telas/iconeRemover.png"))); // NOI18N
        removeOS.setEnabled(false);
        removeOS.setMaximumSize(new java.awt.Dimension(100, 100));
        removeOS.setMinimumSize(new java.awt.Dimension(100, 100));
        removeOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOSActionPerformed(evt);
            }
        });

        printOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bytecare/assistenciatecnica/turma472/telas/iconeImpressora.png"))); // NOI18N
        printOS.setEnabled(false);
        printOS.setMaximumSize(new java.awt.Dimension(100, 100));
        printOS.setMinimumSize(new java.awt.Dimension(100, 100));
        printOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOSActionPerformed(evt);
            }
        });

        tecnicoOS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tecnicoOS.setPreferredSize(new java.awt.Dimension(350, 40));
        tecnicoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecnicoOSActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 225));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 225));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Nº OS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Data");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        numOS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numOS.setMaximumSize(new java.awt.Dimension(90, 40));
        numOS.setMinimumSize(new java.awt.Dimension(90, 40));
        numOS.setPreferredSize(new java.awt.Dimension(90, 30));
        numOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOSActionPerformed(evt);
            }
        });

        dataOS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dataOS.setMaximumSize(new java.awt.Dimension(90, 40));
        dataOS.setMinimumSize(new java.awt.Dimension(90, 40));
        dataOS.setPreferredSize(new java.awt.Dimension(90, 30));
        dataOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataOSActionPerformed(evt);
            }
        });

        buttonGroup1.add(orcamentoOS);
        orcamentoOS.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        orcamentoOS.setText("Orçamento");
        orcamentoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orcamentoOSActionPerformed(evt);
            }
        });

        buttonGroup1.add(osOS);
        osOS.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        osOS.setText("Ordem de serviço");
        osOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(orcamentoOS)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(osOS)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(orcamentoOS)
                .addGap(18, 18, 18)
                .addComponent(osOS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Valor Total");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Serviço");

        searchOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bytecare/assistenciatecnica/turma472/telas/iconePesquisa.png"))); // NOI18N
        searchOS.setMaximumSize(new java.awt.Dimension(100, 100));
        searchOS.setMinimumSize(new java.awt.Dimension(100, 100));
        searchOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOSActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("* Equipamento");

        situacaoOS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        situacaoOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Entrega OK", "Orçamento reprovado", "Aguardando aprovação", "Aguardando peças", "Abandonado pelo cliente", "Na bancada", "Retornou" }));
        situacaoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                situacaoOSActionPerformed(evt);
            }
        });

        editOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bytecare/assistenciatecnica/turma472/telas/iconeEditar.png"))); // NOI18N
        editOS.setEnabled(false);
        editOS.setMaximumSize(new java.awt.Dimension(100, 100));
        editOS.setMinimumSize(new java.awt.Dimension(100, 100));
        editOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOSActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Técnico");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("* Defeito");

        servicoOS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        servicoOS.setMaximumSize(new java.awt.Dimension(650, 40));
        servicoOS.setMinimumSize(new java.awt.Dimension(650, 40));
        servicoOS.setPreferredSize(new java.awt.Dimension(650, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        idCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idCliente.setActionCommand("<Not Set>");
        idCliente.setMaximumSize(new java.awt.Dimension(100, 40));
        idCliente.setMinimumSize(new java.awt.Dimension(100, 40));
        idCliente.setPreferredSize(new java.awt.Dimension(100, 40));
        idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("* Id");

        clientesOS.setMaximumSize(new java.awt.Dimension(350, 40));
        clientesOS.setMinimumSize(new java.awt.Dimension(350, 40));
        clientesOS.setPreferredSize(new java.awt.Dimension(350, 40));
        clientesOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesOSActionPerformed(evt);
            }
        });
        clientesOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clientesOSKeyReleased(evt);
            }
        });

        tabelaClientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tabelaClientes.setRowHeight(30);
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nome", "fone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaClientes.setShowGrid(true);
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaClientes);
        if (tabelaClientes.getColumnModel().getColumnCount() > 0) {
            tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bytecare/assistenciatecnica/turma472/icons/iconeBusca.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(clientesOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientesOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        equipOS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        equipOS.setMaximumSize(new java.awt.Dimension(650, 40));
        equipOS.setMinimumSize(new java.awt.Dimension(650, 40));
        equipOS.setPreferredSize(new java.awt.Dimension(650, 40));
        equipOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipOSActionPerformed(evt);
            }
        });

        valorOS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        valorOS.setMaximumSize(new java.awt.Dimension(170, 40));
        valorOS.setMinimumSize(new java.awt.Dimension(170, 40));
        valorOS.setPreferredSize(new java.awt.Dimension(170, 40));

        defeitoOS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        defeitoOS.setMaximumSize(new java.awt.Dimension(650, 40));
        defeitoOS.setMinimumSize(new java.awt.Dimension(650, 40));
        defeitoOS.setPreferredSize(new java.awt.Dimension(650, 40));
        defeitoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defeitoOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tecnicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(valorOS, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(servicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(equipOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(defeitoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(172, 172, 172))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(situacaoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(situacaoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defeitoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(tecnicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printOSActionPerformed

    private void tecnicoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecnicoOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tecnicoOSActionPerformed

    private void numOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOSActionPerformed

    private void dataOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataOSActionPerformed

    private void searchOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOSActionPerformed
        cont.pesquisarOS();
    }//GEN-LAST:event_searchOSActionPerformed

    private void situacaoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaoOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_situacaoOSActionPerformed

    private void idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClienteActionPerformed

    private void clientesOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesOSActionPerformed

    private void clientesOSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientesOSKeyReleased
        
        cont.pesquisarCliente();
    }//GEN-LAST:event_clientesOSKeyReleased

    public JTable getTabelaClientes() {
        return tabelaClientes;
    }

    public void setTabelaClientes(JTable tabelaClientes) {
        this.tabelaClientes = tabelaClientes;
    }

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        osController cont = new osController(this);
        cont.setarCampos();
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void equipOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipOSActionPerformed

    private void defeitoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defeitoOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defeitoOSActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        orcamentoOS.setSelected(true);
        tipo = "Orçamento";
    }//GEN-LAST:event_formInternalFrameOpened

    public JRadioButton getOrcamentoOS() {
        return orcamentoOS;
    }

    public void setOrcamentoOS(JRadioButton orcamentoOS) {
        this.orcamentoOS = orcamentoOS;
    }

    public JRadioButton getOsOS() {
        return osOS;
    }

    public void setOsOS(JRadioButton osOS) {
        this.osOS = osOS;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void osOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osOSActionPerformed
        tipo = "OS";
    }//GEN-LAST:event_osOSActionPerformed

    private void orcamentoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orcamentoOSActionPerformed
        tipo = "Orçamento";
    }//GEN-LAST:event_orcamentoOSActionPerformed

    private void addOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOSActionPerformed
        cont.emitirOs();
    }//GEN-LAST:event_addOSActionPerformed

    private void editOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOSActionPerformed
        cont.alterarOS();
    }//GEN-LAST:event_editOSActionPerformed

    private void removeOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOSActionPerformed
        cont.excluirOS();
    }//GEN-LAST:event_removeOSActionPerformed
    
    public JTextField getClientesOS() {
        return clientesOS;
    }

    public void setClientesOS(JTextField clientesOS) {
        this.clientesOS = clientesOS;
    }

    public JTextField getDataOS() {
        return dataOS;
    }

    public void setDataOS(JTextField dataOS) {
        this.dataOS = dataOS;
    }

    public JTextField getDefeitoOS() {
        return defeitoOS;
    }

    public void setDefeitoOS(JTextField defeitoOS) {
        this.defeitoOS = defeitoOS;
    }

    public JTextField getEquipOS() {
        return equipOS;
    }

    public void setEquipOS(JTextField equipOS) {
        this.equipOS = equipOS;
    }

    public JButton getAddOS() {
        return addOS;
    }

    public void setAddOS(JButton addOS) {
        this.addOS = addOS;
    }

    public JButton getEditOS() {
        return editOS;
    }

    public void setEditOS(JButton editOS) {
        this.editOS = editOS;
    }

    public JButton getPrintOS() {
        return printOS;
    }

    public void setPrintOS(JButton printOS) {
        this.printOS = printOS;
    }

    public JButton getRemoveOS() {
        return removeOS;
    }

    public void setRemoveOS(JButton removeOS) {
        this.removeOS = removeOS;
    }

    public JButton getSearchOS() {
        return searchOS;
    }

    public void setSearchOS(JButton searchOS) {
        this.searchOS = searchOS;
    }

    public JTextField getNumOS() {
        return numOS;
    }

    public void setNumOS(JTextField numOS) {
        this.numOS = numOS;
    }

    public JTextField getPesqID() {
        return idCliente;
    }

    public void setPesqID(JTextField pesqID) {
        this.idCliente = pesqID;
    }

    public JTextField getServicoOS() {
        return servicoOS;
    }

    public void setServicoOS(JTextField servicoOS) {
        this.servicoOS = servicoOS;
    }

    public JComboBox<String> getSituacaoOS() {
        return situacaoOS;
    }

    public void setSituacaoOS(JComboBox<String> situacaoOS) {
        this.situacaoOS = situacaoOS;
    }

    public JTextField getTecnicoOS() {
        return tecnicoOS;
    }

    public void setTecnicoOS(JTextField tecnicoOS) {
        this.tecnicoOS = tecnicoOS;
    }

    public JTextField getValorOS() {
        return valorOS;
    }

    public void setValorOS(JTextField valorOS) {
        this.valorOS = valorOS;
    }

    public JTextField getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(JTextField idCliente) {
        this.idCliente = idCliente;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOS;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField clientesOS;
    private javax.swing.JTextField dataOS;
    private javax.swing.JTextField defeitoOS;
    private javax.swing.JButton editOS;
    private javax.swing.JTextField equipOS;
    private javax.swing.JTextField idCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numOS;
    private javax.swing.JRadioButton orcamentoOS;
    private javax.swing.JRadioButton osOS;
    private javax.swing.JButton printOS;
    private javax.swing.JButton removeOS;
    private javax.swing.JButton searchOS;
    private javax.swing.JTextField servicoOS;
    private javax.swing.JComboBox<String> situacaoOS;
    public javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField tecnicoOS;
    private javax.swing.JTextField valorOS;
    // End of variables declaration//GEN-END:variables
}
