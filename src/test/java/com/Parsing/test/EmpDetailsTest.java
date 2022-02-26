package com.Parsing.test;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoLib.CompanyPojo;
import PojoLib.EmployeeDetails;

public class EmpDetailsTest 
{
@Test
public void details() throws JsonGenerationException, JsonMappingException, IOException
{
	EmployeeDetails pojo1 = new EmployeeDetails("siba","AB124",2555,"siba12@gmail.com");
	EmployeeDetails pojo2 = new EmployeeDetails("sankar","CD456",1247,"sankar23@gmail.com");
	
	 
	Object[] arr= {pojo1,pojo2};

	int[] phoneno={24455,54865};
	
	CompanyPojo compojo = new CompanyPojo("tyss","tyss09",phoneno,arr);
	
	ObjectMapper mapper = new ObjectMapper();
	
	mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./EmpDetails.json"), compojo);
}	
}
