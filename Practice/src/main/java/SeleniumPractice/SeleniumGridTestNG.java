package SeleniumPractice;


import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.server.RemoteServer;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class SeleniumGridTestNG {

	static WebDriver driver;
	@BeforeMethod
	public void setUp() throws MalformedURLException
	{
		String nodeurl = "http://10.1.1.10:4444/wd/hub";
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		 //cap.setCapability("platform", "Windows 10");
		 //ChromeOptions options = new ChromeOptions();
		 //options.merge(cap);
		 //   cap.setCapability("version", "10.0");
		//cap.setBrowserName("chrome");
		//cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		//cap.setVersion("111.0.5563.65");
		/*cap.setPlatform(Platform.WIN10);
		cap.setVersion("");
		
		 cap.setCapability("browserName", "chrome");
	        cap.setCapability("version", "77.0");
	        
	        
	        cap.setCapability("network", true); // To enable network logs
	        cap.setCapability("visual", true); // To enable step by step screenshot
	        cap.setCapability("video", true); // To enable video recording
	        cap.setCapability("console", true); // To capture console logs
		*/
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		
		//driver = new RemoteServer(new URL(url),cap);
		driver = new RemoteWebDriver(new URL(nodeurl),cap);
	}
	
	@Test
	public void setMAil()
	{
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		
	}
	
	@AfterMethod
	public void close()
	{
			System.out.println("End Test");
		//driver.close();
	}
}
