package DemoMaven01.DemoMavenJS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialsninjas {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

        WebElement searchBox = driver.findElement(By.name("search"));
        SendKeysFunction(searchBox, driver, "hp");

        WebElement button = driver.findElement(By.cssSelector("#search > span > button"));
        PressEnter(button, driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go(0);");
        js.executeScript("window.scrollBy(0,500);");

//        driver.quit();
    }

    public static void SendKeysFunction(WebElement searchBox, WebDriver driver, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "';", searchBox);
    }

    public static void PressEnter(WebElement button, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);
    }
}
