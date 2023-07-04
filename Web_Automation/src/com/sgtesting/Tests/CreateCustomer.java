package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {
	public static WebDriver o=null;
	public static void main(String[] args) {

		launch();
		navigate();
		login();
		minimize();
		createcustomer();
		deletecustomer();
		logout();
		closeapp();
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
			o.findElement(By.id("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try {
			o.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("customerLightBox_nameField")).sendKeys("manju");
			Thread.sleep(2000);
			o.findElement(By.id("customerLightBox_descriptionField")).sendKeys("civil");
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {

			o.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logout()
	{
		try {
			o.findElement(By.id("logoutLink")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeapp()
	{
		try {
			o.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
