import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://account.magento.com/customer/account/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);
		Button btn = new Button();
		btn.ClickOnLink(driver, btn.ID_CREATE_ACCOUNT);
		
	}

}
