package com.Parsing.test;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibrary;

public class EmployeeLibraryTest 
{
@Test   
 public void Serialization() throws JsonGenerationException, JsonMappingException, IOException
{
	//we are creating an object of the pojolibrary
	
	PojoLibrary plib = new PojoLibrary("siba",12,"sahusibasankar28@gmail.com",891741295);
	
	// converting java object into json
	   
	ObjectMapper mapper = new ObjectMapper();
	  
	// printing the jason object into the console
	  
	System.out.println(mapper.writeValueAsString(plib));
	  
	// generate the json file
	  
	mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonFile.json"), plib);
	
}
	
	
	
	
}
