package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;

public class LoginPage extends AbstractPageBase {

    @FindBy(xpath = "//input[@id='login']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    public void login(String role) {
        String userName = "";
        String password = "";
        if (role.equalsIgnoreCase("pos manager")) {
            userName = "posmanager90@info.com";
            password = "posmanager";
        } else if (role.equalsIgnoreCase("events manager")) {
            userName = "eventscrmmanager60@info.com";
            password = "eventscrmmanager";
        } else if (role.equalsIgnoreCase("crm manager")) {
            userName = "eventscrmmanager64@info.com";
            password = "eventscrmmanager";
        } else {
            throw new RuntimeException("Invalid role@!");
        }
        System.out.println("Login as "+role);
        login(userName, password);
    }
}
