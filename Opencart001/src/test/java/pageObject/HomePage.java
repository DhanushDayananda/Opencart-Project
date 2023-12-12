package pageObject;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class HomePage extends Basepage {
		public HomePage(WebDriver driver) {
			super(driver);
			
		}
		/*@FindBy(xpath = "//span[text()='My Account']")
		WebElement lnkMyaccount;
		
		@FindBy(linkText = "Register")
		WebElement lnkRegister;
		
		public void clickMyAccount() {
			lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}
		@FindBy(xpath="//a[normalize-space()='Login']")
		WebElement lnkLogin;
		
		public void clickLogin() {
			lnkLogin.click();
		}
	
	}*/
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText = "Register")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")//this is for login option
	WebElement login;
	
	public void clickMyAccount() {
		lnkMyaccount.click();
}

public void clickRegister() {
	lnkRegister.click();
}
 public void clickLogin() {
	 login.click();
	 
 }



}



