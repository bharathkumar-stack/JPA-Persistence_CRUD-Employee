package com.jpa.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.pojo.Employee;

public class JPA_Read_Employee {

	public void readEmployee() {
		System.out.println("Enter an id to get all details of an Employee\n");
		System.out.println("Enter a Employee Id");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		s.close();
		EntityManagerFactory ef= Persistence.createEntityManagerFactory("emp");
		EntityManager em=ef.createEntityManager();
		
		Employee e=em.find(Employee.class, id);
		
		System.out.println("The Details of an Employee id "+e.getEmpid());
		System.out.println("The Details of an Employee name "+e.getEmpname());
		System.out.println("The Details of an Employee address "+e.getEmpaddress());
		System.out.println("The Details of an Employee E-mail "+e.getEmail());
		System.out.println("The Details of an Employee Phone "+e.getEmpphone());
		
		
		
	}
}
