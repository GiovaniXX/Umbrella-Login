package Umbrella_Custom_Design;

import Classes.Dados;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Login_Custom extends javax.swing.JFrame {

    public Login_Custom() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textField_usuario = new UI_Custom.TextField();
        passwordField_codigo = new UI_Custom.PasswordField();
        passwordField_chave = new UI_Custom.PasswordField();
        button_Entrar = new UI_Custom.Button();
        button_Sair = new UI_Custom.Button();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Umbrella Login Custom™");
        setMaximumSize(new java.awt.Dimension(936, 248));
        setMinimumSize(new java.awt.Dimension(936, 248));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(936, 248));

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(936, 248));
        jPanel1.setMinimumSize(new java.awt.Dimension(936, 248));
        jPanel1.setPreferredSize(new java.awt.Dimension(936, 248));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Umbrella_Imagens/00.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(691, 222));
        jPanel2.setMinimumSize(new java.awt.Dimension(691, 222));
        jPanel2.setPreferredSize(new java.awt.Dimension(691, 222));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Umbrella_Imagens/04.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 13, 190, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Umbrella_Imagens/07.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 40));

        textField_usuario.setBackground(new java.awt.Color(8, 13, 32));
        textField_usuario.setBorder(null);
        textField_usuario.setForeground(new java.awt.Color(255, 255, 255));
        textField_usuario.setLabelText("Entre com seu usuario de acesso");
        jPanel2.add(textField_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 16, 492, 45));

        passwordField_codigo.setBackground(new java.awt.Color(8, 13, 32));
        passwordField_codigo.setBorder(null);
        passwordField_codigo.setForeground(new java.awt.Color(255, 255, 255));
        passwordField_codigo.setLabelText("Entre com seu codigo de acesso");
        jPanel2.add(passwordField_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 492, 45));

        passwordField_chave.setBackground(new java.awt.Color(8, 13, 32));
        passwordField_chave.setBorder(null);
        passwordField_chave.setForeground(new java.awt.Color(255, 255, 255));
        passwordField_chave.setLabelText("Entre com sua chave de acesso");
        jPanel2.add(passwordField_chave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 124, 492, 45));

        button_Entrar.setBackground(new java.awt.Color(8, 13, 32));
        button_Entrar.setBorder(null);
        button_Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Umbrella_Imagens/03.png"))); // NOI18N
        button_Entrar.setColor(new java.awt.Color(8, 13, 32));
        button_Entrar.setColorClick(new java.awt.Color(8, 13, 32));
        button_Entrar.setColorOver(new java.awt.Color(0, 204, 0));
        button_Entrar.setRadius(25);
        button_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EntrarActionPerformed(evt);
            }
        });
        jPanel2.add(button_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 175, 150, 40));

        button_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Umbrella_Imagens/02.png"))); // NOI18N
        button_Sair.setColor(new java.awt.Color(8, 13, 32));
        button_Sair.setColorClick(new java.awt.Color(8, 13, 32));
        button_Sair.setColorOver(new java.awt.Color(255, 51, 0));
        button_Sair.setMaximumSize(new java.awt.Dimension(32, 32));
        button_Sair.setMinimumSize(new java.awt.Dimension(32, 32));
        button_Sair.setPreferredSize(new java.awt.Dimension(32, 32));
        button_Sair.setRadius(25);
        button_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SairActionPerformed(evt);
            }
        });
        jPanel2.add(button_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 175, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Umbrella_Imagens/01.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 14, 680, 208));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button_SairActionPerformed

    private void button_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EntrarActionPerformed
        Dados dados = new Dados();
        if (!dados.validar_Usuario(textField_usuario.getText(),
                new String(passwordField_codigo.getPassword()),
                new String(passwordField_chave.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Acesso Negado!", "ERROR", JOptionPane.ERROR_MESSAGE);
            textField_usuario.setText("");
            passwordField_codigo.setText("");
            passwordField_chave.setText("");
            return;
        }

        Umbrella_Info ui = new Umbrella_Info();
        ui.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_EntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Custom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Custom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Custom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Custom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Custom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI_Custom.Button button_Entrar;
    private UI_Custom.Button button_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private UI_Custom.PasswordField passwordField_chave;
    private UI_Custom.PasswordField passwordField_codigo;
    private UI_Custom.TextField textField_usuario;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Umbrella_Icones/Icon.jpg")));
    }
}
