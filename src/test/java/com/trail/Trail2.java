package com.trail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().version("79.0").setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://live.demoguru99.com/index.php/checkout/cart/");

		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000", Keys.ENTER);
	}
}
