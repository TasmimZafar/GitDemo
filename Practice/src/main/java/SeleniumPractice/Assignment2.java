package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Tasmim");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("tasmimzafar@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abcd");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select selectGender = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		selectGender.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("11-10-1993");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		//System.out.println(driver.findElement(By.cssSelector(".alert-dismissible")).getText());
		String SuccessMsg = driver.findElement(By.cssSelector("div[class*='alert-dismissible']")).getText();
		String[] msg = SuccessMsg.split("\\n");
		
		System.out.println(msg[1]);
		
		driver.close();
	}

}
