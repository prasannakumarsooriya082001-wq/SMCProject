/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.DashboardPage;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author PRASANNA KUMAR
 */
public class DashboardService
{
    DashboardDAO dd = new DashboardDAO();
    
    public List getAllOrders() throws ClassNotFoundException, SQLException
    {
        List list = dd.orders();
        return list;
    }
    
}
