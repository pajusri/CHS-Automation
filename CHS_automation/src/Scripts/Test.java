package Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Packages.CustDetails;
import Packages.Efeatures;
import Packages.Loginandchose;
import Packages.Movesub;
import Packages.Submitorder;
import Packages.Updatesub;
import Packages.features;

public class Test extends Loginandchose {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = Weblogin();
		 CustDetails.webAddress("A3",false, driver);
		 features.WebInt(driver,"500");
		 Efeatures.WebsWifi(driver,false,false,"2");
		 Efeatures.WebsTv(driver, false, null);
		 Efeatures.WebsPhone(driver, false, false);
		 Efeatures.Websfprotect(driver, false);
		 CustDetails.webCustinfo("A4", driver);
		 Submitorder.webSubmit(driver,"A4");
		 logoutClose(driver);
	}

}
//		 driver.findElement(By.xpath("//span[.='All Service Appointments']")).click();
//driver.findElement(By.xpath(null)).sendKeys("SA-133008");
