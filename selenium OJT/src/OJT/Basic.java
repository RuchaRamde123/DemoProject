package OJT;

import java.sql.Driver;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/seleniumsoftware/Offline%20Website/index.html");
		driver.navigate().to("file:///C:/seleniumsoftware/Offline%20Website/index.html");
        driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();


	for (int i=2;i<=5;i++)
      {
		for (int j=1;j<=7;j++) {
		String ss= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
      System.out.println(ss);
	}
	}
}
}
