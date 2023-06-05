package com.greatlearning.interfaces;

import com.greatlearning.model.Employee;

public interface CredetinalInterface {

	public String generateEmailAdresss(Employee employee, String department);
	public String generatePassword();
	public void showCredentials(Employee eomployee);
}
