package stepdefinition;


import org.testng.asserts.SoftAssert;

public class LoginPage
{

	public static void main(String args[])
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
