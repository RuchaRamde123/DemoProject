package Advsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testauto {
	@Test
	 
	public void test() throws Exception  {
	System.setProperty("webdriver.chrome.driver","chromedriverAutoIT.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://javabykiran.com/playground/file-upload");
driver.findElement(By.id("file")).click();

Thread.sleep(2000);
Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");
}
}