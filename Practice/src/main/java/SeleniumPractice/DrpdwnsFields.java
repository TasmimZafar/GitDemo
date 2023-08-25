package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpdwnsFields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//Static dropdown
		WebElement selCurrency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currency = new Select(selCurrency);
		currency.selectByIndex(2);
		System.out.println(currency.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		//Dynamic Passenger dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000);
		
		//dynamic location dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		//above is to identify by index if not index then  below traversing with parent to child is good option
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click();
		
		Thread.sleep(2000);
		//input[@id='autosuggest']
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(2000);
		//Auto suggest dropdown using findElements
		List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));
		
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();
	}

}
