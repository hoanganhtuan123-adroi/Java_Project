/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class OD {
    private int orderId;
    private int customerId;
    private String orderDate;
    private double totalAmount;
    private String shippingAddress;
    private String paymentStatus;

    // Constructor
    public OD(int orderId, int customerId, String orderDate, double totalAmount, String shippingAddress, String paymentStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.shippingAddress = shippingAddress;
        this.paymentStatus = paymentStatus;
    }

    // Getter và Setter

    public int getorderId() {
        return orderId;
    }

    public void setorderId(int orderId) {
        this.orderId = orderId;
    }

    public int getcustomerId() {
        return customerId;
    }

    public void setcustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getorderDate() {
        return orderDate;
    }

    public void setorderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double gettotalAmount() {
        return totalAmount;
    }

    public void settotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getshippingAddress() {
        return shippingAddress;
    }

    public void setshippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getpaymentStatus() {
        return paymentStatus;
    }

    public void setpaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
