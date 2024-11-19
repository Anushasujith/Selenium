package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
public void simpleAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement alert=driver.findElement(By.xpath("//button[@onclick=jsAlert]"));
	alert.click();
	driver.switchTo().alert().accept();
}
public void confirmationAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	alert.click();
	driver.switchTo().alert().dismiss();

}
public void promptAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	alert.click();
	driver.switchTo().alert().sendKeys("Anu");
	driver.switchTo().alert().accept();

}
	public static void main(String[] args) {
		AlertHandling handling=new AlertHandling();
		handling.intializeBrowser();
		//handling.simpleAlert();
		//handling.confirmationAlert();
		handling.promptAlert();

	}

}
