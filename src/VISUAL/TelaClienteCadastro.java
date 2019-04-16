/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//TELA FINALIZADA
package VISUAL;

import CONTROLE.CCliente;
import CONTROLE.CTabela;
import CONTROLE.CWebServiceCep;
import MODELO.Validacao;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jose
 */
public class TelaClienteCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro
     */
    Validacao validacao;
    CCliente ccliente;
    CTabela cTabela;

    public TelaClienteCadastro() {
        initComponents();
        cTabela = new CTabela();
        ccliente = new CCliente();
        //JOptionPane.showMessageDialog(null, TelaLogin.getTipoUsuario());
        if ("Administrativo".equals(TelaLogin.tipoUsuario)) {

        } else if ("Comum".equals(TelaLogin.tipoUsuario)) {
            btnAlterar.setEnabled(false);
            btnDadExcluir.setEnabled(false);
        } else {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txtCadNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCadEma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCadCpf = new javax.swing.JFormattedTextField();
        txtCadRg = new javax.swing.JFormattedTextField();
        txtCadCel = new javax.swing.JFormattedTextField();
        txtCadTel = new javax.swing.JFormattedTextField();
        txtCadDataNasc = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        txtCadRua = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCadCidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCadBairro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCadNum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCadComplem = new javax.swing.JTextArea();
        txtCadCep = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbCadUf = new javax.swing.JComboBox<>();
        btnCadCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBusca = new javax.swing.JTable();
        cbPesquisar = new javax.swing.JComboBox<>();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnDadExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(841, 710));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(357, 300));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("*Celular:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("*Data Nasc.:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel7.setText("RG:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("*Nome Completo:");

        try {
            txtCadCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadCpfActionPerformed(evt);
            }
        });

        try {
            txtCadRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCadCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCadTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadTelActionPerformed(evt);
            }
        });

        try {
            txtCadDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel5.setPreferredSize(new java.awt.Dimension(357, 315));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel12.setText("Cidade:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel13.setText("Bairro:");

        txtCadBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadBairroActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel16.setText("Rua:");

        txtCadNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadNumActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel17.setText("Nº:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setText("Complemento:");

        txtCadComplem.setColumns(20);
        txtCadComplem.setLineWrap(true);
        txtCadComplem.setRows(5);
        jScrollPane1.setViewportView(txtCadComplem);

        try {
            txtCadCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadCepActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel14.setText("CEP:");

        jLabel9.setText("Estado:");

        cbCadUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbCadUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCadUfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13)
                                .addComponent(jLabel16)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtCadCep, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txtCadNum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbCadUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadRua)
                    .addComponent(txtCadBairro)
                    .addComponent(txtCadCidade)
                    .addComponent(jScrollPane1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCadRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCadBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCadUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCadCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtCadNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCadCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCadDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadRg)
                    .addComponent(txtCadCel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(txtCadCpf)
                    .addComponent(txtCadTel)
                    .addComponent(txtCadEma)
                    .addComponent(txtCadNome))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCadDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCadCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCadTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCadCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCadRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCadEma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnCadCancelar.setText("Cancelar");
        btnCadCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tbBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Data", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBusca.setEditingColumn(0);
        tbBusca.setEditingRow(0);
        tbBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBuscaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbBusca);

        cbPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COD_CLIENTE", "NOME", "DATA_NASCIMENTO", "TELEFONE" }));
        cbPesquisar.setToolTipText("");
        cbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPesquisarActionPerformed(evt);
            }
        });

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnPesquisar))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnDadExcluir.setText("Excluir");
        btnDadExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDadExcluirMouseClicked(evt);
            }
        });
        btnDadExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnCadCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDadExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 775, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCancelar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnDadExcluir)
                    .addComponent(btnAlterar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCancelarActionPerformed

    }//GEN-LAST:event_btnCadCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        String msg = "";
        ccliente.cliente.setNome(txtCadNome.getText());
        ccliente.cliente.setDataNasc((txtCadDataNasc.getText()).replace("/", "-"));
        ccliente.cliente.setTelefone(ccliente.cliente.retiraCel(txtCadTel.getText()));
        ccliente.cliente.setCelular(ccliente.cliente.retiraCel(txtCadCel.getText()));
        ccliente.cliente.setCpf(ccliente.cliente.retira(txtCadCpf.getText()));
        ccliente.cliente.setRg(ccliente.cliente.retira(txtCadRg.getText()));
        ccliente.cliente.setEmail(txtCadEma.getText());
        ccliente.cliente.setCep(ccliente.cliente.retira(txtCadCep.getText()));
        ccliente.cliente.setRua(txtCadRua.getText());
        ccliente.cliente.setNumero(Integer.parseInt(txtCadNum.getText()));
        ccliente.cliente.setBairro(txtCadBairro.getText());
        ccliente.cliente.setCidade(txtCadCidade.getText());
        ccliente.cliente.setComplemento(txtCadComplem.getText());
        ccliente.cliente.setEstado(cbCadUf.getItemAt(cbCadUf.getSelectedIndex()));

        // ccliente.cliente.setObservacao(txtCadObs.getText());
        if (Validacao.validaCpf(ccliente.cliente.getCpf())) {
            JOptionPane.showMessageDialog(null, ccliente.gravar(ccliente.cliente));

        } else {
            JOptionPane.showMessageDialog(null, "cpf invalido");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCadCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadCpfActionPerformed

    private void tbBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBuscaMouseClicked
        // TODO add your handling code here:
        cTabela.tabela.setLin(tbBusca.getSelectedRow());
        int i = Integer.parseInt((tbBusca.getModel()).getValueAt(cTabela.tabela.getLin(), 0).toString());
        cTabela.tabela.setCod(i);
        boolean result;
        ccliente.cliente.setCod(cTabela.tabela.getCod());
        result = ccliente.buscar(ccliente.cliente);
        //JOptionPane.showMessageDialog(null, result);
        if (result) {
            //  txtCadCod.setText(Integer.toString(ccliente.cliente.getCod()));
            txtCadNome.setText((ccliente.cliente.getNome()));
            txtCadTel.setText(ccliente.cliente.getTelefone());
            //JOptionPane.showMessageDialog(null,ccliente.cliente.getTelefone());

            ccliente.cliente.getDataNasc();
            String ano = ccliente.cliente.getDataNasc().substring(0, 4);
            String mes = ccliente.cliente.getDataNasc().substring(5, 7);
            String dia = ccliente.cliente.getDataNasc().substring(8);
            ccliente.cliente.setDataNasc(dia + "" + mes + "" + ano);
            JOptionPane.showMessageDialog(null, ccliente.cliente.getDataNasc());
            txtCadDataNasc.setText(ccliente.cliente.getDataNasc());
            txtCadCel.setText(ccliente.cliente.getCelular());
            txtCadCpf.setText(ccliente.cliente.getCpf());
            txtCadRg.setText(ccliente.cliente.getRg());
            txtCadEma.setText(ccliente.cliente.getEmail());
            txtCadRua.setText(ccliente.cliente.getRua());
            txtCadNum.setText(Integer.toString(ccliente.cliente.getNumero()));
            txtCadCep.setText(ccliente.cliente.getCep());
            txtCadBairro.setText(ccliente.cliente.getBairro());
            txtCadCidade.setText(ccliente.cliente.getCidade());
            txtCadComplem.setText(ccliente.cliente.getComplemento());
            txtCadComplem.setText(ccliente.cliente.getEstado());
        }
    }//GEN-LAST:event_tbBuscaMouseClicked

    private void cbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPesquisarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        // TODO add your handling code here:

        tbBusca.setModel(DbUtils.resultSetToTableModel(cTabela.pesq("tbcliente", txtPesquisar.getText(), String.valueOf(cbPesquisar.getSelectedItem()))));
        tbBusca.getColumnModel().getColumn(0).setPreferredWidth(75);
        tbBusca.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(6).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(7).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(8).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(9).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(10).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(11).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(12).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(13).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(14).setPreferredWidth(150);
        tbBusca.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDadExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDadExcluirMouseClicked
        // TODO add your handling code here:

        //abela.tabela.deletarLinha(TelaPrincipal.getCod());
        //JOptionPane.showMessageDialog(null,TelaPrincipal.getLin());
    }//GEN-LAST:event_btnDadExcluirMouseClicked

    private void btnDadExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadExcluirActionPerformed
        // TODO add your handling code here:
        String msg = ccliente.apagar(ccliente.cliente);
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btnDadExcluirActionPerformed

    private void txtCadTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadTelActionPerformed

    private void cbCadUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCadUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCadUfActionPerformed

    private void txtCadCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadCepActionPerformed

        CWebServiceCep cWeb = new CWebServiceCep();
        //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.
        //caso a busca ocorra bem, imprime os resultados.
        cWeb.webServiceCep = cWeb.webServiceCep.searchCep(txtCadCep.getText());
        if (cWeb.webServiceCep.wasSuccessful()) {
            txtCadRua.setText(cWeb.webServiceCep.getLogradouroFull());
            txtCadCidade.setText(cWeb.webServiceCep.getCidade());
            txtCadBairro.setText(cWeb.webServiceCep.getBairro());
            cbCadUf.setSelectedItem(cWeb.webServiceCep.getUf());
            //caso haja problemas imprime as exce??es.
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + cWeb.webServiceCep.getResulCode());

            JOptionPane.showMessageDialog(null, "Descrição do erro: " + cWeb.webServiceCep.getResultText());
        }
    }//GEN-LAST:event_txtCadCepActionPerformed

    private void txtCadNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadNumActionPerformed

    private void txtCadBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadBairroActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        String msg = "";
        ccliente.cliente.setNome(txtCadNome.getText());
        ccliente.cliente.setDataNasc((txtCadDataNasc.getText()).replace("/", ""));
        ccliente.cliente.setTelefone(ccliente.cliente.retiraCel(txtCadTel.getText()));
        ccliente.cliente.setCelular(ccliente.cliente.retiraCel(txtCadCel.getText()));
        ccliente.cliente.setCpf(ccliente.cliente.retira(txtCadCpf.getText()));
        ccliente.cliente.setRg(ccliente.cliente.retira(txtCadRg.getText()));
        ccliente.cliente.setEmail(txtCadEma.getText());
        ccliente.cliente.setCep(ccliente.cliente.retira(txtCadCep.getText()));
        ccliente.cliente.setRua(txtCadRua.getText());
        ccliente.cliente.setNumero(Integer.parseInt(txtCadNum.getText()));
        ccliente.cliente.setBairro(txtCadBairro.getText());
        ccliente.cliente.setCidade(txtCadCidade.getText());
        ccliente.cliente.setComplemento(txtCadComplem.getText());
        ccliente.cliente.setEstado(cbCadUf.getItemAt(cbCadUf.getSelectedIndex()));

        // ccliente.cliente.setObservacao(txtCadObs.getText());
        if (Validacao.validaCpf(ccliente.cliente.getCpf())) {
            if (!ccliente.alterar(ccliente.cliente)) {
                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Não reliada a atualização");
            }

        } else {
            JOptionPane.showMessageDialog(null, "cpf invalido");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadCancelar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDadExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbCadUf;
    private javax.swing.JComboBox<String> cbPesquisar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tbBusca;
    private javax.swing.JTextField txtCadBairro;
    private javax.swing.JFormattedTextField txtCadCel;
    private javax.swing.JFormattedTextField txtCadCep;
    private javax.swing.JTextField txtCadCidade;
    private javax.swing.JTextArea txtCadComplem;
    private javax.swing.JFormattedTextField txtCadCpf;
    private javax.swing.JFormattedTextField txtCadDataNasc;
    private javax.swing.JTextField txtCadEma;
    private javax.swing.JTextField txtCadNome;
    private javax.swing.JTextField txtCadNum;
    private javax.swing.JFormattedTextField txtCadRg;
    private javax.swing.JTextField txtCadRua;
    private javax.swing.JFormattedTextField txtCadTel;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
