package view;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
	initComponents();
	setIconImage(new javax.swing.ImageIcon(getClass().getResource("/model/picture/iconLogin,png.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_login = new javax.swing.JLabel();
        jLabel2_senha = new javax.swing.JLabel();
        jButton1_login = new javax.swing.JButton();
        jTextField1_login = new javax.swing.JTextField();
        jPasswordField1_senha = new javax.swing.JPasswordField();
        jLabel3_iconePrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jLabel1_login.setText("Login");

        jLabel2_senha.setText("Senha");

        jButton1_login.setText("Entrar");
        jButton1_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_loginActionPerformed(evt);
            }
        });

        jLabel3_iconePrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/picture/iconLogin,png.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_login)
                    .addComponent(jLabel2_senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1_senha)
                    .addComponent(jTextField1_login, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jLabel3_iconePrincipal)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jButton1_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3_iconePrincipal)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_login)
                    .addComponent(jTextField1_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_senha)
                    .addComponent(jPasswordField1_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1_login)
                .addGap(65, 65, 65))
        );

        setSize(new java.awt.Dimension(309, 361));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_loginActionPerformed
	// here 
	String login = jTextField1_login.getText();
	String senha = jPasswordField1_senha.getText();

	if (camposPreenchidos(login, senha)) {
	    //if(){
		TelaPrincipal tp = new TelaPrincipal();
		tp.setVisible(true);
	    //}

	}
    }//GEN-LAST:event_jButton1_loginActionPerformed

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
	    java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new TelaLogin().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_login;
    private javax.swing.JLabel jLabel1_login;
    private javax.swing.JLabel jLabel2_senha;
    private javax.swing.JLabel jLabel3_iconePrincipal;
    private javax.swing.JPasswordField jPasswordField1_senha;
    private javax.swing.JTextField jTextField1_login;
    // End of variables declaration//GEN-END:variables

    private boolean camposPreenchidos(String login, String senha) {
	String mensagem = "Preencha o(s) campo(s) \n";
	boolean resultado = true;

	if (login.equals("")) {
	    mensagem += "*login\n";
	    resultado = false;
	}

	if (senha.equals("")) {
	    mensagem += "*senha";
	    resultado = false;
	}

	if (!resultado) {
	    JOptionPane.showMessageDialog(null, mensagem);
	}
	return resultado;
    }
}
