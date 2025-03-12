package DemoMaven01.DemoMavenJS;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_not_list_method {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		dvr.get("https://bstackdemo.com/");
		WebElement select = dvr.findElement(By.xpath("//select "));
		select.click();
		List <WebElement> list = dvr.findElements(By.cssSelector("select option"));
		System.out.println("The select option size is :"+list.size());
		String word = "Lowest to highest";
		for(WebElement l:list) {
			if(l.getText().contains(word)) {
				l.click();
				System.out.println("The "+word+" is clicked");
				break;
			}
		}
		dvr.close();

	}

}
