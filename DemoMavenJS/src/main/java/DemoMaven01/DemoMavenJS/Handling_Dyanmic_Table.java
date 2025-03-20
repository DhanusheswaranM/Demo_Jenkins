package DemoMaven01.DemoMavenJS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dyanmic_Table {

	public static void main(String[] args) {
		ChromeDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		dvr.get("https://thinking-tester-contact-list.herokuapp.com/");
		dvr.findElement(By.xpath("//input[@id='email']")).sendKeys("mdhanusheswaran@gmail.com");
		dvr.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
		dvr.findElement(By.xpath("//button[@id='submit']")).click();
		List<WebElement> list = dvr.findElements(By.xpath("//table[@id='myTable']/tr/td"));
		for(WebElement li:list) {
			System.out.println(li.getText());
		}
		String retrivename = "Danny S";
		
		List<WebElement> names = dvr.findElements(By.xpath("//table[@id='myTable']/tr/td[2]"));
		System.out.println("----------"+names.size()+"------------");
		System.out.println("------------");
		int i = 1;
		for(WebElement n:names) {
			System.out.println(n.getText());
		}
		
		System.out.println("------------");
		for(WebElement n:names) {
			if(n.getText().contains(retrivename)) {
				List<WebElement> row = dvr.findElements(By.xpath("//table[@id='myTable']/tr["+i+"]"));
				for(WebElement r:row) {
					System.out.println(r.getText());
				}
			}
			i++;
		}
	}

}
