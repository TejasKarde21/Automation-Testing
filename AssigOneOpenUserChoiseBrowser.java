	package Assigments;
	
	import java.util.Scanner;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	
	public class AssigOneOpenUserChoiseBrowser {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			 Scanner sc = new Scanner(System.in);
	
		        System.out.print("Enter the Browser name you want to open :- 1. Chrome 2. Edge ");
		        System.out.println("Enter the Choice :- "); 
		        int optionBrowser = sc.nextInt();
		        
		        if(optionBrowser == 1) {
		        	WebDriver driver = new ChromeDriver();
		        	 driver.manage().window().maximize();
		    		driver.get("https://www.google.co.in/");
		          driver.close();
		        }
		        else if(optionBrowser == 2) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
		    		driver.get("https://www.google.co.in/");
		    		
		    		 Thread.sleep(20000);
		    		
		          driver.close();
		        }
	
		       
	           
		}
	
	}
