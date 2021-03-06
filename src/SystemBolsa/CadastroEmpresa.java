
package SystemBolsa;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastroEmpresa extends javax.swing.JFrame {

    public String nomeEmpresa;
    public String Cnpj ;
    public long valorPatri;
    public String codPapel ;
    public float ValorAtivo;
    public int QuantAcao ;
    public CadastroEmpresa() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnCadastroEmpresa = new javax.swing.JDesktopPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCadastroEmpresa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEmpresa = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtEmpresa = new javax.swing.JFormattedTextField();
        txtCodPapel = new javax.swing.JFormattedTextField();
        txtQuantAcao = new javax.swing.JFormattedTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtValorPatri = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        txtValorAtivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Empresas");

        jpnCadastroEmpresa.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setText("Nome da Empresa:");

        jLabel13.setText("CNPJ");

        jLabel14.setText("Valor do patrimõnio R$: ");

        jLabel15.setText("Código do ativo");

        jLabel16.setText("Valor do ativo");

        jLabel17.setText("Quantidade de ações do ativo: ");

        btnCadastroEmpresa.setText("Cadastrar");
        btnCadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroEmpresaActionPerformed(evt);
            }
        });

        tbEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomo da empresa", "CNPJ", "Valor do patrimônio", "Ativo", "Valor do ativo", "Quantidade de Ações"
            }
        ));
        tbEmpresa.getTableHeader().setReorderingAllowed(false);
        tbEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmpresaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbEmpresa);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Editar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtQuantAcao.setToolTipText("APENAS NÚMEROS");

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ex: 00.00");

        jpnCadastroEmpresa.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(btnCadastroEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(btnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(btnAtualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(btnSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(txtEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(txtCodPapel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(txtQuantAcao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(txtCnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(txtValorPatri, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroEmpresa.setLayer(txtValorAtivo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jpnCadastroEmpresaLayout = new javax.swing.GroupLayout(jpnCadastroEmpresa);
        jpnCadastroEmpresa.setLayout(jpnCadastroEmpresaLayout);
        jpnCadastroEmpresaLayout.setHorizontalGroup(
            jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jpnCadastroEmpresaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnCadastroEmpresaLayout.createSequentialGroup()
                        .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCodPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuantAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnCadastroEmpresaLayout.createSequentialGroup()
                        .addComponent(btnCadastroEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnCadastroEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnCadastroEmpresaLayout.createSequentialGroup()
                        .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(txtValorPatri))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jpnCadastroEmpresaLayout.setVerticalGroup(
            jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastroEmpresaLayout.createSequentialGroup()
                .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCadastroEmpresaLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCadastroEmpresaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCodPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtValorPatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtQuantAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtValorAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpnCadastroEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroEmpresa)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnSair))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        getContentPane().add(jpnCadastroEmpresa, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroEmpresaActionPerformed
        nomeEmpresa = txtEmpresa.getText();
        Cnpj = txtCnpj.getText();
        valorPatri = Long.parseLong(txtValorPatri.getText());
        codPapel = txtCodPapel.getText();
        ValorAtivo = Float.parseFloat(txtValorAtivo.getText());
        QuantAcao = Integer.parseInt(txtQuantAcao.getText());

        DefaultTableModel jTbCadastro = (DefaultTableModel) tbEmpresa.getModel();
        Object[] dados= {nomeEmpresa, Cnpj, valorPatri, codPapel, ValorAtivo,QuantAcao };
        jTbCadastro.addRow(dados);
        JOptionPane.showMessageDialog(null, "Cadastro Efetuado com sucesso!");
       
        txtEmpresa.setText("");
        txtCnpj.setText("");
        txtValorPatri.setText("");
        txtCodPapel.setText("");
        txtValorAtivo.setText("");
        txtQuantAcao.setText("");
    }//GEN-LAST:event_btnCadastroEmpresaActionPerformed

    private void tbEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmpresaMouseClicked
        if(tbEmpresa.getSelectedRow()!= -1){

            txtEmpresa.setText(tbEmpresa.getValueAt(tbEmpresa.getSelectedRow(), 0).toString());
            txtCnpj.setText(tbEmpresa.getValueAt(tbEmpresa.getSelectedRow(), 1).toString());
            txtValorPatri.setText(tbEmpresa.getValueAt(tbEmpresa.getSelectedRow(), 2).toString());
            txtCodPapel.setText(tbEmpresa.getValueAt(tbEmpresa.getSelectedRow(), 3).toString());
            txtValorAtivo.setText(tbEmpresa.getValueAt(tbEmpresa.getSelectedRow(), 4).toString());
            txtQuantAcao.setText(tbEmpresa.getValueAt(tbEmpresa.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tbEmpresaMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tbEmpresa.getSelectedRow()!= -1){

            DefaultTableModel jTbCadastro = (DefaultTableModel) tbEmpresa.getModel();
            jTbCadastro.removeRow(tbEmpresa.getSelectedRow());

        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma item para excluir!!!");
            return;
        }
        JOptionPane.showMessageDialog(null, "Item Excluído com Sucesso!!");
        txtEmpresa.setText("");
        txtCnpj.setText("");
        txtValorPatri.setText("");
        txtCodPapel.setText("");
        txtValorAtivo.setText("");
        txtQuantAcao.setText("");

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if(tbEmpresa.getSelectedRow()!= -1){
            nomeEmpresa = txtEmpresa.getText();
            Cnpj = txtCnpj.getText();
            valorPatri = Long.parseLong(txtValorPatri.getText());
            codPapel = txtCodPapel.getText();
            ValorAtivo = Float.parseFloat(txtValorAtivo.getText());
            QuantAcao = Integer.parseInt(txtQuantAcao.getText());

            tbEmpresa.setValueAt(nomeEmpresa,tbEmpresa.getSelectedRow() , 0);
            tbEmpresa.setValueAt(Cnpj,tbEmpresa.getSelectedRow() , 1);
            tbEmpresa.setValueAt(valorPatri,tbEmpresa.getSelectedRow() , 2);
            tbEmpresa.setValueAt(codPapel,tbEmpresa.getSelectedRow() , 3);
            tbEmpresa.setValueAt(ValorAtivo,tbEmpresa.getSelectedRow() , 4);
            tbEmpresa.setValueAt(QuantAcao,tbEmpresa.getSelectedRow() , 5);
        }else{ JOptionPane.showMessageDialog(null, "Selecione um item para atualizar!!!");
            return;

        }
        JOptionPane.showMessageDialog(null, "Item atualizado com sucesso.");
        txtEmpresa.setText("");
        txtCnpj.setText("");
        txtValorPatri.setText("");
        txtCodPapel.setText("");
        txtValorAtivo.setText("");
        txtQuantAcao.setText("");

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        JOptionPane.showMessageDialog(null, "Até mais!!!");
        LoginCorretor tela = new LoginCorretor();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastroEmpresa;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDesktopPane jpnCadastroEmpresa;
    private javax.swing.JTable tbEmpresa;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JFormattedTextField txtCodPapel;
    private javax.swing.JFormattedTextField txtEmpresa;
    private javax.swing.JFormattedTextField txtQuantAcao;
    private javax.swing.JTextField txtValorAtivo;
    private javax.swing.JFormattedTextField txtValorPatri;
    // End of variables declaration//GEN-END:variables
}
