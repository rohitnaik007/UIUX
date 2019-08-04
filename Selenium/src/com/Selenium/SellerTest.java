package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellerTest {
	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// And now use this to visit PawShop
		driver.get("https://thepawshop.netlify.com");
		driver.manage().window().maximize();

		// driver.switchTo().frame("interfaceControlFrame");
		driver.findElement(By.id("interfaceControlFrameMinimizeContainer")).click();
		Thread.sleep(1500);
		// Alternatively the same thing can be done like this
		// driver.navigate().to("http://www.google.com");
		driver.switchTo().frame("mainFrame");

		driver.findElement(By.id("u8_div")).click();

		Thread.sleep(1500);

		driver.findElement(By.id("u652")).click();

		Thread.sleep(1500);

		driver.findElement(By.id("u601_input")).sendKeys("001832839");

		Thread.sleep(1000);

		driver.findElement(By.id("u602_input")).sendKeys("testtest");

		Thread.sleep(1500);

		driver.findElement(By.id("u603")).click();
		Thread.sleep(1500);

		driver.findElement(By.id("u587")).click();
		Thread.sleep(1500);
		//all products
		driver.findElement(By.id("u227_div")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("u54_img")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("u287_input")).sendKeys("2");
		Thread.sleep(1500);
		//driver.findElement(By.id("u297")).click();
		//Thread.sleep(1500);
		driver.findElement(By.id("u277_img")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("u228_div")).click();
		Thread.sleep(1500);

		driver.findElement(By.id("u92_img")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("u157_input")).sendKeys("2");
		Thread.sleep(1500);

		driver.findElement(By.id("u155")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("u87_img")).click();
		Thread.sleep(5000);

		// Close the browser
		driver.close();

	}

}
