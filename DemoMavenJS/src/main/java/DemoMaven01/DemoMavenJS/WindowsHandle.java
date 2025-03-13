package DemoMaven01.DemoMavenJS;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WindowsHandle {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(dvr,Duration.ofSeconds(10));
		dvr.get("http://demoqa.com/browser-windows");
		String parent = dvr.getWindowHandle();
		System.out.println("Parent window " +parent);
		Set<String>allwindow = dvr.getWindowHandles();
		System.out.println("Count of Window :"+allwindow.size());
		Actions act = new Actions(dvr);
		WebElement windowbtn = dvr.findElement(By.xpath("//button[@id=\"windowButton\"]"));
		act.moveToElement(windowbtn).click().build().perform();
		Set<String> newAllwindow = dvr.getWindowHandles();
		System.out.println("new count of window : "+newAllwindow.size());
		String parenthandle = dvr.getWindowHandle();
		System.out.println("Parent window :"+parenthandle);
		Iterator<String>it = newAllwindow.iterator();
		String mainwindow = it.next();
		String childwindow = it.next();
		System.out.println("Main Window : "+mainwindow);
		System.out.println("Child Window : "+childwindow);
		dvr.switchTo().window(childwindow);
//		WebElement text = dvr.findElement(By.id("sampleHeading"));
//		System.out.println("Child Title : "+text.getText());
		

	}

}
