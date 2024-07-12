package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigTwoFillingForm {

	 public static void main(String[] args) throws InterruptedException {
		  
		 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement login = driver.findElement(By.id("userName"));
		  
		login.sendKeys("Tejas_Karde");
		
		WebElement Email = driver.findElement(By.id("userEmail"));
		
		Email.sendKeys("tejaskarde21@gmail.com");
		
		
		WebElement CurrentAdd = driver.findElement(By.className("form-control"));
		
		CurrentAdd.sendKeys("infinity saloon karve nagar pincode:-420001");
		
		WebElement perentaddre = driver.findElement(By.id("permanentAddress"));
		

		perentaddre.sendKeys("\"infinity saloon karve nagar pincode:-420001");
		
	WebElement submit = driver.findElement(By.id("submit"));
		
                 submit.click();
		
		
		Thread.sleep(5000); 
		
	  driver.close();
		
		
		 
	 }
	
}
