package runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = { "stepDef",
"ups" },  plugin = { "pretty", "html:target/cucumber-htmlreport",
		"json:target/cucumber-report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

public class RunTracking extends AbstractTestNGCucumberTests{

	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/config.xml"));

	}
}
