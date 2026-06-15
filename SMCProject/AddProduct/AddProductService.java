/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddProduct;

import java.sql.SQLException;
import smcproject.Notification.NotificationService;

/**
 *
 * @author PRASANNA KUMAR
 */
public class AddProductService 
{
    public String createuser(AddProductModel am) throws ClassNotFoundException, SQLException, Exception
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
                NotificationService ns
                        = new NotificationService();

                ns.addNotification(
                        "New Product Added : "
                        + am.getProductName());
                return "Product Added...";
            } else 
            {
                return "Product Not Added!";
            }
        }        
    }
    
    
    public String updateProduct(AddProductModel am)
            throws Exception {
        AddProductDAO ad
                = new AddProductDAO();

        int result
                = ad.updateProduct(am);

        if (result > 0) {
            return "Updated";
        } else {
            return "Not Updated";
        }
    }
}
