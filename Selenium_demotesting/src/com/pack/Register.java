package com.pack;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 class Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver 106\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String RegisterSite="https://demo.automationtesting.in/Register.html";
		driver.get(RegisterSite);
		WebElement Firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Firstname.sendKeys("janagan");
		WebElement LastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		LastName.sendKeys("s");
		WebElement AdressBox = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		AdressBox.sendKeys("Thirumuerugan poondi,Tiruppur,Tamilnadu");
		WebElement EmailBox = driver.findElement(By.xpath("//input[@type='email']"));
		EmailBox.sendKeys("janagan97janagan@gmail.com");
		WebElement PhoneNum = driver.findElement(By.xpath("//input[@type='tel']"));
		PhoneNum.sendKeys("9629759667");
		WebElement GenderButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		GenderButton.click();
		WebElement HobbiesBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		HobbiesBox.click();
		WebElement HobbiesBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		HobbiesBox1.click();
		WebElement HobbiesBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		HobbiesBox2.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)");
		Thread.sleep(10000);
		
		
			/*WebElement LanguagesBox = driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[7]/div/multi-select"));
		Select Select=new Select(LanguagesBox);
		Select.selectByVisibleText("English");*/
		WebElement  Skills= driver.findElement(By.xpath("//select[@id='Skills']"));
		Select Select1 =new Select(Skills);
		Select1.selectByValue("Java");
		WebElement countryBox = driver.findElement(By.xpath("//span[@aria-haspopup='true']"));
		Select Select2=new Select(countryBox);
		Select2.selectByIndex(4);
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
