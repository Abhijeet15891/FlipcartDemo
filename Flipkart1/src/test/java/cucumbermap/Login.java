package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	@Given("^user open \"([^\"]*)\" browser with exe path as \"([^\"]*)\"$")
	public void user_open_browser_with_exe_path_as(String bname, String exe) throws Throwable 
	{
		 Object[] input=new Object[2];
		  input[0]=bname;
		  input[1]=exe;
		  SeleniumOperations.browserLaunch(input);
	}

	@Given("^user enter \"([^\"]*)\" as url$")
	public void user_enter_as_url(String arg1) throws Throwable 
	{
		 Object[] input1=new Object[1];
		  input1[0]=arg1;
		  SeleniumOperations.openApplication(input1);
	}

	@Given("^user click on cancel button to close login$")
	public void user_click_on_cancel_button_to_close_login() throws Throwable 
	{
		Object[] input2=new Object[1];
		  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		  SeleniumOperations.clickOnElement(input2);
	}

	@Given("^user move on Login button$")
	public void user_move_on_Login_button() throws Throwable 
	{
		 Object[] input3=new Object[1];
		  input3[0]="//*[@class='_28p97w']";
		  SeleniumOperations.moveToElement(input3);
	}

	@When("^user click on my profile$")
	public void user_click_on_my_profile() throws Throwable 
	{
		 Object[] input4=new Object[1];
		  input4[0]="//*[text()='My Profile']";
		Hashtable<String, Object> output4= SeleniumOperations.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on my profile$", output4.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable 
	{
		  Object[] input5=new Object[2];
		  input5[0]="(//*[@autocomplete='off'])[2]";
		  input5[1]=arg1;
		  Hashtable<String, Object> output5=  SeleniumOperations.sendKeys(input5);
 HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"([^\"]*)\" as username$", output5.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable 
	{
		  Object[] input6=new Object[2];
		  input6[0]="//*[@type='password']";
		  input6[1]=arg1;
		  Hashtable<String, Object> output6=SeleniumOperations.sendKeys(input6);
		  HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as password$" , output6.get("MESSAGE").toString());
		  
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		  Object[] input7=new Object[1];
		  input7[0]="(//*[@type='submit'])[2]";
		  Hashtable<String, Object> output7= SeleniumOperations.clickOnElement(input7);
		  HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$", output7.get("MESSAGE").toString());
		  
	}

	@Then("^Application shows profile to user$")
	public void application_shows_profile_to_user() throws Throwable 
	{
		  Object[] input8=new Object[2];
		  input8[0]="Abhijeet Jadhav";
		  input8[1]="//*[text()='Abhijeet Jadhav']";
		  Hashtable<String, Object> output8=SeleniumOperations.validationLogin(input8);
		  HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows profile to user$", output8.get("MESSAGE").toString());
		  
	}
	    

	
}
