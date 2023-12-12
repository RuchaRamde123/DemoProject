package OJT;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class incognito{
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--incognito");
		DesiredCapabilities c= new DesiredCapabilities();
		c.setCapability(ChromeOptions.CAPABILITY, o);
		WebDriver driver = new ChromeDriver(o);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input")).sendKeys("Dress");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/div[2]/div/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")).click();
		
}}