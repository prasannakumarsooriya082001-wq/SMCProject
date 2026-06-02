/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.ProductsPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import smcproject.PasswordPage.PasswordModel;

/**
 *
 * @author PRASANNA KUMAR
 */
public class ProductsDAO 
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
    
    public List Productstable() throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        List list = new ArrayList();
        
        PreparedStatement psmt = conn.prepareStatement("Select product_id,product_name,category,price,stock,status from product");
        ResultSet rs = psmt.executeQuery();
        
        while(rs.next())
        {
            ProductsModel pm = new ProductsModel();
            pm.setProductId(rs.getInt("product_id"));
            pm.setProductName(rs.getString("product_name"));
            pm.setCategory(rs.getString("category"));
            pm.setPrice(rs.getDouble("price"));
            pm.setStock(rs.getInt("stock"));
            pm.setStatus(rs.getString("status"));
            
            list.add(pm);
            
        }
        return list;
    }
}
