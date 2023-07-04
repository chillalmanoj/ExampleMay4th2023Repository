package com.sgtedting.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createproject {
	public static WebDriver obrowser=null;
    public static ActiTimePage opage=null;


	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		createcustomer();
		createproject();
		//deletecustomer();
		//deleteproject();
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
			opage.getontask().click();
			Thread.sleep(2000);
			opage.getaddonnew().click();
			Thread.sleep(2000);
			opage.getnewcustomer().click();
			Thread.sleep(2000);
			opage.getcustomername().sendKeys("harsha");
			Thread.sleep(2000);
			opage.getdiscription().sendKeys("doctor");
			Thread.sleep(2000);
			opage.getCustomer().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createproject()
	{
		try {
			opage.TaskonName().click();
			Thread.sleep(2000);
			opage.getprojects().click();
			Thread.sleep(2000);
			opage.clickonproject().click();
			Thread.sleep(2000);
			opage.getproject().sendKeys("hospital");
			Thread.sleep(2000);
			opage.projectdiscription().sendKeys("big project");
			Thread.sleep(2000);
			opage.projectcreated().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			opage.getdelete().click();
			Thread.sleep(2000);
			opage.getaction().click();
			Thread.sleep(2000);
			opage.clickdelete().click();
			Thread.sleep(2000);
			opage.permdelete().click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try {
			opage.deleteproject().click();
			Thread.sleep(2000);
			opage.getonproject().click();
			Thread.sleep(2000);
			opage.getnamedeleted().click();
			Thread.sleep(2000);
			opage.cmpltdelete().click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
