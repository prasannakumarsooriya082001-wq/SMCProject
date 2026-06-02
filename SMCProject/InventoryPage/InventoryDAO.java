/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.InventoryPage;

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
public class InventoryDAO 
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
    
    public List materials() throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        List list = new ArrayList();
        
        PreparedStatement psmt = conn.prepareStatement("Select * from materials");
        ResultSet rs = psmt.executeQuery();
        
        while(rs.next())
        {
            InventoryModel im = new InventoryModel();
            
            im.setMaterial_name(rs.getString("material_name"));
            im.setCategory(rs.getString("category"));
            im.setUnit(rs.getString("unit"));
            im.setStock(rs.getInt("stock"));
            im.setStatus(rs.getString("status"));  
            
            list.add(im);
            
        }
        return list;
    }
    
}
