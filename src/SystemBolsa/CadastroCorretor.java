
package SystemBolsa;

import Controle.Corretor;
import Controle.CorretorDao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastroCorretor extends javax.swing.JFrame {

    public String ChaveCadastro;
    public String Senha2Corretor;
    public String SenhaCorretor;
    public CadastroCorretor() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jpnCadastroCorretor = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtChaveCadastro = new javax.swing.JFormattedTextField();
        txtNomeCorretor = new javax.swing.JFormattedTextField();
        txtUsuarioCorretor = new javax.swing.JFormattedTextField();
        txtCpfCorretor = new javax.swing.JFormattedTextField();
        txtSenhaCorretor = new javax.swing.JPasswordField();
        txtSenha2Corretor = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnCadastroCorretor = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCtpsCorretor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        lblChaveCadastro = new javax.swing.JLabel();
        lblSenhaCorretor = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCorretor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setLayout(new java.awt.CardLayout());

        jpnCadastroCorretor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel6.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel7.setText("Usuário: ");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel8.setText("Senha:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel9.setText("Confirmar Senha: ");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel10.setText("Chave para Cadastro:");

        txtChaveCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChaveCadastroActionPerformed(evt);
            }
        });

        try {
            txtCpfCorretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCorretor.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setText("CADASTRO DE CORRETORES");

        btnCadastroCorretor.setText("Cadastrar");
        btnCadastroCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroCorretorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel11.setText("Ctps:");

        try {
            txtCtpsCorretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setText("(Pis/Pased)");

        lblChaveCadastro.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lblChaveCadastro.setForeground(new java.awt.Color(204, 0, 0));

        lblSenhaCorretor.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lblSenhaCorretor.setForeground(new java.awt.Color(204, 0, 0));

        jpnCadastroCorretor.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(txtChaveCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(txtNomeCorretor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(txtUsuarioCorretor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(txtCpfCorretor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(txtSenhaCorretor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(txtSenha2Corretor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(btnCadastroCorretor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(txtCtpsCorretor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(lblChaveCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpnCadastroCorretor.setLayer(lblSenhaCorretor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jpnCadastroCorretorLayout = new javax.swing.GroupLayout(jpnCadastroCorretor);
        jpnCadastroCorretor.setLayout(jpnCadastroCorretorLayout);
        jpnCadastroCorretorLayout.setHorizontalGroup(
            jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCadastroCorretorLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jpnCadastroCorretorLayout.createSequentialGroup()
                        .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastroCorretor)
                            .addGroup(jpnCadastroCorretorLayout.createSequentialGroup()
                                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtChaveCadastro)
                                    .addComponent(txtNomeCorretor)
                                    .addComponent(txtCpfCorretor, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(txtUsuarioCorretor)
                                    .addComponent(txtSenhaCorretor)
                                    .addComponent(txtSenha2Corretor)
                                    .addComponent(txtCtpsCorretor))))
                        .addGap(18, 18, 18)
                        .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(lblChaveCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(lblSenhaCorretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(114, 229, Short.MAX_VALUE))
        );
        jpnCadastroCorretorLayout.setVerticalGroup(
            jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCadastroCorretorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(59, 59, 59)
                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChaveCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtChaveCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCpfCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCtpsCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsuarioCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSenhaCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenhaCorretor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnCadastroCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtSenha2Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCadastroCorretor)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jpnCadastroCorretor, "jpnCadastroCorretor");

        jDesktopPane2.setBackground(new java.awt.Color(204, 204, 204));

        tbCorretor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cpf", "Ctps(pis/pased)", "Usuário", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCorretor.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbCorretor);
        if (tbCorretor.getColumnModel().getColumnCount() > 0) {
            tbCorretor.getColumnModel().getColumn(0).setResizable(false);
            tbCorretor.getColumnModel().getColumn(1).setResizable(false);
            tbCorretor.getColumnModel().getColumn(2).setResizable(false);
            tbCorretor.getColumnModel().getColumn(3).setResizable(false);
            tbCorretor.getColumnModel().getColumn(4).setResizable(false);
        }

        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jDesktopPane2, "card3");

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroCorretorActionPerformed
        
        Corretor corretor = new Corretor();
        
        ChaveCadastro = this.txtChaveCadastro.getText();
        corretor.setChavecadastro(ChaveCadastro);
        corretor.setNome(txtNomeCorretor.getText());
        corretor.setCpf(txtCpfCorretor.getText());
        corretor.setCtps(txtCtpsCorretor.getText());
        corretor.setUsuario(txtUsuarioCorretor.getText());
        SenhaCorretor = new String (this.txtSenhaCorretor.getPassword()).trim();
        Senha2Corretor = new String(this.txtSenha2Corretor.getPassword()).trim();
        if((!(ChaveCadastro.equals("honesty"))) || (!(SenhaCorretor.equals(Senha2Corretor)))){
            if(!(ChaveCadastro.equals("honesty"))){
                lblChaveCadastro.setText("Chave de cadastro inválida!!!!");
                
            }else { lblChaveCadastro.setText(" "); 
                    corretor.setChavecadastro(ChaveCadastro);
            
            } if(!(SenhaCorretor.equals(Senha2Corretor))){
                lblSenhaCorretor.setText("Senhas Incompatíveis!!!!");
            }else{ lblSenhaCorretor.setText(" ");   
                  corretor.setSenha(SenhaCorretor);}
            
            
        }else{
            /*DefaultTableModel jTbCadastroCorretor = (DefaultTableModel) tbCorretor.getModel();
            Object[] dados= {NomeCorretor,CpfCorretor, CtpsCorretor,UsuarioCorretor,SenhaCorretor };
            jTbCadastroCorretor.addRow(dados);*/
            
            CorretorDao dao = new CorretorDao();
            dao.adicionar(corretor);
            
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com sucesso!");
            LoginCorretor tela = new LoginCorretor();
            tela.setVisible(true);
            dispose();
            txtNomeCorretor.setText("");
            txtCpfCorretor.setText("");
            txtCtpsCorretor.setText("");
            txtUsuarioCorretor.setText("");
            txtSenhaCorretor.setText("");
            txtSenha2Corretor.setText("");
            lblSenhaCorretor.setText("");
            lblChaveCadastro.setText("");
        }
                
    }//GEN-LAST:event_btnCadastroCorretorActionPerformed

    private void txtChaveCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChaveCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChaveCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCorretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCorretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCorretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCorretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCorretor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCorretor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jpnCadastroCorretor;
    private javax.swing.JLabel lblChaveCadastro;
    private javax.swing.JLabel lblSenhaCorretor;
    private javax.swing.JTable tbCorretor;
    private javax.swing.JFormattedTextField txtChaveCadastro;
    private javax.swing.JFormattedTextField txtCpfCorretor;
    private javax.swing.JFormattedTextField txtCtpsCorretor;
    private javax.swing.JFormattedTextField txtNomeCorretor;
    private javax.swing.JPasswordField txtSenha2Corretor;
    private javax.swing.JPasswordField txtSenhaCorretor;
    private javax.swing.JFormattedTextField txtUsuarioCorretor;
    // End of variables declaration//GEN-END:variables
}
