/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.InventoryPage;

import java.sql.SQLException;
import java.util.List;

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
    
}
