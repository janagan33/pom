package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver 106\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String Testing="https://demo.automationtesting.in/Register.html";
		driver.get(Testing);
		
		WebElement MouseHover = driver.findElement(By.xpath("//a[normalize-space()='Interactions']"));
		Actions Actions=new Actions(driver);
		Actions.moveToElement(MouseHover).build().perform();
		WebElement DragAndDrop = driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']"));
		Actions.moveToElement(DragAndDrop).build().perform();
		WebElement Static = driver.findElement(By.xpath("//a[normalize-space()='Static']"));
		Static.click();
		Thread.sleep(10000);
		WebElement Slatter = driver.findElement(By.xpath("//img[@id='angular']"));
		
		
		WebElement to = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		Actions Actions1=new Actions(driver);
		Actions1.dragAndDrop(Slatter, to).build().perform();
		
		
		
		
		
		
		
		
		
		
		

	}

}
