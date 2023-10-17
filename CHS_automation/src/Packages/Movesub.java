package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Movesub {
	public static void moveSub(String date,String time,WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("desiredDisconnectDate")).sendKeys(date);
		driver.findElement(By.id("time")).sendKeys(time);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button)[9]")).click();
	}
   public static void moveSubpack(boolean change,boolean wifi,String choise,WebDriver driver) throws InterruptedException {
	   if(change==true) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span/a[.='Change Packages']")).click();
	        String xpath="//span[.='"+choise+"']";
	        driver.findElement(By.xpath(xpath)).click();
	        driver.findElement(By.xpath("//button[.='Next']")).click();
			driver.findElement(By.xpath("//span/input[@name='discussedProtectionCustomer']")).click();
			driver.findElement(By.xpath("//span/button[.='Next']")).click();
	   }
	   else {
		   driver.findElement(By.xpath("//span/input[@name='discussedProtectionCustomer']")).click();
			driver.findElement(By.xpath("//span/button[.='Next']")).click();
			if(wifi==true) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[.='Next']")).click();
			}
	   }
		driver.findElement(By.xpath("//div/button[.='Submit Order']")).click();
		driver.findElement(By.xpath("//div/input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//div/button[.='Place Order']")).click();
		Thread.sleep(1000);
    	driver.findElement(By.id("selectedTime")).click();
    	driver.findElement(By.xpath("//div[.=' Submit ']")).click();
   }

}
