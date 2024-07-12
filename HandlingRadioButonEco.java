package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButonEco {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
		 driver.get("https://echoecho.com/htmlforms09.htm");
		 


		 
		 List<WebElement> gender = driver.findElements(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input"));
       
		      
		   for(WebElement g : gender ) {
			   System.out.println("Before clicking....");
		        System.out.println("Visiblity of chkbox : " + g.isDisplayed());
		        System.out.println("Visiblity of chkbox : " + g.isEnabled());
		        System.out.println("Visiblity of chkbox : " + g.isSelected());
			   
			   
		   }
		 
       
         
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
