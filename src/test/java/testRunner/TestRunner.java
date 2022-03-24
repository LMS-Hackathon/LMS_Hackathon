package testRunner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (
		
		features="C:\\Users\\sethu\\eclipse-workspace\\LMS_Hackathon\\features",
		glue="stepDefinitions",
		dryRun=false,
		plugin={"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"html:target/cucumber-html-report",
				"json:target/cucumber-json-report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"junit:target/cucumber-junit-report.xml"},
		monochrome=true
		//tags= "@Smoke"
		)

public class TestRunner {
	

}
