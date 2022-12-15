package com.jpa.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.pojo.Employee;

public class JPA_Update_Employee {

	public void updateEmployee() {
		System.out.println("Enter an id get details ");
		Scanner s=new Scanner(System.in);
		int id =s.nextInt();
		//Employee e=new Employee();
		
		EntityManagerFactory ef=Persistence.createEntityManagerFactory("emp");
		EntityManager em=ef.createEntityManager();
		
		
		Employee employee=em.find(Employee.class, id);
		 System.out.println("Before Updation"); 
		System.out.println("These are deials of employee id "+employee.getEmpid() );
		System.out.println("The Details of an Employee name "+employee.getEmpname());
		System.out.println("The Details of an Employee address "+employee.getEmpaddress());
		System.out.println("The Details of an Employee E-mail "+employee.getEmail());
		System.out.println("The Details of an Employee Phone "+employee.getEmpphone());
		System.out.println("\n");
		 System.out.println("Enter details to  Update\n"); 
		 System.out.println("Do you want to update 1=>YES \n 2=>NO");
		 int flag=s.nextInt();
		 Scanner l=new Scanner(System.in);
		 if(flag==1) {
			
		System.out.println("\nEnter name of an Employee ");
		String name=l.nextLine();
		System.out.println("\nEnter email of an Employee");
		String email=l.nextLine();
		System.out.println("\nEnter address of an Employee");
		String address=l.nextLine();
		System.out.println("\nEnter phone of an Employee");
		String phone=l.nextLine();
		System.out.println("\n");
		em.getTransaction().begin();
		employee.setEmpname(name);
		employee.setEmail(email);
		employee.setEmpaddress(address);
		employee.setEmpphone(phone);
		
		em.getTransaction().commit();
		 }
		 s.close();
		 l.close();
		 System.out.println("After Updation"); 
		 
		 
			System.out.println("These are deials of employee id "+employee.getEmpid() );
			System.out.println("The Details of an Employee name "+employee.getEmpname());
			System.out.println("The Details of an Employee address "+employee.getEmpaddress());
			System.out.println("The Details of an Employee E-mail "+employee.getEmail());
			System.out.println("The Details of an Employee Phone "+employee.getEmpphone());
			

			
		
		
		
	}
}
