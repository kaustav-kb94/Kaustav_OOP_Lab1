package com.greatlearning.services;


import java.util.Random;

import com.greatlearning.interfaces.CredetinalInterface;
import com.greatlearning.model.Employee;

public class CredentialService implements CredetinalInterface {

	@Override
	public String generateEmailAdresss(Employee employee, String department) {
		return employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+ "@" + department + ".abc.com";
	}

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		Random random = new Random();
		String num = "", cap [] = new String[3];
		for(int i =0; i< 3; i ++) {
			num += String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
			cap[i] =  String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
		}
		String small = String.valueOf(smallLetters.charAt(random.nextInt(smallLetters.length())));
		String spechar = String.valueOf(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
		String password = num + cap[0] + spechar + small + cap[1] + cap[2];
		return password;
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ---> " + employee.getEmail());
		System.out.println("Password ---> " + employee.getPassword());
	}

}
