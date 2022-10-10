package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	      driver.get("http://leaftaps.com/opentaps/control/main");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
	      username.sendKeys("Demosalesmanager");
	      WebElement password= driver.findElement(By.xpath("//input[@id= 'password']"));
	      password.sendKeys("crmsfa");
	      WebElement login= driver.findElement(By.xpath("//input[@class ='decorativeSubmit']"));
	      login.click();
	      WebElement CRMlink= driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
	      CRMlink.click();
	}

}
