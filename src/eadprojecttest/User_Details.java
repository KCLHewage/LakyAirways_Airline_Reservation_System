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
import javax.swing.JOptionPane;
import java.util.regex.*;  

public class User_Details extends javax.swing.JFrame {
    private String name,id;

    public User_Details() {
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
    
    public void setUserDetails()
    {
        String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";
            try
            {
               Connection con = DriverManager.getConnection(dbpath,"root","");
               Statement st = con.createStatement();
               ResultSet result = st.executeQuery("SELECT Username,FirstName,LastName,DOB,Address,MobileNo FROM user WHERE UserID='"+id+"'");
                
               while(result.next()){
                 
                    lbl_id.setText(id);
                    lbl_username.setText(result.getString(1));
                    lbl_fname.setText(result.getString(2));
                    lbl_lname.setText(result.getString(3));
                    lbl_dob.setText(result.getString(4));
                    lbl_address.setText(result.getString(5));
                    lbl_tp.setText(result.getString(6));
                }            
            }
            catch(SQLException ex)
            {
                System.out.println(ex.getMessage());
            } 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        FirstNameText1 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        LastNameText = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        txt_lname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        PassportNoText = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        lbl_dashboard2 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        lbl_subheader1 = new javax.swing.JLabel();
        lbl_dashboard3 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        LastNameText1 = new javax.swing.JLabel();
        txt_tp = new javax.swing.JTextField();
        lbl_subheader2 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_subheader3 = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        lbl_subheader4 = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        lbl_subheader5 = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        lbl_subheader6 = new javax.swing.JLabel();
        lbl_subheader8 = new javax.swing.JLabel();
        lbl_tp = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();

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
        lbl_dashboard.setText("USER INFORMATION");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
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

        FirstNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText1.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText1.setText("First Name");

        txt_fname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });

        LastNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText.setText("Last Name");

        btn_back.setBackground(new java.awt.Color(119, 67, 219));
        btn_back.setForeground(new java.awt.Color(255, 233, 177));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/back.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        txt_lname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(251, 187, 90));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        PassportNoText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassportNoText.setForeground(new java.awt.Color(252, 253, 242));
        PassportNoText.setText("Address");

        txt_address.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        lbl_dashboard2.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dashboard2.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard2.setText("UPDATE DETAILS");

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
        btn_confirm.setText("Confirm");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        lbl_subheader1.setBackground(new java.awt.Color(5, 5, 5));
        lbl_subheader1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subheader1.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader1.setText("UserID");

        lbl_dashboard3.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dashboard3.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/button4.png"))); // NOI18N
        lbl_dashboard3.setText("USER INFORMATION");

        lbl_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(251, 187, 90));
        lbl_id.setText("30 Apr");

        LastNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText1.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText1.setText("Mobile Number");

        txt_tp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_subheader2.setBackground(new java.awt.Color(5, 5, 5));
        lbl_subheader2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subheader2.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader2.setText("UserName");

        lbl_username.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(251, 187, 90));
        lbl_username.setText("30 Apr");

        lbl_subheader3.setBackground(new java.awt.Color(5, 5, 5));
        lbl_subheader3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subheader3.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader3.setText("LastName");

        lbl_lname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_lname.setForeground(new java.awt.Color(251, 187, 90));
        lbl_lname.setText("30 Apr");

        lbl_subheader4.setBackground(new java.awt.Color(5, 5, 5));
        lbl_subheader4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subheader4.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader4.setText("FirstName");

        lbl_fname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_fname.setForeground(new java.awt.Color(251, 187, 90));
        lbl_fname.setText("30 Apr");

        lbl_subheader5.setBackground(new java.awt.Color(5, 5, 5));
        lbl_subheader5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subheader5.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader5.setText("Address");

        lbl_address.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(251, 187, 90));
        lbl_address.setText("30 Apr");

        lbl_subheader6.setBackground(new java.awt.Color(5, 5, 5));
        lbl_subheader6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subheader6.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader6.setText("Date of Birth");

        lbl_subheader8.setBackground(new java.awt.Color(5, 5, 5));
        lbl_subheader8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subheader8.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader8.setText("Mobile Number");

        lbl_tp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_tp.setForeground(new java.awt.Color(251, 187, 90));
        lbl_tp.setText("30 Apr");

        lbl_dob.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_dob.setForeground(new java.awt.Color(251, 187, 90));
        lbl_dob.setText("30 Apr");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstNameText1)
                            .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameText)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassportNoText)
                            .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_dashboard3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_subheader2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_subheader1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_subheader3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_subheader4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbl_subheader5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbl_subheader6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbl_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbl_subheader8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbl_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_back)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_dashboard3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_subheader1)
                                    .addComponent(lbl_id))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_subheader2)
                                    .addComponent(lbl_username))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_subheader4)
                                    .addComponent(lbl_fname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_subheader3)
                                    .addComponent(lbl_lname))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_subheader6)
                                    .addComponent(lbl_dob))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_subheader5)
                                    .addComponent(lbl_address))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_subheader8)
                                    .addComponent(lbl_tp)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FirstNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PassportNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LastNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login user_login=new Login();
        User_Details.this.setVisible(false);
        user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        User_Details.this.setVisible(false);
        user_dashboard.setID(id);
        user_dashboard.setName(name);
        user_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        User_Details.this.setVisible(false);
        user_dashboard.setID(id);
        user_dashboard.setName(name);
        user_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        String fname,lname,address,tp;
        fname=txt_fname.getText();
        lname=txt_lname.getText();
        address=txt_address.getText();
        tp=txt_tp.getText();
        
        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(tp); 

        if(fname.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter your First name", "Invalid Input",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(lname.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter your Last name", "Invalid Input",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (address.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter your New Address", "Invalid Input",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tp.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter your Mobile Number", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if (!(m.matches())) {
            JOptionPane.showMessageDialog(null,"Enter 10 Numbers ONLY", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else
        {
            String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";

            try
            {
                Connection con = DriverManager.getConnection(dbpath,"root","");
                Statement st = con.createStatement();
                int row_count = st.executeUpdate("UPDATE user SET FirstName ='"+fname+"', LastName='"+lname+"', Address='"+address+"', MobileNo='"+tp+"' WHERE UserID='"+id+"'");
                if (row_count>0)
                {
                    JOptionPane.showMessageDialog(null,"User Information Successfully Updated", "Seat Booking",JOptionPane.INFORMATION_MESSAGE);
                    User_Dashboard user_dashboard=new User_Dashboard();
                    user_dashboard.setID(id);
                    user_dashboard.setName(name);
                    user_dashboard.setVisible(true);
                    User_Details.this.setVisible(false);
                }
            }
            catch(SQLException ex)
            {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new User_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JLabel LastNameText1;
    private javax.swing.JLabel PassportNoText;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_dashboard2;
    private javax.swing.JLabel lbl_dashboard3;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_subheader1;
    private javax.swing.JLabel lbl_subheader2;
    private javax.swing.JLabel lbl_subheader3;
    private javax.swing.JLabel lbl_subheader4;
    private javax.swing.JLabel lbl_subheader5;
    private javax.swing.JLabel lbl_subheader6;
    private javax.swing.JLabel lbl_subheader8;
    private javax.swing.JLabel lbl_tp;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_tp;
    // End of variables declaration//GEN-END:variables
}
