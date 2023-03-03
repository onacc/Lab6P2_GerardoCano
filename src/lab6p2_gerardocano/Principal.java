/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab6p2_gerardocano;

import java.util.ArrayList;
import javax.swing.JSpinner.DefaultEditor;

/**
 *
 * @author gcano
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        setLocationRelativeTo(null);
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

        jf_registro = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jtxt_user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxt_pw = new javax.swing.JTextField();
        js_age = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        btn_crear = new javax.swing.JButton();
        btn_regresar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jtxt_userlog = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_pwlogin = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();

        jLabel4.setText("Nombre de Usuario:");

        jLabel5.setText("Contraseña:");

        js_age.setModel(new javax.swing.SpinnerNumberModel(18, 1, 80, 1));

        jLabel6.setText("Edad");

        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jf_registroLayout = new javax.swing.GroupLayout(jf_registro.getContentPane());
        jf_registro.getContentPane().setLayout(jf_registroLayout);
        jf_registroLayout.setHorizontalGroup(
            jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_registroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_registroLayout.createSequentialGroup()
                        .addComponent(btn_crear)
                        .addGap(158, 158, 158)
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(js_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jtxt_user)
                        .addComponent(jtxt_pw, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jf_registroLayout.setVerticalGroup(
            jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_registroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtxt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jtxt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(js_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crear)
                    .addComponent(btn_regresar))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Spotify");

        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setText("Password:");

        btn_login.setText("Ingresar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_register.setText("Registrarse");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_login)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jtxt_userlog)
                                .addComponent(jLabel3)
                                .addComponent(jtxt_pwlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                            .addComponent(btn_register))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_userlog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_pwlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_login)
                .addGap(18, 18, 18)
                .addComponent(btn_register)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        setVisible(false);
        //js_age.getValue();
        ((DefaultEditor) js_age.getEditor()).getTextField().setEditable(false);
        jf_registro.setLocationRelativeTo(this);
        jf_registro.setVisible(true);
        jf_registro.setSize(600, 400);
        
        
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        int i = (int)js_age.getValue();
        //users.add(new Usuarios(jtxt_user.getText(),jtxt_pw.getText(),i));
        
        if(i<18){
            users.add(new Oyente(jtxt_user.getText(),jtxt_pw.getText(),i));
        }else{
             users.add(new Artista(jtxt_user.getText(),jtxt_pw.getText(),i));
        }
        jf_registro.setVisible(false);
        setVisible(true);
        jtxt_user.setText(" ");
        jtxt_pw.setText(" ");
    }//GEN-LAST:event_btn_crearActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        jf_registro.setVisible(false);
        setVisible(true);
        jtxt_user.setText(" ");
        jtxt_pw.setText(" ");
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        setVisible(false);
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUsername()==jtxt_userlog.getText()&& users.get(i) instanceof Oyente &&users.get(i).getPassword()==jtxt_pwlogin.getText() ){
                
                
            }else if(users.get(i).getUsername()==jtxt_userlog.getText()&& users.get(i) instanceof Artista &&users.get(i).getPassword()==jtxt_pwlogin.getText() ){
                
                
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JToggleButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JFrame jf_registro;
    private javax.swing.JSpinner js_age;
    private javax.swing.JTextField jtxt_pw;
    private javax.swing.JTextField jtxt_pwlogin;
    private javax.swing.JTextField jtxt_user;
    private javax.swing.JTextField jtxt_userlog;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuarios> users = new ArrayList();
}
