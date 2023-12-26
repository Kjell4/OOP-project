package Users;

import Enums.EmployeePost;
import SystemParts.Order;

import java.util.Date;
import java.util.Vector;

import Database.Data;

public class TechSupportSpecialist extends Employee {
	
    
    public TechSupportSpecialist(String login, String password, String name, String surname, String id, EmployeePost post, int salary, Date hireDate) {
        super(login, password, name, surname, id, post, salary, hireDate);
    }
    
    Data database = new Data();
    
    public void addOrder(Order order) {
        database.orders.add(order);
        System.out.println("[TechSupport] : Order was added successfully!");
    }

    public void removeOrder(Order order) {
    	database.orders.remove(order);
    }

    public void acceptOrder(Order order) {
        order.setStatus("Accepted");
        removeOrder(order);
        System.out.println("[TechSupport] : Order was accepted!");
    }

    public void rejectOrder(Order order) {
        order.setStatus("Rejected");
        removeOrder(order);
        System.out.println("[TechSupport] : Order was rejected!");
    }

    public Vector<Order> viewOrders() {
        return database.orders;
    }

    @Override
    public String toString() {
        return super.toString() + "Orders: " + database.orders;
    }

}