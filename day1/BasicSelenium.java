package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSelenium {

	public static void main(String[] args) {
	
      //WebDriverManager.chromedriver().setup();
      //WebDriverManager.edgedriver().setup();
      WebDriverManager.firefoxdriver().setup();
     //ChromeDriver driver = new ChromeDriver();
      FirefoxDriver driver = new FirefoxDriver();
     // EdgeDriver driver = new EdgeDriver();
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
      WebElement creatlead= driver.findElement(By.linkText("Create Lead"));
      creatlead.click();
      WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
      companyname.sendKeys("Exela");
      WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
      firstname.sendKeys("Subash");
      WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
      lastname.sendKeys("Raju");
      WebElement creatleadbutton = driver.findElement(By.className("smallSubmit"));
      creatleadbutton.click();
      //driver.close();
	}

}
