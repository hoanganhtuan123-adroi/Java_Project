package classs;

import java.sql.*;
import database.Data;
import interfacee.iOrder;
import java.util.Scanner;
import entity.OD;

public class Order implements iOrder {
    
    private Data dataAccess;

    public Order(Data dataAccess) {
        this.dataAccess = dataAccess;
    }

    @Override
    public void addOrder(int customerId, String orderDate, double totalAmount, String shippingAddress, String paymentStatus) {
        String sql = "INSERT INTO Orders (CustomerID, OrderDate, TotalAmount, ShippingAddress, PaymentStatus) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = dataAccess.getConnection().prepareStatement(sql)) {
            ps.setInt(1, customerId);
            ps.setString(2, orderDate);
            ps.setDouble(3, totalAmount);
            ps.setString(4, shippingAddress);
            ps.setString(5, paymentStatus);
            ps.executeUpdate();
            System.out.println("Successfully added Orders!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateOrder(int customerId, int orderId, String orderDate, double totalAmount, String shippingAddress, String paymentStatus) {
        String sql = "UPDATE Orders SET CustomerID = ?, OrderDate = ?, TotalAmount = ?, ShippingAddress = ?, PaymentStatus = ? WHERE OrderID = ?";
        try (PreparedStatement ps = dataAccess.getConnection().prepareStatement(sql)) {
        	ps.setInt(1, customerId);  
        	ps.setString(2, orderDate);      
        	ps.setDouble(3, totalAmount);
        	ps.setString(4, shippingAddress);   
        	ps.setString(5, paymentStatus); 
            ps.executeUpdate();
            System.out.println("Successfully updated Order!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteOrder(int orderId) {
        String sql = "DELETE FROM Orders WHERE OrderID = ?";
        try (PreparedStatement ps = dataAccess.getConnection().prepareStatement(sql)) {
            ps.setInt(1, orderId);
            ps.executeUpdate();
            System.out.println("Successfully deleted Order!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showOrder() {
        String sql = "SELECT * FROM Orders";
        System.out.printf("| %-10s | %-10s | %-15s | %-15s | %-25s | %-15s |%n", "OrderID", "CustomerID", "OrderDate", "TotalAmount", "ShippingAddress", "PaymentStatus");
        System.out.println("|----------|------------|-----------------|-----------------|---------------------------|----------------|");
        try (Statement stmt = dataAccess.getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int orderId  = rs.getInt("OrderID");
                int customerId   = rs.getInt("CustomerID ");
                String orderDate   = rs.getString("OrderDate ");
                double totalAmount   = rs.getDouble("TotalAmount ");
                String shippingAddress   = rs.getString("ShippingAddress");
                String paymentStatus   = rs.getString("PaymentStatus");
                System.out.printf("| %-10d | %-10d | %-15s | %-15.2f | %-25s | %-15s |%n", orderId  , customerId, orderDate.toString(), totalAmount, shippingAddress, paymentStatus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}