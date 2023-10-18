package Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Packages.CustDetails;
import Packages.Efeatures;
import Packages.Loginandchose;
import Packages.Submitorder;
import Packages.features;

public class testr extends Loginandchose{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//Create an gigfiber customer in crm
		 WebDriver driver=Login();
		 createCustomer(false,false,"A8",driver);
		 features.GigFiber(driver);
		 Efeatures.smartWifi(0, false, driver);
		 CustDetails.custInfo("A8", driver);
		 Submitorder.submit(driver);

	}

}
