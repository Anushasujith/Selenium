package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
public WebDriver driver;
public void intializeBrowser()
{
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().window().maximize();
}
public void quitClose()
{
	driver.close();
	driver.quit();
}
	public static void main(String[] args) {
		Base obj=new Base();
		obj.intializeBrowser();
		obj.quitClose();
		
		// TODO Auto-generated method stub

	}

}
