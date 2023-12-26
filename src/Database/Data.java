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

<<<<<<< HEAD
public class Data implements Serializable{
=======
public class Data implements Serializable {
>>>>>>> db7c0471e90327e2f467d548a3ac23ecf85513c4
	
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
<<<<<<< HEAD
	
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



=======
	User u;
	public Data(User u){
		this.u=u;
	}

//	public void serialize() throws Exception {
//		try (FileOutputStream fos = new FileOutputStream("user.ser")){
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(users);
//			oos.flush();
//			oos.close();
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.err.println("File not found: " + e.getMessage());
//		}
//		catch (IOException e1) {
//			e1.printStackTrace();
//			System.err.println("File not found: " + e1.getMessage());
//		}
//	}
//
//	public User deserialize() throws Exception {
//		try (FileInputStream fos = new FileInputStream("user.ser")){
//			ObjectInputStream ois = new ObjectInputStream(fos);
//			Vector<User> users = (Vector<User>) ois.readObject();
//			fos.close();
//			ois.close();
//			return users.get(0);
//
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		return null;
//	}
public  void serializeStudent() {
	try (FileOutputStream fs = new FileOutputStream("students.ser")){
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		oos.writeObject(students);
		oos.flush();
		oos.close();
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException e1) {
		e1.printStackTrace();
	}
}

	public Vector<Student> deserializeStudent() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream("students.ser")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Student> s = (Vector<Student>)ois.readObject();
			return s;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return students;
	}
}
//serialization
>>>>>>> db7c0471e90327e2f467d548a3ac23ecf85513c4
