package DemoMaven01.DemoMavenJS;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.*;

//public class Day_2_practise {
//
//	public static void main(String[] args) {
//		WebDriver dvr = new ChromeDriver();
//		dvr.manage().window().maximize();
//		dvr.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
//		WebElement red = dvr.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
//		System.out.println("red check box is enable r not : "+red.isEnabled());
//		System.out.println("red check box is selected r not : "+red.isSelected());
//		red.click();
//		System.out.println("red check box is selected r not after clicking red checkbox : "+red.isSelected());
//		WebElement opera = dvr.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
//		System.out.println("opera check box is selected r not : "+opera.isSelected());
//		
//	}
//
//}
public class Day_2_practise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.get("https://www.flipkart.com");
		WebElement s_box = dvr.findElement(By.name("q"));
		s_box.sendKeys("Mobiles");
		Thread.sleep(3000);
		System.out.println("Input accepted successfully");
		//s_box.clear();
		s_box.sendKeys(Keys.CONTROL+"a"+Keys.CONTROL+"Backspace");
		System.out.println("Input cleared successfully");
		
	}

}
//public class Day_2_practise {
//public static WebDriver dvr;
//	public static void main(String[] args) throws InterruptedException, IOException {
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("configuration.properties");
//		prop.load(fis);
//		String browser1;
//		browser1 = prop.getProperty("browser");
//		if(browser1.equalsIgnoreCase("chrome")) {
//			dvr = new ChromeDriver();
//			System.out.println("Chrome added successfully");
//		}
//		else if(browser1.equalsIgnoreCase("edge")) {
//			dvr = new EdgeDriver();
//			System.out.println("Edge added successfully");
//		}
//		else {
//			dvr = new FirefoxDriver();
//			System.out.println("FireFox added successfully");
//		}
//		dvr.get("https://www.google.co.in");
//	}
//
//}
