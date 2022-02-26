package PojoLib;

public class CompanyPojo 
{
	String companyName;
    String empno;
    int[] phoneno;
     Object [] empdetails;
	public CompanyPojo(String companyName, String empno, int[] phoneno, Object[] empdetails) {
		super();
		this.companyName = companyName;
		this.empno = empno;
		this.phoneno = phoneno;
		this.empdetails = empdetails;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public int[] getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int[] phoneno) {
		this.phoneno = phoneno;
	}
	public Object[] getEmpdetails() {
		return empdetails;
	}
	public void setEmpdetails(Object[] empdetails) {
		this.empdetails = empdetails;
	}



}
