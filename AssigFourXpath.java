package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigFourXpath {

	 public static void main(String[] args) {
		 
		  
		 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 WebElement userName = driver.findElement(By.xpath("html/body/div/div/div/div[2]/form/div/div[2]/div/div[2]/input"));
		 userName.sendKeys("Tejas Karde");
         
		 
		 WebElement password = driver.findElement(By.xpath("html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[1]"));
		 password.sendKeys("Pass@123");
         
		 
		 WebElement signIn = driver.findElement(By.xpath("html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]"));
		 signIn.submit();
         
		
		 
	 }
	
	
}
