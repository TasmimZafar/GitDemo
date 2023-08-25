package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		/*
		//frameborder
		WebElement frameSet = driver.findElement(By.xpath("//frameset[@frameborder='1']"));
		driver.switchTo().frame(frameSet);
		
		WebElement frameTop = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(frameTop);
		
		WebElement frameSetMiddle = driver.findElement(By.name("frameset-middle"));
		driver.switchTo().frame(frameSetMiddle);
		
		WebElement middleFrame = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(middleFrame);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
				
		driver.switchTo().defaultContent();
		*/
		
		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());
		driver.quit();
	}

}
