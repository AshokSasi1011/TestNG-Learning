package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends BaseClass{
	
	public FbPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement passWord;
	
	@FindBy(name="login")
	private WebElement loginUser;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginUser() {
		return loginUser;
	}
	
	

}
