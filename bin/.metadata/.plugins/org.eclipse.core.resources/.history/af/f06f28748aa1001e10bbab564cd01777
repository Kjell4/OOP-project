package SystemParts;

import java.io.Serializable;
import java.util.Objects;
import java.util.Vector;

import Database.Data;
import Enums.CourseType;
import Enums.Faculty;
import Users.Student;
import Users.Teacher;

public class Course implements Serializable{
	private String name;
	private String code;
	private int credit;
	private Faculty faculty;
	private CourseType type;
	private int studentLimit;
	private Vector<Teacher> teachers = new Vector<>();
	
	
	public Vector<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Vector<Teacher> teachers) {
		this.teachers = teachers;
	}
	public Course(String name, String code, int credit, Faculty faculty, CourseType type) {
		super();
		this.name = name;
		this.code = code;
		this.credit = credit;
		this.faculty = faculty;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public CourseType getType() {
		return type;
	}
	public void setType(CourseType type) {
		this.type = type;
	}
	
	public int getStudentLimit() {
		return studentLimit;
	}
	public void setStudentLimit(int studentLimit) {
		this.studentLimit = studentLimit;
	}
	
	Data database = new Data();
	
	public void addStudent(Student student) {
		database.students.add(student);
	}
	public void removeStudent(Student student) {
		database.students.remove(student);
	}
	
	public boolean teaches(Teacher teacher) {
		if (database.teachers.contains(teacher)) {
			this.teachers.add(teacher);
			return true;
		}
		return false;
	}
	
	public boolean removeTeacher(Teacher teacher) {
		if (this.teachers.contains(teacher)) {
			this.teachers.remove(teacher);
			return true;
		}
		return false;
	}
	
	
	public String toString() {
		return "Course [name=" + name + ", code=" + code + ", credit=" + credit + ", type=" + type + ", studentLimit="
				+ studentLimit + ", teachers=" + teachers + "]";
	}
	
	
	public int hashCode() {
		return Objects.hash(code, credit, name, studentLimit, teachers, type);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(code, other.code) && credit == other.credit && Objects.equals(name, other.name)
				&& studentLimit == other.studentLimit && Objects.equals(teachers, other.teachers) && type == other.type;
	}
	
	
	
}