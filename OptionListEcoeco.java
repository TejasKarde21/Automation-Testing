package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionListEcoeco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
		 driver.get("https://echoecho.com/htmlforms11.htm");
		 
		
		 WebElement ddlist =driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/select"));
		 
		 Select prod = new Select(ddlist);
		 
		 List<WebElement> plist = prod.getOptions();
		 
		 
		 //1 to check no of country in descrption
		 
		 System.out.println("No of Products = " + plist.size());
		 
		 
		 //To print name of products
		 
		 int i=0;
		  for(WebElement p : plist) {
			   
			  System.out.println(i+" ."+ p.getText());
			  i++;
		  }
		  
		  //3. To Print selected Product
		  
		  System.out.println("Selected country : " + prod.getFirstSelectedOption().getText());
		  
		  //4. select by visible text
		 prod.selectByVisibleText("Milk");
		 
		 System.out.println("Its a Muliple choose list :- "+prod.isMultiple());
		  
		
	}

}
