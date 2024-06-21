package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.PageObjects;
import reusableMethods.ReusableMethods;


public class LoginSteps {
	WebDriver driver;

	@Given("User navigate to the URL")
	public void User_navigate_to_the_url() throws IOException {
		ReusableMethods RM = new ReusableMethods();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String PageURL = RM.getProperty("URL");
		driver.get(PageURL);
	}

	@When("user perform E2E")
	public void user_perform_E2E() throws InterruptedException {
		List<WebElement> products = driver.findElements(By.cssSelector(".product"));

		WebElement desiredProduct = products.stream()
				.filter(product -> product.findElement(By.cssSelector("h4")).getText().equals("Water Melon - 1 Kg"))
				.findFirst().orElse(null);

		PageObjects PO = new PageObjects(driver);



		desiredProduct.findElement(By.cssSelector("a[class='increment']")).click();
		Thread.sleep(3000);
		desiredProduct.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(3000);
		PO.carticon().click();
		Thread.sleep(5000);
		PO.cartPreviewAactive().click();
		Thread.sleep(5000);
		PO.PlaceOrderButton().click();
		Thread.sleep(5000);
		WebElement dropdown = PO.DropDown();

		Select s = new Select(dropdown);
		s.selectByValue("India");

		PO.CheckBox().click();
		Thread.sleep(5000);
		PO.ProceedButton().click();
		driver.quit();
	}


	@And("^User Captures Screenshot$")
	public void And_User_Captures_Screenshot() throws IOException {

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//screenshots//screenshot.png"));

	}

}
