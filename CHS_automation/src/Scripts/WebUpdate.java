package Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Packages.Loginandchose;
import Packages.features;

public class WebUpdate extends Loginandchose {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 WebDriver driver = Weblogin();
		 webSignIn("A5",driver);
		 features.WebUpdate(driver,"1000", null);
	}

}
