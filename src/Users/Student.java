package Users;

import java.io.Serializable;
import java.util.Objects;
import java.util.HashMap;
import java.util.Vector;

import Database.Data;
import Enums.Degree;
import Enums.Faculty;
import SystemParts.Course;
import SystemParts.Mark;
import SystemParts.Organization;

public class Student extends User implements Serializable, Comparable<Object> {
	private int limitOfCredit=21;
    private Degree degree;
    private int year;
    private String major;
    private Faculty faculty;
    private Vector <Course> course = new Vector<Course>();
    private double gpa;
    private String transcript;
    private Organization organization;
    private int credits;
    private HashMap<Course, Mark> marks = new HashMap<Course, Mark>();
    
	public Student(String login, String password, String name, String surname, String id, int limitOfCredit, Degree degree, int year, String major, Faculty faculty, double gpa, String transcript, Organization organization, int credits) {
		super(login, password, name, surname, id);
		this.limitOfCredit = limitOfCredit;
		this.degree = degree;
		this.year = year;
		this.major = major;
		this.faculty = faculty;
		this.course = course;
		this.gpa = gpa;
		this.transcript = transcript;
		this.organization = organization;
		this.credits = credits;
		this.marks = marks;
	}

	public int getLimitOfCredit() {
		return limitOfCredit;
	}
	public void setLimitOfCredit(int limitOfCredit) {
		this.limitOfCredit = limitOfCredit;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public Vector<Course> getCourse() {
		return course;
	}
	public void setCourse(Vector<Course> course) {
		this.course = course;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getTranscript() {
		return transcript;
	}
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public HashMap<Course, Mark> getMarks() {
		return marks;
	}
	public void setMarks(HashMap<Course, Mark> marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	Data database = new Data();

	public Vector viewCourses() {
		return database.students;
	}
	
	
//	public Degree getTypeDegree() {
//        //TODO
//        return Degree.BACHELOR;
//    }
//	
//	 public boolean registerToCourse() {
//	        //TODO
//	        return false;
//	    }
//	 
//	 public Vector<Mark> viewMarks() {
//	        //TODO
//	        return null;
//	    }
//	 
//	 public Vector<Course> viewCourses() {
//	        //TODO
//	        return null;
//	    }
//	 
//	 public int compareTo(Object o) {
//				Student s = (Student) o;
//				if (gpa < s.gpa) return -1;
//				else return 1;
//			return 0;
//		}
//	 
//	 public void rateTeachers(Teacher teacher, double rating) {
//			teacher.setRating(rating);
//		}
//	 
//	 public boolean dropCourse(Course course) {
//			if(this.getMarks().get(course).addGrade()<50) {
//				marks.remove(course);
//				return true;
//			}
//			return false;
//		}
}
