package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Packages.Loginandchose;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=Loginandchose.driver();
         Loginandchose.salesforceLogin(driver);
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("//a[.='Service Appointments']")).click();
		 driver.findElement(By.xpath("//span[.='All Service Appointments']")).click();
		 driver.findElement(By.id("input-114")).sendKeys("SA-133008");

	}

}
