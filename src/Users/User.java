package Users;

public abstract class User {
	private String login;  
	private String password;
	private String name;   
	private String surname;
	private String id;
	    
	public User(String login, String password, String name, String surname, String id) {
	    	this.login = login;
	    	this.password = password;
	    	this.name = name;
	    	this.surname = surname;
	    	this.id = id;
	}
	    
	public boolean authenticate(String enteredLogin, String enteredPassword) {
	        return this.getLogin().equals(enteredLogin) && this.getPassword().equals(enteredPassword);
	}
	
	public String toString() {
		return "\n[UserInfo: \n" + "Name: " + getName() + "\n" + "Surname: " + getSurname() + "\n" + "id: " + getId() + "] \n";
	}
	    
	public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        User user = (User) o;
	        return this.getLogin().equals(user.getLogin()) && this.getPassword().equals(user.getPassword());
	}
	    


	public String getLogin() {
			return login;
	 }

	public void setLogin(String login) {
			this.login = login;
	}

	public String getPassword() {
			return password;
	}

	public void setPassword(String password) {
			this.password = password;
	}

	public String getName() {
			return name;
	}

	public void setName(String name) {
			this.name = name;
	}

	public String getSurname() {
			return surname;
	}

	public void setSurname(String surname) {
			this.surname = surname;
	}

	public String getId() {
			return id;
	}

	public void setId(String id) {
			this.id = id;
	}

	public String makeRequest() {
	        //TODO
	        return "";
	}
	
}
