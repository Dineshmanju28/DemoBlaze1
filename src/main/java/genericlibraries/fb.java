package genericlibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vanalakshmi");
		driver.findElement(By.id("pass")).sendKeys("anupriya");
		driver.findElement(By.name("login")).click();
	}

}
