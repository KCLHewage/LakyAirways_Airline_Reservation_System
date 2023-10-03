package eadprojecttest;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Add_Users extends javax.swing.JFrame {
    private String name,id;
    private String flightID, flightName, startLocation, endLocation,departureDate,departureTime,arrivalDate,arrivalTime,gate;


    public Add_Users() {
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
    }
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_dashboard1 = new javax.swing.JLabel();
        lbl_dashboard2 = new javax.swing.JLabel();
        FirstNameText1 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        LastNameText = new javax.swing.JLabel();
        txt_lname = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        LastNameText1 = new javax.swing.JLabel();
        LastNameText2 = new javax.swing.JLabel();
        LastNameText3 = new javax.swing.JLabel();
        txt_tp = new javax.swing.JTextField();
        LastNameText4 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        LastNameText5 = new javax.swing.JLabel();
        LastNameText7 = new javax.swing.JLabel();
        txt_dob = new org.jdesktop.swingx.JXDatePicker();
        rdb_male = new javax.swing.JRadioButton();
        rdb_female = new javax.swing.JRadioButton();
        txt_username = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel1.setBackground(new java.awt.Color(119, 67, 219));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));

        jPanel2.setBackground(new java.awt.Color(59, 52, 134));

        main_logo.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        main_logo.setForeground(new java.awt.Color(255, 255, 255));
        main_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/main_logo_large.png"))); // NOI18N

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(252, 253, 242));
        lbl_welcome.setText("Welcome User");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_back.setBackground(new java.awt.Color(119, 67, 219));
        btn_back.setForeground(new java.awt.Color(255, 233, 177));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/back.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(251, 187, 90));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbl_dashboard1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_dashboard1.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard1.setText("ADD USERS");

        lbl_dashboard2.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dashboard2.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard2.setText("USER INFORMATION");

        FirstNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText1.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText1.setText("FirstName");

        txt_fname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });

        LastNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText.setText("LastName");

        txt_lname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_cancel.setBackground(new java.awt.Color(59, 52, 134));
        btn_cancel.setForeground(new java.awt.Color(255, 233, 177));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_confirm.setBackground(new java.awt.Color(59, 52, 134));
        btn_confirm.setForeground(new java.awt.Color(255, 233, 177));
        btn_confirm.setText("Add");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        LastNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText1.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText1.setText("DOB");

        LastNameText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText2.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText2.setText("Gender");

        LastNameText3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText3.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText3.setText("MobileNo");

        txt_tp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        LastNameText4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText4.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText4.setText("Username");

        txt_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        LastNameText5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText5.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText5.setText("Password");

        LastNameText7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText7.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText7.setText("Address");

        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });

        rdb_male.setBackground(new java.awt.Color(119, 67, 219));
        buttonGroup1.add(rdb_male);
        rdb_male.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rdb_male.setForeground(new java.awt.Color(240, 240, 240));
        rdb_male.setText("Male");

        rdb_female.setBackground(new java.awt.Color(119, 67, 219));
        buttonGroup1.add(rdb_female);
        rdb_female.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rdb_female.setForeground(new java.awt.Color(240, 240, 240));
        rdb_female.setText("Female");

        txt_username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        txt_address.setColumns(20);
        txt_address.setRows(5);
        jScrollPane1.setViewportView(txt_address);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameText1)
                                    .addComponent(LastNameText)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_lname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_fname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LastNameText3)
                                    .addComponent(LastNameText1)
                                    .addComponent(LastNameText2)
                                    .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdb_male)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdb_female)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastNameText7)
                                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameText5)
                                    .addComponent(LastNameText4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lbl_dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_back)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LastNameText7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LastNameText4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LastNameText5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FirstNameText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(LastNameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LastNameText1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(LastNameText2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb_male)
                            .addComponent(rdb_female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LastNameText3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        Admin_Users admin_users=new Admin_Users();
        Add_Users.this.setVisible(false);
        admin_users.setName(name);
        admin_users.setID(id);
        admin_users.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Admin_Users admin_users=new Admin_Users();
        Add_Users.this.setVisible(false);
        admin_users.setName(name);
        admin_users.setID(id);
        admin_users.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        String fname,lname,gender,dob,address,tp,username,password;
        dob=null;
        
        username = txt_username.getText();
        password = txt_password.getText();
        fname = txt_fname.getText();
        lname = txt_lname.getText();
        
        Date empty_dob =txt_dob.getDate();
        DateFormat dformat =new SimpleDateFormat("yyyy-MM-dd");
        if(txt_dob.getDate() != null) {
              dob = dformat.format(empty_dob);
        }

        if (rdb_male.isSelected()) {
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
        else if(txt_dob.getDate() == null) {
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
                    JOptionPane.showMessageDialog(null,"Successfully Added", "Users",JOptionPane.INFORMATION_MESSAGE);
                    Admin_Users admin_users=new Admin_Users();
                    Add_Users.this.setVisible(false);
                    admin_users.setName(name);
                    admin_users.setID(id);
                    admin_users.setVisible(true);
                }
            }
            catch(SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login user_login=new Login();
        Add_Users.this.setVisible(false);
        user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JLabel LastNameText1;
    private javax.swing.JLabel LastNameText2;
    private javax.swing.JLabel LastNameText3;
    private javax.swing.JLabel LastNameText4;
    private javax.swing.JLabel LastNameText5;
    private javax.swing.JLabel LastNameText7;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_logout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_dashboard1;
    private javax.swing.JLabel lbl_dashboard2;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    private javax.swing.JRadioButton rdb_female;
    private javax.swing.JRadioButton rdb_male;
    private javax.swing.JTextArea txt_address;
    private org.jdesktop.swingx.JXDatePicker txt_dob;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_tp;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
