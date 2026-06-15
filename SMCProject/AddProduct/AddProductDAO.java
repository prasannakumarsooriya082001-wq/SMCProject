
package smcproject.AddProduct;

import java.sql.*;


public class AddProductDAO 
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
    
    public int insertProduct(AddProductModel am) throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        PreparedStatement psmt = conn.prepareStatement("Insert into product(product_name ,category ,price,stock,status) values(?,?,?,?,?) ");
        psmt.setString(1, am.getProductName());
        psmt.setString(2, am.getCategory());
        psmt.setDouble(3, am.getPrice());
        psmt.setInt(4, am.getStock());
        psmt.setString(5, am.getStatus());
        
        
        int result = psmt.executeUpdate();
        
        return result;
    }
    
    public int updateProduct(AddProductModel am)
            throws Exception 
    {
        Connection conn = dbConnection();
        String query
                = "update product set product_name=?, category=?, price=?, stock=?, status=? where product_id=?";

        PreparedStatement ps
                = conn.prepareStatement(query);

        ps.setString(1, am.getProductName());

        ps.setString(2, am.getCategory());

        ps.setDouble(3, am.getPrice());

        ps.setInt(4, am.getStock());

        ps.setString(5, am.getStatus());

        ps.setInt(6, am.getId());

        return ps.executeUpdate();
    }
}
