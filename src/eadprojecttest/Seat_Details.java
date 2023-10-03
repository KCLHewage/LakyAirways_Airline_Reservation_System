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

public class Seat_Details extends javax.swing.JFrame {
    private String name,id, seatNo;
    private String flightID, flightName, startLocation, endLocation,departureDate,departureTime,arrivalDate,arrivalTime,gate;


    public Seat_Details() {
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
    public void bookedSeat(String seatNo)
    {
        this.seatNo=seatNo;
        lbl_seat.setText(seatNo);
    }
    
    public void setFlightDetails(String flightID, String flightName, String startLocation, String endLocation, String departureDate, String departureTime, String arrivalDate, String arrivalTime, String gate)
    {
        this.flightID=flightID;
        this.flightName=flightName;
        this.startLocation=startLocation;
        this.endLocation=endLocation;
        this.departureDate=departureDate;
        this.departureTime=departureTime;
        this.arrivalDate=arrivalDate;
        this.arrivalTime=arrivalTime;
        this.gate=gate;
        
        if(startLocation.equals("Colombo")){
            lbl_from.setText("CMB");
        } 
        else if (startLocation.equals("New Dehli")){
            lbl_from.setText("DHE");
        }  
        else if (startLocation.equals("Toronto")){
            lbl_from.setText("TOR");
        }   
        else if (startLocation.equals("Melbourne")){
            lbl_from.setText("MLB");
        }   
        else if (startLocation.equals("Tokyo")){
            lbl_from.setText("TOK");
        }
        
        if(endLocation.equals("Colombo")){
            lbl_to.setText("CMB");
        } 
        else if (endLocation.equals("New Dehli")){
            lbl_to.setText("DHE");
        }  
        else if (endLocation.equals("Toronto")){
            lbl_to.setText("TOR");
        }   
        else if (endLocation.equals("Melbourne")){
            lbl_to.setText("MLB");
        }   
        else if (endLocation.equals("Tokyo")){
            lbl_to.setText("TOK");
        }
        
        lbl_flightNo.setText("FL-"+flightID);
        lbl_from2.setText(startLocation);
        lbl_to2.setText(endLocation);
        lbl_ddate.setText(departureDate);
        lbl_dtime.setText(departureTime);
        lbl_adate.setText(arrivalDate);
        lbl_atime.setText(arrivalTime);
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
        btn_back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_dashboard1 = new javax.swing.JLabel();
        lbl_dashboard2 = new javax.swing.JLabel();
        lbl_subheader1 = new javax.swing.JLabel();
        lbl_from = new javax.swing.JLabel();
        lbl_to = new javax.swing.JLabel();
        lbl_subheader2 = new javax.swing.JLabel();
        lbl_to2 = new javax.swing.JLabel();
        lbl_from2 = new javax.swing.JLabel();
        FlightNoHeader1 = new javax.swing.JLabel();
        lbl_ddate = new javax.swing.JLabel();
        lbl_dtime = new javax.swing.JLabel();
        FlightNoHeader3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FlightNoHeader2 = new javax.swing.JLabel();
        lbl_adate = new javax.swing.JLabel();
        lbl_atime = new javax.swing.JLabel();
        FlightNoHeader5 = new javax.swing.JLabel();
        FirstNameText1 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        LastNameText = new javax.swing.JLabel();
        txt_lname = new javax.swing.JTextField();
        PassportNoText = new javax.swing.JLabel();
        txt_passport = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        FlightNoHeader10 = new javax.swing.JLabel();
        lbl_flightNo = new javax.swing.JLabel();
        FlightNoHeader9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_seat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel1.setBackground(new java.awt.Color(119, 67, 219));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));

        lbl_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard.setText("BOOKING DETAILS");

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
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
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
        lbl_dashboard1.setText("PASSENGER DETAILS");

        lbl_dashboard2.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dashboard2.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard2.setText("SEATING INFORMATION");

        lbl_subheader1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_subheader1.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader1.setText("FROM");

        lbl_from.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_from.setForeground(new java.awt.Color(251, 187, 90));
        lbl_from.setText("BKK");

        lbl_to.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_to.setForeground(new java.awt.Color(251, 187, 90));
        lbl_to.setText("CNX");

        lbl_subheader2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_subheader2.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subheader2.setText("TO");

        lbl_to2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_to2.setForeground(new java.awt.Color(204, 204, 204));
        lbl_to2.setText("Chiang Mai");

        lbl_from2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_from2.setForeground(new java.awt.Color(204, 204, 204));
        lbl_from2.setText("Bangkok");

        FlightNoHeader1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader1.setForeground(new java.awt.Color(204, 204, 204));
        FlightNoHeader1.setText("DEPARTURE DATE");

        lbl_ddate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_ddate.setForeground(new java.awt.Color(251, 187, 90));
        lbl_ddate.setText("30 Apr");

        lbl_dtime.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dtime.setForeground(new java.awt.Color(251, 187, 90));
        lbl_dtime.setText("09:15");

        FlightNoHeader3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader3.setForeground(new java.awt.Color(204, 204, 204));
        FlightNoHeader3.setText("DEPARTURE TIME");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/plane.png"))); // NOI18N

