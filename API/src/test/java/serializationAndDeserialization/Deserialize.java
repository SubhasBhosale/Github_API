package serializationAndDeserialization;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import Pojoclassforemployee.PojoforEmployee;
public class Deserialize 
{
	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objectmapper = new ObjectMapper();
		PojoforEmployee e1 = objectmapper.readValue(new File("./src/main/pojowithObject.txt"),PojoforEmployee.class );	
		System.out.println(e1.geteName());
	}
}
