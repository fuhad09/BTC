import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForLoop {
	WebDriver driver;
	public void getProduct(List<WebElement> eles, WebDriver driver, List<WebElement> ele2) {
		for (int i = 1; i <= eles.size(); i++) {
			WebElement ele = eles.get(i);
			ele.click();
			driver.navigate().back();
			
			
			for(j=1;j<ele2.size();j++) {
			WebElement moga =ele2.get(j);
			moga.click();
				
			}

		}

	}

	
	public void testOne() {
		//getProduct(driver.findElements(By.tagName("a")), driver, null);
	}
	
	public void playWithString () {
		String cow="how are you";
		cow.charAt(0);
		"cow".compareTo("dog");

	}
}
