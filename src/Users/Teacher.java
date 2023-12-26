package Users;

import java.io.Serializable;
import SystemParts.Mark;
import java.util.Date;
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





	public void putMark(Course course, Student student, double point, AttestationType type) {
		Mark mark = student.getMarks().get(course);
		if (mark == null) {
			mark = new Mark();
			student.getMarks().put(course, mark);
		}

		if (type == AttestationType.FIRST) {
			mark.setFirstAttestation(point);
		} else if (type == AttestationType.SECOND) {
			mark.setSecondAttestation(point);
		} else {
			mark.setExamMark(point);
		}
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


}