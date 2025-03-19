package DemoMaven01.DemoMavenJS;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
public class Tutorialninjas_register {
    public static void main(String[] args) {
        WebDriver dvr = new ChromeDriver();
        dvr.manage().window().maximize();
        dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dvr.get("https://tutorialsninja.com/demo/");
        JavascriptExecutor jse = (JavascriptExecutor) dvr; 
  	    jse.executeScript("document.getElementsByClassName(\"dropdown-toggle\")[1].click();");
  	    jse.executeScript("document.querySelector('a[href*=\"account/register\"]').click();");
        jse.executeScript("document.getElementById(\"input-firstname\").value='Mark';"); 	     
        jse.executeScript("document.getElementById(\"input-lastname\").value='D';");
  	   	jse.executeScript("document.getElementById(\"input-email\");.value='exmple@gamil.com'");
  	   	jse.executeScript("document.getElementById(\"input-telephone\");.value='6869696009';");
  	   	jse.executeScript("document.getElementById(\"input-password\");.value='example1234@';");
  	   	jse.executeScript("document.getElementById(\"input-confirm\");.value='example1234@';");
  	   	jse.executeScript("document.getElementsByName(\"newsletter\")[0];.click();");
  	   	jse.executeScript("document.getElementsByName(\"agree\")[0];.click();");
  	   	}
    }