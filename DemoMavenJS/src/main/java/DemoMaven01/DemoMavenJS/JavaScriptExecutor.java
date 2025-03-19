package DemoMaven01.DemoMavenJS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptExecutor {

	public static void main(String[] args) {
		ChromeDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
//		
//		dvr.get("http://omayo.blogspot.com");
//		JavascriptExecutor js = (JavascriptExecutor)dvr;
//		js.executeScript("alert('welcome')");
//		js.executeScript("document.getElementById('alert2').click()");
//		WebElement button1 = dvr.findElement(By.id("alert1"));
//		js.executeScript("arguments[0].click()", button1);
		dvr.get("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor)dvr;
//		js.executeScript("document.getElementById('APjFqb').value='Java Programming'");
//		js.executeScript("document.getElementsByClassName('gNO89b')[0].click()");
//		WebElement alert1 = dvr.findElement(By.id("alert1"));
//		javaScriptClick(dvr , alert1);
//		String title = (String) js.executeScript(" return document.title");
//		System.out.println(title);
		WebElement search = dvr.findElement(By.id("APjFqb"));
		javaScriptClick(dvr , search);
		System.out.println("class called successfully");
		js.executeScript("history.go(0)");
		js.executeScript("window.scrollBy(0,500)");

	}
	public static void javaScriptClick(WebDriver dvr , WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor)dvr;
		jse.executeScript("arguments[0].value='Java Programming';", element);
		System.out.println("input passed successfully successfully");
		jse.executeScript("document.getElementsByClassName('gNO89b')[0].click()");
		System.out.println("searching the input successfully");
	}

}
