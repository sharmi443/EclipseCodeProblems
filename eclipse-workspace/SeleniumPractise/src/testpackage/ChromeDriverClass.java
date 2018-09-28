package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();				
				String baseURL = "http://www.google.com";
				driver.manage().window().maximize();
				driver.get(baseURL);		
				driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
				driver.findElement(By.name("btnK")).click();
			}


	}