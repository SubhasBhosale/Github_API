package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojoclassforemployee.PojoforEmployee;
import Pojoclassforemployee.PojoforEmployeeArray;

public class DeserializeforArray {
	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException
	{
		File file = new File("./src/test/resources/excel_file/p123.txt");
		ObjectMapper objmap = new	ObjectMapper();
		PojoforEmployeeArray obj = objmap.readValue(file, PojoforEmployeeArray.class);
		System.out.println(obj.getPhoneNo()[1]);
	}
}
