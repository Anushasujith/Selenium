package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void idLocator()
	{
		//WebElement ElementName=driver.getfindElement(By.LocatorName("value"));
		WebElement message=driver.findElement(By.id("single-input-field"));
		WebElement demo=driver.findElement(By.id("single-input-field"));
		WebElement bootsrapalerts=driver.findElement(By.id("autoclosable-btn-success"));
		WebElement jqueryuiprogresslist=driver.findElement(By.id("downloadButton"));
		WebElement text=driver.findElement(By.id("value-a"));
		
	}
public void classlocator()
{
	WebElement section=driver.findElement(By.className("clearfix"));
}
public void namelocator()
{
	WebElement name=driver.findElement(By.name("viewport"));
}
public void linktextlocator()
{
	WebElement linkinputform=driver.findElement(By.linkText("simple-form-demo.php"));
}
public void partiallinktext()
{
	WebElement linkinputform=driver.findElement(By.partialLinkText("simple-form"));
	
}
public void csstagandid()
{
	//tag#id
	WebElement inputid=driver.findElement(By.cssSelector("input#single-input-field"));
	
}
public void csstagattribute()

{
	//tag[attributetype=value]
	WebElement tagattribute=driver.findElement(By.cssSelector("input[id=single-input-ield]"));
}
public void csstagclass()
{
	//tagclass
	WebElement tagclass=driver.findElement(By.cssSelector("ul.navbar-nav"));
}
public void tagclassattribute()
{
	WebElement tagclasattribute=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
}
	public static void main(String[] args) {
		

	}

}
