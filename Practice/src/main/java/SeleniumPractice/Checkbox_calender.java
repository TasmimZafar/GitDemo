package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Checkbox_calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//div[id='discount-checkbox'] div
		
		//div[id*='SeniorCitizenDiv']
		driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).click();
		
		Thread.sleep(2000);
		
		boolean chk = driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).isSelected();
		
		if(chk)
		{
			System.out.println(chk);
			driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).click();
			Thread.sleep(2000);
		}
		System.out.println(driver.findElements(By.cssSelector("div[id='discount-checkbox'] div")).size());
		List<WebElement> chkbxlist = driver.findElements(By.cssSelector("div[id='discount-checkbox'] div"));
		for(WebElement chk1 : chkbxlist)
		{
			chk1.click();
			Thread.sleep(1000);
			
		}
		Thread.sleep(2000);
		driver.close();
	}

}
