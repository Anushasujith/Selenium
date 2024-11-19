package testScript;

public class NavigationCommands extends Base{
	public void navigationcommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NavigationCommands commands=new NavigationCommands();
commands.intializeBrowser();
commands. navigationcommands();
	}

}
