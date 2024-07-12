package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_AssEight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();

		List<WebElement> flist = driver.findElements(By.xpath("html/body/div[2]/div[4]/table/thead/tr/th"));

		for (int i = 0; i < flist.size(); i++) {

			System.out.println(i + " " + flist.get(i).getText());
		}

//		   List<WebElement> rlist = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr"));

//		   for(int i=0 ; i < rlist.size(); i++) {
//			   
//			      System.out.println(i+" "+rlist.get(i).getText());
//		   }

		List<WebElement> cp = driver.findElements(By.xpath("  /html/body/div[2]/div[4]/table/tbody/tr/td[4]"));

		System.out.println(cp.size());

		for (int i = 0; i < cp.size(); i++) {

			System.out.println(i + " " + cp.get(i).getText());
		}
		Thread.sleep(5000);

		try {
			Double max = Double.MIN_VALUE;
			for (int i = 0; i < cp.size(); i++) {
				try {

					String valueString = cp.get(i).getText().replace(",", "");
					Double currentValue = Double.parseDouble(valueString);
					if (currentValue > max) {
						max = currentValue; // Update max if the current value is greater
					}
				} catch (NumberFormatException e) {
					System.err.println("Error parsing value: " + cp.get(i).getText());
					e.printStackTrace();
				}
			}
			System.out.println("The maximum value is: " + max);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(5000);

		driver.close();

	}

}
