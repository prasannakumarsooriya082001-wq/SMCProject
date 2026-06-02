/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.DashboardPage;

import java.time.LocalDate;

/**
 *
 * @author PRASANNA KUMAR
 */
public class DashboardModel 
{
    private int orderId;
    private String customerName;
    private double amount;
    private LocalDate orderDate;
    private String status;

    public DashboardModel() {
    }

    public DashboardModel(int orderId, String customerName, double amount, LocalDate orderDate, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.orderDate = orderDate;
        this.status = status;
    }

    

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
