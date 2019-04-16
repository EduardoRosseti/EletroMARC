/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//TELA PARCIALAMENTE PRONTA
//MOTIVO: FALTA GERAR A SUB-TELA DO BOTÃO EXCLUIR
package VISUAL;

import CONTROLE.CCliente;
import CONTROLE.COrcamento;
import CONTROLE.CPagamento;
import CONTROLE.CTabela;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jose
 */
public class TelaControlePagamento extends javax.swing.JInternalFrame {

    COrcamento cOrcamento;
    CCliente cCliente;
    CPagamento cPagamento;
    CTabela cTabela;

    public TelaControlePagamento() {
        initComponents();
        cTabela = new CTabela();
        cOrcamento = new COrcamento();
        cPagamento = new CPagamento();
        cCliente = new CCliente();
        txtValOrc.setEditable(false);
        if ("Administrativo".equals(TelaLogin.tipoUsuario)) {

        } else if ("Comum".equals(TelaLogin.tipoUsuario)) {
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

        jButton1 = new javax.swing.JButton();
        btnDadExcluir = new javax.swing.JButton();
        btnCadCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBusca = new javax.swing.JTable();
        cbPesquisar2 = new javax.swing.JComboBox<>();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtValOrc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDes = new javax.swing.JTextField();
        txtValTot = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbFor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDat = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButton1.setText("Confirmar");

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

        btnCadCancelar.setText("Cancelar");
        btnCadCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCancelarActionPerformed(evt);
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

        cbPesquisar2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COD_PAGAMENTO", "NOME_CLIENTE" }));
        cbPesquisar2.setToolTipText("");
        cbPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPesquisar2ActionPerformed(evt);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbPesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel17.setText("Nome:");

        jLabel5.setText("Valor Orçamento:");

        jLabel3.setText("Desconto:");

        txtDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDesKeyReleased(evt);
            }
        });

        jLabel16.setText("Valor Total à Pagar:");

        jLabel4.setText("Data Do Pagamento:");

        cbFor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartao", "Cheque" }));

        jLabel2.setText("Forma de pagamento:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        txtDat.setText("Data Automatica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValTot, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDat)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValOrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtValTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDat))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(btnDadExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(btnCadCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(btnCadastrar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDadExcluir)
                    .addComponent(btnCadCancelar)
                    .addComponent(jButton1)
                    .addComponent(btnCadastrar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDadExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDadExcluirMouseClicked

    }//GEN-LAST:event_btnDadExcluirMouseClicked

    private void btnDadExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadExcluirActionPerformed
        // IRÁ GERAR UMA OUTRA TELA PARA QUE SEJA FEITO O "CANCELAMENTO" DO
        // PAGAMENTO DA VENDA
        JOptionPane.showMessageDialog(null, cPagamento.apagar(cPagamento.pagamento));
    }//GEN-LAST:event_btnDadExcluirActionPerformed

    private void btnCadCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCancelarActionPerformed

    }//GEN-LAST:event_btnCadCancelarActionPerformed

    private void cbPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPesquisar2ActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        // TODO add your handling code here:
        tbBusca.setModel(DbUtils.resultSetToTableModel(cTabela.pesq("tbpagamento", txtPesquisar.getText(), cbPesquisar2.getItemAt(cbPesquisar2.getSelectedIndex()))));
        tbBusca.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbBusca.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(4).setPreferredWidth(150);
        cTabela.tabela.setTipo(2);
        tbBusca.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tbBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBuscaMouseClicked
        // TODO add your handling code here:
        switch (cTabela.tabela.getTipo()) {
            case 1:
                Object t = tbBusca.getValueAt(tbBusca.getSelectedRow(), 1);
                Object d = tbBusca.getValueAt(tbBusca.getSelectedRow(), 0);
                txtNome.setText((String) t);
                cOrcamento.orcamento.setCod((int) d);
                cOrcamento.buscar(cOrcamento.orcamento);
                txtValOrc.setText(Float.toString(cOrcamento.orcamento.getValorTotal()));
                cPagamento.pagamento.setCodOrcamento(cOrcamento.orcamento.getCod());
                break;
            case 2:
                cTabela.tabela.setLin(tbBusca.getSelectedRow());
                int i = Integer.parseInt((tbBusca.getModel()).getValueAt(cTabela.tabela.getLin(), 0).toString());
                cTabela.tabela.setCod(i);
                boolean result;
                cPagamento.pagamento.setCod(cTabela.tabela.getCod());
                result = cPagamento.buscar(cPagamento.pagamento);
                if (result) {
                    cOrcamento.orcamento.setCod(cPagamento.pagamento.getCodOrcamento());
                    cOrcamento.buscar(cOrcamento.orcamento);
                    cCliente.cliente.setCod(cOrcamento.orcamento.getCodCliente());
                    cCliente.buscar(cCliente.cliente);
                    txtNome.setText(cCliente.cliente.getNome());
                    txtDat.setText(cPagamento.pagamento.getDataPagamento());
                    txtDes.setText(Float.toString(cPagamento.pagamento.getDesconto()));
                    txtValOrc.setText(Float.toString(cOrcamento.orcamento.getValorTotal()));
                    txtValTot.setText(Float.toString(cPagamento.pagamento.getValor()));
                    cbFor.getModel().setSelectedItem(cPagamento.pagamento.getFormaPagamento());
                }
                break;
        }
    }//GEN-LAST:event_tbBuscaMouseClicked

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        // TODO add your handling code here:
        tbBusca.setModel(DbUtils.resultSetToTableModel(cTabela.pesqOrc("tborcamento", txtNome.getText(), "C.NOME", "AND O.STATUS_PAG = 'Nao Pago'")));
        tbBusca.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbBusca.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(6).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(7).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(8).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(9).setPreferredWidth(150);
        cTabela.tabela.setTipo(1);
        tbBusca.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_txtNomeKeyReleased

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        cPagamento.pagamento.setDesconto(Float.parseFloat(txtDes.getText()));
        cPagamento.pagamento.setFormaPagamento(cbFor.getItemAt(cbFor.getSelectedIndex()));
        cPagamento.pagamento.setValor(Float.parseFloat(txtValTot.getText()));
        JOptionPane.showMessageDialog(null, cPagamento.gravar(cPagamento.pagamento));
        cOrcamento.orcamento.setStatusPagamento("Pago");
        cOrcamento.alterar(cOrcamento.orcamento, "pago");
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtDesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesKeyReleased
        // TODO add your handling code here:
        Float x1 = (Float.parseFloat(txtValOrc.getText()));
        Float x2 = (Float.parseFloat(txtDes.getText()));
        x1 -= x2;
        txtValTot.setText(Float.toString(x1));
    }//GEN-LAST:event_txtDesKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCancelar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDadExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbFor;
    private javax.swing.JComboBox<String> cbPesquisar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tbBusca;
    private javax.swing.JLabel txtDat;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtValOrc;
    private javax.swing.JTextField txtValTot;
    // End of variables declaration//GEN-END:variables

}
