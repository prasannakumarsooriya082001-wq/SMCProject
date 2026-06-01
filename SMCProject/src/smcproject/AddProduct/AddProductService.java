/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddProduct;

import java.sql.SQLException;

/**
 *
 * @author PRASANNA KUMAR
 */
public class AddProductService 
{
    public String createuser(AddProductModel am) throws ClassNotFoundException, SQLException
    {
        AddProductDAO ad = new AddProductDAO();

        
        
        if(am.getCategory().isEmpty() || 
                am.getProductName().isEmpty() || am.getStatus().isEmpty() )
        {
            return "Enter all Details";
        }
        else
        {
            int result = ad.insertProduct(am);
            if (result > 0)
            {
                return "Product Added...";
            } else 
            {
                return "Product Not Added!";
            }
        }        
    }
}
