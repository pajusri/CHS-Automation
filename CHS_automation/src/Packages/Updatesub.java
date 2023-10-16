package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Updatesub {
	public static void changePackage(String choise,WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span/a[.='Change Packages']")).click();
        String xpath="//span[.='"+choise+"']";
        driver.findElement(By.xpath(xpath)).click();
        
	}
	public static void disConectServicePop(String reason,WebDriver driver) {
		driver.findElement(By.xpath("//div/span[.='Please select a reason']")).click();
		String xpath="//li/a[.='"+reason+"']";
		driver.findElement(By.xpath(xpath)).click();
		driver.findElement(By.id("removalComment")).sendKeys("test");
		driver.findElement(By.xpath("//button[.='Submit For Removal']")).click();
	}
	public static void twoSteps(WebDriver driver) {
		driver.findElement(By.xpath("//button[.='Next']")).click();
		driver.findElement(By.xpath("//span/input[@name='discussedProtectionCustomer']")).click();
		driver.findElement(By.xpath("//span/button[.='Next']")).click();
	}
	public static void completeUpdate(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//div/button[.='Submit Order']")).click();
		driver.findElement(By.xpath("//div/input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//div/button[.='Place Order']")).click();
	}
	public static void completeUpdateApoint(WebDriver driver) throws InterruptedException {

    	driver.findElement(By.xpath("//div/button[.='Submit Order']")).click();
    	driver.findElement(By.xpath("//div/input[@type='checkbox']")).click();
    	driver.findElement(By.xpath("//div/button[.='Place Order']")).click();
    	driver.findElement(By.id("selectedTime")).click();
    	driver.findElement(By.xpath("//div[.=' Submit ']")).click();
	}
	public static void zyxelWifi(WebDriver driver) {
		driver.findElement(By.xpath("//span[.='C Spire WiFi Gateway']")).click();
	}
	public static void smartWifi(WebDriver driver) {
		driver.findElement(By.xpath("//span[.='Smart WiFi 6']")).click();
	}
	public static void equipReturn(int no,WebDriver driver) {
		//this method is used to handle return equipment pop up
		String str="(//div/input[@type='radio'])["+no+"]";
		driver.findElement(By.xpath(str)).click();
		driver.findElement(By.xpath("(//button[.='Next'])[3]")).click();
		
	}
	

}
