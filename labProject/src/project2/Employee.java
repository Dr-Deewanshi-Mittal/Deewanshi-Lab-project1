package project2;

public class Employee {
	
	private String firstName="";
	private String lastName="";
	private String department="";
	private String email="";
	private char[]password;
	
	
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public Employee() {
		
	}
	public Employee(String firstName, String lastName,String department) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.department=department;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", email=" + email + "]";
	}
	
	

}
	
