import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/// Tagname[@attribute='value']  - xpath
		/*driver.findElement(By.xpath("//input[@type='text']")).sendKeys("+998933767433");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("1111222233");
		driver.findElement(By.xpath("//button[@value='1']")).click();*/

		/// tagName[attribute='value']  - CSS or tagName#id or tagName.classname
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("My own css");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("66466");
		driver.findElement(By.name("login")).click();
	}
	

}
