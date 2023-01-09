public class Methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION TESTING\\Auto program\\chrome driver and  webdriver files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().maximize();
		WebElement enable=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		boolean a=enable.isDisplayed();
        System.out.println(a);
        boolean b=enable.isEnabled();
        System.out.println(b);
        boolean e=enable.isSelected();
        System.out.println(e);
        //enable.click();
        enable.sendKeys("Akash");
        enable.clear();
        String h=driver.getTitle();
        System.out.println(h);
        String j=driver.getCurrentUrl();
        System.out.println(j);
        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("//div[@class='_5k_5'][1]/descendant::select[1]"));
	    Select l=new Select(day);
	    //l.selectByIndex(12);//13
	    //l.selectByValue("12");//12
	    //l.selectByVisibleText("12");//12
	    
	    
	}
}