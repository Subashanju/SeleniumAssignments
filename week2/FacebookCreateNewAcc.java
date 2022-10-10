package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateNewAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://en-gb.facebook.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          WebElement createlink = driver.findElement(By.linkText("Create New Account"));
          createlink.click();
          WebElement firstname = driver.findElement(By.name("firstname"));
          firstname.sendKeys("Subash");
          WebElement lastname = driver.findElement(By.name("lastname"));
          lastname.sendKeys("raju");
          WebElement Mobilenumber = driver.findElement(By.name("reg_email__"));
          Mobilenumber.sendKeys("9944748123");
          WebElement password = driver.findElement(By.name("reg_passwd__"));
          password.sendKeys("Subash@1992");
          WebElement birthdaydate = driver.findElement(By.id("day"));
          Select day1 = new Select(birthdaydate);
          day1.selectByVisibleText("19");
          WebElement birthdaymonth = driver.findElement(By.id("month"));
          Select day2 = new Select(birthdaymonth);
          day2.selectByVisibleText("Sep");
          WebElement birthdayear = driver.findElement(By.id("year"));
          Select day3 = new Select(birthdayear);
          day3.selectByVisibleText("1992");
          WebElement radiobutton = driver.findElement(By.xpath("//label[text() = 'Female']"));
          radiobutton.click();
          
	}

}
