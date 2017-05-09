/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager_haroldmendoza_11541045;

import javax.swing.JOptionPane;

/**
 *
 * @author Harold Mendoza
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Task Manager | Harold Mendoza");
        agregar();
        login(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        PanelLogin = new javax.swing.JPanel();
        jl_usuario = new javax.swing.JLabel();
        tf_login = new javax.swing.JTextField();
        jl_password = new javax.swing.JLabel();
        pf_passwordField = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bt_cpu = new javax.swing.JButton();
        bt_hdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bt_ram = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItem_xml = new javax.swing.JMenuItem();
        MenuItem_ftp = new javax.swing.JMenuItem();
        MenuItem_Bitacora = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItem_logoff = new javax.swing.JMenuItem();

        jd_login.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        PanelLogin.setBackground(new java.awt.Color(8, 33, 61));
        PanelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelLogin.setInheritsPopupMenu(true);
        PanelLogin.setName("PanelLogin"); // NOI18N

        jl_usuario.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jl_usuario.setForeground(new java.awt.Color(243, 55, 55));
        jl_usuario.setText("usuario");

        jl_password.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jl_password.setForeground(new java.awt.Color(243, 55, 55));
        jl_password.setText("contraseña");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1494300240_Services.png"))); // NOI18N

        logo2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        logo2.setForeground(new java.awt.Color(243, 55, 55));
        logo2.setText("task manager");

        bt_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1494300717_arrow_right.png"))); // NOI18N
        bt_login.setBorderPainted(false);
        bt_login.setContentAreaFilled(false);
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 169, 236));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_1494293700_power.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jl_usuario)
                        .addComponent(tf_login)
                        .addComponent(jl_password)
                        .addComponent(pf_passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                    .addComponent(logo2)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(bt_login)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jl_usuario)
                .addGap(18, 18, 18)
                .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl_password)
                .addGap(18, 18, 18)
                .addComponent(pf_passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(243, 55, 55));

        jLabel4.setBackground(new java.awt.Color(76, 76, 76));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(8, 33, 61));
        jLabel4.setText("CPU");

        bt_cpu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1494229156_Microprocessor.png"))); // NOI18N
        bt_cpu.setBorderPainted(false);
        bt_cpu.setContentAreaFilled(false);

        bt_hdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1494293653_hard-disks.png"))); // NOI18N
        bt_hdd.setBorderPainted(false);
        bt_hdd.setContentAreaFilled(false);

        jLabel5.setBackground(new java.awt.Color(76, 76, 76));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel5.setText("HDD");

        bt_ram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1494229100_ram.png"))); // NOI18N
        bt_ram.setBorderPainted(false);
        bt_ram.setContentAreaFilled(false);
        bt_ram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ramActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 33, 61));
        jLabel1.setText("RAM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(bt_cpu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(bt_hdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(bt_ram)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1)
                        .addGap(130, 130, 130))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bt_cpu)
                        .addComponent(bt_ram, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(bt_hdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(242, 241, 239));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(8, 33, 61));
        jMenuBar1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(8, 33, 61));
        jMenu1.setText("File");

        MenuItem_xml.setBackground(new java.awt.Color(242, 241, 239));
        MenuItem_xml.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        MenuItem_xml.setForeground(new java.awt.Color(8, 33, 61));
        MenuItem_xml.setText("Crear XML");
        jMenu1.add(MenuItem_xml);

        MenuItem_ftp.setBackground(new java.awt.Color(242, 241, 239));
        MenuItem_ftp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        MenuItem_ftp.setForeground(new java.awt.Color(8, 33, 61));
        MenuItem_ftp.setText("Enviar FTP");
        jMenu1.add(MenuItem_ftp);

        MenuItem_Bitacora.setBackground(new java.awt.Color(242, 241, 239));
        MenuItem_Bitacora.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        MenuItem_Bitacora.setForeground(new java.awt.Color(8, 33, 61));
        MenuItem_Bitacora.setText("Bitacora");
        MenuItem_Bitacora.setContentAreaFilled(false);
        jMenu1.add(MenuItem_Bitacora);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(8, 33, 61));
        jMenu2.setText("Edit");

        menuItem_logoff.setText("Log Off");
        menuItem_logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_logoffActionPerformed(evt);
            }
        });
        jMenu2.add(menuItem_logoff);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        // TODO add your handling code here:
         if (validarContacto(tf_login.getText(), pf_passwordField.getText())) {
            
            //JOptionPane.showMessageDialog(this.jd_login, "Se Ingreso Exitosamente");
            this.jd_login.setVisible(false);
            this.setVisible(true);
            this.setTitle("Task Manager | Harold Mendoza");
            //JOptionPane.showMessageDialog(this, "Ha Ingresado al Sistema Exitosamente");
        } else {
            JOptionPane.showMessageDialog(this.jd_login, "Usuario Incorrecto");
        }
        tf_login.setText("");
        pf_passwordField.setText("");
    }//GEN-LAST:event_bt_loginActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_ramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ramActionPerformed

    private void menuItem_logoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_logoffActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login(true);
    }//GEN-LAST:event_menuItem_logoffActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem_Bitacora;
    private javax.swing.JMenuItem MenuItem_ftp;
    private javax.swing.JMenuItem MenuItem_xml;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JButton bt_cpu;
    private javax.swing.JButton bt_hdd;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_ram;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDialog jd_login;
    private javax.swing.JLabel jl_password;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    private javax.swing.JMenuItem menuItem_logoff;
    private javax.swing.JPasswordField pf_passwordField;
    private javax.swing.JTextField tf_login;
    // End of variables declaration//GEN-END:variables


    administrarUsuarios usuarios = new administrarUsuarios("./Usuarios.txt"); 
    Usuario administrador = new Usuario("admin", "123");
    Usuario usuarioActual; 


    private boolean validarContacto(String nombre, String contraseña) {
        for (Usuario temp : usuarios.getListaUsuarios()) {
            if (nombre.equals(temp.getNombre()) && contraseña.equals(temp.getContraseña())) {
                usuarioActual=temp; 
                return true;
            }
        }
        return false;

    }
    
    private void login(boolean show){
        if(show){
            this.jd_login.setModal(true); // cuando las subventas se muestre, bloqueara el frame principal
            this.jd_login.pack(); //Redimensiona la ventana dependiendo de los controles que tenga en el frame
            this.jd_login.setLocationRelativeTo(this);
            this.jd_login.setVisible(true);
            this.jd_login.setTitle("Login| Task Manager | Harold Mendoza");
        }
    
    }
    private void agregar() { // se agrega el administrador al arreglo de usuarios
        usuarios.cargarArchivo();  
    }
    



}
