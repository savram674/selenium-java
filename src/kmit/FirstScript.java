package kmit;



public class FirstScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("savithakmit@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		String dt = driver.getTitle();
		String et = "gmail";
		driver.close();
		if (dt.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failure");
 		}	
	}
}