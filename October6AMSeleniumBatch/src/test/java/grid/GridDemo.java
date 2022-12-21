package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridDemo 
{
	
  @Test
  public void test1() throws Exception 
  {
	  System.out.println("Starting test1");
	  WebDriverManager.firefoxdriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("chrome");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.39.17:4444/wd/hub"), ds);
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  
	  driver.quit();
	  
	  System.out.println("Ending Test1");
  }
  
  @Test
  public void test2() throws Exception 
  {
	  System.out.println("Starting test2");
	  WebDriverManager.firefoxdriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("chrome");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.39.17:4444/wd/hub"), ds);
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  
	  driver.quit();
	  
	  System.out.println("Ending Test2");
  }
  
  @Test
  public void test3() throws Exception 
  {
	  System.out.println("Starting test3");
	  WebDriverManager.firefoxdriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("chrome");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.39.17:4444/wd/hub"), ds);
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  
	  driver.quit();
	  
	  System.out.println("Ending Test3");
  }
  
  @Test
  public void test4() throws Exception 
  {
	  System.out.println("Starting test4");
	  WebDriverManager.firefoxdriver().setup();
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("chrome");
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.39.17:4444/wd/hub"), ds);
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  
	  driver.quit();
	  
	  System.out.println("Ending Test4");
  }
}
