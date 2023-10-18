package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class features {
	 public static void Fiber300(WebDriver driver){}
	 public static void Fiber300Tv(int number,String pack,WebDriver driver){}
	 public static void Fiber300phone(WebDriver driver) {}
	 public static void Fiber300TVPhone(int number,String pack,WebDriver driver){
	 }
	 public static void GigFiber(WebDriver driver){
		  driver.findElement(By.xpath("//label[.=' Fiber 1 Gig ']")).click();
		  driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
	 }
	 public static void GigFiberTv(int number,String pack,WebDriver driver){
		driver.findElement(By.xpath("//label[.=' Fiber 1 Gig + C Spire TV ']")).click();
	   	driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
	   	if(pack=="economy") {
	   		Efeatures.economyTv(number,driver);
	   	}
	   	else if(pack=="standerd") {
	   		Efeatures.standardTv(number, driver);
	   	}
	   	else if(pack=="expanded") {
	   		Efeatures.expandedTv(number, driver);
	   	}
	 }
	 public static void GigFiberPhone(WebDriver driver) {
		 driver.findElement(By.xpath("//label[.=' Fiber 1 Gig + Home Phone ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
		 Efeatures.newPhone(driver);
	 }
	 public static void GigFiberTVPhone(int number,String pack,WebDriver driver){
		driver.findElement(By.xpath("//label[.=' Fiber 1 Gig + C Spire TV + Home Phone ']")).click();
		driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
		if(pack=="economy") {
	   		Efeatures.economyTv(number,driver);
	   	}
	   	else if(pack=="standerd") {
	   		Efeatures.standardTv(number, driver);
	   	}
	   	else if(pack=="expanded") {
	   		Efeatures.expandedTv(number, driver);
	   	}
		 Efeatures.phoneTv(driver);

	 }
	 public static void Int2000(WebDriver driver) {
		 driver.findElement(By.xpath("//label[.=' Fiber 2 Gig ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
	 }
	 public static void Int2000Tv(int number,String pack,WebDriver driver){
		 driver.findElement(By.xpath("//label[.=' Fiber 2 Gig + C Spire TV ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
			if(pack=="economy") {
		   		Efeatures.economyTv(number,driver);
		   	}
		   	else if(pack=="standerd") {
		   		Efeatures.standardTv(number, driver);
		   	}
		   	else if(pack=="expanded") {
		   		Efeatures.expandedTv(number, driver);
		   	}
	 }
	 public static void Int2000FiberPhone(WebDriver driver) {
		 driver.findElement(By.xpath("//label[.=' Fiber 2 Gig + Home Phone ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
		 Efeatures.newPhone(driver);

	 }
	 public static void Int2000TVPhone(int number,String pack,WebDriver driver){
		 driver.findElement(By.xpath("//label[.=' Fiber 2 Gig + C Spire TV + Home Phone ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
		 if(pack=="economy") {
		   		Efeatures.economyTv(number,driver);
		   	}
		   	else if(pack=="standerd") {
		   		Efeatures.standardTv(number, driver);
		   	}
		   	else if(pack=="expanded") {
		   		Efeatures.expandedTv(number, driver);
		   	}
		 Efeatures.phoneTv(driver);
	 }
	 public static void Int5000(WebDriver driver) {
		driver.findElement(By.xpath("//label[.=' Fiber 5 Gig ']")).click();
	   	driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
	 }
	 public static void Int5000Tv(int number,String pack,WebDriver driver){
		 driver.findElement(By.xpath("//label[.=' Fiber 5 Gig + C Spire TV ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
			if(pack=="economy") {
		   		Efeatures.economyTv(number,driver);
		   	}
		   	else if(pack=="standerd") {
		   		Efeatures.standardTv(number, driver);
		   	}
		   	else if(pack=="expanded") {
		   		Efeatures.expandedTv(number, driver);
		   	}
	 }
	 public static void Int5000Phone(WebDriver driver) {
		 driver.findElement(By.xpath("//label[.=' Fiber 5 Gig + Home Phone ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
		 Efeatures.newPhone(driver);

	 }
	 public static void Int5000TVPhone(int number,String pack,WebDriver driver){
		 driver.findElement(By.xpath("//label[.=' Fiber 5 Gig + C Spire TV + Home Phone ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
		 if(pack=="economy") {
		   		Efeatures.economyTv(number,driver);
		   	}
		   	else if(pack=="standerd") {
		   		Efeatures.standardTv(number, driver);
		   	}
		   	else if(pack=="expanded") {
		   		Efeatures.expandedTv(number, driver);
		   	}
		 Efeatures.phoneTv(driver);

	 }
	 public static void Int8000(WebDriver driver) {
		 driver.findElement(By.xpath("//label[.=' Fiber 8 Gig ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
	 }
	 public static void Int8000Tv(int number,String pack,WebDriver driver){
		 driver.findElement(By.xpath("//label[.=' Fiber 8 Gig + C Spire TV ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
			if(pack=="economy") {
		   		Efeatures.economyTv(number,driver);
		   	}
		   	else if(pack=="standerd") {
		   		Efeatures.standardTv(number, driver);
		   	}
		   	else if(pack=="expanded") {
		   		Efeatures.expandedTv(number, driver);
		   	}
	 }
	 public static void Int8000Phone(WebDriver driver) {
		 driver.findElement(By.xpath("//label[.=' Fiber 8 Gig + Home Phone ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
		 Efeatures.newPhone(driver);

	 }
	 public static void Int8000TVPhone(int number,String pack,WebDriver driver){
		 driver.findElement(By.xpath("//label[.=' Fiber 8 Gig + C Spire TV + Home Phone ']")).click();
		 driver.findElement(By.xpath("//div/button[@type='submit']")).click(); 
		 if(pack=="economy") {
		   		Efeatures.economyTv(number,driver);
		   	}
		   	else if(pack=="standerd") {
		   		Efeatures.standardTv(number, driver);
		   	}
		   	else if(pack=="expanded") {
		   		Efeatures.expandedTv(number, driver);
		   	}
		 Efeatures.phoneTv(driver);

	 }
     public static void MDU(String internet,String tv,WebDriver driver) {
    	 if(internet=="50"&&tv=="Plus") {
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[1]")).click();
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[3]")).click();
    	 }
    	 else if(internet=="250"&&tv=="Plus") {
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[2]")).click();
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[3]")).click();
    	 }
    	 else if(internet=="50"&&tv=="Premier") {
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[1]")).click();
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[4]")).click();
    	 }
    	 else if(internet=="250"&&tv=="Premier") {
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[2]")).click();
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[4]")).click();
    	 }
    	 else if(internet=="50"&&tv=="Basic") {
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[1]")).click();
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[5]")).click();
    	 }
    	 else if(internet=="250"&&tv=="Basic") {
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[2]")).click();
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[5]")).click();
    	 }
    	 else if(internet=="50"&&tv=="none") {
    		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
    		 driver.findElement(By.xpath("(//div/input)[1]")).click();
    	 }
    	 else if(internet=="250"&&tv=="none") {  		
        		 driver.findElement(By.xpath("(//*[@data-icon='plus-circle'])[1]")).click();
        		 driver.findElement(By.xpath("(//div/input)[2]")).click();	 
    	 }
    	 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    	 
     }
     public static void WebInt(WebDriver driver,String speed) {
    	 //speed 300,500,1_Gig,2_Gig,5_Gig,8_Gig
    	 String id="add-to-cart-button-Fiber_"+speed;
         driver.findElement(By.id(id)).click();
         driver.findElement(By.xpath("//div/button[.='NEW CUSTOMER']")).click();
    	      
     }
     public static void WebMdu(WebDriver driver,String speed) {
    	 //speed 50,250
    	 String id="add-to-cart-button-Managed_WiFi_"+speed;
    	 driver.findElement(By.id(id)).click();
         driver.findElement(By.xpath("//div/button[.='NEW CUSTOMER']")).click();
     }
     public static void WebUpdate(WebDriver driver,String pack) throws InterruptedException {
    	 
    	 driver.findElement(By.xpath("//span[.='Manage Service']")).click();
    	 driver.findElement(By.xpath("(//a[.='Modify'])[1]")).click();
    	 Thread.sleep(2500);
    	 driver.findElement(By.xpath("//div[@data-ng-if='FiberPackages1000.length > 0']")).click();
     }

}
