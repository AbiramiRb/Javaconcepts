package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;


public class Employee {

	private void empName() {

		System.out.println("Employee Name : Selvam G");
	}
	
	public static void main(String[] args) {
		
		Employee e= new Employee ();
		e.empName();
		
		Company c= new Company ();
		c.companyName();
		
		Project p= new Project ();
		p.projectName();
				
		Client cl= new Client ();
		cl.clientName();
		
	}
	
	
}
