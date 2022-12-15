package com.jpa;

import com.jpa.dao.JPA_Delete_Employee;
import com.jpa.dao.JPA_Read_Employee;
import com.jpa.dao.JPA_Update_Employee;

public class JPA_CRUD_Main {

	public static void main(String[] args) {
		/*JPA_Create_Emplpyee create=new JPA_Create_Emplpyee();
		create.createEmplpyee();*/
		
		/*JPA_Read_Employee read=new JPA_Read_Employee();
		read.readEmployee();*/
		
		/*JPA_Update_Employee update=new  JPA_Update_Employee();
		update.updateEmployee();*/
		
		JPA_Delete_Employee d=new JPA_Delete_Employee();
		d.deleteEmployee();

	}

}
