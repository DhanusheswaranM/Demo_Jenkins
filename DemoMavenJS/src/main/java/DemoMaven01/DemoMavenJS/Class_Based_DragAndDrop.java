package DemoMaven01.DemoMavenJS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Class_Based_DragAndDrop {
	private WebDriver dvr ;
	private WebDriverWait wait ;
	private Actions act ;
	
	Class_Based_DragAndDrop(){
		this.dvr = new ChromeDriver();
		this.dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.dvr.manage().window().maximize();
		this.act = new Actions(dvr);
		this.wait = new WebDriverWait(dvr,Duration.ofSeconds(10));
		
	}
	
	void openwebsite(String link) {
		dvr.get(link);
	}
	
	void DragDrop(String src , String tgt) {
		WebElement source = dvr.findElement(By.id(src));
		WebElement target = dvr.findElement(By.id(tgt));
		System.out.println("");
		System.out.println("Before "+src+" box : "+source.getCssValue("background-color"));
		
		act.clickAndHold(source).moveToElement(target).release().build().perform();

		System.out.println("After "+src+" box : "+source.getCssValue("background-color"));
		String name = wait.until(ExpectedConditions.visibilityOf(source)).getText();
		if(source.getCssValue("background-color").equals("rgba(0, 255, 0, 1)")) {
			System.out.println("--------------- "+name+" Dropped correctly---------------");
		}
		else {
			System.out.println("--------------- "+name+" Dropped incorrectly---------------");
		}
		
	}
	void quitDriver() {
		dvr.quit();
	}
	public static void main(String[] args) {
		Class_Based_DragAndDrop dd1 = new Class_Based_DragAndDrop();
		dd1.openwebsite("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		dd1.DragDrop("box1", "box101");
		dd1.DragDrop("box2", "box102");
		dd1.DragDrop("box3", "box103");
		dd1.DragDrop("box4", "box104");
		dd1.DragDrop("box5", "box105");
		dd1.DragDrop("box6", "box106");
		dd1.DragDrop("box7", "box107");
		dd1.quitDriver();
		

	}

}
