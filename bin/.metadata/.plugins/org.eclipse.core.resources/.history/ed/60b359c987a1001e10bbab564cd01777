package Users;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;
import Database.Data;
import Enums.AttestationType;
import Enums.EmployeePost;
import Enums.TeacherRank;
import SystemParts.Course;
import SystemParts.Lesson;

public class Teacher extends Employee implements Serializable, Comparable<Object>{
	private String departmentName;
	private TeacherRank rank;
	private Vector<Lesson> lessons;
	private double rating;
	
	
	public Teacher(String login, String password, String name, String surname, String id, EmployeePost post, int salary, Date hireDate, String departmentName, TeacherRank rank, double rating) {
		super(login, password, name, surname, id, post, salary, hireDate);
		this.departmentName = departmentName;
		this.rank = rank;
		this.rating = rating;
	}
	
	
	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public TeacherRank getRank() {
		return rank;
	}
	public void setRank(TeacherRank rank) {
		this.rank = rank;
	}
	public Vector<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(Vector<Lesson> lessons) {
		this.lessons = lessons;
	} 
	
	Data database = new Data();
	
	public String viewCourses() {
		String courses = "";
		for (Course c : database.courses) {
			if (c.getTeachers().contains(this)) courses += c.getName() + " ";
		}
		return courses;
	}
	
	public String viewStudents() {
		String stud = "";
		for (Student s : database.students) {
			for (Course c : database.courses) {
				if (c.getTeachers().contains(this) && s.viewCourses().contains(c)) {
					stud += s.toString();
				}
			}
		}
		return stud;
	}
	
	

	
	
//	public void putMark(Course course, Student student, double point, AttestationType type) {
//		if (type == AttestationType.FIRST) {
//			student.setMarks(course, p);
//			student.getMarks().put(course, mark);
//		}
//		else if (mark.getPeriod() == AttestationType.SECOND){
//			student.getMarks().get(course).setSecondAttestation(student.getMarks().get(course).getSecondAttestation() + point);
//			student.getMarks().put(course, student.getMarks().get(course));
//		}
//		else {
//			student.getMarks().get(course).setExamMark(student.getMarks().get(course).getExamMark() + point);
//			student.getMarks().put(course, student.getMarks().get(course));
//		}
//	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}