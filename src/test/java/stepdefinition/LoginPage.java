package stepdefinition;

import org.junit.jupiter.api.Assertions;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;

public class LoginPage
{

	public static void main(String args[])
	{

		
		Assertions soft = new Assertions();
		soft.assertEquals("hello", "Hello");
		soft.assertAll();
		System.out.println("ok");
}
	}









	
//	
//	@Given("^printing hello world$")
//	public void printing_hello_world() {
//		System.out.println("Hello world");
//		
//	}
//
//	@Given("^printing hi$")
//	public void printing_hi() {
//		System.out.println("Hi word");
//		
//	}
//}
