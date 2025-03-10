package DemoMaven01.DemoMavenJS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.*;

//public class OpenGoogle {
//
//	public static void main(String[] args) throws InterruptedException {
////		WebDriverManager.edgedriver().setup();
////		EdgeDriver dvr = new EdgeDriver();
////		dvr.get("https://google.co.in");
////		WebElement search_box = dvr.findElement(By.name("q"));
////		search_box.sendKeys("Java Selenium" + Keys.ENTER);
////		WebDriverManager.chromedriver().setup(); // if we comment webdrivermanager it will be also work
////		ChromeDriver dvr = new ChromeDriver();
////		dvr.manage().window().maximize();
////		dvr.get("https://google.co.in");
////		WebElement search_box = dvr.findElement(By.name("q"));
////		search_box.sendKeys("Java Selenium" + Keys.ENTER);
////		String CurrentURL =dvr.getCurrentUrl();
////		String Title = dvr.getTitle();
////		dvr.getPageSource();
////		System.out.println("URL : "+CurrentURL);
////		System.out.println("Title : "+Title);
////		dvr.close();// it close the window when all the process is done
////		WebDriverManager.chromedriver().setup(); // if we comment webdrivermanager it will be also work
////		ChromeDriver dvr = new ChromeDriver();
////		dvr.manage().window().maximize();
////		dvr.get("https://amazon.in");
////		WebElement search_box = dvr.findElement(By.name("field-keywords"));
////		search_box.sendKeys("Drone" + Keys.ENTER);
////		String CurrentURL =dvr.getCurrentUrl();
////		String Title = dvr.getTitle();
////		dvr.getPageSource();
////		System.out.println("URL : "+CurrentURL);
////		System.out.println("Title : "+Title);
////		//dvr.close();
//		WebDriverManager.chromedriver().setup(); // if we comment webdrivermanager it will be also work
//		ChromeDriver dvr = new ChromeDriver();
//		dvr.manage().window().maximize();
//		dvr.get("https://www.saucedemo.com");
//		//dvr.navigate().to("\"https://www.saucedemo.com\"");// navigate instead of get
//		WebElement user = dvr.findElement(By.name("user-name"));
//		user.sendKeys("standard_user" + Keys.ENTER);
//		WebElement pwd = dvr.findElement(By.name("password"));
//		pwd.sendKeys("secret_sauce" + Keys.ENTER);
//		WebElement loginbtn = dvr.findElement(By.name("login-button"));
//		loginbtn.sendKeys(Keys.ENTER);
//		WebElement cart = dvr.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
//		cart.click();
//		WebElement viewcart = dvr.findElement(By.id("shopping_cart_container"));
//		viewcart.click();
//		Thread.sleep(3000);
//		String CurrentURL =dvr.getCurrentUrl();
//		String Title = dvr.getTitle();
//		dvr.getPageSource();
//		System.out.println("URL : "+CurrentURL);
//		System.out.println("Title : "+Title);
//		//dvr.close();
//		dvr.navigate().back();// it is back to the page
//		
//	}
//
//}
public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		//email accessing
		//WebDriverManager.chromedriver().setup(); // if we comment webdrivermanager it will be also work
		WebDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.get("https://accounts.google.com");

		WebElement search_box = dvr.findElement(By.name("identifier"));// use in xpath
		Thread.sleep(3000);
		search_box.sendKeys("2k21eee09@kiot.ac.in\n"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement pwd = dvr.findElement(By.name("Passwd"));
		pwd.sendKeys("Dhanush2412$"+Keys.ENTER);
		WebElement compose = dvr.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div/div"));
		compose.click();
		//dvr.close();
		//dvr.navigate().back();// it is back to the page
		
	}

}
//public class OpenGoogle {
//
//	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
//		WebDriver dvr = new ChromeDriver(option);
//		dvr.manage().window().maximize();
//		dvr.get("https://www.google.co.in");
//		WebElement search_box = dvr.findElement(By.name("q"));
//		search_box.sendKeys("Java Selenium" + Keys.ENTER);
//		String url = dvr.getCurrentUrl();
//		String title = dvr.getTitle();
//		System.out.println("URL : "+url);
//		System.out.println("TITLE : "+title);
//	}
//
//}