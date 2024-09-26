public class User{
	String username, password;
	
	User(String username, String password){
		this.username = username;
		this.password = password;
	}

	public boolean signIn(String username, String password){
		if(this.username.equals(username) && this.password.equals(password)){
			return true;
		} else {
			return false;
		} 
	}
}