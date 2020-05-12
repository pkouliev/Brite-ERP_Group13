package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class AbstractPageBase {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    @FindBy(id = "menu_more_container")
    protected WebDriver moreTab;


    protected WebDriver purchasesModule;

    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }





}
