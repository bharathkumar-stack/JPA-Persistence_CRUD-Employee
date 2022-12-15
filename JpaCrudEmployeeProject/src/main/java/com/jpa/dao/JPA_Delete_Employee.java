package com.jpa.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.pojo.Employee;

public class JPA_Delete_Employee {

public void deleteEmployee() {
	System.out.println("Enter an id get details ");
	Scanner s=new Scanner(System.in);
	int id =s.nextInt();
	
	EntityManagerFactory ef=Persistence.createEntityManagerFactory("emp");
	EntityManager em=ef.createEntityManager();
	
	em.getTransaction().begin();
	Employee e=em.find(Employee.class, id);
	em.remove(e);
	em.getTransaction().commit();
	
	System.out.println("Details has been deleted ");
			
			
}
	
}
