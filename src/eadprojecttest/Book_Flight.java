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

public class Book_Flight extends javax.swing.JFrame {
    private String name,id;

    public Book_Flight() {
        initComponents();
        setIcon();
        setTitle("Airline Reservation System");
        this.setLocationRelativeTo(null);
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    
    public void setID(String id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
        lbl_welcome.setText("Welcome "+name);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        btn_logout1 = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmb_source = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmb_destination = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dp_start = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_searchflight = new javax.swing.JTable();
        btn_search = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_dashboard1 = new javax.swing.JLabel();
        lbl_dashboard2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_bookingflightno = new javax.swing.JTextField();
        btn_book = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmb_bookingloc = new javax.swing.JComboBox<>();
        dp_bookingdate = new org.jdesktop.swingx.JXDatePicker();

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
        lbl_dashboard.setText("SEARCH FLIGHT");

        jPanel2.setBackground(new java.awt.Color(59, 52, 134));

        main_logo.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        main_logo.setForeground(new java.awt.Color(255, 255, 255));
        main_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/main_logo_large.png"))); // NOI18N

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(252, 253, 242));
        lbl_welcome.setText("Welcome User");

        btn_logout1.setBackground(new java.awt.Color(59, 52, 134));
        btn_logout1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_logout1.setForeground(new java.awt.Color(255, 233, 177));
        btn_logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eadprojecttest/logout.png"))); // NOI18N
        btn_logout1.setText("Logout");
        btn_logout1.setFocusPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_logout1)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout1)))
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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 253, 242));
        jLabel2.setText("From");

        cmb_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "New Dehli", "Toronto", "Melbourne", "Tokyo" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 253, 242));
        jLabel3.setText("To");

        cmb_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toronto", "Colombo", "New Dehli", "Melbourne", "Tokyo" }));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 253, 242));
        jLabel4.setText("Date");

        tb_searchflight.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tb_searchflight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlightNo", "FlightName", "Source", "Destination", "Departure Date", "Departure Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_searchflight.setRowHeight(30);
        tb_searchflight.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_searchflight);

        btn_search.setBackground(new java.awt.Color(59, 52, 134));
        btn_search.setForeground(new java.awt.Color(255, 233, 177));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(251, 187, 90));
        jSeparator1.setForeground(new java.awt.Color(251, 187, 90));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbl_dashboard1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_dashboard1.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard1.setText("BOOK FLIGHT");

        lbl_dashboard2.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dashboard2.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard2.setText("BOOK FLIGHT");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 253, 242));
        jLabel5.setText("Flight Number");

        txt_bookingflightno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookingflightnoActionPerformed(evt);
            }
        });

        btn_book.setBackground(new java.awt.Color(59, 52, 134));
        btn_book.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_book.setForeground(new java.awt.Color(255, 233, 177));
        btn_book.setText("Book");
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 253, 242));
        jLabel6.setText("Start Location");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(252, 253, 242));
        jLabel7.setText("Departure Date");

        cmb_bookingloc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "New Dehli", "Toronto", "Melbourne", "Tokyo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmb_source, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmb_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dp_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23)
                                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 41, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_book, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bookingflightno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_bookingloc, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(dp_bookingdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lbl_dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_back)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dp_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_search))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_bookingflightno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(cmb_bookingloc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dp_bookingdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addComponent(btn_book, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        String bookflight,bookloc,bookdate;
        int isFlightAvailable=0;
        bookdate="";
        bookflight= txt_bookingflightno.getText();
        bookloc= cmb_bookingloc.getSelectedItem().toString();

        Date empty_dp = dp_bookingdate.getDate();
        DateFormat dformat =new SimpleDateFormat("yyyy-MM-dd");

        if(dp_bookingdate.getDate() != null){
            bookdate = dformat.format(empty_dp);
        }

        if(bookflight.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter your Flight Number", "Invalid Input",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (!bookflight.matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(null,"Please select and enter a relevant Flight Number from the Table", "Invalid Input",JOptionPane.INFORMATION_MESSAGE);
        }

        else if(dp_bookingdate.getDate() == null)
        {
            JOptionPane.showMessageDialog(null,"Select Departure Date", "Invalid Input",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";

            try{
                Connection con = DriverManager.getConnection(dbpath,"root","");
                Statement st = con.createStatement();
                ResultSet result = st.executeQuery("SELECT flight.FlightID, flight.FlightName, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flight.FlightID='"+bookflight+"' AND flightSchedule.StartLocation='"+bookloc+"' AND flightSchedule.DepartureDate='"+bookdate+"' AND flight.FlightID=flightSchedule.FlightID");

                while(result.next()){
                    if (bookflight.equals(result.getString(1)) && bookloc.equals(result.getString(3)) && bookdate.equals(result.getString(5)))
                    {

                        Book_Seat user_seat=new Book_Seat();
                        user_seat.setName(name);
                        user_seat.setID(id);
                        user_seat.setFlightDetails(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9));
                        user_seat.checkSeatAvailability();
                        Book_Flight.this.setVisible(false);
                        user_seat.setVisible(true);
                        isFlightAvailable=1;
                    }
                    else{
                        isFlightAvailable=0;
                    }
                }
                if (isFlightAvailable==0)
                {
                    JOptionPane.showMessageDialog(null,"Invalid Flight, Please check again.", "Invalid Flight ",JOptionPane.INFORMATION_MESSAGE);
                }
                else if (isFlightAvailable==1)
                {
                    int row_count = st.executeUpdate("INSERT INTO user_flight (UserID, FlightID) VALUES ('"+id+"','"+bookflight+"')");
                if (row_count>0)  {
                    System.out.println("Success yay");
                }
                }
            }
            catch(SQLException ex)
            {
                System.err.println(ex.getMessage());
            }
        }

    }//GEN-LAST:event_btn_bookActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String query,source,destination,sdate;
        source= cmb_source.getSelectedItem().toString();
        destination= cmb_destination.getSelectedItem().toString();

        Date empty_dp = dp_start.getDate();
        DateFormat dformat =new SimpleDateFormat("yyyy-MM-dd");

        query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime FROM flight,flightSchedule WHERE flightSchedule.StartLocation='"+source+"' AND flightSchedule.EndLocation='"+destination+"' AND flight.FlightID=flightSchedule.FlightID";

        if(dp_start.getDate() != null){
            sdate = dformat.format(empty_dp);
            query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime FROM flight,flightSchedule WHERE flightSchedule.StartLocation='"+source+"' AND flightSchedule.EndLocation='"+destination+"' AND flightSchedule.DepartureDate='"+sdate+"' AND flight.FlightID=flightSchedule.FlightID";
        }

        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("FlightNo");
        table.addColumn("Flightname");
        table.addColumn("Source");
        table.addColumn("Destination");
        table.addColumn("Departure Date");
        table.addColumn("Departure Time");

        try
        {
            String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";
            Connection con = DriverManager.getConnection(dbpath,"root","");
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(query);
            while(result.next())
            {
                String[] value =new String[6];
                value[0] = result.getString(1);
                value[1] = result.getString(2);
                value[2] = result.getString(3);
                value[3] = result.getString(4);
                value[4] = result.getString(5);
                value[5] = result.getString(6);
                table.addRow(value);
            }
            tb_searchflight.setModel(table);
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        Book_Flight.this.setVisible(false);
        user_dashboard.setName(name);
        user_dashboard.setID(id);
        user_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_bookingflightnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookingflightnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookingflightnoActionPerformed

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
            java.util.logging.Logger.getLogger(Book_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_book;
    private javax.swing.JButton btn_logout1;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cmb_bookingloc;
    private javax.swing.JComboBox<String> cmb_destination;
    private javax.swing.JComboBox<String> cmb_source;
    private org.jdesktop.swingx.JXDatePicker dp_bookingdate;
    private org.jdesktop.swingx.JXDatePicker dp_start;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_dashboard1;
    private javax.swing.JLabel lbl_dashboard2;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    private javax.swing.JTable tb_searchflight;
    private javax.swing.JTextField txt_bookingflightno;
    // End of variables declaration//GEN-END:variables
}
