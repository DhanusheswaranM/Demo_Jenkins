package DemoMaven01.DemoMavenJS;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_JavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		dvr.get("https://bstackdemo.com/");
//		WebElement select = dvr.findElement(By.xpath("//select "));
//		JavascriptExecutor js = (JavascriptExecutor)dvr;
//		js.executeScript("arguments[0].value='lowestprice'",select);
//		System.out.println("button clicked by JavascriptExecutor");
		dvr.findElement(By.xpath("//select ")).sendKeys("lowsetprice");
		System.out.println("button clicked by sendkeys");
		dvr.close();

	}

}
