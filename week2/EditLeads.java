package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

	public static void main(String[] args) throws InterruptedException {
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
	      WebElement creatlead= driver.findElement(By.linkText("Create Lead"));
	      creatlead.click();
	      WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
	      companyname.sendKeys("Exela");
	      WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
	      firstname.sendKeys("Subash");
	      WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
	      lastname.sendKeys("Raju");
	      WebElement departmentname = driver.findElement(By.id("createLeadForm_departmentName"));
	      departmentname.sendKeys("QA");
	      WebElement description = driver.findElement(By.id("createLeadForm_description"));
	      description.sendKeys("Learning selenium");
	      WebElement emailid = driver.findElement(By.id("createLeadForm_primaryEmail"));
	      emailid.sendKeys("subashraju.sr@gmail.com");
	      String title = driver.getTitle();
	      System.out.println("Title :" +  title);
	      WebElement creatleadbutton = driver.findElement(By.className("smallSubmit"));
	      creatleadbutton.click();
	      WebElement edit= driver.findElement(By.linkText("Edit"));
          edit.click();
          WebElement firstnamelocal = driver.findElement(By.id("updateLeadForm_firstNameLocal"));
          firstnamelocal.sendKeys("Testleaf Subash");
          WebElement update= driver.findElement(By.name("submitButton"));
          update.click();
          Thread.sleep(2000);
          driver.close();
	}

}
