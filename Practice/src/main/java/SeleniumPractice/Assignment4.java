package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		
		WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		String parentWindow = driver.getWindowHandle();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(clickHere));
		
		clickHere.click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext())
		{
			String childWin = itr.next();
			
			if(parentWindow!=childWin)
			{
				driver.switchTo().window(childWin);
				System.out.println("Child Window "+driver.getTitle());
			}
			
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window "+driver.getTitle());
		driver.quit();
	}

}
