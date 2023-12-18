package Users;
import Database.Data;
import java.util.Date;

import Enums.EmployeePost;

public class Admin extends Employee{

	public Admin(String login, String password, String name, String surname, String id, EmployeePost post, int salary, Date hireDate) {
		super(login, password, name, surname, id, post, salary, hireDate);
	}
	
	Data database = new Data();
	
	public void addUser(User u, String adminPassword) {
	        if (this.authenticate(getLogin(), adminPassword)) {  
	            if (!database.getData().contains(u)) {
	                database.getData().add(u);
	                System.out.println("User added successfully by admin: " + getLogin());
	            } 
	            else {
	                System.out.println("User already exists in the database.");
	            }
	        } 
	        else {
	            System.out.println("Authentication failed for admin: " + getLogin());
	        }  
	 }
	    
	public void removeUser(User u, String adminPassword) {
        if (this.authenticate(getLogin(), adminPassword)) {
            if (database.getData().contains(u)) {
                database.getData().removeElement(u);
                System.out.println("User removed successfully by admin: " + getLogin());
            } 
            else {
                System.out.println("User not found in the database.");
            }
        } 
        else {
            System.out.println("Authentication failed for admin: " + getLogin());
        }
    }
	 
	public Data showDatabase() {
		 return database;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
