package DemoMaven01.DemoMavenJS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {


	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.get("https://omayo.blogspot.com/");
		WebElement menu = dvr.findElement(By.id("blogsmenu"));
		Actions act = new Actions(dvr);
		act.moveToElement(menu).perform();
		WebElement opt = dvr.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		act.moveToElement(opt).click().build().perform();
	}

}
