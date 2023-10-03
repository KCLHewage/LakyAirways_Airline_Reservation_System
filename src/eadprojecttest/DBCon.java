/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eadprojecttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nushan
 */
public class DBCon {
    String dbpath;
    Connection con;
    public void createCon(){
    try{
    dbpath ="jbdc:mysql://localhost/3306/airline_reservation_system";
    con =DriverManager.getConnection(dbpath, "root","");
    Statement St =con.createStatement();
    }
    catch(SQLException ex)
    {
        System.out.println(ex.getMessage());
    }
    
    }
    public void closeCon(){
    try{
    con.close();
    }
    catch(SQLException ex)
    {
        System.out.println(ex.getMessage());
    }
    
    }
    
}
