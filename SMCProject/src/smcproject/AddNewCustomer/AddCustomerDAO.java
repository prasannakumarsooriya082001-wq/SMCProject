/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddNewCustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import smcproject.AddOrder.AddOrderModel;

/**
 *
 * @author PRASANNA KUMAR
 */
public class AddCustomerDAO 
{
    public Connection dbConnection() throws ClassNotFoundException, SQLException
    {  
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/SMCProject";
        String userName = "postgres";
        String pass = "prasanna@08";
        Connection con = DriverManager.getConnection(url, userName, pass);
       
       return con;
    }
    
    public int insertCustomer(AddCustomerModel am) throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        PreparedStatement psmt = conn.prepareStatement("INSERT INTO customer(customer_name, phone, email, address) VALUES (?,?,?,?)");
        psmt.setString(1, am.getCustomerName());
        psmt.setString(2, am.getPhoneNumber());
        psmt.setString(3, am.getEmail());
        psmt.setString(4, am.getAddress());
        
        int result = psmt.executeUpdate();
        
        return result;
    }
    
}
