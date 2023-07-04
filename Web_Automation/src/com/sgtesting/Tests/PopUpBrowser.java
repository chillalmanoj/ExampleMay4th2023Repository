package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowser {
	private static WebDriver o=null;
	static int count=0;
	public static void main(String[] args) {
		launch();
		navigate();
		popupbrowser();
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
	public static int getpopupscount() {
		
		count=o.getWindowHandles().size()-1;
		return count;
	}
	private static void popupbrowser()
	{
		try {
			
			
			System.out.println("Before click on,No of popups :"+getpopupscount());
			o.findElement(By.linkText("actiTIME Inc.")).click();
			System.out.println("After click on,No of popups :"+getpopupscount());
			Thread.sleep(2000);
			if(getpopupscount()>0)
			{
				handlepopups();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	private static void handlepopups() {
		try
		{
			String parentBroweser=o.getWindowHandle();
			System.out.println(parentBroweser);
			Object childpopup[]=o.getWindowHandles().toArray();
			for(int i=1;i<childpopup.length;i++)
			{
				String childBrowers=childpopup[i].toString();
				System.out.println(childBrowers+"  childBrowsee");
				o.switchTo().window(childBrowers);
				String title=o.getTitle();
				System.out.println(title+"title");
				String url=o.getCurrentUrl();
				System.out.println(url+"current url ");
				Thread.sleep(2000);
				o.findElement(By.linkText("Try Free")).click();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}


}
