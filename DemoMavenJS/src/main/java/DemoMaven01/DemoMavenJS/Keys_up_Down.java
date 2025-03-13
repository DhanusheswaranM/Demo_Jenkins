package DemoMaven01.DemoMavenJS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_up_Down {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		Actions act = new Actions(dvr);
		dvr.get("https://omayo.blogspot.com/");
		WebElement jquery = dvr.findElement(By.xpath("//a[contains(text(),\"jqueryui\")]"));
		act.keyDown(Keys.CONTROL).moveToElement(jquery).click().keyUp(Keys.CONTROL).build().perform();
		System.out.println("---------jquery selected---------");
//		dvr.close();

	}

}
