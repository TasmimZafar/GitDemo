package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//https://rahulshettyacademy.com/dropdownsPractise/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		boolean userDisplay;
		userDisplay = driver.findElement(By.xpath("//input[@id='inputUsername']")).isDisplayed();
		if(userDisplay=true)
		{
			Assert.assertTrue(userDisplay, "User text field is present");
			driver.findElement(By.xpath("//input[@id='inputUsername']")).clear();
			driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Tasmim");
			
		}
		else
		{
			Assert.assertFalse(userDisplay, "User text field is not present");
		}
		boolean passDisplay = driver.findElement(By.cssSelector("input[type='password']")).isDisplayed();
		if(passDisplay=true)
		{
			Assert.assertTrue(passDisplay, "Password text field is present");
			driver.findElement(By.cssSelector("input[type='password']")).clear();
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
			
		}
		else
		{
			Assert.assertFalse(passDisplay, "Password text field is not present");
		}
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		//agreeTerms
		/*boolean rembrUse;
		rembrUse = driver.findElement(By.xpath("//input[@value='rmbrUsername']")).isSelected();
		if(rembrUse=false)
		{
			driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		}
		else
		{
			Assert.assertTrue(passDisplay, "rmbrUsername checkbox is already selected");
		}
		
		*/
		String Welcome = driver.findElement(By.xpath("//div[@class='login-container']/h1")).getText();
		
		System.out.println(Welcome);
		
		Assert.assertEquals(Welcome, "Welcome to Rahul Shetty Academy");
		
		driver.findElement(By.cssSelector("button.logout-btn")).click();
		
		String signinPAge = driver.findElement(By.xpath("//form/h1[contains(text(),'Sign in')]")).getText();
		
		Assert.assertEquals(signinPAge, "Sign in");
		
		//form/h1[contains(text(),"Sign in")]
		
		driver.close();
	}

}
