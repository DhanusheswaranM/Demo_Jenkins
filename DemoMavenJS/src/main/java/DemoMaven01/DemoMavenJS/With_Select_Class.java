package DemoMaven01.DemoMavenJS;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class With_Select_Class {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.get("https://www.leafground.com/select.xhtml");
		dvr.manage().window().maximize();
		WebElement ui = dvr.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
		Select selectdropdown = new Select(ui);
		List<WebElement> list = selectdropdown.getOptions();
		System.out.println("The size of dropdown options "+list.size());
		for(WebElement li:list) {
			System.out.println("The dropdown options are "+li.getText());
		}
		System.out.println("The dropdown is multiple option or not :"+selectdropdown.isMultiple());
		selectdropdown.selectByIndex(2);
//		selectdropdown.selectByVisibleText("Cypress");
		
	}

}
