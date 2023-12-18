package Authorization;

import Database.Data;
import Users.User;

public class Session {
	private User currentUser;
	
	public void login(Data database, String login, String password) {
		User user = database.authenticateUser(login, password);
		if (user != null) {
			this.currentUser = user;
			System.out.println("Login successful for user: " + login);
		} 
		else {
			System.out.println("Login failed for user: " + login);
		}
	}

    public User getCurrentUser() {
        return this.currentUser;
    }

    public void logout() {
        this.currentUser = null;
    }
}
