/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddOrder;

import java.sql.SQLException;


/**
 *
 * @author PRASANNA KUMAR
 */
public class AddOrderService 
{
    public String createOrder(AddOrderModel am) throws ClassNotFoundException, SQLException
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
                return "Order Added...";
            } else 
            {
                return "Order Not Added!";
            }
        }        
    }
}
