package selenium_pgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_link 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Advance_selenium/geckodriver.exe");
		FirefoxDriver web=new FirefoxDriver();
	web.get("https://www.amazon.com");
	Thread.sleep(1000);
	List<WebElement> All = web.findElements(By.xpath("//a|//img|//table"));
	int C = All.size();
	System.out.println(C);
	web.close();
	}
}
