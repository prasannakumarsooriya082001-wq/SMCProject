
package smcproject.ProductionPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import smcproject.OrdersPage1.OrdersModel;


public class ProductionDAO 
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
    
    public List productions() throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        List list = new ArrayList();
        
        PreparedStatement psmt = conn.prepareStatement("SELECT pr.production_id,p.product_name,pr.quantity,pr.status, pr.start_date FROM production pr JOIN product p ON pr.product_id = p.product_id");
        ResultSet rs = psmt.executeQuery();
        
        while(rs.next())
        {
            ProductionModel pm = new ProductionModel();
            
            pm.setProductionId(rs.getInt("production_id"));
            pm.setProductName(rs.getString("product_name"));
            pm.setQuantity(rs.getInt("quantity"));
            pm.setStatus(rs.getString("status"));
            pm.setStartDate(rs.getDate("start_date"));      
            
            list.add(pm);
            
        }
        return list;
    }
    
}
