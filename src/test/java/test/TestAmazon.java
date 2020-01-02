package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.AmazonSignup;

public class TestAmazon extends BaseTest 
{
	@Test
	public void singup() throws IOException, InterruptedException
	{
		
		AmazonSignup am = new AmazonSignup(driver);
		am.loginMethod();
		
	}

}
