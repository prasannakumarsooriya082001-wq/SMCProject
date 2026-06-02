/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.OrdersPage1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import smcproject.InventoryPage.InventoryModel;

/**
 *
 * @author PRASANNA KUMAR
 */
public class OrdersDAO 
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
    
    public List orders() throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        List list = new ArrayList();
        
        PreparedStatement psmt = conn.prepareStatement("SELECT o.order_id, c.customer_name, o.amount, o.order_date ,o.status " +"FROM orders o "+"JOIN customer c ON o.customer_id = c.customer_id");
        ResultSet rs = psmt.executeQuery();
        
        while(rs.next())
        {
            OrdersModel om = new OrdersModel();
            
            om.setOrderId(rs.getInt("order_id"));
            om.setCustomerName(rs.getString("customer_name"));
            om.setAmount(rs.getDouble("amount"));
            om.setOrderDate(rs.getDate("order_date").toLocalDate());
            om.setStatus(rs.getString("status"));
            
            list.add(om);
            
        }
        return list;
    }
}
