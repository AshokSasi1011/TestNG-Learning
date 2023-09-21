package org.pojo;

import java.io.IOException;

import org.testng.annotations.Test;

public class Ques1 extends BaseClass{
	
	@Test
	public void tc1() {
		launchChromeBrowser();
		launchURL("https://www.facebook.com/");
	}
	
	@Test
	public void tc2() throws IOException {
		FbPojo fb = new FbPojo();
		getDataFromExcel("C:\\Users\\WIN 10\\Desktop\\datadHrivenframework.xlsx","fblogin",2,0);
		getDataFromExcel("C:\\Users\\WIN 10\\Desktop\\datadrivenframework.xlsx","fblogin",2,1);
		sendValues(fb.getUserName(), "asasikumar0505@gmail.com");
		sendValues(fb.getPassWord(), "narmatha0505");
		clickElement(fb.getLoginUser());
	}

}
