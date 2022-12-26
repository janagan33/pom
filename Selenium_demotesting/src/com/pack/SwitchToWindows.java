package com.pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver 107\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String widowsLink = "https://demo.automationtesting.in/Register.html";
		driver.get(widowsLink);
		
		String pernetWindow = driver.getWindowHandle();
		
		WebElement SwitchButton = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
		Actions Actions = new Actions(driver);
		Actions.moveToElement(SwitchButton).build().perform();

		WebElement WindowsDrop = driver.findElement(By.xpath("//a[text()='Windows']"));
		WindowsDrop.click();
		
		Thread.sleep(10000);
		WebElement Switchwin = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		Switchwin.click();

		

		WebElement SingleWindow = driver.findElement(By.xpath("//button[@onclick='newwindow()']"));
		SingleWindow.click();

		Set<String> Newwindow = driver.getWindowHandles();
		for (String OpenNewwindow : Newwindow) {
			driver.switchTo().window(OpenNewwindow);
			
		}
		driver.close();
		
		driver.switchTo().window(pernetWindow);
		
		WebElement multiwindow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		multiwindow.click();
		
		WebElement multiwindowButton = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
		multiwindowButton.click();
		
		Set<String> newmultiwindow = driver.getWindowHandles();
		for (String openmultiwindow : newmultiwindow) {
			if(!openmultiwindow.equals(pernetWindow)) {
				driver.switchTo().window(openmultiwindow);
				driver.close();
			}
			
		}
		driver.quit();
		
	}

}
