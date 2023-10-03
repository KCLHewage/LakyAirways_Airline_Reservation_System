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

public class Update_Flights extends javax.swing.JFrame {
    private String name,id;
    //int totalCount;
    //private String flightID, flightName, startLocation, endLocation,departureDate,departureTime,arrivalDate,arrivalTime,gate;


    public Update_Flights() {
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
    /*public void setTotFlight(String totCount)
    {
        this.totalCount=Integer.parseInt(totCount);
        totalCount++;
        txt_fid.setText(Integer.toString(totalCount));
        txt_fid.setEnabled(false);
        
    }*/
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txt_fid = new javax.swing.JTextField();
        LastNameText = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        LastNameText1 = new javax.swing.JLabel();
        LastNameText2 = new javax.swing.JLabel();
        LastNameText3 = new javax.swing.JLabel();
        txt_gate = new javax.swing.JTextField();
        LastNameText4 = new javax.swing.JLabel();
        txt_dtime = new javax.swing.JTextField();
        LastNameText5 = new javax.swing.JLabel();
        LastNameText6 = new javax.swing.JLabel();
        txt_atime = new javax.swing.JTextField();
        LastNameText7 = new javax.swing.JLabel();
        txt_adate = new org.jdesktop.swingx.JXDatePicker();
        txt_ddate = new org.jdesktop.swingx.JXDatePicker();
        cmb_sloc = new javax.swing.JComboBox<>();
        cmb_eloc = new javax.swing.JComboBox<>();

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
        lbl_dashboard1.setText("UPDATE FLIGHT");

        lbl_dashboard2.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dashboard2.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard2.setText("FLIGHT INFORMATION");

        FirstNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText1.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText1.setText("FlightID");

        txt_fid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_fid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fidActionPerformed(evt);
            }
        });

        LastNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText.setText("FlightName");

        txt_fname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

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
        btn_confirm.setText("Update");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        LastNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText1.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText1.setText("Start Location");

        LastNameText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText2.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText2.setText("End Location");

        LastNameText3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText3.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText3.setText("Gate");

        txt_gate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        LastNameText4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText4.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText4.setText("Departure Time");

        txt_dtime.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        LastNameText5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText5.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText5.setText("Arrival Date");

        LastNameText6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText6.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText6.setText("Arrival Time");

        txt_atime.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        LastNameText7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText7.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText7.setText("Departure Date");

        cmb_sloc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "New Dehli", "Toronto", "Melbourne", "Tokyo" }));
        cmb_sloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_slocActionPerformed(evt);
            }
        });

        cmb_eloc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toronto", "Colombo", "New Dehli", "Melbourne", "Tokyo" }));
        cmb_eloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_elocActionPerformed(evt);
            }
        });

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
                                        .addComponent(txt_fname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_fid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LastNameText3)
                                    .addComponent(LastNameText1)
                                    .addComponent(cmb_sloc, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameText2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_gate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmb_eloc, javax.swing.GroupLayout.Alignment.LEADING, 0, 259, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LastNameText7)
                                .addComponent(txt_dtime)
                                .addComponent(LastNameText5)
                                .addComponent(LastNameText4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_adate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_ddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LastNameText6)
                                .addComponent(txt_atime, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))))
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LastNameText7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_ddate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txt_dtime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LastNameText4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(LastNameText5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_adate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LastNameText6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_atime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
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
                            .addComponent(txt_fid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(LastNameText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LastNameText1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmb_sloc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(LastNameText2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmb_eloc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(LastNameText3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_gate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        Admin_Flights admin_flights=new Admin_Flights();
        Update_Flights.this.setVisible(false);
        admin_flights.setName(name);
        admin_flights.setID(id);
        admin_flights.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_fidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fidActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        Admin_Flights admin_flights=new Admin_Flights();
        Update_Flights.this.setVisible(false);
        admin_flights.setName(name);
        admin_flights.setID(id);
        admin_flights.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        String fid,fname,sloc,eloc,gate,ddate,dtime,adate,atime;
        ddate=null;adate=null;
        
        fid = txt_fid.getText();
        fname = txt_fname.getText();
        sloc = cmb_sloc.getSelectedItem().toString();
        eloc = cmb_eloc.getSelectedItem().toString();
        gate = txt_gate.getText();
        dtime = txt_dtime.getText();
        atime = txt_atime.getText();
        
        Date empty_dob =txt_ddate.getDate();
        Date empty_dob2 =txt_adate.getDate();
        DateFormat dformat =new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dformat2 =new SimpleDateFormat("yyyy-MM-dd");
        if(txt_ddate.getDate() != null) {
              ddate = dformat.format(empty_dob);
        }
        if(txt_adate.getDate() != null) {
              adate = dformat2.format(empty_dob);
        }

        if(fid.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Enter FlightID", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        if(fname.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Enter FlightName", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }

        else if(gate.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Enter Gate", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(txt_ddate.getDate() == null) {
             JOptionPane.showMessageDialog(null,"Select Departure Date", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(dtime.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Enter Departure Time", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(txt_adate.getDate() == null) {
             JOptionPane.showMessageDialog(null,"Select Arrival Date", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(atime.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Enter Arrival Time", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else {
            String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";
            try  {
                Connection con = DriverManager.getConnection(dbpath,"root","");
                Statement st = con.createStatement();
                int row_count = st.executeUpdate("UPDATE flight SET FlightName='"+fname+"', FlightCapacity='48' WHERE FlightID ='"+fid+"'");
                System.out.println(row_count);
                if (row_count>0)  {
                     int count = st.executeUpdate("UPDATE flightSchedule SET StartLocation='"+sloc+"',EndLocation='"+eloc+"',DepartureDate='"+ddate+"',DepartureTime='"+dtime+"',ArrivalDate='"+adate+"',ArrivalTime='"+atime+"',Gate='"+gate+"' WHERE FlightID='"+fid+"'");
                     if (count>0)  {
                    JOptionPane.showMessageDialog(null,"Successfully Updated", "Flights",JOptionPane.INFORMATION_MESSAGE);
                    Admin_Flights admin_flights=new Admin_Flights();
                    Update_Flights.this.setVisible(false);
                    admin_flights.setName(name);
                    admin_flights.setID(id);
                    admin_flights.setVisible(true);
                }
                }
            }
            catch(SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login user_login=new Login();
        Update_Flights.this.setVisible(false);
        user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void cmb_slocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_slocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_slocActionPerformed

    private void cmb_elocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_elocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_elocActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Flights().setVisible(true);
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
    private javax.swing.JLabel LastNameText6;
    private javax.swing.JLabel LastNameText7;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_logout;
    private javax.swing.JComboBox<String> cmb_eloc;
    private javax.swing.JComboBox<String> cmb_sloc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_dashboard1;
    private javax.swing.JLabel lbl_dashboard2;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    private org.jdesktop.swingx.JXDatePicker txt_adate;
    private javax.swing.JTextField txt_atime;
    private org.jdesktop.swingx.JXDatePicker txt_ddate;
    private javax.swing.JTextField txt_dtime;
    private javax.swing.JTextField txt_fid;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_gate;
    // End of variables declaration//GEN-END:variables
}
