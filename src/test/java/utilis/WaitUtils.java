package utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	
	
	
	public static void explicitwait(WebDriver driver,WebElement e, int i) {
		WebDriverWait wait = new WebDriverWait(driver,i);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

}
