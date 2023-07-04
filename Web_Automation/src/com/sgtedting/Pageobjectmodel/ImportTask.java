package com.sgtedting.Pageobjectmodel;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTask {
	private static WebDriver o=null;

	public static void main(String[] args) {
		launch();
		 navigate();
		 login();
		 minimize();
		 importTask();

	}
	public static void launch()
	{
		try {
			o=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void navigate()
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
			Thread.sleep(2000);
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
	private static void importTask()
	{
		try {
			o.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
			Thread.sleep(1000);
			o.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(1000);
			String filename="D:\\demo\\Sample.csv";
			copyFile(filename);
			Thread.sleep(1000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void copyFile(String filename) {
		StringSelection strSelection=new  StringSelection(filename);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
	}

}
