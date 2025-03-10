package DemoMaven01.DemoMavenJS;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.*;
//public class Day2_Automation {
//
//	public static void main(String[] args) {
//		WebDriver dvr = new ChromeDriver();
//		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		dvr.manage().window().maximize();
//		dvr.get("https://www.naukri.com");
//		WebElement SearchBox = dvr.findElement(By.cssSelector("input.suggestor-input"));
//		
//		WebElement mobile = dvr.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[2]/a"));
//		String text = mobile.getText();
//		System.out.println("Text : "+text);
//		//@SuppressWarnings("deprecation")
//		String attribute = mobile.getDomAttribute("href");
//		System.out.println("href attributes : "+attribute);
//		String color = mobile.getCssValue("color");
//		System.out.println("Css Color : "+color);
//		int x = mobile.getLocation().getX();
//		int y = mobile.getLocation().getY();
//		System.out.println("X :"+x+"\nY : "+y);
//		int width = mobile.getSize().getWidth();
//		int height = mobile.getSize().getHeight();
//		System.out.println("Size:Width : "+width+"\nSize:height : "+height);
//		System.out.println("company is enable  : "+(mobile.isEnabled()));
//		System.out.println("company is  disable : "+(mobile.isSelected()));
//		System.out.println("company is displayed : "+(mobile.isDisplayed()));
//		//dvr.quit();
//		
//	}
//
//}
//public class Day2_Automation {
//
//	public static void main(String[] args) {
//		WebDriver dvr = new ChromeDriver();
//		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		dvr.manage().window().maximize();
//		dvr.get("https://www.flipkart.com");
//		WebElement search_box = dvr.findElement(By.xpath("//*[@class='zDPmFV']"));
//		
//		String color = search_box.getCssValue("color");
//		System.out.println("Css Color of search_box: "+color);
//		int x = search_box.getLocation().getX();
//		int y = search_box.getLocation().getY();
//		System.out.println("X :"+x+"\nY : "+y);
//		int width = search_box.getSize().getWidth();
//		int height = search_box.getSize().getHeight();
//		System.out.println("Size:Width : "+width+"\nSize:height : "+height);
////		WebElement mobiles = dvr.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/div/div/img"));
////		String text = mobiles.getText();
////		System.out.println("Text : "+text);
////		//@SuppressWarnings("deprecation")
////		String attribute = mobiles.getDomAttribute("href");
////		System.out.println("href attributes : "+attribute);
////		System.out.println("mobiles is enable  : "+(mobiles.isEnabled()));
////		System.out.println("mobiles is  disable : "+(mobiles.isSelected()));
////		System.out.println("mobiles is displayed : "+(mobiles.isDisplayed()));
//		search_box.sendKeys("mobiles"+Keys.ENTER);
//		//search_box.click();
////		WebElement mob = dvr.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div[7]/div/div/a/div/img[2]"));
////		mob.click();
//		//dvr.quit();
//		
//	}
//
//}
//public class Day2_Automation {
//
//	public static void main(String[] args) {
//		WebDriver dvr = new ChromeDriver();
//		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		dvr.manage().window().maximize();
//		dvr.get("https://www.youtube.com");
//		WebElement search_box = dvr.findElement(By.className("search_query"));
//		
//		String color = search_box.getCssValue("color");
//		System.out.println("Css Color of search_box: "+color);
//		int x = search_box.getLocation().getX();
//		int y = search_box.getLocation().getY();
//		System.out.println("X :"+x+"\nY : "+y);
//		int width = search_box.getSize().getWidth();
//		int height = search_box.getSize().getHeight();
//		System.out.println("Size:Width : "+width+"\nSize:height : "+height);
//		search_box.sendKeys("Arr songs"+Keys.ENTER);
//		WebElement mobiles = dvr.findElement(By.xpath(""));
//		String text = mobiles.getText();
//		System.out.println("Text : "+text);
//		//@SuppressWarnings("deprecation")
//		String attribute = mobiles.getDomAttribute("href");
//		System.out.println("href attributes : "+attribute);
//		System.out.println("mobiles is enable  : "+(mobiles.isEnabled()));
//		System.out.println("mobiles is  disable : "+(mobiles.isSelected()));
//		System.out.println("mobiles is displayed : "+(mobiles.isDisplayed()));
//		//dvr.quit();
//		
//	}
//
//}
//public class Day2_Automation {
//
//	public static void main(String[] args) {
//		
//		WebDriver dvr = new ChromeDriver();
//		dvr.manage().window().maximize();
//		
//		dvr.get("https://www.flipkart.com");
//		WebElement search_box = dvr.findElement(By.xpath("//*[@class='Pke_EE']"));
//		
//		search_box.sendKeys("mobiles"+Keys.ENTER);
//		
//		WebElement mob = dvr.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div/a/div[2]/div[1]/div[1]"));
//		mob.click();
//		//dvr.quit();
//		
//		
//	}
//}
public class Day2_Automation {

	public static void main(String[] args) throws AWTException, IOException {
		
		WebDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		
//		dvr.get("https://petstore.octoperf.com/actions/Catalog.action");
//		WebElement content = dvr.findElement(By.id("Content"));
//		content.click();
//		
//		WebElement mob = dvr.findElement(By.id("SidebarContent"));
//		mob.click();
//		//dvr.quit();
		dvr.get("https://www.hamleys.in/");
//		Robot robot = new Robot();// it takes full screenshot 
//		Dimension scr_size = Toolkit.getDefaultToolkit().getScreenSize();
//		Rectangle rect = new Rectangle(scr_size);
//		BufferedImage img = robot.createScreenCapture(rect);
//		File Dest = new File("screenshot2.png");
//		ImageIO.write(img, "png", Dest);
//		System.out.println("Done successfully");
		
		TakesScreenshot sch = ((TakesScreenshot)dvr);// it takes only tab without 
		File src = sch.getScreenshotAs(OutputType.FILE);
		File dest = new File ("screenshot-3.png");
		FileHandler.copy(src, dest);
		System.out.println("Done successfully");
		
	}
}
