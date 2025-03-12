package DemoMaven01.DemoMavenJS;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Using_Action_Class {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		dvr.get("https://bstackdemo.com/");
		WebElement select = dvr.findElement(By.xpath("//select "));
		Actions actions = new Actions(dvr);
		WebElement custom = dvr.findElement(By.xpath("//option[contains(text(),\"Lowest to highest\")]"));
		custom.click();
		System.out.println("Button clicked by Action Class");
		dvr.close();

	}

}
