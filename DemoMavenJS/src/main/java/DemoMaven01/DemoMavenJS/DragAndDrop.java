package DemoMaven01.DemoMavenJS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		Actions act = new Actions(dvr);
		dvr.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement box1 = dvr.findElement(By.id("box1"));
		System.out.println("Before drag Oslo box : "+box1.getCssValue("background-color"));
		WebElement box2 = dvr.findElement(By.id("box101"));
		act.clickAndHold(box1).moveToElement(box2).release().build().perform();
		System.out.println("After drag Oslo box : "+box1.getCssValue("background-color"));
		if(box1.getCssValue("background-color").equals("rgba(0, 255, 0, 1)")) {
			System.out.println("---------------Oslo-Correctly selected--------------------");
		}
		else {
			System.out.println("---------------Oslo-selected wrong-----------------");
		}
		
		WebElement box3 = dvr.findElement(By.id("box6"));
		WebElement box4 = dvr.findElement(By.id("box106"));
		System.out.println("Before drag Rome box : "+box3.getCssValue("background-color"));
		act.dragAndDrop(box3, box4).release().build().perform();
		System.out.println("After drag Rome box : "+box3.getCssValue("background-color"));
		if(box3.getCssValue("background-color").equals("rgba(0, 255, 0, 1)")) {
			System.out.println("----------------Rome-Correctly selected---------------");
		}
		else {
			System.out.println("-----------------Rome-selected wrong-------------------------");
		}
		dvr.close();
	}

}