        FlightNoHeader2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader2.setForeground(new java.awt.Color(204, 204, 204));
        FlightNoHeader2.setText("ARRIVAL DATE");

        lbl_adate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_adate.setForeground(new java.awt.Color(251, 187, 90));
        lbl_adate.setText("30 Apr");

        lbl_atime.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_atime.setForeground(new java.awt.Color(251, 187, 90));
        lbl_atime.setText("09:15");

        FlightNoHeader5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader5.setForeground(new java.awt.Color(204, 204, 204));
        FlightNoHeader5.setText("ARRIVAL TIME");

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

        txt_lname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        PassportNoText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassportNoText.setForeground(new java.awt.Color(252, 253, 242));
        PassportNoText.setText("Passport No.");

        txt_passport.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_passport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passportActionPerformed(evt);
            }
        });

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

        FlightNoHeader10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader10.setForeground(new java.awt.Color(204, 204, 204));
        FlightNoHeader10.setText("FLIGHT");

        lbl_flightNo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_flightNo.setForeground(new java.awt.Color(251, 187, 90));
        lbl_flightNo.setText("QF 8");

        FlightNoHeader9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader9.setForeground(new java.awt.Color(204, 204, 204));
        FlightNoHeader9.setText("SEAT");

        jPanel3.setBackground(new java.awt.Color(251, 187, 90));

        lbl_seat.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_seat.setForeground(new java.awt.Color(255, 255, 255));
        lbl_seat.setText("XX");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_seat)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_seat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

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
                        .addComponent(lbl_dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FlightNoHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_flightNo)
                        .addGap(42, 42, 42)
                        .addComponent(FlightNoHeader9)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_back)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstNameText1)
                            .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameText)
                            .addComponent(txt_passport, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassportNoText)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lbl_subheader1)
                                .addGap(133, 133, 133)
                                .addComponent(lbl_subheader2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_from)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(lbl_to))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_dashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lbl_from2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)
                                    .addComponent(lbl_to2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ddate)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FlightNoHeader1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_adate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlightNoHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FlightNoHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_dtime)
                                    .addComponent(lbl_atime))))
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FlightNoHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_flightNo)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(FlightNoHeader9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addGap(18, 18, 18)
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
                                .addComponent(txt_passport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PassportNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_subheader1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_subheader2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_from, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_to, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_from2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_to2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FlightNoHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ddate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dtime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FlightNoHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_adate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_atime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        Seat_Details.this.setVisible(false);
        user_dashboard.setName(name);
        user_dashboard.setID(id);
        user_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void txt_passportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passportActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        String fname,lname,passport;
        fname=txt_fname.getText();
        lname=txt_lname.getText();
        passport=txt_passport.getText();
        
        if(fname.isEmpty())
        {
             JOptionPane.showMessageDialog(null,"Enter your First name", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(lname.isEmpty())
        {
             JOptionPane.showMessageDialog(null,"Enter your Last name", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if (passport.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter your Passport Number", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
        else
        {
            String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";
          
            try
            {
                Connection con = DriverManager.getConnection(dbpath,"root","");
                Statement st = con.createStatement();
                int row_count = st.executeUpdate("INSERT INTO seat (FlightID, SeatID, PassengerFirstName, PassengerLastName, Passport, Status) VALUES ('"+flightID+"','"+seatNo+"','"+fname+"','"+lname+"','"+passport+"','1')");
                if (row_count>0)
                {
                    JOptionPane.showMessageDialog(null,"Seat Booked Successfully", "Seat Booking",JOptionPane.INFORMATION_MESSAGE);
                    Book_Seat user_seat=new Book_Seat();
                    user_seat.setID(id);
                    user_seat.setName(name);
                    user_seat.setFlightDetails(flightID, flightName, startLocation, endLocation,departureDate,departureTime,arrivalDate,arrivalTime,gate);
                    user_seat.checkSeatAvailability();
                    Seat_Details.this.setVisible(false);
                    user_seat.setVisible(true);
                }
            }
            catch(SQLException ex)
            {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login user_login=new Login();
        Seat_Details.this.setVisible(false);
        user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seat_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JLabel FlightNoHeader1;
    private javax.swing.JLabel FlightNoHeader10;
    private javax.swing.JLabel FlightNoHeader2;
    private javax.swing.JLabel FlightNoHeader3;
    private javax.swing.JLabel FlightNoHeader5;
    private javax.swing.JLabel FlightNoHeader9;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JLabel PassportNoText;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_adate;
    private javax.swing.JLabel lbl_atime;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_dashboard1;
    private javax.swing.JLabel lbl_dashboard2;
    private javax.swing.JLabel lbl_ddate;
    private javax.swing.JLabel lbl_dtime;
    private javax.swing.JLabel lbl_flightNo;
    private javax.swing.JLabel lbl_from;
    private javax.swing.JLabel lbl_from2;
    private javax.swing.JLabel lbl_seat;
    private javax.swing.JLabel lbl_subheader1;
    private javax.swing.JLabel lbl_subheader2;
    private javax.swing.JLabel lbl_to;
    private javax.swing.JLabel lbl_to2;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_passport;
    // End of variables declaration//GEN-END:variables
}
