package Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Packages.CustDetails;
import Packages.Loginandchose;
import Packages.Movesub;

public class Movetest extends Loginandchose {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=Login();
		searchCustomer("A4", driver);
		subActions("Move Subscription","A4",driver);
		Movesub.moveSub("18-10-2023","12:00", driver);
		CustDetails.moveCrmAddress(driver,"A3");
		CustDetails.billingAddressChange("A3",true, driver);
		Movesub.moveSubpack(false,true, null, driver);

	}

}
