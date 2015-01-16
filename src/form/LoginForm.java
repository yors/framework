package form;

public class LoginForm implements Form {

	 String login;
	 String pass;
	
	public boolean validate() {
		
		return true;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String password) {
		this.pass = password;
	}

	

}
