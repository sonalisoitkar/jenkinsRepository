package selenium.jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void LoginTest() {
	  System.out.println("login test");
	  WebDriver driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver.get("www.google.com");
	  System.out.println("current title is "+driver.getTitle());
  }
}
