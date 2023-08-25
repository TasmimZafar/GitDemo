package SeleniumPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class DynamicLoadingFluent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("start")).click();
		
		WebElement helloWorld = driver.findElement(By.cssSelector("[id='finish'] h4"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function <WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver)
			{
				if(helloWorld.isDisplayed()) {
					return helloWorld;
				}
				else
				{
					return null;
				}
				
			}
		});
		
		/*WebElement foo1 = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return helloWorld;
		       
		     }});
		     */
	}

}
