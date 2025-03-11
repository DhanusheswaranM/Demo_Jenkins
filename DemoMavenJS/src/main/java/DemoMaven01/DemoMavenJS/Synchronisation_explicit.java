package DemoMaven01.DemoMavenJS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation_explicit {
		public static void main(String[] args) throws InterruptedException {
			WebDriver drive = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(drive,Duration.ofSeconds(5));
//			drive.get("https://omayo.blogspot.com/");
//			WebElement timerbtn = wait(ExpectedConditions.visibilityOfElementLocated((drive.findElement(By.cssSelector("#timerButton")))));
//			timerbtn.click();
//			
			drive.get("https://www.selenium.dev/selenium/web/dynamic.html");
			drive.manage().window().maximize();
			WebElement reveal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#reveal")));
			reveal.click();
			WebElement revealtext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#revealed")));
			revealtext.sendKeys("HI"+Keys.ENTER);
			System.out.println("Text of reveal text box : "+revealtext.getDomProperty("value"));
			drive.close();
	}

}
