package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipKartLogin {

	public static void main(String[] args) {
		//Launch the browser
        EdgeDriver driver=new EdgeDriver();
		
		//Load the url.get
		driver.get("https://www.flipkart.com/");
		
		//maximize the brpwers
		driver.manage().window().maximize();
		
		//Search mobile in search field
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watches",Keys.ENTER);
      

	}

}
