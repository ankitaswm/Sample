import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {

	public static final String ID_CREATE_ACCOUNT = "register";
	public static final String LABEL_INFORMATION = "Personal Information";
	
	
	public static void ClickOnLink(WebDriver driver, String value)
	{
		driver.findElement(By.id(value)).click();
	}
	
	public static void main(String[] args) {
		
	}

}
