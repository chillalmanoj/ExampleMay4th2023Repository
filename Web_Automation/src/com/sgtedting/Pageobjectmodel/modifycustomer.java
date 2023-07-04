package com.sgtedting.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modifycustomer {
	public static WebDriver obrowser=null;
    public static ActiTimePage opage=null;

	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		createcustomer();
		modifyuser();
		 deletecustomer();
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
	private static void createcustomer()
	{
		try {
			opage.clicktask().click();
			Thread.sleep(2000);
			opage.Addcustomer().click();
			Thread.sleep(2000);
			opage.NewCustomer().click();
			Thread.sleep(2000);
			opage.getName().sendKeys("manoj");
			Thread.sleep(2000);
			opage.AddDiscription().sendKeys("Student");
			Thread.sleep(2000);
			opage.createcustomer().click();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try {
			opage.clickmodifyuser().click();
			Thread.sleep(2000);
			opage.modifyDiscription().clear();
			Thread.sleep(2000);
			opage.adddiscription().sendKeys("Engineer");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			opage.customerdeletes().click();
			Thread.sleep(2000);
			opage.Actionbtns().click();
			Thread.sleep(2000);
			opage.clickondeletes().click();
			Thread.sleep(2000);
			opage.permanentlydeletes().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
