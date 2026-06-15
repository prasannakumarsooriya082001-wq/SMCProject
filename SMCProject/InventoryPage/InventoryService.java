/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.InventoryPage;

import java.sql.SQLException;
import java.util.List;
import smcproject.OrdersPage1.OrdersDAO;

/**
 *
 * @author PRASANNA KUMAR
 */
public class InventoryService 
{
    InventoryDAO id = new InventoryDAO();
    
    public List getAllMaterials() throws ClassNotFoundException, SQLException
    {
        List list = id.materials();
        return list;
    }
    
    
    public String deleteProduct(String name)
            throws Exception {
        InventoryDAO pd
                = new InventoryDAO();

        int result
                = pd.deleteMaterial(name);

        if (result > 0) {
            return "Deleted";
        } else {
            return "Not Deleted";
        }
    }
    
}
