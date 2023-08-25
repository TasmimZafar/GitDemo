package SeleniumPractice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmi\\OneDrive\\Documents\\tasmim\\Tasmim Library Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String[] listToSelect = {"Cucumber","Brocolli","Tomato"};
		List<WebElement> products = driver.findElements(By.className("product-name"));
		int j = 0;
		for(int i=0;i<products.size();i++)
		{
			//System.out.println(products.get(i).getText());
			String item = products.get(i).getText().split("-")[0].trim();
			 
			List veggies = Arrays.asList(listToSelect);
			
			
			if(veggies.contains(item))
			//if(item.contains("Cucumber"))
			{
				j++;
				Thread.sleep(2000);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(2000);
				if(j==veggies.size())
					break;
			}
			
		}
		Thread.sleep(2000);
		//driver.close();
	}

}
