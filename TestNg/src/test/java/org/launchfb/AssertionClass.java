package org.launchfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class AssertionClass {
	
/*		@Test
		public void titleTest() {
		
			String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle,expectedTitle);
			driver.close();
			}*/
		
		// multiple verification points - soft assert (as against hard assert)
		
		@Test(groups="regression")
		public void multTests() {
			
			SoftAssert softassert = new SoftAssert();
			String expectedTitle = "Electronicss, Cars, Fashion, Collectibles & More | eBay";
			String expectedText = "Searchh";
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			String actualTitle = driver.getTitle();
			String actualText = driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).getAttribute("value");
			softassert.assertEquals(actualTitle,expectedTitle, "Title verification failed");
			softassert.assertEquals(actualText, expectedText, "Text verification failed");
			softassert.assertAll();
			driver.close();
		}

}