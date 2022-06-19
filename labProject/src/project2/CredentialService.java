package project2;

import java.util.Random;

public class CredentialService {

	 public void passwordgen(Employee emp) {
		
		Random random=new Random();
		int size=10;
		char[]pass=new char[size];
		
		String pattern="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
		
		for(int i=0;i<size;i++) {
			pass[i]=pattern.charAt(random.nextInt(pattern.length()));
		}
         emp.setPassword(pass);
         System.out.print("Your Password is : ");
		System.out.println(pass);		
	}	
	 
	 
	  public void generateEmail(Employee emp) {
			String email=emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartment()+".abc.com";
			emp.setemail(email);
			System.out.println("Your email is : ");
			System.out.println(email);
		}
		
}
