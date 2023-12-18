//package Authorization;
//import Enums.UserRole;
//import Users.User;
//import Database.Data;
//import Exceptions.InvalidUserException;
//
//public class Authorization {
//
//	private String login;
//	private String password;
//	
//	Data database = new Data();
//	
//	public User loginToSystem(String login, String password) {
//		for(int i = 0; i < database.getData().size(); i++) {
//			if(login.equals(database.getData().get(i).getLogin())){
//				if(password.equals(database.getData().get(i).getPassword())){
//					User u = database.getData().get(i);
//					return u;
//				}
//			}
//		}
//		throw new InvalidUserException("Invalid login or password.");
//	}
//}
