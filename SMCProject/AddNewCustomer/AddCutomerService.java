/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddNewCustomer;

import java.sql.SQLException;
import smcproject.AddOrder.AddOrderDAO;
import smcproject.AddOrder.AddOrderModel;

/**
 *
 * @author PRASANNA KUMAR
 */
public class AddCutomerService 
{
    public String createCustomer(AddCustomerModel am) throws ClassNotFoundException, SQLException
    {
        AddCustomerDAO ad = new AddCustomerDAO();

        
        
        if(am.getAddress().isEmpty() || am.getCustomerName().isEmpty() || am.getEmail().isEmpty() || am.getPhoneNumber().isEmpty())
        {
            return "Enter all Details";
        }
        else
        {
            int result = ad.insertCustomer(am);
            if (result > 0)
            {
                return "Customer Added...";
            } else 
            {
                return "Customer Not Added!";
            }
        }        
    }
    
}
