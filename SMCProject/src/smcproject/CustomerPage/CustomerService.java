/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.CustomerPage;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author PRASANNA KUMAR
 */
public class CustomerService 
{
    CustomerDAO cd = new CustomerDAO();
    
    public List getAllCustomers() throws ClassNotFoundException, SQLException
    {
        List list = cd.customerTable();
        return list;
    }
    
}
