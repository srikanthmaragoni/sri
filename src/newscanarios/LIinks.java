package newscanarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIinks {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*List<WebElement> demovar = driver.findElements(By.tagName("a"));
        System.out.println(demovar.size());

        for (WebElement var : demovar) {
            System.out.println(var.getText()); // used to get text present between the anchor tags
            System.out.println(var.getAttribute("href"));
        }

        for (WebElement var : demovar) {
            var.click();
	}
*/



/*wd.get("https://www.google.com");//open google
WebElement elem = wd.findElement(By.name("q"));
elem.sendKeys(new String[]{"your keyword"}); 
elem.submit();
By.tagName("div");
By.className("r");
wd.findElement(By.partialLinkText("https://www.yourdesiredlink.com/")).click();*/
/*List<WebElement> allLinks = driver.findElements(By.tagName("a")); 
allLinks.get(5).click(); */
	System.out.println(driver.findElements(By.tagName("a")).size());
	}
}

