package DemoMaven01.DemoMavenJS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class New_Window_Tab {

	public static void main(String[] args) {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		
		dvr.get("https://www.bing.com");
		System.out.println("Bing website is opened");
		
		dvr.switchTo().newWindow(WindowType.TAB);
		System.out.println("New window created");
		
		dvr.navigate().to("https://www.duckduckgo.com");
		System.out.println("DuckDuck website is opend");
		
	}

}
