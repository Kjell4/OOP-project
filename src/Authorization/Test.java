package Authorization;
import java.sql.Date;

import java.util.Map.Entry;
import java.util.Vector;

import Users.*;
import Enums.*;
import SystemParts.*;



public class Test {

	public static void main(String[] args) {

		//Checking for request method
		//
		Admin adminEren = new Admin("eren", "745f0", "Eren", "Yeager", "22B040578", EmployeePost.ADMIN, 145000, Date.valueOf("2023-02-21"));
		Manager managerAzamat = new Manager("azzza", "aboba", "Azamat", "Alpysbay", "22B010445", EmployeePost.MANAGER, 451000, Date.valueOf("2022-12-12"), ManagerType.DEPARTMENT);
		managerAzamat.addRequest(adminEren.makeRequest("Complain", "Wifi is not working", OrderType.COMPLAINT));
		System.out.println(managerAzamat.viewRequests());
		Dean dean = new Dean("Obama", "Barack", "DS78450A", "passworddd");
		dean.signOrder(adminEren.getEmployeeOrder());
		managerAzamat.addRequest(adminEren.getEmployeeOrder());
		System.out.println(managerAzamat.viewRequests());

		//Checking for news
		//
		Vector<News> newsVector = new Vector<>();
		Vector<Comment> commentVector = new Vector<>();
		Vector<Comment> commentVector2 = new Vector<>();
		NewsSection newsSection = new NewsSection(newsVector);
		News newsLessonPostponed = new News("LESSON POSTPONED, Hangi", "Because of my business trip, tomorrow lessons will " +
				"be postponed to unknown date", Date.valueOf("2023-12-25"), NewsType.PPONE, commentVector);
		News newsSomeRes = new News("RESEAAAARCH!", "Some research happened, go check", Date.valueOf("2023-12-23"), NewsType.RES, commentVector2);
		newsSection.addNews(newsLessonPostponed);
		newsSection.addNews(newsSomeRes);
		newsSection.writeComment(newsSomeRes, "WOW, what a news about some research!", "Azamat", Date.valueOf("2023-12-24"));
		newsSection.writeComment(newsLessonPostponed, "Ok", "Anonim", Date.valueOf("2023-12-25"));
		newsSection.writeComment(newsSomeRes, "Cool research", "Tramp", Date.valueOf("2023-12-25"));
		newsSection.viewNews();


		Admin admin = new Admin("admin", "777", "Bibolat", "Kaldybai", "22B000000", EmployeePost.ADMIN, 124000, Date.valueOf("2023-03-22"));

		User u = new Researcher("ilias", "1234", "Ilias", "Bekturgan", "22B030327");

		User u2 = new Manager("dias", "1111", "Dias", "Ermek", "22B6564684", EmployeePost.MANAGER, 114000, Date.valueOf("2023-02-01"), ManagerType.OR);

		admin.addUser(u, "777");
		admin.addUser(u2, "777");

		Session session = new Session();
		session.login(admin.showDatabase(), "ilias", "1234");

		Researcher currentUser = (Researcher) session.getCurrentUser();
		System.out.println(currentUser);

		currentUser.makeResearchPaper("Clean Code", Date.valueOf("2023-03-03"), 50, "AlmatyKitap", "pakita");
		currentUser.makeResearchPaper("Retake", Date.valueOf("2023-01-03"), 41, "Atamura", "pakita");
//		currentUser.printPapersByPublishedDate();
		currentUser.printPapersByArticleLength();
		currentUser.getCitation(0, "Bibtex");

		session.logout();
		currentUser = (Researcher) session.getCurrentUser();
		System.out.println(currentUser);

//		Session session = new Session();
//		session.login(admin.showDatabase() , "dias", "1111");
//
//		Manager currentUser = (Manager)session.getCurrentUser();
//		currentUser.addCourses(new Course("OOP", "CSCI2106", 5, Faculty.SITE, CourseType.BASIC));
//		System.out.println(currentUser.getCourses());
//
//		session.logout();
//		currentUser = (Manager) session.getCurrentUser();
////		System.out.println(currentUser);


		Mark firstAttestationMark = new Mark();
		firstAttestationMark.setType(AttestationType.FIRST);
		firstAttestationMark.defineMark(25);
		System.out.println("First Attestation Mark: " + firstAttestationMark);


		Mark secondAttestationMark = new Mark();
		secondAttestationMark.setType(AttestationType.SECOND);
		secondAttestationMark.defineMark(32);
		System.out.println("Second Attestation Mark: " + secondAttestationMark);

		Mark finalExamMark = new Mark();
		finalExamMark.setType(AttestationType.EXAM);
		finalExamMark.defineMark(30);
		System.out.println("Final Exam Mark: " + finalExamMark);


		double totalGrade = firstAttestationMark.addGrade() + secondAttestationMark.addGrade() + finalExamMark.addGrade();
		System.out.println("Total Grade: " + totalGrade);

		Mark overallMark = new Mark();
		overallMark.defineMark(totalGrade);
		overallMark.transformMark();
		System.out.println("Overall GPA: " + overallMark.getGpa());
		System.out.println("Letter of GPA" + " " + overallMark.getIteralMark());


		Admin admin2 = new Admin("admin", "777", "Bibolat", "Kaldybay", "22B030480", EmployeePost.ADMIN, 777007, Date.valueOf("2023-03-22"));

		Teacher teacher = new Teacher("teacher1", "password", "Alice", "Smith", "T456", EmployeePost.TEACHER, 50000, new Date(11, 11, 11), "Computer Science", TeacherRank.LECTURER, 4.5);

		admin2.addUser(teacher, "777");

		Session session2 = new Session();

		session2.login(admin2.showDatabase(), "teacher1", "password");

		Course course = new Course("Programming 101", "CS101", 1, Faculty.SITE, CourseType.BASIC);

		Student student = new Student("student1", "password", "John", "Doe", "S123", 19, Degree.BACHELOR, 2, "Computer Science", Faculty.SITE, 3.5, "Good standing", null, 11);
		course.teaches(teacher);
		student.registerToCourse(course);
		double point = 25;
		AttestationType type = AttestationType.FIRST;
		teacher.putMark(course, student, point, type);
		System.out.println("Student's Marks:");
		for (Entry<Course, Mark> entry : student.getMarks().entrySet()) {
			Course courseEntry = entry.getKey();
			Mark markEntry = entry.getValue();
			System.out.println("Course: " + courseEntry.getName() + ", Mark: " + markEntry);
		}

		session2.logout();
	}
}



//		Student student = new Student("student1", "password", "John", "Doe", "S123", 19, Degree.BACHELOR, 2, "Computer Science", Faculty.SITE, 3.5, "Good standing", null, 11);
//
//		Course course = new Course("Programming 101", "CS101", 1, Faculty.SITE, CourseType.BASIC);
//		course.teaches(teacher);
//		student.registerToCourse(course);
//		double point = 25;
//		AttestationType type = AttestationType.FIRST;
//		teacher.putMark(course, student, point, type);
//		System.out.println("Student's Marks:");
//		for (Entry<Course, Mark> entry : student.getMarks().entrySet()) {
//			Course courseEntry = entry.getKey();
//			Mark markEntry = entry.getValue();
//			System.out.println("Course: " + courseEntry.getName() + ", Mark: " + markEntry);
//		}
//
//	}
//}
