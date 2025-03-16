package DemoMaven01.DemoMavenJS;
 
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_WAIT {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.get("https://www.rediff.com/");
		dvr.findElement(By.xpath("//div[@class=\"toplinks\"]//a[2]")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(dvr)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement BSE = wait.until(new Function<WebDriver , WebElement>(){
			public WebElement apply(WebDriver dvr) {
				return dvr.findElement(By.cssSelector(".hmbseindicestable>ul:nth-child(2)>li:nth-child(2)"));
			}
		
		});
		String msg = BSE.getText();
		System.out.println(msg);
		dvr.close();
	}

}
