package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumNGWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		//C:\chrome
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\FireFox\\geckodriver.exe");
		//EdgeDriver driver = new EdgeDriver();
		//System.setProperty("webdriver.msedge.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\Edge\\msedgedriver.exe");
			
		//C:\Users\tasmi\OneDrive\Documents\tasmim\Tasmim Library Files\FireFox
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://juliemr.github.io/protractor-demo/");
		driver.manage().window().maximize();
		
		WebElement el1 = driver.findElement(By.xpath("//input[@ng-model='first']"));
		WebElement el2 = driver.findElement(By.xpath("//input[@ng-model='second']"));
		WebElement go = driver.findElement(By.xpath("//button[@id='gobutton']"));
		
		el1.sendKeys("1");
		el2.sendKeys("3");
		go.click();
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", go);
		////button[@id="gobutton"]
		////input[@ng-model="second"]
		
		js.executeScript("alert('Welcome');");
		*/
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", go);
		
	}

}
