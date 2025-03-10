package DemoMaven01.DemoMavenJS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_demo {

	public static void main(String[] args) throws IOException {
		WebDriver dvr = new ChromeDriver();
		dvr.get("https://www.selenium.dev/");
		try {
			WebElement logo = dvr.findElement(By.xpath("//*[@id=\"Layer_1\"]"));
			File src = ((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File ("./Screenshot/logo_selenium"+System.currentTimeMillis()+".png"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ss is taked");
		dvr.close();
	}

}
