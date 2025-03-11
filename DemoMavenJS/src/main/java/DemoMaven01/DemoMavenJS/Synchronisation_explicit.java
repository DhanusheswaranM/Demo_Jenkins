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
			drive.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(drive,Duration.ofSeconds(10));
//			drive.get("https://omayo.blogspot.com/");
//			WebElement timerbtn = wait(ExpectedConditions.visibilityOfElementLocated((drive.findElement(By.cssSelector("#timerButton")))));
//			timerbtn.click();
//			
//			drive.get("https://www.selenium.dev/selenium/web/dynamic.html");
//			drive.manage().window().maximize();
//			WebElement reveal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#reveal")));
//			reveal.click();
//			WebElement revealtext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#revealed")));
//			revealtext.sendKeys("HI"+Keys.ENTER);
//			System.out.println("Text of reveal text box : "+revealtext.getDomProperty("value"));
//			drive.close();
//			drive.get("https://configureselenium.blogspot.com/");
//			WebElement selenium = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"PageList1\"]/div/div[1]/div[1]/div/ul/li[1]/a")));
//			selenium.click();
//			WebElement totalviews = drive.findElement(By.cssSelector("#Stats1_totalCount"));
//			System.out.println(totalviews.getDomProperty("value"));
			drive.get("https://configureselenium.blogspot.com/2020/11/selenium-tutorials.html");
			WebElement totalviews = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Stats1_totalCount")));
			System.out.println("TotalViews : "+totalviews.getText());
			WebElement selenium = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"PageList1\"]/div/div[1]/div[1]/div/ul/li[1]/a")));
			selenium.click();
			drive.navigate().refresh();
			WebElement totalviews1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Stats1_totalCount")));
			System.out.println("TotalViews : "+totalviews1.getText());
			drive.close();
	}

}