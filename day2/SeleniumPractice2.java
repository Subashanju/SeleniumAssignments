package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
	      WebElement sourceid = driver.findElement(By.id("createLeadForm_dataSourceId"));
	      Select a1 = new Select(sourceid);
	      a1.selectByVisibleText("Employee");
	      WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	      Select a2 = new Select(industry);
	      a2.selectByValue("IND_FINANCE");
	      WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	      Select a3 = new Select(ownership);
	      a3.selectByIndex(4);
	}

}
