package API_excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelutilityInAPI 
{
	public void getexcelsheet(String sheetName) throws EncryptedDocumentException, IOException
	{

		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("./src/test/resources/practice_excel/API.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Object[][] a = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				a[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				if (j==3) 
				{
					String teamsize = df.formatCellValue(sheet.getRow(i+1).getCell(j));
					a[i][j]=Integer.parseInt(teamsize);
				}
			}
		}
		wb.close();
		fis.close();
	}
}



















//pojoclassforctreatingproject pojo = new pojoclassforctreatingproject("subhas", "so@122", "Completed", 11);
//baseURI="http://rmgtestingserver";
//port=8084;
//given().body(pojo).contentType(ContentType.JSON)
//.when().post("/addProject")
//.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();