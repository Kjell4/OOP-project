package Users;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;
import Database.Data;
import Enums.EmployeePost;
import Enums.ManagerType;
import SystemParts.Course;

public class Manager extends Employee implements Serializable, Comparable<Object>{

	private ManagerType type;
	private Vector<String> requests = new Vector<>();
	public Vector<String> getRequests() {
		return requests;
	}

	public void setRequests(Vector<String> requests) {
		this.requests = requests;
	}
	
	public Manager(String login, String password, String name, String surname, String id, EmployeePost post, int salary, Date hireDate, ManagerType type) {
		super(login, password, name, surname, id, post, salary, hireDate);
		this.type = type;
	}
	public ManagerType getType() {
		return type;
	}
	public void setType(ManagerType type) {
		this.type = type;
	}
	
	Data database = new Data();
	
	public void addCourses(Course course) {
		if (database.courses.contains(course)) {
			System.out.println("Course is already exist!");
		}
		database.courses.add(course);
		System.out.println("Course added successfully!");
	}
	
	public void removeCourses(Course course) {
		if (!database.courses.contains(course)) {
			System.out.println("Course does not exist!");
		}
		database.courses.remove(course);
		System.out.println("Course removed successfully!");
	}
	
	public Vector<Course> getCourses(){
		return database.courses;
	}
	
//	public boolean addNews(News news) {
//		if (database.news.contains(news)) return false;
//		database.news.add(news);
//		return true;
//	}
//	
//	public boolean removeNews(News news) {
//		if (!database.news.contains(news)) return false;
//		database.news.remove(news);
//		return true;
//	}
	
//	 public HashSet<Teacher> viewTeacherInformation() { 
//	        return database.teachers;
//	    } 
//	 public HashSet<Student> viewStudentInformation() { 
//	        return database.student; 
//	
//	
//	
//	public boolean assignCoursesToTeachers(Course course, Teacher teacher) {
//		return course.teaches(teacher);
//	}
//	
//	public boolean receiveRegistration(Student student, Course course) {
//		return (student.getLimitOfCredit() <= 21 && course.getStudentLimit() > 0);
//	}
//	
//	public void addRequest(String request) {
//        requests.add(request);
//    }
//	 public Vector<String> viewRequests() {
//	        return requests;
//	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

