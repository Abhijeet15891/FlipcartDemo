package utility;

public class Calling
{
	public static void main(String[] args)
	{
	//browserLaunch
	  Object[] input=new Object[2];
	  input[0]="Chrome";
	  input[1]="E:\\abhi\\chromedriver.exe";
	  SeleniumOperations.browserLaunch(input);
	
	//openApp
	  Object[] input1=new Object[1];
	  input1[0]="https://www.flipkart.com/";
	  SeleniumOperations.openApplication(input1);
	
	//click on cancel
	  Object[] input2=new Object[1];
	  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	  SeleniumOperations.clickOnElement(input2);
	
	//moveToElement
	  Object[] input3=new Object[1];
	  input3[0]="//*[@class='_28p97w']";
	  SeleniumOperations.moveToElement(input3);
		
    //click on profile
	  Object[] input4=new Object[1];
	  input4[0]="//*[text()='My Profile']";
	  SeleniumOperations.clickOnElement(input4);
		
	//enter user name
	  Object[] input5=new Object[2];
	  input5[0]="(//*[@autocomplete='off'])[2]";
	  input5[1]="abhi15891@gmail.com";
	  SeleniumOperations.sendKeys(input5);
	  
	//enter password
	  Object[] input6=new Object[2];
	  input6[0]="//*[@type='password']";
	  input6[1]="@bhi12345";
	  SeleniumOperations.sendKeys(input6);
	  
    //click on login
	  Object[] input7=new Object[1];
	  input7[0]="(//*[@type='submit'])[2]";
	  SeleniumOperations.clickOnElement(input7);
		 
	  
	  
	}

}
