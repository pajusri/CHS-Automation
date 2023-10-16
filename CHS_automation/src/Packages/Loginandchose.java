package Packages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginandchose {
	public static WebDriver driver() {
		//This method is used to initialize the browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();	
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		return driver;
	}
	public static WebDriver Login() {
		//This method is used to login into FIBER POS
		WebDriver driver = driver();
		driver.get("https://testappa.cspire.net/fiberpos/#/login");
		driver.findElement(By.id("username")).sendKeys("ipsx");
		driver.findElement(By.id("password")).sendKeys("ipsx");
		driver.findElement(By.className("btn-primary")).click();
		return driver;	
	}
	public static WebDriver Weblogin() {
		WebDriver driver = driver();
		driver.get("https://test-www.cspire.com/web/main?adobe_mc_sdid=SDID%3D705886AED5C1E4BF-292361B6D61A22E8%7CMCORGID%3D85279F01585CF4FA0A495CC3%40AdobeOrg%7CTS%3D1692892705");
		driver.findElement(By.xpath("(//a/img[@class='cmp-image__image'])[3]")).click();
		return driver;	
	}
	public static void salesforceLogin(WebDriver driver) throws InterruptedException {
		 driver.get("https://cspire--testfull.sandbox.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fcspire--testfull.sandbox.lightning.force.com%252Flightning%252Fr%252FServiceAppointment%252F08p77000000DV0fAAG%252Fview");
		 driver.findElement(By.cssSelector("div[id='idp_section_buttons'] button[class='button mb12 secondary wide']")).click();
		 driver.findElement(By.id("i0116")).sendKeys("prajwals@cscontract.com");
		 driver.findElement(By.id("idSIButton9")).click();
		 driver.findElement(By.id("i0118")).sendKeys("Maddur@123");
		 Thread.sleep(8000);  
		 driver.findElement(By.id("idSIButton9")).click();
		 Thread.sleep(8000);
		 driver.findElement(By.id("idSIButton9")).click();
	}
    public static void createCustomer(boolean mdu,boolean override,String g,WebDriver driver) throws IOException, InterruptedException {
    	//This method is used to chose customer creation tab
   	 driver.findElement(By.xpath("(//img[@class='landing-img'])[2]")).click();
    	CustDetails.enterDetails(g,driver);
    	if(override==false&&mdu==false) {
    		 Thread.sleep(2500);
    		 driver.findElement(By.xpath("//div/button[.='Yes, Proceed']")).click();
    		 driver.findElement(By.xpath("//div/button[.='Register For Service']")).click();
    	}
    	else if(override==true&&mdu==false)
    	{
    		 Thread.sleep(2500);
    		 driver.findElement(By.xpath("//div/button[.='Yes, Proceed']")).click();
    		driver.findElement(By.xpath("//li/button[.='Override']")).click();
    		driver.findElement(By.xpath("//div/label[.=' Blue Fiberhood']")).click();
    		driver.findElement(By.xpath("(//a[.='Madison'])[1]")).click();
    	}
    	
    }
    public static void searchCustomer(String s,WebDriver driver) throws IOException {
    	//Used to search the customer
    	 ArrayList<String> acc=Getdata.getAccounts(s);
    	 String Account=acc.get(1);
    	driver.findElement(By.xpath("(//img[@class='landing-img'])[1]")).click();
    	driver.findElement(By.id("accountNumber")).sendKeys(Account);
    	driver.findElement(By.xpath("//div/button[.='Search']")).click();   	
    }
    public static void subActions(String action,String index,WebDriver driver) throws IOException {
    	//used to search the desired Subscription
    	ArrayList<String>ar=Getdata.getAccounts(index);
    	String address=ar.get(2);
    	String Xpaths="(//div[contains(., '"+address+"')]/following-sibling::div//button)[1]";
    	driver.findElement(By.xpath(Xpaths)).click();
    	String xpath="//ul/li[.='"+action+"']";
    	driver.findElement(By.xpath(xpath)).click();
    }
}
