package project.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest extends TestData {
	WebDriver driver = new ChromeDriver();
	String URL = "http://127.0.0.1:5500/index.html#about";

	@BeforeTest
	public void mySetup() {
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void scrollTest() throws InterruptedException {
		Thread.sleep(2000);
		// it's mean we tell driver to run code javaScript now
		JavascriptExecutor js = (JavascriptExecutor) driver;// js it's object form JavascriptExecutor
		js.executeScript("window.scrollTo(0,18000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(18000,0)");

	}

	@Test(priority = 2)
	public void fillingTheInputFields() {
		// ----- WebElements

		WebElement TextInputField = driver.findElement(By.id("text"));
		WebElement EmailInputField = driver.findElement(By.id("email"));
		WebElement DateInputField = driver.findElement(By.id("date"));
		WebElement PassWordInputField = driver.findElement(By.id("password"));
		WebElement NumberInputField = driver.findElement(By.id("number"));
		WebElement FileUploadButton = driver.findElement(By.id("file"));

		// ---- actions

		// WebElement GenderRadioButton =
		// driver.findElement(By.xpath("//input[@value='"+RandomGender+"']"));
		List<WebElement> Genders = driver.findElements(By.name("gender"));
		List<WebElement> Hoppies = driver.findElements(By.name("hobby"));
		TextInputField.sendKeys(RandomText);
		EmailInputField.sendKeys(RandomEmail);
		PassWordInputField.sendKeys(RandomPassword);
		NumberInputField.sendKeys(RandomNumber);
		DateInputField.sendKeys(RandomDate);
		// GenderRadioButton.click();
		Genders.get(RandomGender).click();

		// this is if you want to get only one value
		// Hoppies.get(RandomHoppy).click();

		// if you want to get all values

		for (int i = 0; i < Hoppies.size(); i++) {
			Hoppies.get(i).click();
		}

		FileUploadButton.sendKeys(FilePath);

	}

	@AfterTest
	public void closeWebsite() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}