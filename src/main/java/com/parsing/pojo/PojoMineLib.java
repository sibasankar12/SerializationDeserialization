package com.parsing.pojo;

public class PojoMineLib
{
	 public String name;
	 public String email;
	 public long empid;
	 public Object spouse;
	 public PojoMineLib() {
		
	}
	public PojoMineLib(String name, String email, long empid, Object spouse) {
		super();
		this.name = name;
		this.email = email;
		this.empid = empid;
		this.spouse = spouse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public Object getSpouse() {
		return spouse;
	}
	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
	 
    
	
}
