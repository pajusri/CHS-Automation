package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Movesub {
	public static void moveSub(String date,String time,WebDriver driver) {
		driver.findElement(By.id("desiredDisconnectDate")).sendKeys(date);
		driver.findElement(By.id("time")).sendKeys(time);
		driver.findElement(By.xpath("(//button)[9]")).click();
	}
  

}
