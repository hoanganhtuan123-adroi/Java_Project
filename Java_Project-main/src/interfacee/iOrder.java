/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacee;

/**
 *
 * @author admin
 */
public interface iOrder {
    void addOrder(int customerId, String orderDate, double totalAmount, String shippingAddress, String paymentStatus);
    void updateOrder(int orderId, int customerId, String orderDate, double totalAmount, String shippingAddress, String paymentStatus);
    void deleteOrder(int orderId);
    void showOrder();
}
