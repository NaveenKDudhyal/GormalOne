package GORMALONE_LLP_ASSESSMENT_ROUND_Test_Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase 
{
	public WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\NEW FILE\\GORMALONE_LLP_ASSESSMENT_ROUND\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.busonlineticket.com/booking/bus-tickets.aspx");
	}

}
