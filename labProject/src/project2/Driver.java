package project2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
	System.out.println("Type your first name");
	String first= sc.next();
	
	System.out.println("Type your last name");
	String last=sc.next();	
	
	String depart="";
	
	System.out.println("Choose your department");
	System.out.println("1 technical\n2.legal\n3.Human Resource\n4.admin");
	
	CredentialService cs=new CredentialService();
	
	int choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		depart= "T"
				+ "echnical";
		break;
	case 2:
		depart="Legal";
		break;
	case 3:
		depart="Human Resource";
		break;
	case 4:
		depart="Admin";
		break;
	default :
		System.out.println("wrong department selected");
		break;
		
	}
	Employee emp=new Employee(first,last,depart);
	System.out.println("Dear "+first+" "+last+ " your credentials are :\n");
	cs.generateEmail(emp);		;
	cs.passwordgen(emp);
	 sc.close();
	}
}
