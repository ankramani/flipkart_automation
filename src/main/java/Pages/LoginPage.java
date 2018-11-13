package Pages;

import CommonUtils.BrowserActions;
import org.openqa.selenium.By;

public class LoginPage extends BrowserActions {

    BrowserActions browserActions = new BrowserActions();
    By usernameElement = By.xpath("//span[contains(text(),'Enter Email/Mobile number')]");
    String username = "selenium102@gmail.com";
    By passwordElement = By.xpath("//span[contains(text(),'Enter Password')]");
    String password = "selenium@101";
    By loginElement = By.xpath("//span[contains(text(),'Login')]/parent::button[@type = 'submit']");

    void enterUsername(){
        browserActions.enterText(usernameElement, username);
    }

    void enterPassword(){
        browserActions.enterText(passwordElement, password);
    }

    void clickLogin(){

    }

}
