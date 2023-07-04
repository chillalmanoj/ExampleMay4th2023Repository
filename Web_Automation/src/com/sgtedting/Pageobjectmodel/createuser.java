package com.sgtedting.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createuser {
	     public static WebDriver obrowser=null;
	     public static ActiTimePage opage=null;
	public static void main(String[] args) {
		 launch();
		 navigate();
		 login();
		 minimize();
		 createuser();
		 deleteuser();
	}
	private static void launch()
	{
		try {
			obrowser=new ChromeDriver();
			opage=new ActiTimePage(obrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			obrowser.get("http://localhost:81/user/submit_tt.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			opage.getusername().sendKeys("admin");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("manager");
			Thread.sleep(2000);
			opage.getlogin().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			opage.getFly().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			opage.clickuser().click();
			Thread.sleep(2000);
			opage.Adduser().click();
			Thread.sleep(2000);
			opage.getfname().sendKeys("santosh");
			Thread.sleep(2000);
			opage.getlname().sendKeys("chillal");
			Thread.sleep(2000);
			opage.getemail().sendKeys("santoshchilla@gmail.com");
			Thread.sleep(2000);
			opage.getusers().sendKeys("Crazy");
			Thread.sleep(2000);
			opage.getpasswords().sendKeys("123456");
			Thread.sleep(2000);
			opage.repassword().sendKeys("123456");
			Thread.sleep(2000);
			opage.usercreates().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			opage.deleteuser().click();
			Thread.sleep(2000);
			opage.pressdelete().click();
			Thread.sleep(2000);
			obrowser.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
	


