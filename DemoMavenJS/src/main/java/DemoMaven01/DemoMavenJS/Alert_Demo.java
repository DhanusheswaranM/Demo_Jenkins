package DemoMaven01.DemoMavenJS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
public class Alert_Demo {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.get("https://omayo.blogspot.com/");
		WebElement clickalert = dvr.findElement(By.id("alert1"));
		Actions act = new Actions(dvr);
		act.moveToElement(clickalert).click().perform();
		
		System.out.println("Text of SIMPLE alert >>>>> "+dvr.switchTo().alert().getText());
		
		dvr.switchTo().alert().accept();
		System.out.println("Simple alert is accepted\n--------\n");
		
		WebElement clickprompt = dvr.findElement(By.id("prompt"));
		act.moveToElement(clickprompt).click().perform();
		
		System.out.println("Text of PROMPT alert >>>>> "+dvr.switchTo().alert().getText());
		dvr.switchTo().alert().sendKeys("Dhanush");
		
		dvr.switchTo().alert().accept();
		System.out.println("Prompt alert is accepted\n--------\n");
		
		WebElement clickconfirm = dvr.findElement(By.id("confirm"));
		
		act.moveToElement(clickconfirm).click().perform();
		System.out.println("Text of CONFIRMATION alert >>>>> "+dvr.switchTo().alert().getText());
		
		System.out.println("Confirmation alert is accepted\n--------\n");
		dvr.quit();
	}

}
