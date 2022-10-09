package stepdefs;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {
	int result;

	@Given("I have a calculator")
	public void i_have_a_calculator() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("open the calculator");
	}

	@When("add {int} and {int}")
	public void add_and(int int1, int int2) {
		// Write code here that turns the phrase above into concrete actions
		result = int1 + int2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expResult) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(expResult, result);
	}

	@When("I add below Numbers")
	public void i_add_below_Numbers(List<Integer> numbers) {
		for (Integer num : numbers) {
			result = result + num;
		}

	}
}
