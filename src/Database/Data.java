package Database;

import java.util.Vector;

import Research.ResearchPaper;
import Research.ResearchProject;
import SystemParts.Course;
import SystemParts.Mark;
import SystemParts.Order;
import Users.Student;
import Users.Teacher;
import Users.User;
import  SystemParts.News;

public class Data {
	
	public Data() {
	}
	
	public Vector<User> users = new Vector<User>();
	public Vector<Course> courses = new Vector<Course>();
	public Vector<Mark> marks = new Vector<Mark>();
	public Vector<Student> students = new Vector<Users.Student>();
	public Vector<Teacher> teachers = new Vector<Teacher>();
	public Vector<Order> orders = new Vector<Order>();
	public Vector<ResearchPaper> papers = new Vector<>();
	public Vector<ResearchProject> projects = new Vector<>();
	public Vector<News> news = new Vector<>();
	public Vector<User> getData() {
		return users;
	}

	public User authenticateUser(String login, String password) {
	    for (User user : users) {
	        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
	            return user; 
	        }
	    }
	    return null;
	}
}
