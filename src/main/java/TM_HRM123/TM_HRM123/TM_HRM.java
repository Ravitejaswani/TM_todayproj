package TM_HRM123.TM_HRM123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TM_HRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
		  driver.get("http://testingmasters.com/hrm");
	}

}
