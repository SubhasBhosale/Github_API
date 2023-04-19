package API_GUI_DATABASE;
import org.testng.annotations.Test;
import com.mysql.cj.jdbc.Driver;
import io.restassured.http.ContentType;
import pojolibrary.pojoclassforctreatingproject;
import static io.restassured.RestAssured.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RmgyantraAddprojectThroghAPICheckInDataBase {
	@Test
	public void test() throws SQLException
	{
				baseURI="http://rmgtestingserver:8084";
				pojoclassforctreatingproject pojo = new pojoclassforctreatingproject("shubham","shubahm111","Created",8);
		
				given().body(pojo).contentType(ContentType.JSON)
				.when().post("/addProject")
				.then().log().all();
		
				Driver db= new Driver(); 
				DriverManager.registerDriver(db);
				Connection conn = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
				Statement stat = conn.createStatement();
				ResultSet query = stat.executeQuery("select * from Project;");
				while(query.next())
				{
					if("dinga".equals(query.getString("Project_Name")))
					{
						System.out.println("project is present");
					}
					//list.add(query.getString("Project_Name"));
				}
			conn.close();
//		DatabaseUtility dbutil = new DatabaseUtility("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
//		System.out.println(dbutil.getDataFromDataBase("select * from project", "project_Id"));

	}
}
