package SeleniumPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertandWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//alert1
		driver.findElement(By.name("enter-name")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String salertText = driver.switchTo().alert().getText();
		System.out.println(salertText);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		//alert2
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		//alert with Authentication
		
		
		
		
		//window1
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window is "+parentWindow);
		System.out.println("Parent window title"+driver.getTitle());
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(2000);
		Set<String> childwnd = driver.getWindowHandles();
		
		for(String child : childwnd)
		{
			System.out.println(child);
			Thread.sleep(2000);
			if(!child.equals(parentWindow))
			{
				driver.switchTo().window(child);
				Thread.sleep(2000);
				System.out.println("child window title"+driver.getTitle());
				driver.findElement(By.xpath("//a[contains(text(),'Access all our Courses')]")).click();
				//li[@class="nav-item"]/a[contains(text(),"Courses")]
			}
			
			
			
			driver.switchTo().window(parentWindow);
			System.out.println("Parent window title"+driver.getTitle());
		}
		driver.quit();
		
		//checkBoxOption1
		
	}
	

}
