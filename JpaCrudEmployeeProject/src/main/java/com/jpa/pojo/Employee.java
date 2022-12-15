package com.jpa.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
private int  empid;
private String email;
private String empname;
private String empaddress;
private String empphone;

public Employee() {
	
}

public Employee(String email, String empname, String empaddress, String empphone) {
	super();
	this.email = email;
	this.empname = empname;
	this.empaddress = empaddress;
	this.empphone = empphone;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpaddress() {
	return empaddress;
}
public void setEmpaddress(String empaddress) {
	this.empaddress = empaddress;
}
public String getEmpphone() {
	return empphone;
}
public void setEmpphone(String empphone) {
	this.empphone = empphone;
}

}