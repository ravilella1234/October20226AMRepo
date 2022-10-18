package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir")+"//src//test//resources//";
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		
		fis = new FileInputStream(projectPath+"environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
		
		FileInputStream fis = new FileInputStream(projectPath+"data.properties");
		p = new Properties();
		p.load(fis);
		//String val = p.getProperty("chromebrowser");
		//System.out.println(val);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(childProp.getProperty(url));
		driver.navigate().to(childProp.getProperty(url));
	}
	
	public static void clickElement(String locator) 
	{
		driver.findElement(By.xpath(locator)).click();
	}

	public static void typeText(String locator, String text) 
	{
		driver.findElement(By.name(locator)).sendKeys(text);
	}

	public static void selectOption(String locator, String option) 
	{
		driver.findElement(By.id(locator)).sendKeys(option);
	}

}
