package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {

    WebDriver driver;

    public PageObjects(WebDriver driver) {
        this.driver = driver;
    }

    By products = By.cssSelector(".product");

    @SuppressWarnings("unchecked")
    public List<WebElement> products() {
        return (List<WebElement>) driver.findElement(products);
    }

    By carticon = By.xpath("//a[@class='cart-icon']");


    By cartPreviewAactive=By.xpath("//div[@class ='cart-preview active']/div[2]/button");

    By PlaceOrderButton=By.xpath("//button[text()='Place Order']");


    By DropDown= By.xpath("//div[@class='wrapperTwo']/div/select");

    By CheckBox= By.cssSelector(".chkAgree");

    By ProceedButton = By.xpath("//button[text()='Proceed']");

    public WebElement carticon() {

        return driver.findElement(carticon);
    }

    public WebElement cartPreviewAactive() {

        return driver.findElement(cartPreviewAactive);
    }

    public WebElement PlaceOrderButton() {

        return driver.findElement(PlaceOrderButton);
    }

    public WebElement DropDown() {

        return driver.findElement(DropDown);
    }

    public WebElement CheckBox() {

        return driver.findElement(CheckBox);
    }

    public WebElement ProceedButton() {

        return driver.findElement(ProceedButton);
    }
}
