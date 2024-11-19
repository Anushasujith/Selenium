package testScript;

public class BrowserCommand  extends Base{
	public void BrowserCommand()
	{
		String title= driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
	

	public static void main(String[] args) {
		
	BrowserCommand command=new BrowserCommand();
	command.intializeBrowser();
	command.BrowserCommand();

	}

}
