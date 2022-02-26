package com.parsing.pojo;

public class PojoArrayLibrary 
{

	 public  String name;
	 public String empid;
	 public String email;
	 public long[] phoneno;
	public PojoArrayLibrary(String name, String empid, String email, long[] phoneno) {
		super();
		this.name = name;
		this.empid = empid;
		this.email = email;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long[] getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long[] phoneno) {
		this.phoneno = phoneno;
	}
	 
	 
    
	
}
