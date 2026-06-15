package smcproject.OrdersPage1;

import java.time.LocalDate;

public class OrdersModel
{
    private int orderId;

    private int customerId;

    private int productId;

    private int quantity;

    private String customerName;

    private double amount;

    private LocalDate orderDate;

    private String status;

    public OrdersModel() {
    }

    public OrdersModel(
            int orderId,
            int customerId,
            int productId,
            int quantity,
            String customerName,
            double amount,
            LocalDate orderDate,
            String status)
    {
        this.orderId = orderId;

        this.customerId = customerId;

        this.productId = productId;

        this.quantity = quantity;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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