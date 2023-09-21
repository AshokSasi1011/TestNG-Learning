package org.launchfb;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class LoginTest {
		
		// Attributes--> @Test: priority and description
		
	/*	@Test(priority = 1, description = "This is login Test")
		public void bLoginTest() {
			System.out.println("login successful");
		}
		
		@Test(priority = 2, description = "This is logout Test")
		public void aLogoutTest() {
			System.out.println("logout successful");
		}*/
		
		
		// Annotations @BeforeTest, @AfterTest, @BeforeMethod, @AfterMethod
		
		@BeforeTest
		public void loginToApplication() {
			System.out.println("Login to Application");
		}
		
		@AfterTest
		public void logoutFromApplication() {
			System.out.println("Logout from Application");
		}
		
		@BeforeMethod
		public void connectDB() {
			System.out.println("DB Connected");
		}
		
		@AfterMethod
		public void disconnectDB() {
			System.out.println("DB Disconnected");
		}
		
		@Test(priority = 1, description = "This is login Test", groups="regression")
		public void bTest1() {
			System.out.println("Test1");
		}
		
		@Test(priority = 2, description = "This is logout Test")
		public void aTest2() {
			System.out.println("Test2");
		}
		
	}


