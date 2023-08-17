package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	public WebDriver getdriver() throws IOException 
	{ 
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(getproperty("url"));
        driver.manage().window().maximize();
        return driver;
	}

	public static String getproperty(String key) throws IOException {

		File file = new File("src/test/resources/data/master.properties");
		FileInputStream fileinputstream = new FileInputStream(file);

		Properties properties = new Properties();
		properties.load(fileinputstream);
		return properties.getProperty(key);

	}

	public static List<String> ReadExcel() throws IOException {
		List<String> Exceldata = new ArrayList<String>();
		File file = new File("src/test/resources/data/userdata.xlsx");
		FileInputStream fileinputstream = new FileInputStream(file);
		XSSFWorkbook xssfworkbook = new XSSFWorkbook(fileinputstream);
		XSSFSheet sheet = xssfworkbook.getSheet("data");
		int lastrownum = sheet.getLastRowNum();

		for (int i = 1; i <= lastrownum; i++) {
			XSSFRow row = sheet.getRow(i);
			int lastcellnum = row.getLastCellNum();
			for (int j = 0; j < lastcellnum; j++) {
				Exceldata.add(row.getCell(j).toString());
			}
		}
		xssfworkbook.close();
		return Exceldata;
	}
	public static ArrayList<String> selectOptionFromDropDown(WebElement dropdown, String[] options)

	{
		Select select = new Select(dropdown);
		ArrayList<String> selectedoptions = new ArrayList<>();
		for (String option : options) 
		{
			select.selectByVisibleText(option);
		}
		List<WebElement> selectedoptionbylogic = select.getAllSelectedOptions();
		for(WebElement element :selectedoptionbylogic)
		{
			selectedoptions.add(element.getText());     
		}
		return selectedoptions;
	}

}
