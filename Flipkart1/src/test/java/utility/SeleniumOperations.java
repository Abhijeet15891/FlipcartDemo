package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	//browserLaunch
      public static Hashtable<String,Object> browserLaunch(Object[] inputParameters)
      {
       try {
    	    String strBrowserName  =(String) inputParameters[0];
    	    String webDriverExePath=(String) inputParameters[1];
    	  
    	  
    	 if(strBrowserName.equalsIgnoreCase("Chrome"))
    	    {
    		System.setProperty("webdriver.chrome.driver", webDriverExePath);
    	    driver=new ChromeDriver();
    	    driver.manage().window().maximize();
    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	     }
    	 else if(strBrowserName.equalsIgnoreCase("FF"))
    	    {
    		 System.setProperty("webdriver.gecko.driver",webDriverExePath);
    	     driver=new FirefoxDriver();
    	     driver.manage().window().maximize();
    	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	   }
    	   outputParameters.put("STATUS", "PASS");
    	   outputParameters.put("MESSAGE", "methodused:browserLaunch, Input_Data : " +inputParameters[1].toString() );
    	 
    	   }
    	  catch(Exception e)
    	   {
    		  outputParameters.put("STATUS", "FAIL");
    	      outputParameters.put("MESSAGE", "methodused:browserLaunch, Input_Data : " +inputParameters[1].toString() );
    	   }
           return outputParameters;
           }
      
      //openApplication
         public static Hashtable<String,Object> openApplication(Object[]inputParameters)
       {
    	try {
    	     String strURL=(String) inputParameters[0];
    	     driver.get(strURL);
    	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		 outputParameters.put("STATUS", "PASS");
        	 outputParameters.put("MESSAGE", "methodused:openApplication, Input_Data : " +inputParameters[0].toString() );
        	 
    	    }
    	catch(Exception e)
    	    {
    		 outputParameters.put("STATUS", "FAIL");
        	 outputParameters.put("MESSAGE", "methodused:openApplication, Input_Data : " +inputParameters[0].toString() );
        	 
    	    }
        return outputParameters;
        }
    
          //clickOnElement
         public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
            {
    	try {
    	     String xpath=(String) inputParameters[0];
            driver.findElement(By.xpath(xpath)).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            outputParameters.put("STATUS", "PASS");
       	    outputParameters.put("MESSAGE", "methodused:clickOnElement, Input_Data : " +inputParameters[0].toString() );
    	}
    	  catch(Exception e)
    	    {
    		  outputParameters.put("STATUS", "FAIL");
         	  outputParameters.put("MESSAGE", "methodused:clickOnElement, Input_Data : " +inputParameters[0].toString() );
    		
    	    }
        return outputParameters;
    	}
          //movetoElement
         public static Hashtable<String,Object> moveToElement(Object[]inputParameters)
            {
    	try {
         	String xpath=(String) inputParameters[0];
    	    Actions act=new Actions(driver);
    	    WebElement element=driver.findElement(By.xpath(xpath));
    	    act.moveToElement(element).build().perform();
    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	    outputParameters.put("STATUS", "PASS");
       	    outputParameters.put("MESSAGE", "methodused:moveToElement, Input_Data : " +inputParameters[0].toString() );
            }      
    	catch(Exception e)
    	    {
    		  outputParameters.put("STATUS", "FAIL");
         	  outputParameters.put("MESSAGE", "methodused:moveToElement, Input_Data : " +inputParameters[0].toString() );
	        }
        return outputParameters;
	     }
    	
          //send keys
         public static Hashtable<String,Object> sendKeys(Object[]inputParameters)
            {
      	try {
    	     String xpath=(String) inputParameters[0];
    	     String strValue=(String) inputParameters[1];
    	     driver.findElement(By.xpath(xpath)).sendKeys(strValue);
    	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	     outputParameters.put("STATUS", "PASS");
        	 outputParameters.put("MESSAGE", "methodused:sendKeys, Input_Data : " +inputParameters[1].toString() );
    	     
            }
      	    catch(Exception e)
    	    {
      	     outputParameters.put("STATUS", "FAIL");
         	 outputParameters.put("MESSAGE", "methodused:sendKeys, Input_Data : " +inputParameters[1].toString() );
      	    	
	        }
        return outputParameters;
            }
      	//validation Login
      	 public static Hashtable<String,Object> validationLogin(Object[] inputParameters)
         {
     	try {
 	        String givenText=(String)inputParameters[0];
 	        String xpath=(String)inputParameters[1];
 	        String text= driver.findElement(By.xpath(xpath)).getText();
 	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	     
         
   	     if(givenText.equalsIgnoreCase(text)) 
     	   {
   		    System.out.println("Test case Pass");
     	   }
    	else
   	     {
		    System.out.println("Test case Fail");
     	 }
   	        outputParameters.put("STATUS", "PASS");
 	        outputParameters.put("MESSAGE", "methodused:validationLogin, Input_Data : " +inputParameters[0].toString() );
	     
     	}
   	     catch(Exception e)
 	     {
   	        outputParameters.put("STATUS", "FAIL");
    	    outputParameters.put("MESSAGE", "methodused:validationLogin, Input_Data : " +inputParameters[0].toString() );
	     
	     }
        return outputParameters;
           }
   	
      	
      	
      	
      	
      	
	}












