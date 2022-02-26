package com.Parsing.test;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoMineLib;
import com.parsing.pojo.PojoSpouseDetails;

public class EmployeeDetailsWithSpouse 
{
	@Test
  public void serialization() throws JsonGenerationException, JsonMappingException, IOException
  {
		PojoSpouseDetails plib=new PojoSpouseDetails("akki",1325,"sakki@123gmail.com",1246554);
	    PojoMineLib mlib=new PojoMineLib("siba","sahusibasankar28@gmail.com",12345, plib);
	 
	     ObjectMapper mapper = new ObjectMapper();
	     System.out.println(mapper.writeValueAsString(mlib));
	     mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonFilespouse.json"), mlib);
  }
	
	
}
