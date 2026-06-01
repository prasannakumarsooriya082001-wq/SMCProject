/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.CustomerPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import smcproject.ProductsPage.ProductsModel;

/**
 *
 * @author PRASANNA KUMAR
 */
public class CustomerDAO 
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
    
    public List customerTable() throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        List list = new ArrayList();
        
        PreparedStatement psmt = conn.prepareStatement(
                "SELECT c.customer_name, c.phone, c.email, c.address, "
                + "COUNT(o.order_id) AS orders "
                + "FROM customer c "
                + "LEFT JOIN orders o ON c.customer_id = o.customer_id "
                + "GROUP BY c.customer_id, c.customer_name, c.phone, c.email, c.address");
        ResultSet rs = psmt.executeQuery();
        
        while(rs.next())
        {
            CustomerModel cs =new CustomerModel();
            
            cs.setCustomerName(rs.getString("customer_name"));
            cs.setPhone(rs.getString("phone"));
            cs.setEmail(rs.getString("email"));
            cs.setOrders(rs.getInt("orders"));

            list.add(cs);
            
        }
        return list;
    }
    
}
