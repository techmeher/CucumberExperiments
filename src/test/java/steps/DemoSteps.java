package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

@Test(testName = "API_Test")
public class DemoSteps {

    @Given("^I have a configured cucumber-jvm project$")
    public void i_have_a_configured_cucumber_jvm_project() throws Exception {
        System.out.println("From Given");
        System.out.println("From Given Two");
    }

    @When("^I run it within my IDE$")
    public void i_run_it_within_my_IDE() throws Exception {
        System.out.println("From When");
    }

    @Then("^I will be able to run connected step definitions$")
    public void i_will_be_able_to_run_connected_step_definitions() throws Exception {
        System.out.println("From Then");
    }

    @And("I Included another Step")
    public void iIncludedAnotherStep() {
        System.out.println("This is from another Step");
    }
}
