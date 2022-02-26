package com.parsing.pojo;

public class PojoLibrary
{
      public  String name;
      public  long empid;
      public  String email;
      public  long phoneno;
      public PojoLibrary() {
		
	}
		public PojoLibrary(String name, long empid, String email,long phoneno) {
			super();
			this.name = name;
			this.empid = empid;
			this.email = email;
			this.phoneno= phoneno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getEmpid() {
			return empid;
		}
		public void setEmpid(long empid) {
			this.empid = empid;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}
		
		
        
	
}
