package utilis;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Allfunctionutility {
	
	public WebDriver driver;
	public Allfunctionutility(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	public void explicitwait(WebElement e, int i) {
		WebDriverWait wait = new WebDriverWait(driver,i);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	public  String getwindowhandlechild() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		return childwindow;

	}

	public  String getwindowhandleparent() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(parentwindow);
		return parentwindow;

	}
	
	
	
	
	
	}
	
	
	


