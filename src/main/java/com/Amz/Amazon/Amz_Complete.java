package com.Amz.Amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Amz_Complete {
	public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","resources\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.amazon.com/");
	driver.findElement(By.id("nav-link-accountList")).click();
	
	driver.findElement(By.id("ap_email")).sendKeys("Raj.vinay91@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Emerson01");
	driver.findElement(By.id("signInSubmit")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone charger");
    driver.findElement(By.xpath("//input[@class='nav-input']")).click();
    
    driver.findElement(By.xpath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']")).click();
    driver.findElement(By.id("add-to-cart-button")).click();
    
    
	
	
	
	
	
	
	
	}
}
