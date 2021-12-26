package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features", 
	glue={"stepdefinition"},
tags= "@smoke or not @test" //and not smoke"
)
public class RunnerClass extends AbstractTestNGCucumberTests
{


	
}
			