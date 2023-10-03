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

public class View_Availability extends javax.swing.JFrame {

    private String id,name;
    public View_Availability() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        FlightNoHeader2 = new javax.swing.JLabel();
        lbl_availableflights = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmb_source = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmb_destination = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dp_start = new org.jdesktop.swingx.JXDatePicker();
        btn_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_searchflight = new javax.swing.JTable();

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
        lbl_dashboard.setText("VIEW AVAILABILITY");

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
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                            .addComponent(btn_logout))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FlightNoHeader2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNoHeader2.setForeground(new java.awt.Color(255, 233, 177));
        FlightNoHeader2.setText("Available Flights");

        lbl_availableflights.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_availableflights.setForeground(new java.awt.Color(255, 233, 177));
        lbl_availableflights.setText("0");

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

        cmb_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "Colombo", "New Dehli", "Toronto", "Melbourne", "Tokyo" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 253, 242));
        jLabel3.setText("To");

        cmb_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "Toronto", "Colombo", "New Dehli", "Melbourne", "Tokyo" }));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 253, 242));
        jLabel4.setText("Departure");

        btn_search.setBackground(new java.awt.Color(59, 52, 134));
        btn_search.setForeground(new java.awt.Color(255, 233, 177));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        tb_searchflight.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tb_searchflight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlightNo", "FlightName", "Source", "Destination", "Departure Date", "Departure Time", "Arrival Date", "Arrival Time", "Gate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, true
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_availableflights)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dp_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_back))
                        .addGap(0, 30, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_availableflights, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btn_back)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        View_Availability.this.setVisible(false);
        user_dashboard.setName(name);
        user_dashboard.setID(id);
        user_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login user_login=new Login();
        View_Availability.this.setVisible(false);
        user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String query,source,destination,sdate;
        int flightCount=0;
        source= cmb_source.getSelectedItem().toString();
        destination= cmb_destination.getSelectedItem().toString();
        query="SELECT * FROM flight,flightSchedule WHERE flight.FlightID=flightSchedule.FlightID";
        

        Date empty_dp = dp_start.getDate();
        DateFormat dformat =new SimpleDateFormat("yyyy-MM-dd");
       // query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flightSchedule.StartLocation='"+source+"' AND flightSchedule.EndLocation='"+destination+"' AND flight.FlightID=flightSchedule.FlightID";
            
            
        if(dp_start.getDate() != null){
            sdate = dformat.format(empty_dp);
            if (source.equals("--SELECT--") && destination.equals("--SELECT--")) {
            query="SELECT flight.FlightID, flight.FlightName, flightSchedule.StartLocation, flightSchedule.EndLocation, flightSchedule.DepartureDate, flightSchedule.DepartureTime, flightSchedule.ArrivalDate, flightSchedule.ArrivalTime, flightSchedule.Gate FROM flight, flightSchedule WHERE flight.FlightID=flightSchedule.FlightID AND flightSchedule.DepartureDate='"+sdate+"'";
            }
            else if (source.equals("--SELECT--") && (destination != "--SELECT--")) {
            query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flightSchedule.EndLocation='"+destination+"' AND flightSchedule.DepartureDate='"+sdate+"' AND flight.FlightID=flightSchedule.FlightID";
            }
            else if (destination.equals("--SELECT--") && (source != "--SELECT--")) {
            query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flightSchedule.StartLocation='"+source+"' AND flightSchedule.DepartureDate='"+sdate+"' AND flight.FlightID=flightSchedule.FlightID";
            }
            else {
            query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flightSchedule.StartLocation='"+source+"' AND flightSchedule.EndLocation='"+destination+"' AND flightSchedule.DepartureDate='"+sdate+"' AND flight.FlightID=flightSchedule.FlightID";
            }
           // query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime FROM flight,flightSchedule WHERE flightSchedule.StartLocation='"+source+"' AND flightSchedule.EndLocation='"+destination+"' AND flightSchedule.DepartureDate='"+sdate+"' AND flight.FlightID=flightSchedule.FlightID";
        }
        else {
            if (source.equals("--SELECT--") && destination.equals("--SELECT--")) {
            query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flight.FlightID=flightSchedule.FlightID";
            }
            else if (source.equals("--SELECT--") && (destination != "--SELECT--")) {
            query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flightSchedule.EndLocation='"+destination+"' AND flight.FlightID=flightSchedule.FlightID";
            }
            else if (destination.equals("--SELECT--") && (source != "--SELECT--")) {
            query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flightSchedule.StartLocation='"+source+"' AND flight.FlightID=flightSchedule.FlightID";
            }
            else {
            query="SELECT flight.FlightID, flight.Flightname, flightSchedule.StartLocation, flightSchedule.EndLocation,flightSchedule.DepartureDate,flightSchedule.DepartureTime,flightSchedule.ArrivalDate,flightSchedule.ArrivalTime,flightSchedule.Gate FROM flight,flightSchedule WHERE flightSchedule.StartLocation='"+source+"' AND flightSchedule.EndLocation='"+destination+"' AND flight.FlightID=flightSchedule.FlightID";
            }
        }

        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("FlightNo");
        table.addColumn("Flightname");
        table.addColumn("Source");
        table.addColumn("Destination");
        table.addColumn("Departure Date");
        table.addColumn("Departure Time");
        table.addColumn("Arrival Date");
        table.addColumn("Arrival Time");
        table.addColumn("Gate");

        try
        {
            String dbpath = "jdbc:mysql://localhost:3306/airline_reservation_system";
            Connection con = DriverManager.getConnection(dbpath,"root","");
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(query);
            while(result.next())
            {
                flightCount++;
                String[] value =new String[9];
                value[0] = result.getString(1);
                value[1] = result.getString(2);
                value[2] = result.getString(3);
                value[3] = result.getString(4);
                value[4] = result.getString(5);
                value[5] = result.getString(6);
                value[6] = result.getString(7);
                value[7] = result.getString(8);
                value[8] = result.getString(9);
                table.addRow(value);
            }
            tb_searchflight.setModel(table);
            lbl_availableflights.setText(Integer.toString(flightCount));
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(View_Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new View_Availability().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlightNoHeader2;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cmb_destination;
    private javax.swing.JComboBox<String> cmb_source;
    private org.jdesktop.swingx.JXDatePicker dp_start;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_availableflights;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    private javax.swing.JTable tb_searchflight;
    // End of variables declaration//GEN-END:variables
}
