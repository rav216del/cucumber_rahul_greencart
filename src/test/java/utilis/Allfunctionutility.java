package utilis;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

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
	public List<String> handlingMapDataTable(DataTable data) {
		List<Map<String, String>> multipleData = data.asMaps();
		List<String> itemAddedToList = new ArrayList<String>();
		Iterator<Map<String, String>> multiData = multipleData.iterator();
		while (multiData.hasNext()) {
			Map<String, String> datas = multiData.next();
			Iterator<Entry<String, String>> itr_entry = datas.entrySet().iterator();
			while (itr_entry.hasNext()) {
				Entry<String, String> entry = itr_entry.next();
				//System.out.println(entry.getValue());
				//System.out.println("For the Key: " + entry.getKey() + ",The value is: " + entry.getValue());
				itemAddedToList.add(entry.getValue());
			}
		}
		return itemAddedToList;

	}
	public List<String> handlingListDataTable(DataTable data) {
		List<List<String>> multipleItem = data.asLists();
		List<String> compareItemToList = new ArrayList<String>();
		Iterator<List<String>> multidata = multipleItem.iterator();
		while (multidata.hasNext()) {
			List<String> multisData = multidata.next();
			Iterator<String> multData = multisData.iterator();
			while (multData.hasNext()) {
				String product = multData.next();
				System.out.println(product);
				compareItemToList.add(product);
				}
			}
		return compareItemToList;
	}
	public List<String> handlingValuesDataTable(DataTable data) {
		List<String> multipleItem = data.values();
		List<String> compareItemToList = new ArrayList<String>();
		Iterator<String> multidata = multipleItem.iterator();
		while (multidata.hasNext()) {
				String product = multidata.next();
				System.out.println(product);
				compareItemToList.add(product);
				}
			
		return compareItemToList;
	}
	
	
	
}
	
	
	
	


