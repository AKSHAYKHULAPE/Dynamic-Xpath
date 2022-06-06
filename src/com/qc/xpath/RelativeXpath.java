package com.qc.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "chromedriver_v112.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("file:///H:/Automation%20Testing/program%20file%20pre/Files/Offline%20Website/index.html");
		
		WebElement email =driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("queuecodes@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123456");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		WebElement logout = driver.findElement(By.xpath("//li[@id='hlogout']"));
		logout.click();
	}

}
