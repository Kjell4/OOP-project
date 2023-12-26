package Database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import Research.ResearchPaper;
import Research.ResearchProject;
import SystemParts.Course;
import SystemParts.Mark;
import SystemParts.Order;
import Users.Researcher;
import Users.Student;
import Users.Teacher;
import Users.User;
import  SystemParts.News;

public class Data implements Serializable {

	
	public Data() {
	}
	
	public static Data database = new Data();
	
	public Vector<User> users = new Vector<User>();
	public Vector<Course> courses = new Vector<Course>();
	public Vector<Mark> marks = new Vector<Mark>();
	public Vector<Student> students = new Vector<Users.Student>();
	public Vector<Teacher> teachers = new Vector<Teacher>();
	public Vector<Order> orders = new Vector<Order>();
	public Vector<ResearchPaper> papers = new Vector<>();
	public Vector<ResearchProject> projects = new Vector<>();
	public Vector<News> news = new Vector<>();
	public Vector<Researcher> participants = new Vector<>();
	public Vector<User> getData() {
		return users;
	}

	public String toString() {
		return "Data [users=" + users + ", courses=" + courses + ", marks=" + marks + ", students=" + students
				+ ", teachers=" + teachers + ", orders=" + orders + ", papers=" + papers + ", projects=" + projects
				+ ", news=" + news + ", participants=" + participants + "]";
	}

	public User authenticateUser(String login, String password) {
	    for (User user : users) {
	        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
	            return user; 
	        }
	    }
	    return null;
	}
	
	public void serialize(Data database) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            oos.writeObject(database);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to serialize data: " + e.getMessage());
        }
    }

    public Data deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
            Data newData = (Data) ois.readObject();
            return newData;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Failed to deserialize data: " + e.getMessage());
        }
        return null;
    }
}
