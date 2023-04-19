package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojoclassforemployee.PojoforEmployee;

public class serailizingforwmployee {
	@Test
	public void test() throws JsonGenerationException, JsonMappingException, IOException
	{
		PojoforEmployee pojo = new PojoforEmployee("bro",1245,12345678,"test123@gmail.com","brobasjhba");
		ObjectMapper objectmapper = new ObjectMapper();
		File fl = new	File("./src/test/resources/excel_file/pojojo.txt");
		objectmapper.writeValue(fl, pojo);
	}
}
