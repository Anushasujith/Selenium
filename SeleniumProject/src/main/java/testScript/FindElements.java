package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base {

	public void multiplecheck()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> messagefield=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement listvalue:messagefield)
		{
			listvalue.sendKeys("Hello");	
		}
	}
	public static void main(String[] args)
	{
		FindElements elements=new FindElements();
		elements.intializeBrowser();
		elements.multiplecheck();
		

	}

}
