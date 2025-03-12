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
public class Demo_Select {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.get("https://www.selenium.dev/selenium/web/formPage.html");
		dvr.manage().window().maximize();
		WebElement multi = dvr.findElement(By.xpath("//select[@name=\"multi\"]"));
		Select selectdropdown = new Select(multi);
		
		List<WebElement> list = selectdropdown.getOptions();
		
		System.out.println("The size of dropdown options "+list.size());
		for(WebElement li:list) {
			System.out.println("The dropdown options are "+li.getText());
		}
		
		selectdropdown.deselectAll();
		selectdropdown.selectByIndex(0);
		selectdropdown.selectByVisibleText("Onion gravy");
		
		List<WebElement> list1 = selectdropdown.getAllSelectedOptions();
		
		for(WebElement l:list1) {
			System.out.println("The selected options "+l.getText());
		}
		System.out.println("-----------order text------------");
		List<String> text = new ArrayList<>();
		for(WebElement li:list) {
			text.add(li.getText());
		}
		Collections.sort(text);
		for(String t:text) {
			System.out.println(t);
		}
		System.out.println("-------------------------------");
		System.out.println("the selectdropdown is multiple :"+selectdropdown.isMultiple());
		selectdropdown.deselectByVisibleText("Eggs");
		selectdropdown.deselectAll();
		dvr.close();
		
	}

}
