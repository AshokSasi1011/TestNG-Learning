package org.launchfb;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="smoke")
	public void atest1() {
		System.out.println("Test1");
	}
	
	@Test(groups= {"regression", "bvt"})
	public void atest2() {
		System.out.println("Test2");
	}
	
	@Test(groups= {"smoke", "bvt"})
	public void atest3() {
		System.out.println("Test2");
	}
	
	@Test(groups= "regression")
	public void atest4() {
		System.out.println("Test4");
	}

}
