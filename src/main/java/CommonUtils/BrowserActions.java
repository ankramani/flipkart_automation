package CommonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserActions {

    static WebDriver driver;

    void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\IdeaProjects\\flipkart\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }

    void clickElement(By by){
        driver.findElement(by).click();
    }

    void enterText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    void dragAndDrop(By source, By destination){
        WebElement src = driver.findElement(source);
        WebElement dest = driver.findElement(destination);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(src, dest).build().perform();
    }

    void implicitWait(Long time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    void explicitWait(By by){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    

}
