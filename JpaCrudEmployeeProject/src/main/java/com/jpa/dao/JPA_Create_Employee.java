package com.jpa.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.pojo.Employee;

public class JPA_Create_Employee {

	public void createEmplpyee() {
	System.out.println("Enter The Detials of an Employee");
	Scanner s=new Scanner(System.in);
	System.out.println("\nEnter name of an Employee ");
	String name=s.nextLine();
	System.out.println("\nEnter email of an Employee");
	String email=s.nextLine();
	System.out.println("\nEnter address of an Employee");
	String address=s.nextLine();
	System.out.println("\nEnter phone of an Employee");
	String phone=s.nextLine();

	Employee e=new Employee(name,email,address,phone);
	
		//Creates a entity relation between class[Entity] to the table in database 
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(e);
		entityManager.getTransaction().commit();
		
		System.out.println("The details has been added "+name +" "+email+" "+address+" "+phone );
		
	}
}
