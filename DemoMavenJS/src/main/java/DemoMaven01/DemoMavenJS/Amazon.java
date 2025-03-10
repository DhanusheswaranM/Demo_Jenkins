package DemoMaven01.DemoMavenJS;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.support.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
			Scanner obj = new Scanner(System.in);
			WebDriver dvr = new ChromeDriver();
			dvr.get("https://www.amazon.in/");
			dvr.manage().window().maximize();
			dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			WebElement search_box = dvr.findElement(By.id("twotabsearchtextbox"));
//			search_box.sendKeys("samsung s25");
//			WebElement search = dvr.findElement(By.id("nav-search-submit-button"));
//			search.click();
//			WebElement samsung_s25 = dvr.findElement(By.xpath("//h2[@class=\"a-size-medium a-spacing-none a-color-base a-text-normal\"]"));
//			samsung_s25.click();
//			Set <String> s =dvr.getWindowHandles();
//			ArrayList <String> a = new ArrayList<>(s);
//			dvr.switchTo().window((String)a.get(1));
//			WebElement add_to_cart = dvr.findElement(By.id("add-to-cart-button"));
//			add_to_cart.click();
			System.out.println("Select the option");
			int ch = obj.nextInt();
			switch(ch) {
				case 1:
					WebElement fresh = dvr.findElement(By.xpath("//*[@class=\"nav-ul\"]//a[contains(text(),\"Fresh\")]"));
					fresh.click();
					System.out.println("Fresh option clicked !!");
					Thread.sleep(3000);
					dvr.navigate().back();
					break;
				case 2:
					WebElement mobile = dvr.findElement(By.cssSelector("#nav-xshop>a:nth-child(7)"));
					mobile.click();
					System.out.println("Mobile option clicked !!");
					Thread.sleep(3000);
					dvr.navigate().back();
					break;
				case 3:
					WebElement electronics = dvr.findElement(By.cssSelector("#nav-xshop>a:nth-child(9)"));
					electronics.click();
					System.out.println("electronics option clicked !!");
					Thread.sleep(3000);
					dvr.navigate().back();
					break;
				case 4:
					WebElement home_and_kitchen = dvr.findElement(By.cssSelector("#nav-xshop>a:nth-child(13)"));
					home_and_kitchen.click();
					System.out.println("home & kitchen option clicked !!");
					Thread.sleep(3000);
					dvr.navigate().back();
					break;
				case 5:
					WebElement fashion = dvr.findElement(By.cssSelector("#nav-xshop>a:nth-child(14)"));
					fashion.click();
					System.out.println("fashion option clicked !!");
					Thread.sleep(3000);
					dvr.navigate().back();
					break;
				case 6:
					WebElement computer = dvr.findElement(By.cssSelector("#nav-xshop>a:nth-child(15)"));
					computer.click();
					System.out.println("computer option clicked !!");
					Thread.sleep(3000);
					dvr.navigate().back();
					break;
				case 7:
					WebElement books = dvr.findElement(By.cssSelector("#nav-xshop>a:nth-child(16)"));
					books.click();
					System.out.println("Books option clicked !!");
					Thread.sleep(3000);
					dvr.navigate().back();
					break;
				case 8:
					WebElement car_and_bike = dvr.findElement(By.cssSelector("#nav-xshop>a:nth-child(17)"));
					car_and_bike.click();
					System.out.println("car_and_bike option clicked !!");
					Thread.sleep(3000);
					dvr.navigate().back();
					break;
					default:
						System.out.println("Invalid");
			}
			
			
		

	}

}
