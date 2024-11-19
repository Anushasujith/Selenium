package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleCheckbox  extends Base
{
	public void multiplecheckbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multicheck=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement check:multicheck)
		{
		
		check.click();
	}
	}
	public static void main(String[] args) {
	
		 MultipleCheckbox checkbox=new  MultipleCheckbox();
		 checkbox.intializeBrowser();
		 checkbox.multiplecheckbox();
	}

}
