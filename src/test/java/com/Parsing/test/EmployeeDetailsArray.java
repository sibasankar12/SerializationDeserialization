package com.Parsing.test;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoArrayLibrary;

public class EmployeeDetailsArray 
{
    @Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException
	{
    	//create an array of phoneno
		
    	long []arr= {894241662,451548611,46144613,48466130};
		
    	// here we create a object of pojoArrayLibrary
		
    	PojoArrayLibrary pobj = new PojoArrayLibrary("siba","Tyss011","sahusibasankar28@gmail.com",arr);
		
    	// here we convert the java to json
		
    	ObjectMapper mapper=new ObjectMapper();
		
    	// print the json object into the console
		
    	System.out.println(mapper.writeValueAsString(pobj));
		
    	// here we crate a json file
		
    	mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonArrayFile.json"), pobj);
	}
	
	
}
