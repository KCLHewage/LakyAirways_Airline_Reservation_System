package eadprojecttest;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;  
import javax.swing.JOptionPane;
import java.sql.*;


public class Signup extends javax.swing.JFrame {

    public Signup() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();
        lbl_member = new javax.swing.JLabel();
        OwnerName9 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        OwnerName3 = new javax.swing.JLabel();
        lbl_signup = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        btn_signup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        txt_tp = new javax.swing.JTextField();
        lbl_username1 = new javax.swing.JLabel();
        lbl_password1 = new javax.swing.JLabel();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        dobpicker = new org.jdesktop.swingx.JXDatePicker();
        txt_lastname = new javax.swing.JTextField();
        lbl_dob1 = new javax.swing.JLabel();
        lbl_dob2 = new javax.swing.JLabel();
        lbl_password2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        txt_firstname = new javax.swing.JTextField();
        lbl_name1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel1.setBackground(new java.awt.Color(119, 67, 219));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));

        lbl_name.setBackground(new java.awt.Color(204, 204, 204));
        lbl_name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(252, 253, 242));
        lbl_name.setText("First Name");

        lbl_dob.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dob.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_dob.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dob.setText("DOB");

        lbl_member.setBackground(new java.awt.Color(204, 204, 204));
        lbl_member.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_member.setForeground(new java.awt.Color(252, 253, 242));
        lbl_member.setText("Already a Member?");

        OwnerName9.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName9.setForeground(new java.awt.Color(252, 253, 242));
        OwnerName9.setText("Login Here");

        btn_login.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setFocusPainted(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        OwnerName3.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        OwnerName3.setForeground(new java.awt.Color(252, 253, 242));
        OwnerName3.setText("Created by CODSE213F-024");

        lbl_signup.setBackground(new java.awt.Color(204, 204, 204));
        lbl_signup.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_signup.setForeground(new java.awt.Color(252, 253, 242));
        lbl_signup.setText("SIGNUP");

        txt_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_signup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_signup.setText("Signup");
        btn_signup.setFocusPainted(false);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
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
                .addComponent(main_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txt_tp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_username1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_username1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_username1.setForeground(new java.awt.Color(252, 253, 242));
        lbl_username1.setText("Gender");

        lbl_password1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_password1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_password1.setForeground(new java.awt.Color(252, 253, 242));
        lbl_password1.setText("Mobile No");

        rbtn_male.setBackground(new java.awt.Color(119, 67, 219));
        buttonGroup1.add(rbtn_male);
        rbtn_male.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbtn_male.setForeground(new java.awt.Color(204, 204, 204));
        rbtn_male.setSelected(true);
        rbtn_male.setText("Male");

        rbtn_female.setBackground(new java.awt.Color(119, 67, 219));
        buttonGroup1.add(rbtn_female);
        rbtn_female.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbtn_female.setForeground(new java.awt.Color(204, 204, 204));
        rbtn_female.setText("Female");

        txt_lastname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_dob1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dob1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_dob1.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dob1.setText("Username");

        lbl_dob2.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dob2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_dob2.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dob2.setText("Password");

        lbl_password2.setBackground(new java.awt.Color(204, 204, 204));
        lbl_password2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_password2.setForeground(new java.awt.Color(252, 253, 242));
        lbl_password2.setText("Address");

        txt_address.setColumns(20);
        txt_address.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_address.setRows(5);
        jScrollPane1.setViewportView(txt_address);

        txt_firstname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_name1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_name1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_name1.setForeground(new java.awt.Color(252, 253, 242));
        lbl_name1.setText("Last Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OwnerName9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_member)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbl_password1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_username1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_password2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_dob1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_dob2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(209, 209, 209))))
                            .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dobpicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rbtn_male)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbtn_female))
                                .addComponent(txt_firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(txt_lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(txt_tp)
                                .addComponent(txt_username)
                                .addComponent(txt_password)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                            .addGap(89, 89, 89))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(OwnerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lbl_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lbl_password2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_dob1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_dob2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_dob)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(dobpicker, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtn_male)
                            .addComponent(rbtn_female)
                            .addComponent(lbl_username1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_password1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_member, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OwnerName9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OwnerName3)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        String fname,lname,gender,dob,address,tp,username,password;
        dob=null;
        
        username = txt_username.getText();
        password = txt_password.getText();
        fname = txt_firstname.getText();
        lname = txt_lastname.getText();
        
        Date empty_dob =dobpicker.getDate();
        DateFormat dformat =new SimpleDateFormat("yyyy-MM-dd");
        if(dobpicker.getDate() != null) {
              dob = dformat.format(empty_dob);
        }

        if (rbtn_male.isSelected()) {
            gender ="Male";
        }
        else {
            gender = "Female";
        }
        tp = txt_tp.getText();
        address = txt_address.getText();
        
        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(tp); 

        if(fname.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Enter your First name", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(lname.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Enter your Last name", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(dobpicker.getDate() == null) {
             JOptionPane.showMessageDialog(null,"Select a Date", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if (tp.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Enter your Mobile Number", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if (!(m.matches())) {
            JOptionPane.showMessageDialog(null,"Enter 10 Numbers ONLY", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(address.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Enter your Address", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Username Cannot be Empty", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(password.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Password Cannot be Empty", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else {
            String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";
            try  {
                Connection con = DriverManager.getConnection(dbpath,"root","");
                Statement st = con.createStatement();
                int row_count = st.executeUpdate("INSERT INTO user (Username, Password, FirstName, LastName, DOB, Gender, Address, MobileNo) VALUES ('"+username+"','"+password+"','"+fname+"','"+lname+"','"+dob+"','"+gender+"','"+address+"','"+tp+"')");
                if (row_count>0)  {
                    JOptionPane.showMessageDialog(null,"Successfully Registered", "Signup",JOptionPane.INFORMATION_MESSAGE);
                    Login user_login=new Login();
                    Signup.this.setVisible(false);
                    user_login.setVisible(true);
                }
            }
            catch(SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
            Login user_login=new Login();
            Signup.this.setVisible(false);
            user_login.setVisible(true);
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OwnerName3;
    private javax.swing.JLabel OwnerName9;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdesktop.swingx.JXDatePicker dobpicker;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_dob1;
    private javax.swing.JLabel lbl_dob2;
    private javax.swing.JLabel lbl_member;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_password1;
    private javax.swing.JLabel lbl_password2;
    private javax.swing.JLabel lbl_signup;
    private javax.swing.JLabel lbl_username1;
    private javax.swing.JLabel main_logo;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_tp;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
