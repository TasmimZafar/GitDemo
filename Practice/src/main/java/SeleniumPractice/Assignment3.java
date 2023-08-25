package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		List<WebElement> radio = driver.findElements(By.className("customradio"));
		for(int i=0;i<radio.size();i++)
		{
			String rVal = radio.get(i).getText();
			if(rVal.contains("User"))
			{
				radio.get(i).click();
			}
		}
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("okayBtn"))));
		
		driver.findElement(By.id("okayBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//select[@class='form-control']"))));
				
		Select drp = new Select (driver.findElement(By.xpath("//select[@class='form-control']")));
		drp.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//h1[contains(text(),'Shop Name')]"))));
		
		List<WebElement> addElements = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for(WebElement list : addElements)
		{
			if(list.isDisplayed())
			{
				list.click();
			}
			
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		driver.close();
	}

}
