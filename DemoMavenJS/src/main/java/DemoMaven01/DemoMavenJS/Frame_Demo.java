package DemoMaven01.DemoMavenJS;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Frame_Demo {

	public static void main(String[] args) {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("----headless");
//		WebDriver dvr= new ChromeDriver();
//		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		dvr.manage().window().maximize();
//		dvr.get("https://demoqa.com/frames");
//		WebElement iframeele = dvr.findElement(By.id("frame1"));
//		dvr.switchTo().frame(iframeele);
//		String Frame1 = dvr.findElement(By.id("sampleHeading")).getText();
//		System.out.println("switch by locator : "+Frame1);
//		
//		dvr.switchTo().defaultContent();
//		
//		String mainpage = dvr.findElement(By.xpath("//div[@id='framesWrapper']//h1")).getText();
//		System.out.println("Back to Main page : "+mainpage );
//		Set<String>frame=dvr.getWindowHandles();
//		System.out.println(frame.size());
//		dvr.switchTo().frame(3);
//		
//		String Frame2 = dvr.findElement(By.id("sampleHeading")).getText();
//		System.out.println("Switch by index : "+Frame2);
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/frame.xhtml");
        WebElement one=driver.findElement(By.xpath("//iframe[@src=\"default.xhtml\"]"));
        driver.switchTo().frame(one);
        WebElement a=driver.findElement(By.xpath("//button[@style=\"color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%\"]"));
        a.click();
        String t=a.getText();
        System.out.println("text click1:"+t);
        driver.switchTo().defaultContent();
        
        WebElement bottom=driver.findElement(By.id("j_idt96"));
        System.out.println("main page:"+bottom.getText());
        WebElement two=driver.findElement(By.xpath("//iframe[@src=\"nested.xhtml\"]"));
        Set<String> window=driver.getWindowHandles();
        System.out.println(window.size());
        driver.switchTo().frame(2);
//        WebElement b=driver.findElement(By.xpath("//button[@style=\"background: linear-gradient(240deg, #00aadf 0%, #0071bc 100%);color:#ffffff;border: 0 none;width:25%;height:40%\"]"));
        

		
	}

}
