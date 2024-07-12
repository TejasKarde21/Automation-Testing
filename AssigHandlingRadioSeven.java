package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigHandlingRadioSeven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
		 driver.get("https://echoecho.com/htmlforms09.htm");
		 

		 Thread.sleep(10000);
		 
		 List<WebElement> gender = driver.findElements(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
       
		      
		   for(WebElement g : gender ) {
			   System.out.println("Before clicking....");
		        System.out.println("Visiblity of chkbox : " + g.isDisplayed());
		        System.out.println("Visiblity of chkbox : " + g.isEnabled());
		        System.out.println("Visiblity of chkbox : " + g.isSelected());
			   
			   
		   }
		 
       Thread.sleep(10000);
         
            if(!gender.get(0).isSelected()) { 
            	gender.get(0).click();
            	gender.get(2).click();
            	
            	
            	 for(WebElement g : gender ) {
      			   System.out.println("After clicking....");
      		        System.out.println("Visiblity of chkbox : " + g.isDisplayed());
      		        System.out.println("Visiblity of chkbox : " + g.isEnabled());
      		        System.out.println("Visiblity of chkbox : " + g.isSelected());
      			   
      			   
      		   }
      		 
            }
            
             
	}
	
	
}
