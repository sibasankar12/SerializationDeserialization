package PojoLib;

public class EmployeeDetails 
{
    String name;
    String empid;
    long phoneno;
    String email;
	public EmployeeDetails(String name, String empid, long phoneno, String email) {
		super();
		this.name = name;
		this.empid = empid;
		this.phoneno = phoneno;
		this.email = email;
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
}
