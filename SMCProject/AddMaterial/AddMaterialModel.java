/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddMaterial;

/**
 *
 * @author PRASANNA KUMAR
 */
public class AddMaterialModel 
{
    private int id;
    private String materialName;
    private String category;
    private String unit;
    private int stock;
    private String status;

    public AddMaterialModel() {
    }

    public AddMaterialModel(String materialName, String category, String unit, int stock, String status) {
        this.materialName = materialName;
        this.category = category;
        this.unit = unit;
        this.stock = stock;
        this.status = status;
    }

    public AddMaterialModel(int id, String materialName, String category, String unit, int stock, String status) {
        this.id = id;
        this.materialName = materialName;
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

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
