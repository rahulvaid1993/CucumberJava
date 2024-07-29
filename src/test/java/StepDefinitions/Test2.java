package StepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test2 {
    WebDriver driver;



    public static void main(String[] args){



    }


    public void launchbrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();

        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());



        driver.quit();
        WebElement dropdown = driver.findElement(By.xpath(""));
        Select s = new Select(dropdown);

        s.selectByValue("a");
        s.selectByIndex(1);
        s.selectByVisibleText("Mr.");
        s.deselectAll();

        WebElement incrementbutton = driver.findElement(By.xpath(""));
        int i = 1;
        while(i<5){
            incrementbutton.click();
            i++;



        }

        WebDriverWait d = new WebDriverWait(driver,Duration.ofSeconds(10));

        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));









    }
}
