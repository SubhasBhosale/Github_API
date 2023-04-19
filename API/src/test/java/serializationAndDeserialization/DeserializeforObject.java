package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojoclassforemployee.PojoforEmployeeObject;

public class DeserializeforObject {
	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException
	{
		File fl = new File("./src/test/resources/excel_file/pojowithObject.txt");
		ObjectMapper objmap = new	ObjectMapper();
		PojoforEmployeeObject obj = objmap.readValue(fl, PojoforEmployeeObject.class);
		System.out.println(obj.getSpouse());
		System.out.println(obj.getPhoneNo()[0]);
	}
}
