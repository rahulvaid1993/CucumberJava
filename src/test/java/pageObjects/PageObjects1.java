package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects1 {

    WebDriver driver;


    public PageObjects1(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath="//a[@class='test']")
    WebElement username;

    public WebElement username()
    {
     return  username;
    }



}
