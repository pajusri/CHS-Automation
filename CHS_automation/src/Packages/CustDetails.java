package Packages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustDetails {
 public static void enterDetails(String g,WebDriver driver) throws IOException, InterruptedException {
     //This method is used to enter the data of customer to tabs 
	 ArrayList<String> how= Getdata.getData(g);
     System.out.println(how);
     String address=how.get(1);
     String unit=how.get(2);
     String zip=how.get(3);
     String city=how.get(4);
     String state=how.get(5);
     driver.findElement(By.id("address")).sendKeys(address);
	 driver.findElement(By.id("unit")).sendKeys(unit);
	 driver.findElement(By.id("city")).sendKeys(city);
	 WebElement us=driver.findElement(By.id("state"));
	 Select stateChoice=new Select(us);
	 stateChoice.selectByVisibleText(state);
	 driver.findElement(By.id("zip")).sendKeys(zip);
	 driver.findElement(By.id("own")).click(); 
	 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	 driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	 driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div/button[@type='submit']")).click();
	

 }
 public static void webAddress(String g,boolean mdu,WebDriver driver) throws IOException {
	 ArrayList<String> how= Getdata.getData(g);
 System.out.println(how);
 String address=how.get(1);
 String unit=how.get(2);
 String zip=how.get(3);
 String city=how.get(4);
 String state=how.get(5);
 driver.findElement(By.xpath("(//input[@name='header-form_address'])[2]")).sendKeys(address+""+city+""+state+""+zip);
 driver.findElement(By.xpath("(//input[@name='header-form_apartment'])[2]")).sendKeys(unit);
 driver.findElement(By.xpath("(//div/button[.='VIEW PACKAGES'])[2]")).click();
 if(mdu==false) { 
	 driver.findElement(By.xpath("//div/a[.='Yes, this is my home']")).click();
          }
 }
 public static void custInfo(String g,WebDriver driver) throws IOException {
	 ArrayList<String> how= Getdata.getData(g);
     System.out.println(how);
     String first=how.get(6);
     String last=how.get(7);
     String email=how.get(8);
     String phone=how.get(9);
     String ssn=how.get(10);
 	driver.findElement(By.id("firstName")).sendKeys(first);
 	driver.findElement(By.id("lastName")).sendKeys(last);
 	driver.findElement(By.id("emailAddress")).sendKeys(email);
 	driver.findElement(By.id("confirmEmailAddress")).sendKeys(email);
 	driver.findElement(By.id("mobileNumber")).sendKeys(phone);
 	driver.findElement(By.id("confirmMobileNumber")).sendKeys(phone);
 	driver.findElement(By.id("monthToMonthBilling")).click();
 	driver.findElement(By.id("securityCode")).sendKeys(ssn);
 	driver.findElement(By.id("birthDate")).sendKeys("1999-01-01");
 	driver.findElement(By.xpath("//div/button[.='Next ']")).click();
 }
 public static void webCustinfo(String g,WebDriver driver) throws IOException {
	 ArrayList<String> how= Getdata.getData(g);
     System.out.println(how);
     String first=how.get(6);
     String last=how.get(7);
     String email=how.get(8);
     String phone=how.get(9);
     driver.findElement(By.id("firstName")).sendKeys(first);
     driver.findElement(By.id("lastName")).sendKeys(last);
     WebElement day=driver.findElement(By.xpath("(//select)[1]"));
     Select a1=new Select(day);
     a1.selectByVisibleText("8");
     WebElement month=driver.findElement(By.xpath("(//select)[2]"));
     Select b1=new Select(month);
     b1.selectByVisibleText("5");
     driver.findElement(By.id("dobYear")).sendKeys("1999"); 
     driver.findElement(By.id("email")).sendKeys(email);
     driver.findElement(By.id("confirmEmail")).sendKeys(email);
     driver.findElement(By.id("mobileNumber")).sendKeys(phone);
 }
 public static void moveCrmAddress(WebDriver driver,String g) throws IOException, InterruptedException {
	 ArrayList<String> how= Getdata.getData(g);
     System.out.println(how);
     String address=how.get(1);
     String unit=how.get(2);
     String zip=how.get(3);
     String city=how.get(4);
     String state=how.get(5);
     driver.findElement(By.id("address")).sendKeys(address);
	 driver.findElement(By.id("unit")).sendKeys(unit);
	 driver.findElement(By.id("city")).sendKeys(city);
	 WebElement us=driver.findElement(By.id("state"));
	 Select stateChoice=new Select(us);
	 stateChoice.selectByVisibleText(state);
	 driver.findElement(By.id("zip")).sendKeys(zip);
	 driver.findElement(By.id("own")).click(); 
	 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	 driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	 driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div/button[@type='submit']")).click();
	 driver.findElement(By.xpath("//button[.='Yes, Proceed']")).click();
	 
 }
	public static void billingAddressChange(String g,Boolean y,WebDriver driver) throws IOException {
		 ArrayList<String> how= Getdata.getData(g);
	     System.out.println(how);
	     String address=how.get(1);
	     String unit=how.get(2);
	     String zip=how.get(3);
	     String city=how.get(4);
	     String state=how.get(5);
		if(y==true){
			driver.findElement(By.xpath("(//input[@value='Yes'])[1]")).click();
			driver.findElement(By.xpath("//button[.='Ok']")).click();
			driver.findElement(By.id("address")).sendKeys(address);
			driver.findElement(By.id("unit")).sendKeys(unit);
			driver.findElement(By.id("city")).sendKeys(city);
			driver.findElement(By.id("state")).sendKeys(state);
			driver.findElement(By.id("zip")).sendKeys(zip);
			driver.findElement(By.xpath("//button[.='Submit']")).click();
			}
		else {
			driver.findElement(By.xpath("(//input[@value='No'])[1]")).click();
			driver.findElement(By.xpath("//button[.='Ok']")).click();
		}
	}

}
