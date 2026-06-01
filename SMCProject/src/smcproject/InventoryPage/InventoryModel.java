/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.InventoryPage;

/**
 *
 * @author PRASANNA KUMAR
 */
public class InventoryModel 
{
    private String material_name;
    private String category ;
    private String unit ;
    private int stock ;
    private String status ;

    public InventoryModel() {
    }

    public InventoryModel(String material_name, String category, String unit, int stock, String status) {
        this.material_name = material_name;
        this.category = category;
        this.unit = unit;
        this.stock = stock;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
