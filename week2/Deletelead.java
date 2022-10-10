package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	      driver.get("http://leaftaps.com/opentaps/control/main");
	      driver.manage().window().maximize();
	      WebElement username= driver.findElement(By.id("username"));
	      username.sendKeys("Demosalesmanager");
	      WebElement password= driver.findElement(By.id("password"));
	      password.sendKeys("crmsfa");
	      WebElement login= driver.findElement(By.className("decorativeSubmit"));
	      login.click();
	      WebElement CRMlink= driver.findElement(By.linkText("CRM/SFA"));
	      CRMlink.click();
	      WebElement leadtab= driver.findElement(By.linkText("Leads"));
	      leadtab.click();
	      WebElement findlead= driver.findElement(By.linkText("Find Leads"));
	      findlead.click();
	      WebElement email= driver.findElement(By.linkText("Email"));
	      email.click();
	      WebElement emailid= driver.findElement(By.name("emailAddress"));
	      emailid.sendKeys("subashraju.sr@gmail.com");
	      Thread.sleep(3000);
	      WebElement findleadsbutton = driver.findElement(By.className("x-btn-text"));
	      findleadsbutton.click();
	}

}
