package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Packages.CustDetails;
import Packages.Efeatures;
import Packages.Loginandchose;
import Packages.Submitorder;
import Packages.features;

public class Createcustcrm extends Loginandchose{

	
    @Test
	public static void gigTv() throws IOException, InterruptedException {
		 WebDriver driver=Login();
	        System.out.println(driver.getTitle());
	        createCustomer(false,false,"A5",driver);
	        features.GigFiberTv(0,"standerd", driver);
	        Efeatures.smartWifi(8, true, driver);
	        CustDetails.custInfo("",driver);
	        Submitorder.submit(driver);
			 Thread.sleep(23000);
			 String pack=driver.findElement(By.xpath("(//tr/td)[2]")).getText();
			 Assert.assertEquals(pack,"INTERNET_TV2_PLAN");
			 System.out.println(driver.findElement(By.xpath("//span[@class='col-sm-9']")).getText());
	}
    @Test
    public static void Mdu() throws IOException, InterruptedException {
    	// TODO Auto-generated method stub
        WebDriver driver=Login();
        createCustomer(true,false,"A7",driver);
        features.MDU("50","Plus", driver);
        CustDetails.custInfo("A7",driver);
        Submitorder.submit(driver);
		 Thread.sleep(23000);
		// String pack=driver.findElement(By.xpath("(//tr/td)[2]")).getText();
		 //Assert.assertEquals(pack,"INTERNET_TV2_PLAN");
		 System.out.println(driver.findElement(By.xpath("(//div)[20]")).getText());

		 System.out.println(driver.findElement(By.xpath("//span[@class='col-sm-9']")).getText());
    }

	
	
}
