package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusOptionList {

       		
			public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();

	

	
              
		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Sol");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//text[normalize-space()='Solapur']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Kolh");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Kolhapur(Maharashtra)']"))
				.click();
		
		Thread.sleep(3000);

		
	}

}
