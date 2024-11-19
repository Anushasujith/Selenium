package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling extends Base {
public void dropdown()
{
	//WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	//inputform.click();
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='single -input -field']"));
	Select select=new Select(dropdown);
	//select.selectByVisibleText("Red");
	//select.deselectByValue("Yellow");
select.selectByIndex(3);
}

	public static void main(String[] args) {
		
		 DropdownHandling drop=new  DropdownHandling();
		 drop.intializeBrowser();
		 drop.dropdown();
		 
	}

}