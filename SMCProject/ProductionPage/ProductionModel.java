
package smcproject.ProductionPage;

import java.util.Date;


public class ProductionModel 
{
    private int productionId;
    private String productName;
    private int quantity;
    private String status;
    private Date startDate;

    public ProductionModel() {
    }

    public ProductionModel(int productionId, String productName, int quantity, String status, Date startDate) {
        this.productionId = productionId;
        this.productName = productName;
        this.quantity = quantity;
        this.status = status;
        this.startDate = startDate;
    }

    public int getProductionId() {
        return productionId;
    }

    public void setProductionId(int productionId) {
        this.productionId = productionId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    
}
