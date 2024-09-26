public class FullName{
	String firstName, lastName;

	FullName(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}	
	

	public void setLastName(String lastName){
		this.lastName = lastName;	
	}

	public String getLastName(){
		return lastName;
	}

	public String getFullName(){
		return firstName + " " + lastName;
	}

	public void swapFamilyName(FullName name2){
		String temp = getLastName();
		setLastName(name2.getLastName());
		name2.setLastName(temp);
	}
}