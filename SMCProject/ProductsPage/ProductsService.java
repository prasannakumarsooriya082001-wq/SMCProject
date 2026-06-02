/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.ProductsPage;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author PRASANNA KUMAR
 */
public class ProductsService 

{
    ProductsDAO pd = new ProductsDAO();
    
    public List getAllProducts() throws ClassNotFoundException, SQLException
    {
        List list = pd.Productstable();
        return list;
    }
}
