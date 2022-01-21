package stepdefinition;


import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;

public class LoginPage
{

	@Given("printing hello")
	public void printing_hello() {
		System.out.println("hello");
	}

	@Given("printing hello world")
	public void printing_hello_world() {
		System.out.println("hello world");

	}
	
	
	void hello()
	{
		SoftAssert soft = new SoftAssert();
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
