package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaFormFillMultipleChoose {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		WebElement fName = driver.findElement(By.id("firstName"));

		fName.sendKeys("Tejas");

		WebElement lName = driver.findElement(By.id("lastName"));

		lName.sendKeys("Karde");

		WebElement Email = driver.findElement(By.id("userEmail"));

		Email.sendKeys("tejaskarde21@gmail.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[1]/label"))
				.click();

		WebElement mobilNumber = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[4]/div[2]/input"));
		mobilNumber.sendKeys("7083093390");

//		WebElement date = driver.findElement(
//				By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div[1]/div/input"));
//		date.click();

		WebElement subject = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]/div[2]/div/input"));

		subject.click();
		subject.sendKeys("Math");
		subject.submit();
	}

}
