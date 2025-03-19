package DemoMaven01.DemoMavenJS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

public class Handling_claender_using_JsExceutor {

	public static void main(String[] args) {
		ChromeDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement datepick = dvr.findElement(By.id("datepicker"));
		String date = "02/22/2023";
		calender(dvr,datepick,date);
		dvr.quit();
	}
	public static void calender(WebDriver dvr , WebElement ele , String date) {
		JavascriptExecutor js = (JavascriptExecutor)dvr;
		js.executeScript("arguments[0].value='"+date+"';", ele);
		System.out.println("Date selected successfully :"+date);
	}
}
