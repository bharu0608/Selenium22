package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibraries;

public class AmazonSignup extends BasePage implements AutoConstant
{
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement signupButton;
	

	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextfeild;
	
	
	@FindBy(id="continue")
	private WebElement conButton;
	
	@FindBy(id="ap_password")
	private WebElement passwordTextfeild;


public AmazonSignup(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void loginMethod() throws IOException, InterruptedException
{
	Thread.sleep(15000);
	signupButton.click();
	emailTextfeild.sendKeys(ExcelLibraries.getCellValue(excel_path,sheet_name,8,0));
	conButton.click();
	passwordTextfeild.sendKeys(ExcelLibraries.getCellValue(excel_path,sheet_name,9,0));
	
	
}
}
