package eadprojecttest;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setIcon();
        setTitle("Airline Reservation System");
        this.setLocationRelativeTo(null);
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_not_a_member = new javax.swing.JLabel();
        lbl_signup = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        lbl_created_by = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_adminlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel1.setBackground(new java.awt.Color(119, 67, 219));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));

        lbl_username.setBackground(new java.awt.Color(204, 204, 204));
        lbl_username.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(252, 253, 242));
        lbl_username.setText("Username");

        lbl_password.setBackground(new java.awt.Color(204, 204, 204));
        lbl_password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(252, 253, 242));
        lbl_password.setText("Password");

        lbl_not_a_member.setBackground(new java.awt.Color(204, 204, 204));
        lbl_not_a_member.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_not_a_member.setForeground(new java.awt.Color(252, 253, 242));
        lbl_not_a_member.setText("Not a Member Yet?");

        lbl_signup.setBackground(new java.awt.Color(204, 204, 204));
        lbl_signup.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_signup.setForeground(new java.awt.Color(252, 253, 242));
        lbl_signup.setText("Signup Here");

        btn_signup.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_signup.setText("Signup");
        btn_signup.setFocusPainted(false);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        lbl_created_by.setBackground(new java.awt.Color(204, 204, 204));
        lbl_created_by.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_created_by.setForeground(new java.awt.Color(252, 253, 242));
        lbl_created_by.setText("Created by CODSE213F-024");

        lbl_login.setBackground(new java.awt.Color(204, 204, 204));
        lbl_login.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(252, 253, 242));
        lbl_login.setText("LOGIN");

        txt_username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_login.setText("Login");
        btn_login.setFocusPainted(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(59, 52, 134));

        main_logo.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        main_logo.setForeground(new java.awt.Color(255, 255, 255));
        main_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/main_logo_large.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(main_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txt_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_adminlogin.setBackground(new java.awt.Color(59, 52, 134));
        btn_adminlogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_adminlogin.setForeground(new java.awt.Color(252, 253, 242));
        btn_adminlogin.setText("Admin Login");
        btn_adminlogin.setFocusPainted(false);
        btn_adminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_not_a_member)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_adminlogin)
                                .addGap(86, 86, 86)
                                .addComponent(lbl_created_by, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_username)
                .addGap(1, 1, 1)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_not_a_member, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_created_by)
                    .addComponent(btn_adminlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
            Signup user_signup=new Signup();
            Login.this.setVisible(false);
            user_signup.setVisible(true);
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String name,password;
        name = txt_username.getText();
        password = String.valueOf(txt_password.getPassword());
        int isLogin=0;
        
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Username Cannot be Empty", "Invalid Login Details",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(password.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Password Cannot be Empty", "Invalid Login Details",JOptionPane.INFORMATION_MESSAGE); 
        }
        else {
            String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";
            try  {
               Connection con = DriverManager.getConnection(dbpath,"root","");
               Statement st = con.createStatement();
               ResultSet result = st.executeQuery("SELECT username,password,FirstName,UserID FROM user WHERE Username='"+name+"' AND Password='"+password+"'");
                
               while(result.next()) {
                if (name.equals(result.getString(1)) && password.equals(result.getString(2)))  {
                     isLogin=1;
                     User_Dashboard user_dashboard=new User_Dashboard();
                     user_dashboard.setName(result.getString(3));
                     user_dashboard.setID(result.getString(4));
                     Login.this.setVisible(false);
                     user_dashboard.setVisible(true);
                   }
                else {
                    isLogin=0;
                }
                }
               if (isLogin==0) {
                   JOptionPane.showMessageDialog(null,"Incorrect Username and/or Password", "Login",JOptionPane.INFORMATION_MESSAGE);
               } 
            }
            catch(SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }            
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_adminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminloginActionPerformed
            Admin_Login admin_login=new Admin_Login();
            Login.this.setVisible(false);
            admin_login.setVisible(true);
    }//GEN-LAST:event_btn_adminloginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adminlogin;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_created_by;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_not_a_member;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_signup;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel main_logo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}