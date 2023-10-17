package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Efeatures {
    public static void economyTv(int number,WebDriver driver) {
    	//This method is used to chose TV package.
    	driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    	driver.findElement(By.xpath("//div/input[contains(@value,'Economy TV Package')]"));
    	for(int i=0;i<number-1;i++) {
    		System.out.println(i);
    	driver.findElement(By.xpath("//div/button[@class='col-xs-12 col-sm-6 pl-2']")).click();
    	}
    }
    public static void standardTv(int number,WebDriver driver) {
    	//This method is used to chose TV package.
    	driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    	driver.findElement(By.xpath("//div/input[contains(@value,'Standard TV Package')]")).click();
    	for(int i=0;i<number-1;i++) {
    	driver.findElement(By.xpath("//div/button[@class='col-xs-12 col-sm-6 pl-2']")).click();
    	}    
    }
    public static void expandedTv(int number,WebDriver driver) {
    	//This method is used to chose TV package.
    	driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    	driver.findElement(By.xpath("//div/input[contains(@value,'Expanded TV Package')]")).click();
    	for(int i=0;i<number-1;i++) {
    	driver.findElement(By.xpath("//div/button[@class='col-xs-12 col-sm-6 pl-2']")).click();
    	}
    }
    public static void fiberProtection(WebDriver driver) {
    	//Use this method to choose protection plan
    	driver.findElement(By.id("standerd")).click();
    }    
    public static void smartWifi(int num,Boolean r,WebDriver driver) {
    	//Use this method to chose Smart WIFI we can use this to update also
    	if(r==false) {
    		driver.findElement(By.xpath("//input[@name='discussedProtectionCustomer']")).click();
        	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    	}
    	driver.findElement(By.xpath("//div/input[@value='Smart WiFi 6']")).click();
    	driver.findElement(By.xpath("//input[@name='discussedProtectionCustomer']")).click();
    	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    	if(num>0&&num<=3){
    		driver.findElement(By.xpath("//div/button[.='Next']")).click();
    	}
    	else if(num==4) {
    		driver.findElement(By.xpath("(//span/input[@class='radio-btn'])[2]")).click();
    		driver.findElement(By.xpath("//div/button[.='Next']")).click();
    	}
    	else if(num==5) {
    		driver.findElement(By.xpath("(//span/input[@class='radio-btn'])[3]")).click();
    		driver.findElement(By.xpath("//div/button[.='Next']")).click();
    	}
    	else if(num>=6) {
    		driver.findElement(By.xpath("(//span/input[@class='radio-btn'])[4]")).click();
    		driver.findElement(By.xpath("//div/button[.='Next']")).click();
    	}
    }    
    public static void newPhone(WebDriver driver) {
    	driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    	driver.findElement(By.xpath("//label[.='Get a New Number']")).click();
   	    WebElement us=driver.findElement(By.id("state"));
   	    Select city=new Select(us);
   	    city.selectByVisibleText(" BRANDON-MS");
   	    driver.findElement(By.id("callerId")).sendKeys("poiuy");
   	    driver.findElement(By.id("directoryNametxt")).sendKeys("po9i8u");
   	 
    }   
    public static void phoneTv(WebDriver driver) {
        driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[2]")).click();
     	driver.findElement(By.xpath("//label[.='Get a New Number']")).click();
        WebElement us=driver.findElement(By.id("state"));
        Select city=new Select(us);
        city.selectByVisibleText(" BRANDON-MS");
        driver.findElement(By.id("callerId")).sendKeys("poiuy");
        driver.findElement(By.id("directoryNametxt")).sendKeys("po9i8u");
      	 
    }
    public static void WebsWifi(WebDriver driver,boolean a,boolean b,String no) throws InterruptedException {
    	//This method use to add wifi in web
    	Thread.sleep(2000);
    	if(a==false) {
    	driver.findElement(By.xpath("(//div/span[@class='useOwnRouterButton'])[2]")).click();
    	driver.findElement(By.id("noRouterClickedGlassbox")).click();
    	}
    	else {
    		if(b==true) {
    			String xpath="(//div[@class='bedroom-label'])["+"no"+"]";
    	    	driver.findElement(By.xpath(xpath)).click();
    	    	driver.findElement(By.xpath("(//button[.='CONTINUE'])[1]")).click();
    		}
    		else {
    	driver.findElement(By.xpath("(//div/button[.='Add C Spire Smart WiFi 6 '])[1]")).click();
    	String xpath="(//div[@class='bedroom-label'])["+"no"+"]";
    	driver.findElement(By.xpath(xpath)).click();
    	driver.findElement(By.xpath("(//button[.='CONTINUE'])[1]")).click();
    		}
    	}
    }
    public static void WebsTv(WebDriver driver,boolean a,String tv) {
    	if(a==false) {
    	 driver.findElement(By.xpath("(//div/button[.=' I DO NOT WANT TV '])[2]")).click();
    	}
    	else {
    	 if(tv=="economy") {
    	 driver.findElement(By.id("(//div/button[.=' ADD TO CART '])[1]")).click();
    	 }
    	 else if(tv=="standerd") {
    	 driver.findElement(By.id("(//div/button[.=' ADD TO CART '])[2]")).click();
    	 }
    	 else if(tv=="expanded") {
        	 driver.findElement(By.id("(//div/button[.=' ADD TO CART '])[3]")).click();
        	 }
    	 driver.findElement(By.xpath("(//button[.=' I DO NOT WANT PREMIUM CHANNELS '])[2]")).click();
    	 driver.findElement(By.xpath("//button[.='CONTINUE']")).click();
    	}
    }
    public static void WebMduTv(WebDriver driver,boolean tv,String type) {
    	if(tv==false) {
       	 driver.findElement(By.xpath("(//div/button[.=' I DO NOT WANT TV '])[2]")).click();
    	}
    	else {
    		if(type=="BASIC") {
    			driver.findElement(By.xpath("(//button[.=' ADD TO CART '])[1]")).click();
    			driver.findElement(By.xpath("//div/button[.=' NO, I DO NOT WANT TO UPGRADE ']")).click();
    		}
    		else if(type=="PLUS") {
    			driver.findElement(By.xpath("(//button[.=' ADD TO CART '])[2]")).click();
    			driver.findElement(By.xpath("(//div/button[.=' I DO NOT WANT PREMIUM CHANNELS '])[2]")).click();
    			driver.findElement(By.xpath("//div/button[.=' NO, I DO NOT WANT TO UPGRADE ']")).click();
    			driver.findElement(By.xpath("//span[.='NO, I DO NOT WANT ANY ADDITIONAL SET-TOP BOXES']")).click();
    		}
    		else if(type=="PREMIER") {
    			driver.findElement(By.xpath("(//button[.=' ADD TO CART '])[3]")).click();
    			driver.findElement(By.xpath("(//div/button[.=' I DO NOT WANT PREMIUM CHANNELS '])[2]")).click();
    			driver.findElement(By.xpath("//div/button[.=' NO, I DO NOT WANT TO UPGRADE ']")).click();
    			driver.findElement(By.xpath("//span[.='NO, I DO NOT WANT ANY ADDITIONAL SET-TOP BOXES']")).click();
    		}
    	}
    }
    public static void WebsPhone(WebDriver driver,boolean a,boolean pnew) {
    	if(a==false) {
    	     driver.findElement(By.xpath("//div[@class='center-mobile no-router-text']//span[contains(text(),'I do not want Home Phone')]")).click();
    	}
    	else {
    		driver.findElement(By.xpath("(//button[.=' ADD HOME PHONE '])[1]")).click();
    		if(pnew==false) {
    		driver.findElement(By.id("transfer-number-card")).click();
    		driver.findElement(By.id("current-number")).sendKeys("");
    		driver.findElement(By.id("transfernumber-callerid")).sendKeys("");
    		 WebElement us=driver.findElement(By.id("current-provider"));
    		 Select providerChoice=new Select(us);
    		 providerChoice.selectByVisibleText("");
    		 driver.findElement(By.id("transfernumber-submit")).click();
    		 driver.findElement(By.id("//button[.='SUBMIT']")).click();
    		}
    		else if(pnew==true) {
    		driver.findElement(By.id("new-number-card")).click();
    		driver.findElement(By.id("newnumber-callerid")).click();
      		 WebElement us=driver.findElement(By.id("newnumber-city"));
    		 Select providerChoice=new Select(us);
    		 providerChoice.selectByVisibleText("");
    		 driver.findElement(By.id("newnumber-submit")).click();
    		 driver.findElement(By.id("//button[.='SUBMIT']")).click();
    		}
    	}
    }
    public static void Websfprotect(WebDriver driver,boolean d) throws InterruptedException {
    	Thread.sleep(2000);
    	if(d==true) {
    	driver.findElement(By.xpath("(//button[.=' ADD FIBER PROTECTION '])[1]")).click();
    }
    	else {
    		 driver.findElement(By.xpath("(//div/button[.=' I DO NOT WANT FIBER PROTECTION '])[2]")).click();
    	     driver.findElement(By.xpath("//div/button[.=' NO, THANK YOU ']")).click();
    	}
    }
}
