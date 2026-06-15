/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddMaterial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import smcproject.AddProduct.AddProductModel;

/**
 *
 * @author PRASANNA KUMAR
 */
public class AddMaterialDAO 
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
    
    public int insertMaterial(AddMaterialModel am) throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        PreparedStatement psmt = conn.prepareStatement("Insert into materials (material_name,category,unit,stock ,status) values(?,?,?,?,?) ");
        psmt.setString(1, am.getMaterialName());
        psmt.setString(2, am.getCategory());
        psmt.setString(3, am.getUnit());
        psmt.setInt(4, am.getStock());
        psmt.setString(5, am.getStatus());
        
        
        int result = psmt.executeUpdate();
        
        return result;
    }
    
    
    public int updateMaterial(AddMaterialModel am)
            throws Exception {
        Connection conn = dbConnection();

        String query
                = "update materials set material_name=?, category=?, unit=?, stock=?, status=? where material_id=?";

        PreparedStatement ps
                = conn.prepareStatement(query);

        ps.setString(1, am.getMaterialName());

        ps.setString(2, am.getCategory());

        ps.setString(3, am.getUnit());

        ps.setInt(4, am.getStock());

        ps.setString(5, am.getStatus());

        ps.setInt(6, am.getId());

        return ps.executeUpdate();
    }
}
