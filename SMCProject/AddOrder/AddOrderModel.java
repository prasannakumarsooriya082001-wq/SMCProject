/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.AddOrder;

import java.time.LocalDate;

/**
 *
 * @author PRASANNA KUMAR
 */
public class AddOrderModel 
{
    private int orderId;
    private int customerId;
    private int productId;
    private int quantity;
    private double amount;
    private String status;
    private LocalDate oDate;

    public AddOrderModel() {
    }

    public AddOrderModel(int customerId, int productId, int quantity, double amount, String status, LocalDate oDate) {
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
        this.status = status;
        this.oDate = oDate;
    }

    public AddOrderModel(int orderId, int customerId, int productId, int quantity, double amount, String status, LocalDate oDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
        this.status = status;
        this.oDate = oDate;
    }
    

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public LocalDate getoDate() {
        return oDate;
    }

    public void setoDate(LocalDate oDate) {
        this.oDate = oDate;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    
    
    
}
