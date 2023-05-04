package test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5{
  @Test
  public void Task1() {
	  WebDriverManager.chromedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(co);
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.godaddy.com/en-in");
		Assert.assertEquals(title,"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
		driver.close();
  }
  
}