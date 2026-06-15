/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddOrder;

import java.sql.SQLException;
import smcproject.Notification.NotificationService;


/**
 *
 * @author PRASANNA KUMAR
 */
public class AddOrderService 
{
    public String createOrder(AddOrderModel am) throws ClassNotFoundException, SQLException, Exception
    {
        AddOrderDAO ad = new AddOrderDAO();

        
        
        if( am.getStatus().isEmpty())
        {
            return "Enter all Details";
        }
        else
        {
            int result = ad.insertOrder(am);
            if (result > 0)
            {
                NotificationService ns
                        = new NotificationService();

                ns.addNotification(
                        "New Order Created : "
                        + am.getProductId());
                return "Order Added...";
            } else 
            {
                return "Order Not Added!";
            }
        }        
    }
    
    public String updateOrder(AddOrderModel am)
            throws Exception {
        AddOrderDAO ad
                = new AddOrderDAO();

        int result
                = ad.updateOrder(am);

        if (result > 0) {
            return "Updated";
        } else {
            return "Not Updated";
        }
    }
}
