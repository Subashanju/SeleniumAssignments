package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          WebElement createlink = driver.findElement(By.linkText("Create New Account"));
          createlink.click();
          WebElement firstname = driver.findElement(By.className("firstname"));
          firstname.sendKeys("Subash");
          WebElement lastname = driver.findElement(By.className("lastname"));
          lastname.sendKeys("raju");
	}

}
