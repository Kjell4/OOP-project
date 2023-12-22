package Authorization;
import java.sql.Date;
import Enums.EmployeePost;
import Enums.ManagerType;
import Users.Admin;
import Users.Manager;
import Users.Researcher;
import Users.User;

public class Test {

	public static void main(String[] args) {
		Admin admin = new Admin("admin", "777", "Bibolat", "Kaldybai", "22B000000", EmployeePost.ADMIN, 124000, Date.valueOf("2023-03-22"));

		User u = new Researcher("ilias", "1234", "Ilias", "Bekturgan", "22B030327");
		
		User u2 = new Manager("dias", "1111", "Dias", "Ermek", "22B6564684", EmployeePost.MANAGER, 114000, Date.valueOf("2023-02-01"), ManagerType.OR);
		
		admin.addUser(u , "777");
		admin.addUser(u2 , "777");

		Session session = new Session();
		session.login(admin.showDatabase() , "ilias", "1234");
		
		Researcher currentUser = (Researcher)session.getCurrentUser();
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

	}
}
