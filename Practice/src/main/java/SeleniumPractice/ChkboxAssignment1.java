package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ChkboxAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		driver.findElement(By.id("checkBoxOption1")).click();
		boolean chboxSelect = driver.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println(chboxSelect);
		
		if(chboxSelect == true)
		{
			Assert.assertTrue(chboxSelect);
			System.out.println("First Checkbox is checked");
			Thread.sleep(2000);
			//Uncheck again first checkbox
			driver.findElement(By.id("checkBoxOption1")).click();
		}
		else
		{
			Assert.assertTrue(chboxSelect);
			System.out.println("First Checkbox is not checked");
		}
		
		Thread.sleep(2000);
		
		
		boolean chboxDeSelect = driver.findElement(By.id("checkBoxOption1")).isSelected();
		if(chboxDeSelect == false)
		{
			Assert.assertFalse(chboxDeSelect);
			System.out.println("First Checkbox is Unchecked");
			
		}
		else
		{
			Assert.assertFalse(chboxDeSelect);
			System.out.println("First Checkbox is checked");
		}
		Thread.sleep(2000);
		
		//2. How to get the Count of number of check boxes present in the page
		int chkbxCount = driver.findElements(By.xpath("//div[@id='checkbox-example']//input")).size();
		System.out.println("Count of check boxes = "+chkbxCount);
		
		driver.close();
		
	}

}
