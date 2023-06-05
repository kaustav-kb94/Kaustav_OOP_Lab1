package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;



public class Driver {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Kaustav","Bhattacharya");	
		
		CredentialService credService= new CredentialService();	
		
		displayMenu();
		
		Scanner sc = new Scanner(System.in);
		
		int option = 0;
		
		 option = getOptionFromScreen(sc);
		
		if(0 < option && option < 5) {
			String department = determineEmployeeDepartment(option);		
			String emailAddress = credService.generateEmailAdresss(employee, department);				
			employee.setEmail(emailAddress);		
			String password = credService.generatePassword();		
			employee.setPassword(password);		
			credService.showCredentials(employee);
		}else {
			System.out.println("The option you have selected is not in the list. Kindly choose any option between 1 to 4.");
			
		}
	
		
		sc.close();

	}

	private static int getOptionFromScreen(Scanner sc) {
		int opt = sc.nextInt();
		return opt;
	}

	private static String determineEmployeeDepartment(int option) {
		String department = "";
		switch(option) {
			case 1: 
				department = "tech";
				break;
			case 2:
				department = "admin";
				break;
			case 3:
				department = "humanresource";
				break;
			case 4:
				department = "legal";
				break;
		}
		return department;
	}

	private static void displayMenu() {	
		System.out.println("Plese eneter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}

}
