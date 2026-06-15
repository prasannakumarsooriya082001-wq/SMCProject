/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddMaterial;

import java.sql.SQLException;
import smcproject.AddProduct.AddProductDAO;
import smcproject.AddProduct.AddProductModel;
import smcproject.Notification.NotificationService;

/**
 *
 * @author PRASANNA KUMAR
 */
public class AddMaterialService 
{
    public String addMaterial(AddMaterialModel am) throws ClassNotFoundException, SQLException, Exception
    {
        AddMaterialDAO ad = new AddMaterialDAO();

        
        
        if(am.getCategory().isEmpty()|| am.getStatus().isEmpty()||am.getMaterialName().isEmpty()||am.getUnit().isEmpty())
        {
            return "Enter all Details";
        }
        else
        {
            int result = ad.insertMaterial(am);
            if (result > 0)
            {
                NotificationService ns
                        = new NotificationService();

                ns.addNotification(
                        "New Material Added : "
                        + am.getMaterialName());
                
                return "Material Added...";
            } else 
            {
                return "Material Not Added!";
            }
        }        
    }
    
    
    public String updateMaterial(AddMaterialModel am)
            throws Exception {
        AddMaterialDAO ad
                = new AddMaterialDAO();

        int result
                = ad.updateMaterial(am);

        if (result > 0) {
            return "Updated";
        } else {
            return "Not Updated";
        }
    }
    
}
