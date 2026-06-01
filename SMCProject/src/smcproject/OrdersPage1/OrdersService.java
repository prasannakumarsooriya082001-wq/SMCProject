/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.OrdersPage1;

import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author PRASANNA KUMAR
 */
public class OrdersService 
{
    OrdersDAO od = new OrdersDAO();
    
    public List getAllOrders() throws ClassNotFoundException, SQLException
    {
        List list = od.orders();
        return list;
    }
    
}
