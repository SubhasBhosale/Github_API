package serializationAndDeserialization;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import Pojoclassforemployee.PojoforEmployeeObject;

public class serailizingforwmployee_Object 
{
	@Test
	public void test() throws JsonGenerationException, JsonMappingException, IOException
	{
		spouse sp = new spouse("bella",789);
		int[] a= {123,456};
		PojoforEmployeeObject pojo = new PojoforEmployeeObject("bro1111122222",1234,a,sp);
		ObjectMapper objm = new ObjectMapper();
		objm.writeValue(new File("./src/main/pojowithObject.txt"), pojo);
	}
}

//serializing => converting java object into json format ,by using objectmapper and writevalue and readvalue

//k/src/test/resources/excel_file/pojowithObject.txt
//String eName,int eId,int[]  phoneNo,Object spouse
//String eName,int eId << == spouse