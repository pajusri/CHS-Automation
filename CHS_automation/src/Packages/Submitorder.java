package Packages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Submitorder {
	public static void submit(WebDriver driver) throws InterruptedException {
    	Thread.sleep(10000);
    	driver.findElement(By.xpath("//div/button[.='Submit Order']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div/input[@type='checkbox']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div/button[.=' Place Order ']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div/button[.=' NO']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.id("selectedTime")).click();
    	driver.findElement(By.xpath("//div[.=' Submit ']")).click();
	}
public static void webSubmit(WebDriver driver,String g) throws InterruptedException, IOException {
	 ArrayList<String> how= Getdata.getData(g);
     System.out.println(how);
     String ssn=how.get(10);
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div/p[.='I accept the Terms and Conditions']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div/button[.='CONTINUE TO REVIEW']")).click();
    Thread.sleep(2000);
  // driver.findElement(By.id("ssn")).sendKeys(ssn);
  //  driver.findElement(By.xpath("//div/button[.='CONTINUE TO REVIEW']")).click();
  //  Thread.sleep(2000);
  System.out.println(driver.findElement(By.xpath("//div[@class='fiber-info']")).getText());
  Thread.sleep(2000);
  driver.findElement(By.xpath("//div//button[.=' Submit Your Order ']")).click();
  Thread.sleep(5000);
  driver.findElement(By.xpath("//div/button[.=' SCHEDULE APPOINTMENT ']")).click();
  Thread.sleep(5000);
  System.out.println(driver.findElement(By.xpath("//div[@class='sub-heading-text']")).getText());
    
}
}
