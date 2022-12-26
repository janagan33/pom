package com.pack;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_to_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver 106\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String RegisterSite="https://demo.automationtesting.in/Register.html";
		driver.get(RegisterSite);
		WebElement Switchlink = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		Actions Actions=new Actions(driver);
		Actions.moveToElement(Switchlink).build().perform();
		WebElement AlertLink = driver.findElement(By.xpath("//a[normalize-space()='Alerts']"));
		AlertLink.click();
		Thread.sleep(10000);
		WebElement AlertWithOk = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		AlertWithOk.click();
		Alert Alert=driver.switchTo().alert();
		Alert.accept();
		WebElement AlertWithCancel = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		AlertWithCancel.click();
		WebElement AlertWithCancelBox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		AlertWithCancelBox.click();
		Alert Alert1=driver.switchTo().alert();
		Alert1.dismiss();
		WebElement Textbox = driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
		Textbox.click();
		WebElement TextboxLink = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		TextboxLink.click();
		Alert Alert2=driver.switchTo().alert();
		Alert2.sendKeys("janagan");
		
		String text = Alert2.getText();
		System.out.println(text);
		Alert2.accept();
		
		
		
		
		
		

	}

}
