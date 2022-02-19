import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
	WebDriver driver;

	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M. Fuhad\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.experss.com/");
List<WebElement> ele =driver.findElements(By.xpath("sdlnvfjkghkfjh"));
	for (int i=1; i<ele.size(); i++);{
	String mofis=driver.findElement(By.xpath("ashkcb")).getText();
	if (!mofis.equals("Shop Now"));
	driver.findElement(By.xpath("hjvbhjbvhjsbvshbv"));
	driver.navigate().back();
	}else{
		continue;
		
	}
	
	
		
	}

	public void getproduct(WebElement ele,) {
		
	//List<webelement>=ele1 driver.findElements(By.xpath("nlvdjnvsnvjsdvn"));
	 
	for(i=1; i<ele1.size();i++) {
		driver.findElement(By.xpath("jvfjvhfehvjefkjhvr")).click();
		List<WebElement> eles=driver.findElements(By.xpath("ahjgdugfeud"));
		
		for(j=1;	j<eles.size(); j++ ) {
		driver.findElement(By.xpath("hjc jhdsvb")).click();
		driver.navigate().back();
			
		}
		
		}
	}

}
