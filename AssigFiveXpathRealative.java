package Assigments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigFiveXpathRealative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 WebElement userName = driver.findElement(By.xpath("//*[@id=\"login1\"]"));
		 userName.sendKeys("Tejas Karde");
         
		 
		 WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 password.sendKeys("Pass@123");
         
		 
		 WebElement signIn = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]"));
		 signIn.submit();
	}

}



