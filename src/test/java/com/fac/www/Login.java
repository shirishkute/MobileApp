package com.fac.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		  WebDriver rv=new ChromeDriver();
		  Thread.sleep(3000);
		  rv.get("https://www.facebook.com/");
		      

	}

}
