package API_GUI_DATABASE;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import static io.restassured.RestAssured.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RmgyantraDeleteprojectThroghAPICheckInDataBase {
@Test
public void test() throws SQLException
{
	baseURI="http://rmgtestingserver:8084";
	
	when().delete("/projects/TY_PROJ_3425")
	.then().log().all();

	boolean flag=false;
	Driver db = new Driver();
	DriverManager.registerDriver(db);
	Connection conn = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
	Statement stat = conn.createStatement();
	ResultSet result = stat.executeQuery("select * from Project;");
	while(result.next())
	{
		if("TY_PROJ_3425".equals(result.getString("project_Id")))
		{
			flag=true;
			break;
		}
	}
	if (flag==true)
	{
		System.out.println("project is not deleted");	
	}
	else
	{
		System.out.println("project is deleted");
	}
	
	
	
}
}
