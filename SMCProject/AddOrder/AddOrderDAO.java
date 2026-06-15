/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddOrder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author PRASANNA KUMAR
 */
public class AddOrderDAO 
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
    
    public int insertOrder(AddOrderModel am) throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        PreparedStatement psmt = conn.prepareStatement("INSERT INTO orders(customer_id,product_id,quantity, amount, status,order_date) VALUES (?,?,?,?,?,?)");
        psmt.setInt(1, am.getCustomerId());
        psmt.setInt(2, am.getProductId());      
        psmt.setInt(3, am.getQuantity());
        psmt.setDouble(4, am.getAmount());
        psmt.setString(5, am.getStatus());
        psmt.setDate(6, java.sql.Date.valueOf(am.getoDate()));  
        
        int result = psmt.executeUpdate();
        
        return result;
    }
    
    
    public int updateOrder(AddOrderModel am)
            throws Exception {
        Connection conn = dbConnection();

        String query
                = "update orders set customer_id=?, product_id=?, quantity=?, amount=?, status=?, order_date=? where order_id=?";

        PreparedStatement ps
                = conn.prepareStatement(query);

        ps.setInt(1, am.getCustomerId());

        ps.setInt(2, am.getProductId());

        ps.setInt(3, am.getQuantity());

        ps.setDouble(4, am.getAmount());

        ps.setString(5, am.getStatus());

        ps.setDate(6,java.sql.Date.valueOf(am.getoDate()));

        ps.setInt(7, am.getOrderId());

        return ps.executeUpdate();
    }
}
