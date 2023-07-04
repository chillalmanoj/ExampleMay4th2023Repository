package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static WebDriver o=null;

	public static void main(String[] args) {
		 launch();
		 navigate();
		 login();
		 minimize();
		 createuser();
		 delete();
		 logout() ;
		 closebrowser() ;
}
	private static void launch()
	{
		try {
			o=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
	}
	}
	private static void navigate()
	{
		try {
			o.get("http://localhost:81/user/submit_tt.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			o.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
		o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(2000);
		} catch (Exception e) {
		e.printStackTrace();
		}
	
	}
	private static void createuser()
	{
		
		try {
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			o.findElement(By.name("firstName")).sendKeys("manoj");
			Thread.sleep(2000);
			o.findElement(By.name("lastName")).sendKeys("chillal");
			Thread.sleep(2000);
			o.findElement(By.name("email")).sendKeys("manojchillal@gmail.com");
			Thread.sleep(2000);
			o.findElement(By.name("username")).sendKeys("gulbarga");
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("123456");
			o.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void delete()
	{
		try {
			o.findElement(By.xpath("//span[text()='chillal, manoj']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("userDataLightBox_deleteBtn")).click();
			o.switchTo().alert().accept();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout() 
	 {
		 try
		 {
			 o.findElement(By.linkText("Logout")).click();
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 private static void closebrowser() 
	 {
		 try
		 {
			 o.quit();
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
}


