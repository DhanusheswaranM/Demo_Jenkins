package DemoMaven01.DemoMavenJS;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
public class Sysnchronization_Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.get("https://www.selenium.dev/selenium/web/dynamic.html");
		WebElement add_a_box = dvr.findElement(By.cssSelector("input#adder"));
		add_a_box.click();
		String color = add_a_box.getDomAttribute("class");
		System.out.println("add_a_box clicked");
		System.out.println("Color of the add_a_box : "+color);
		dvr.close();
		
	}

}
