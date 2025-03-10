package DemoMaven01.DemoMavenJS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.support.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Day_7_mar_Relative_locators {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver dvr = new ChromeDriver();
//		dvr.get("https://omayo.blogspot.com/");
//		dvr.manage().window().maximize();
//		WebElement submit = dvr.findElement(By.cssSelector("#HTML10>div.widget-content>button:nth-child(1)"));
//		WebElement login = dvr.findElement(with(By.xpath("//button[@name=\"samename\"][2]")).toRightOf(submit));
//		System.out.println("Login button text : "+login.getText());
//		WebElement register = dvr.findElement(with(By.tagName("button")).toRightOf(login));
//		System.out.println("Register button text : "+register.getText());
//		WebElement username = dvr.findElement(By.xpath("//button[contains(text(),\"Login\")]"));
//		////button[text()="Register"]/preceding-sibling::button[(text()="Login")]
//		///#HTML10 > div.widget-content > button:nth-child(2)
//		/////div[@class="widget-content"]//button[text()='Login' and following-sibling::button[text()='Register']]
//		WebElement password = dvr.findElement(with(By.tagName("input")).below(username));
//		password.sendKeys("KIOT");
//		dvr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);
//
//		WebElement usernametxt = dvr.findElement(By.xpath("//label[@class=\"oxd-label\"]"));
//		WebElement usernametxtbox = dvr.findElement(with(By.tagName("input")).below(usernametxt));
//		usernametxtbox.sendKeys("Admin");
//		System.out.println("username entered successfully");
//		Thread.sleep(3000);
//		
//		WebElement pwdtxt = dvr.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]"));
//		WebElement pwdtxtbox = dvr.findElement(with(By.name("password")).below(pwdtxt));
//		pwdtxtbox.sendKeys("admin123");
//		System.out.println("password entered successfully");
//		Thread.sleep(3000);
//		
//		WebElement fpass = dvr.findElement(By.xpath("//div[@class=\"orangehrm-login-forgot\"]"));
//		WebElement login = dvr.findElement(with(By.tagName("button")).above(fpass));
//		login.click();
//		System.out.println("Logged in successfully");
//		Thread.sleep(3000);
//		
//		WebElement scroll = dvr.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]"));
//		scroll.click();
//		System.out.println("Scroll down clicked successfully");
//		Thread.sleep(3000);
//		
//		WebElement changepwd = dvr.findElement(By.xpath("//a[contains(text(),\"Change Password\")]"));
//		WebElement logout = dvr.findElement(with(By.linkText("Logout")).below(changepwd));
//		logout.click();
//		System.out.println("Logged out successfully");
//		Thread.sleep(3000);
		dvr.get("https://configureselenium.blogspot.com/");
		TakesScreenshot ts = (TakesScreenshot)dvr ;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshot/Selenium-1-"+ System.currentTimeMillis()+".png"));
		
		FileHandler.copy(src, new File("D:\\Selenium-2-"+ System.currentTimeMillis()+".png"));
		System.out.println("Screenshot is taken successfully");
		
		dvr.close();
	}

}
