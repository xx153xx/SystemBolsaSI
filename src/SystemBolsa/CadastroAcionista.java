/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemBolsa;

import Controle.Acionista;
import Controle.AcionistaDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author derp_
 */
public class CadastroAcionista extends javax.swing.JFrame {

  
    public float PlanoCadastro ;
    public String UsuarioCadastro ;
    public String SenhaCadastro ;
    public String SenhaCadastro2;
    public CadastroAcionista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnCadastro = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSenhaCadastro = new javax.swing.JPasswordField();
        txtSenha2Cadastro = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        txtCpfCadastro = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPlanoCadastro = new javax.swing.JFormattedTextField();
        txtNomeCadastro = new javax.swing.JFormattedTextField();
        txtUsuarioCadastro = new javax.swing.JFormattedTextField();
        lblSenha2 = new javax.swing.JLabel();
        lblPlanoCadastro = new javax.swing.JLabel();
        jpnLista = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCadastro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jpnCadastro.setBackground(new java.awt.Color(102, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setText("CADASTRO DE ACIONISTAS");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel6.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel10.setText("Plano R$:");

        txtSenha2Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha2CadastroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel9.setText("Confirmar Senha: ");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel8.setText("Senha:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel7.setText("Usuário: ");

        btnCadastrar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        try {
            txtCpfCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial Black", 3, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("(1500,3000,5000)");

        try {
            txtPlanoCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPlanoCadastro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtUsuarioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCadastroActionPerformed(evt);
            }
        });

        lblSenha2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lblSenha2.setForeground(new java.awt.Color(204, 0, 0));
        lblSenha2.setToolTipText("");

        lblPlanoCadastro.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lblPlanoCadastro.setForeground(new java.awt.Color(204, 0, 0));
        lblPlanoCadastro.setToolTipText("");

        jpnCadastro.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(txtSenhaCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(txtSenha2Cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(txtCpfCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(txtPlanoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(txtNomeCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(txtUsuarioCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(lblSenha2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastro.setLayer(lblPlanoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jpnCadastroLayout = new javax.swing.GroupLayout(jpnCadastro);
        jpnCadastro.setLayout(jpnCadastroLayout);
        jpnCadastroLayout.setHorizontalGroup(
            jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastroLayout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jpnCadastroLayout.createSequentialGroup()
                        .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnCadastroLayout.createSequentialGroup()
                                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnCadastroLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSenhaCadastro)
                                            .addComponent(txtSenha2Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                                    .addGroup(jpnCadastroLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(txtUsuarioCadastro))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnCadastroLayout.createSequentialGroup()
                                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCpfCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txtPlanoCadastro)
                                    .addComponent(txtNomeCadastro)))
                            .addComponent(btnCadastrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(lblPlanoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSenha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(128, 128, 128))
        );
        jpnCadastroLayout.setVerticalGroup(
            jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(75, 75, 75)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCpfCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(txtPlanoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlanoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSenha2Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        getContentPane().add(jpnCadastro, "jpnCadastro");

        jpnLista.setBackground(new java.awt.Color(255, 255, 0));

        tbCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CPF", "PLANO R$", "USUÁRIO", "SENHA"
            }
        ));
        tbCadastro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbCadastro);

        jpnLista.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jpnListaLayout = new javax.swing.GroupLayout(jpnLista);
        jpnLista.setLayout(jpnListaLayout);
        jpnListaLayout.setHorizontalGroup(
            jpnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        jpnListaLayout.setVerticalGroup(
            jpnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnListaLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpnLista, "jpnLista");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenha2CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha2CadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenha2CadastroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        Acionista acionista = new Acionista();
        
        acionista.setNome(txtNomeCadastro.getText());
        acionista.setCpf(txtCpfCadastro.getText());
        PlanoCadastro = Float.parseFloat(this.txtPlanoCadastro.getText());
        acionista.setPlano(PlanoCadastro);
        acionista.setUsuario(txtUsuarioCadastro.getText());
        SenhaCadastro = new String(this.txtSenhaCadastro.getPassword()).trim();
        SenhaCadastro2 = new String(this.txtSenha2Cadastro.getPassword()).trim();
        if (((PlanoCadastro != 1500) && (PlanoCadastro != 3000) && (PlanoCadastro != 5000)) || (!(SenhaCadastro.equals(SenhaCadastro2)))){
            if((!(SenhaCadastro.equals(SenhaCadastro2)))){
                lblSenha2.setText("Senhas Incompatíveis!!!");

            }else if(SenhaCadastro.equals(SenhaCadastro2)){
                lblSenha2.setText("");
                acionista.setSenha(SenhaCadastro);

            }if((PlanoCadastro != 1500) && (PlanoCadastro != 3000) && (PlanoCadastro != 5000)){
                lblPlanoCadastro.setText("Plano Imcompatível!!!");
            }/*else if(UsuarioCadastro.equals(ABORT)){
                lblUsuarioCadastro.setText("Nome de usuário indisponível!!!");
            }*/

            else if ((PlanoCadastro == 1500) || (PlanoCadastro == 3000) || (PlanoCadastro == 5000)){
                lblPlanoCadastro.setText(" ");
                acionista.setPlano(PlanoCadastro);

            }
        }

        else {

            /*DefaultTableModel jTbCadastro = (DefaultTableModel) tbCadastro.getModel();
            Object[] dados= { PlanoCadastro,UsuarioCadastro,SenhaCadastro };
            jTbCadastro.addRow(dados);*/
            
            AcionistaDao dao = new AcionistaDao();
            dao.adicionar(acionista);
            
            
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com sucesso!");
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
            dispose();
            txtNomeCadastro.setText("");
            txtCpfCadastro.setText("");
            txtPlanoCadastro.setText("");
            txtUsuarioCadastro.setText("");
            txtSenhaCadastro.setText("");
            txtSenha2Cadastro.setText("");
            lblSenha2.setText("");
            lblPlanoCadastro.setText("");}

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtUsuarioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jpnCadastro;
    private javax.swing.JDesktopPane jpnLista;
    private javax.swing.JLabel lblPlanoCadastro;
    private javax.swing.JLabel lblSenha2;
    private javax.swing.JTable tbCadastro;
    private javax.swing.JFormattedTextField txtCpfCadastro;
    private javax.swing.JFormattedTextField txtNomeCadastro;
    private javax.swing.JFormattedTextField txtPlanoCadastro;
    private javax.swing.JPasswordField txtSenha2Cadastro;
    private javax.swing.JPasswordField txtSenhaCadastro;
    private javax.swing.JFormattedTextField txtUsuarioCadastro;
    // End of variables declaration//GEN-END:variables
}
