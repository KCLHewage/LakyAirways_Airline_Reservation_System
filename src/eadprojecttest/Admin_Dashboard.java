package eadprojecttest;

import java.awt.Toolkit;

public class Admin_Dashboard extends javax.swing.JFrame {
    private String name,id;

    public Admin_Dashboard() {
        initComponents();
        setIcon();
        setTitle("Airline Reservation System");
        this.setLocationRelativeTo(null);
        
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    public void setName(String name)
    {
        this.name=name;
        lbl_welcome.setText("Welcome "+name);
    }
    public void setID(String id)
    {
        this.id=id;
        lbl_adminID.setText(id);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        lbl_welcome = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();
        btn_users = new javax.swing.JButton();
        btn_flights = new javax.swing.JButton();
        btn_bookings = new javax.swing.JButton();
        btn_aboutus = new javax.swing.JButton();
        FlightNoHeader2 = new javax.swing.JLabel();
        lbl_adminID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel1.setBackground(new java.awt.Color(119, 67, 219));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));

        lbl_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard.setText("ADMIN DASHBOARD");

        jPanel2.setBackground(new java.awt.Color(59, 52, 134));

        main_logo.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        main_logo.setForeground(new java.awt.Color(255, 255, 255));
        main_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/main_logo_large.png"))); // NOI18N

        btn_logout.setBackground(new java.awt.Color(59, 52, 134));
        btn_logout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 233, 177));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/logout.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.setFocusPainted(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(252, 253, 242));
        lbl_welcome.setText("Welcome Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btn_report.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/button2.png"))); // NOI18N
        btn_report.setText("Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        btn_users.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/button4.png"))); // NOI18N
        btn_users.setText("Users");
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });

        btn_flights.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_flights.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/button1.png"))); // NOI18N
        btn_flights.setText("Flights");
        btn_flights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_flightsActionPerformed(evt);
            }
        });

        btn_bookings.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/button3.png"))); // NOI18N
        btn_bookings.setText("Bookings");
        btn_bookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingsActionPerformed(evt);
            }
        });

        btn_aboutus.setBackground(new java.awt.Color(119, 67, 219));
        btn_aboutus.setForeground(new java.awt.Color(255, 233, 177));
        btn_aboutus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/info.png"))); // NOI18N
        btn_aboutus.setText("About Us");
        btn_aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutusActionPerformed(evt);
            }
        });

        FlightNoHeader2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNoHeader2.setForeground(new java.awt.Color(255, 233, 177));
        FlightNoHeader2.setText("AdminID -");

        lbl_adminID.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_adminID.setForeground(new java.awt.Color(255, 233, 177));
        lbl_adminID.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aboutus)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_flights, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FlightNoHeader2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_adminID)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_adminID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_flights, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_aboutus)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutusActionPerformed
        About user_about=new About();
        user_about.setVisible(true);
    }//GEN-LAST:event_btn_aboutusActionPerformed

    private void btn_bookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingsActionPerformed
        if (true) {
            Admin_Bookings admin_bookings=new Admin_Bookings();
            admin_bookings.setID(id);
            admin_bookings.setName(name);
            Admin_Dashboard.this.setVisible(false);
            admin_bookings.setVisible(true);
        }
    }//GEN-LAST:event_btn_bookingsActionPerformed

    private void btn_flightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_flightsActionPerformed
        if (true) {
            Admin_Flights admin_flights=new Admin_Flights();
            admin_flights.setID(id);
            admin_flights.setName(name);
            Admin_Dashboard.this.setVisible(false);
            admin_flights.setVisible(true);
        }
    }//GEN-LAST:event_btn_flightsActionPerformed

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
            Admin_Users admin_users=new Admin_Users();
            admin_users.setID(id);
            admin_users.setName(name);
            Admin_Dashboard.this.setVisible(false);
            admin_users.setVisible(true);
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        if (true) {
            View_Availability flight_availability=new View_Availability();
            Admin_Dashboard.this.setVisible(false);
            flight_availability.setVisible(true);
        }
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login user_login=new Login();
        Admin_Dashboard.this.setVisible(false);
        user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlightNoHeader2;
    private javax.swing.JButton btn_aboutus;
    private javax.swing.JButton btn_bookings;
    private javax.swing.JButton btn_flights;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_users;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_adminID;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    // End of variables declaration//GEN-END:variables
}
