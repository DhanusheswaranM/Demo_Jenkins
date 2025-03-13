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

public class Windows_Handle_Practise {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(dvr,Duration.ofSeconds(10));
		dvr.get("https://www.leafground.com/dashboard.xhtml");
		String parent = dvr.getWindowHandle();
		System.out.println("Parent title "+dvr.getTitle());
		System.out.println("Parent window : " +parent);
		Set<String> window = dvr.getWindowHandles();
		System.out.println("count of window : "+window.size());
		
		Actions act = new Actions(dvr);
		WebElement dropdown = dvr.findElement(By.id("menuform:j_idt39"));
		act.moveToElement(dropdown).click().build().perform();
		WebElement windows = dvr.findElement(By.xpath("//span[contains(text(),\"Window\")]"));
		windows.click();
		System.out.println("Alert title "+dvr.getTitle());
		
		WebElement newwindow = dvr.findElement(By.xpath("//button[@id=\"j_idt88:new\"]//span[contains(text(),\"Open\")]"));
		act.moveToElement(newwindow).click().build().perform();
		String child1 = dvr.getWindowHandle();
		System.out.println("newwindow title "+dvr.getTitle());
		Set<String> window1 = dvr.getWindowHandles();
		System.out.println("Child window : "+window1);
		System.out.println("count of new window : "+window1.size());
		
		Iterator<String> it = window1.iterator();
		dvr.switchTo().window(it.next());
		System.out.println("switched to Child window");
		
		WebElement newtab = dvr.findElement(By.xpath("//span[contains(text(),\"Open Multiple\")]"));
		act.moveToElement(newtab).click().perform();
		String child2 = dvr.getWindowHandle();
		System.out.println("newtab title "+dvr.getTitle());
//		dvr.switchTo().window(child1);
		dvr.close();
		Set<String> tab = dvr.getWindowHandles();
		System.out.println("New tab opened: "+tab);
		System.out.println("count of new tab : "+tab.size());
		
//		dvr.quit();
		
	}

}
