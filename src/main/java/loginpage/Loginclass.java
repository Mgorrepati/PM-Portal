package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginclass {

	
	@Test
	
	public void login() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\eclipse-workspace\\Page\\Drivers\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://pm.sageit.co/login?back_url=https%3A%2F%2Fpm.sageit.co%2F");
		Driver.findElement(By.id("username")).sendKeys("Mgorrepati@sageit.in");
		Driver.findElement(By.id("password")).sendKeys("G@9494901278");
		Driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/input[4]")).click();
		
		Driver.findElement(By.xpath("//a[text()='Shortcuts']")).click();
		Driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div[1]/ul/li[1]/a")).click();
		Driver.findElement(By.xpath("//a[text()='Change password']")).click();
		

	}

}
