package DemoMaven01.DemoMavenJS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_Select {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		dvr.get("https://www.leafground.com/dashboard.xhtml");
		WebElement element = dvr.findElement(By.xpath("//i[@class=\"pi pi-server layout-menuitem-icon\"]"));
		element.click();
		List <WebElement> list = dvr.findElements(By.xpath("//ul[@role=\"menu\"]//li"));
		System.out.println("The select option size is :"+list.size());
		String word = "Dropdown";
		for(WebElement l:list) {
			if(l.getText().contains(word)) {
				l.click();
				System.out.println("The "+word+" is clicked ");
				break;
			}
		}
		WebElement ui = dvr.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
		Select elementdropdown = new Select(ui);
		List<WebElement> list1 = elementdropdown.getOptions();
		String word1 = "Puppeteer";
		for(WebElement l:list1) {
			if(l.getText().contains(word1)) {
				l.click();
				System.out.println(word1+" clicked");
				break;
			}
		}
//		dvr.findElement(By.xpath("//label[@id=\"j_idt87:country_label\"]")).click();
		WebElement country = dvr.findElement(By.xpath("//select[@id=\"j_idt87:country_input\"]"));
		Select countrydropdown = new Select(country);
		List<WebElement> list2 = countrydropdown.getOptions();
		for(WebElement l:list2) {
			System.out.println(l.getText());
		}
		String word2 = "India";
		for(WebElement l:list2) {
			if(l.getText().contains(word2)) {
				l.click();
				System.out.println(word2+" clicked");
				break;
			}
		}
				
		
//		dvr.close();
	}

}
