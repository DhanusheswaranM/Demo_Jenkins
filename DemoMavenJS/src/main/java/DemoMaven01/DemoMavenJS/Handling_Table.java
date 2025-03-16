package DemoMaven01.DemoMavenJS;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Handling_Table {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.get("https://omayo.blogspot.com/");
		dvr.manage().window().maximize();
		System.out.println("-------All Headings-------");
		List<WebElement> list = dvr.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println("The of body :"+list.size());
		for(WebElement li:list) {
			System.out.println(li.getText());
		}
		System.out.println("-------All cells-------");
		List<WebElement> list1 = dvr.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		System.out.println("The of body :"+list.size());
		for(WebElement li:list1) {
			System.out.println(li.getText());
		}
		System.out.println("-------The 1st row-------");
		List<WebElement> list2 = dvr.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]"));
		System.out.println(list2.size());
		for(WebElement li : list2) {
			System.out.println(li.getText());
		}
		System.out.println("-------2nd row 3rd column-------");
		WebElement secrow3col = dvr.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]"));
		System.out.println(secrow3col.getText());
		
		System.out.println("-------Specific column----------");
		List<WebElement> list3 = dvr.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		System.out.println(list3.size());
		for(WebElement li : list3) {
			System.out.println(li.getText());
		}
		List<WebElement> rsize = dvr.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println(rsize.size());
	    
        List<WebElement> csize = dvr.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        System.out.println(csize.size());
    
        for (WebElement header : rsize) {
            System.out.print(header.getText() + " ");
        }
        
        for (int i = 0; i <= csize.size(); i++) {
            List<WebElement> columns = dvr.findElements(By.xpath("//table[@id='table1']//tbody//tr[" + i + "]//td"));
          for (WebElement cell : columns) {
                System.out.print(cell.getText() + " ");
            }


			System.out.println();
		}
		dvr.quit();
	}

}
