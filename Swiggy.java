package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div/div/div/span[1]/span")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("Pune");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[3]/div/div[1]/div/div/div[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		List<WebElement> cp = driver.findElements(By.xpath(
				"/html/body/div[1]/div[1]/div/div/div/main/div[2]/div/div[1]/div[2]/div[2]/div/div/div/a/div/div[2]/div[2]/div[2]/span"));

//		System.out.println(cp.size());

		for (int i = 0; i < cp.size(); i++) {

			System.out.println(i + " " + cp.get(i).getText());
		}

		try {

			for (int i = 0; i < cp.size(); i++) {
				try {

					String valueString = cp.get(i).getText().trim();
					valueString = valueString.replaceAll("[^0-9.-]", "");

					// Step 3: Parse the cleaned string to double
					double result = Double.parseDouble(valueString);

					if (result > 4.3) {
						System.out.println("The maximum value is: " + result); // Update max if the current value is
																				// greater
					}
				} catch (NumberFormatException e) {
					System.err.println("Error parsing value: " + cp.get(i).getText());
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}