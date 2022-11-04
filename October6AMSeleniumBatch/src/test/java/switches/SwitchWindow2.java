package switches;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow2 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com");
		System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		while(!wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@alt='FD'][@src='/content/dam/icicibank/india/managed-assets/images/homepage/6.35-fd-rates-hp-d-cou.jpg'])[1]"))).isDisplayed())
		{
			System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@alt='FD'][@src='/content/dam/icicibank/india/managed-assets/images/homepage/6.35-fd-rates-hp-d-cou.jpg'])[1]"))).isDisplayed());
			driver.findElement(By.xpath("(//button[@class='slick-next slick-arrow'])[1]")).click();
		}
		driver.findElement(By.xpath("(//img[@alt='FD'][@src='/content/dam/icicibank/india/managed-assets/images/homepage/6.35-fd-rates-hp-d-cou.jpg'])[1]")).click();
	}

}
