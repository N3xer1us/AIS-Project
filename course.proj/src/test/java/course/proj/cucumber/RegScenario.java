package course.proj.cucumber;

import static org.junit.Assert.assertEquals;

import course.proj.models.RegScreenModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegScenario {

	RegScreenModel rsm = new RegScreenModel();
	
	@Given("^The user opens the child registration form$")
	public void opensRegistrationForm() throws Throwable {
	    
	    
	}

	@When("^enters the child's full name \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void enterChild_Name(String first, String second, String last) throws Throwable {
		rsm.setChildName(first, second, last);
	}

	@When("^sets child is disabled to \"([^\"]*)\"$")
	public void setIsDisabled(String isDisabled) throws Throwable {
		boolean a = Boolean.valueOf(isDisabled);
		rsm.setIsDisabled(a);
	}

	@When("^sets child has twin to \"([^\"]*)\"$")
	public void setIsTwin(String isTwin) throws Throwable {
		boolean a = Boolean.valueOf(isTwin);
		rsm.setIsTwin(a);
	}

	@When("^sets child has sibling to \"([^\"]*)\"$")
	public void setIsSibling(String isSibling) throws Throwable {
		boolean a = Boolean.valueOf(isSibling);
		rsm.setIsSibling(a);
	}

	@When("^sets child has one parent to \"([^\"]*)\"$")
	public void setHasOneParent(String hasOneParent) throws Throwable {
		boolean a = Boolean.valueOf(hasOneParent);
		rsm.setHasOneParent(a);
	}

	@When("^enters first parent's full name \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void enterParent1_Name(String first, String second, String last) throws Throwable {
		rsm.setParent1Name(first, second, last);
	}

	@When("^enters first parent's email \"([^\"]*)\"$")
	public void enterParent1_Email(String email) throws Throwable {
		rsm.setParent1Email(email);
	}

	@When("^sets 	first parent is working to \"([^\"]*)\"$")
	public void setParent1_IsWorking(String isWorking) throws Throwable {
		boolean a = Boolean.valueOf(isWorking);
		rsm.setParent1IsWorking(a);
	}

	@When("^enters second parent's full name \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void enterParent2_Name(String first, String second, String last) throws Throwable {
		rsm.setParent2Name(first, second, last);
	}

	@When("^enters second parent's email \"([^\"]*)\"$")
	public void enterParent2_Email(String email) throws Throwable {
		rsm.setParent2Email(email);
	}

	@When("^sets 	second parent is working to \"([^\"]*)\"$")
	public void setParent2_IsWorking(String isWorking) throws Throwable {
		boolean a = Boolean.valueOf(isWorking);
		rsm.setParent2IsWorking(a);
	}

	@When("^presses the submit button$")
	public void pressSubmit() throws Throwable {
		rsm.registerChild();
	}

	@Then("^sees the message \"([^\"]*)\"$")
	public void sees_the_message(String expectedMessage) throws Throwable {
		final String resultMessage = rsm.getMessage();
		assertEquals(expectedMessage, resultMessage);
	}
	
}
