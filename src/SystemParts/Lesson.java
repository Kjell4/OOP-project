package SystemParts;

import java.sql.Date;
import java.sql.Time;
import Enums.LessonType;
import Users.Teacher;

public class Lesson {
    
    private Course course;
    private Teacher teacher;
    private LessonType lessonType;
    private Time lessonStart;
    private Time lessonEnd;
    private Date days;
    private int studentsNum;
    
    
    public Lesson(Course course, Teacher teacher, LessonType lessonType, Time lessonStart, Time lessonEnd,
			Date days, int studentsNum) {
		super();
		this.course = course;
		this.teacher = teacher;
		this.lessonType = lessonType;
		this.lessonStart = lessonStart;
		this.lessonEnd = lessonEnd;
		this.days = days;
		this.studentsNum = studentsNum;
	}
    
    
    public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public LessonType getLessonType() {
		return lessonType;
	}
	public void setLessonType(LessonType lessonType) {
		this.lessonType = lessonType;
	}
	public Time getLessonStart() {
		return lessonStart;
	}
	public void setLessonStart(Time lessonStart) {
		this.lessonStart = lessonStart;
	}
	public Time getLessonEnd() {
		return lessonEnd;
	}
	public void setLessonEnd(Time lessonEnd) {
		this.lessonEnd = lessonEnd;
	}
	public Date getDays() {
		return days;
	}
	public void setDays(Date days) {
		this.days = days;
	}
	public int getStudentsNum() {
		return studentsNum;
	}
	public void setStudentsNum(int studentsNum) {
		this.studentsNum = studentsNum;
	}
	
}