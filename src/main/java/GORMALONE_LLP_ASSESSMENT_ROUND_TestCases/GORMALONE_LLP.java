package GORMALONE_LLP_ASSESSMENT_ROUND_TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GORMALONE_LLP_ASSESSMENT_ROUND_Test_Base.TestBase;

public class GORMALONE_LLP extends TestBase
{
	
	@Test(priority = 1)
	public void GORMALONE() throws InterruptedException
	{
		
		
		WebElement SName = driver.findElement(By.xpath("//input[@id='txtOriginGeneral']"));
		SName.sendKeys("Cameron Highlands");
		
		WebElement DName = driver.findElement(By.xpath("//input[@id='txtDestinationGeneral']"));
		DName.sendKeys("Kaula Lumpur");
			
	}
	
	@Test(priority = 2)
	public void datePicker() throws InterruptedException
	{
		
		String ExpectMonth = "November 2022";
		String ExpectDate = "20";
		
		WebElement datePicker = driver.findElement(By.xpath("//input[@id='txtDepartDateBooking']"));
		datePicker.click();
		Thread.sleep(3000);
		
		while(true)
		{
			String text = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
            Thread.sleep(2000);
			if(text.equals(ExpectMonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			Thread.sleep(2000);
		}
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[4]/td[1]/a")).click();;
		
		WebElement SBus = driver.findElement(By.xpath("//input[@id='btnBusSearchNewGeneral']"));
		SBus.click();
	}
	
	@Test(priority = 3)
	public void SelectSeats()
	{
		driver.findElement(By.xpath("(//a[text()='Select'])[3]")).click();
		
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[2]/div[3]/div/div[2]/div/div[1]/div[3]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[5]/td[1]/div")).click();
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[2]/div[3]/div/div[2]/div/div[1]/div[3]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td[1]/div")).click();
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[2]/div[3]/div/div[2]/div/div[1]/div[3]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[2]/div")).click();
	
		driver.findElement(By.xpath("//input[@class='seatproceed']")).click();
			
	}
	
	@Test(priority = 4)
	public void details()
	{
		driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']")).sendKeys("Naveen Dudhyal");
		driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']")).sendKeys("9527449087");
		driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']")).sendKeys("naveendudhyal777@gmail.com");
		
		driver.findElement(By.xpath("//a[text()='Next']")).click();
	}
	
	
	

}
