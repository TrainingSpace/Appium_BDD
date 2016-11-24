package net.training_bdd.Appium_Sample;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
  plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport"},
  //tags = {"@Login"},
  features = {"src/test/resources/features"}
  )

public class RunnerClassTest {

}
