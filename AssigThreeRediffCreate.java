package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigThreeRediffCreate {
   
	 public static void main(String[] args) throws InterruptedException {
		  
		 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
         
		 
         WebElement full_name = driver.findElement(By.cssSelector("input[name^='name']"));
         full_name.sendKeys("Tejas Karde");
         
         WebElement Rediffmail = driver.findElement(By.cssSelector("input[name^='login']"));
         Rediffmail.sendKeys("tejaskarde");
         
         WebElement Password = driver.findElement(By.cssSelector("input[name^='passwd']"));
         Password.sendKeys("Password1234");
         
         WebElement Re_password = driver.findElement(By.cssSelector("input[name^='confirm']"));
         Re_password.sendKeys("Password1234");
         
         
         WebElement AltEmail = driver.findElement(By.cssSelector("input[name^='altemail']"));
         AltEmail.sendKeys("Password1234");
         
         
         WebElement MobNo = driver.findElement(By.id("mobno"));
         MobNo.sendKeys("Password1234");
         
         
         
         
         
//         WebElement RediffId = driver.findElement(By.className("login39c52bba"));
//         RediffId.sendKeys("Tejas Karde");
         
         
        
		 Thread.sleep(5000);
		 driver.close();
		 
	 }
	
}
