package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojoclassforemployee.PojoforEmployeeArray;

public class serializaionforemployessArray {
	@Test
	public void test() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] phoneno= {586101,586102};
		PojoforEmployeeArray pojo = new PojoforEmployeeArray("bro12",1234,phoneno,"test123@gmail.com");
		ObjectMapper objmap = new ObjectMapper();
		objmap.writeValue(new File("./src/test/resources/excel_file/p123.txt"), pojo);		
	}
}
//(String eName,int eId,int[]  phoneNo,String email