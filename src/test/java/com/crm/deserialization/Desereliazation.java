package com.crm.deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibrary;

public class Desereliazation 
{
	@Test
   public void deseliazation() throws JsonParseException, JsonMappingException, IOException
   {
	  ObjectMapper mapper = new ObjectMapper();
	  PojoLibrary pobj = mapper.readValue(new File("./jsonFile.json"), PojoLibrary.class);
	  
	  System.out.println(pobj.name);
	  System.out.println(pobj.empid);
	  System.out.println(pobj.email);
	  System.out.println(pobj.phoneno);
   }
	
}
