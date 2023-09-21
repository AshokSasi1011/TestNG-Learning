package org.launchfb;

import org.testng.annotations.Test;

public class LaunchFb {
	
	@Test(priority=1)
	public void launchFb() {
		System.out.println("FB is successfully launched");
		
	}
	
	@Test(priority=1, groups="regression")
	public void loginFb() {
		System.out.println("Fb is logged in successfully");
	}

}
