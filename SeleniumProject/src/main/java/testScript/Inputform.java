package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inputform extends Base {
public void showmessage()
{
	WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	inputform.click();
}
	public static void main(String[] args) {
	Inputform input=new Inputform();
	input.intializeBrowser();
	input.showmessage();

	}

}
