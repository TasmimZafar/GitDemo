package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\eclipse-workspace\\Practice\\src\\main\\java\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement Categories = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(Categories);
		action.perform();
		
		Select dropdown = new Select(driver.findElement(By.id("ccompound")));
	      dropdown.selectByVisibleText("continuously");
	      
	      
	      WebElement DynamicElement = 
	    		   (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("DynamicElement")));
		//driver.quit();
		//driver.close();
	      //How to take screenshot in selenium
	      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      
	      FileUtils.copyFile(screenshot, new File("D:\\screenshots\\screenshots1.jpg"));
	      
	   // Create instance of WebDriverWait class 
	   //   WebDriverWait wait = new WebDriverWait(driver, 10);
	         
	      // Wait till the element becomes visible
	     //  WebElement webElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Enter xpath")));

	       
	       	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       //	Webdriver wait = new Webdriver wait()
	       	
	       	WebDriverWait wait = new WebDriverWait(driver,10);
	       //	wait.until(ExpectedConditions.visibilityOfElementLocated(By.))
	       	
	       	Wait wait1  = new FluentWait(driver)
	       			.withTimeout(60,TimeUnit.SECONDS)
	       			.pollingEvery(10,TimeUnit.SECONDS)
	       			.ignoring(NoSuchElementException.class);
	       	
	       	
	}

}
