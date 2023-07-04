package com.sgtedting.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class ActiTimePage {
	
	//div[text()='Add User']
	public ActiTimePage(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser,this);
	}
	// WebElement for username
	   private WebElement username;
	   public WebElement getusername()
	   {
		   return username;
	   }
	   //WebElement for password
	   private WebElement pwd;
	   public WebElement getpassword()
	   {
		   return pwd;
	   }
	   //WebElement for login
	   @FindBy(xpath="//div[text()='Login ']")
	  private WebElement login;
	   public WebElement getlogin()
	   {
		   return login;
	   }
		   //WebElement for minimize
	   private WebElement gettingStartedShortcutsPanelId;
	   public WebElement getFly()
	   {
		   return gettingStartedShortcutsPanelId;
	   }
	   //WebElement for createuser
	   @FindBy(xpath="//div[text()='USERS']")
	   private WebElement getuser;
	   public WebElement  clickuser()
	   {
		   return getuser;
	   }
	 //WebElement for Adduser
	   @FindBy(xpath="//div[text()='Add User']")
	   private WebElement Add;
	   public WebElement  Adduser()
	   {
		   return Add;
	   }
	   // WebElement for firstname
	   private WebElement firstName;
	   public WebElement getfname()
	   {
		   return firstName;
	   }
	// WebElement for lastname
	   private WebElement lastName;
	   public WebElement getlname()
	   {
		   return lastName;
	   }
	// WebElement for email
	   private WebElement email;
	   public WebElement getemail()
	   {
		   return email;
	   }
	// WebElement for username
	   private WebElement userDataLightBox_usernameField;
	   public WebElement getusers()
	   {
		   return userDataLightBox_usernameField;
	   }
	// WebElement for password
	   private WebElement password;
	   public WebElement getpasswords()
	   {
		   return password;
	   }
	// WebElement for passwordCopy
	   private WebElement passwordCopy;
	   public WebElement repassword()
	   {
		   return passwordCopy;
	   }
	   //WebElement for usercreate
	   @FindBy(xpath="//span[text()='Create User']")
	   private WebElement usercreate;
	   public WebElement  usercreates()
	   {
		   return usercreate;
	}
	 //WebElement for deleteuser
	   @FindBy(xpath="//span[text()='chillal, santosh']")
	   private WebElement delete;
	   public WebElement  deleteuser()
	   {
		   return delete;
 }
	 //WebElement for pressdelete
	  
	   private WebElement userDataLightBox_deleteBtn;
	   public WebElement  pressdelete()
	   {
		   return userDataLightBox_deleteBtn;
}
	   //WebElement for modify
	   @FindBy(xpath="//span[text()='chillal, santosh']")
	   private WebElement modify;
	   public WebElement modifiusers()
	   {
		   return modify;
	   }
	   //WebElement for clearlastname
	   private WebElement userDataLightBox_lastNameField;
	   public WebElement clearlname()
	   {
		   return userDataLightBox_lastNameField;
	   }
	   //WebElement for addlastname
	   @FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
	   private WebElement addlastname;
	   public WebElement addlname()
	   {
		   return addlastname;
	   }
	   //WebElement for savechange
	   @FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	   private WebElement save;
	   public WebElement savechange()
	   {
		   return save;
	   }
	   //WebElement for deleteuser
	   @FindBy(xpath="//span[text()='kuamr, santosh']")
	   private WebElement deletes;
	   public WebElement  deleteusers()
	   {
		   return deletes;
 }
	 //WebElement for pressdelete
	  @FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	  private WebElement deletemodify;
	  public WebElement deletesmo()
	  {
		  return deletemodify;
	
	   
	   }
	  //WebElement for clicktask
	  @FindBy(xpath="//div[text()='TASKS']")
	  private WebElement oadd;
	  public WebElement clicktask()
	  {
		  return oadd;
	  }
	  //WebElement for Add New 
	  @FindBy(xpath="//div[text()='Add New']")
	  private WebElement Addnew;
	  public WebElement Addcustomer()
	  {
		  return Addnew;
		  
	  }
	  // WebElement for New Customer
	  @FindBy(xpath="/html/body/div[14]/div[1]")
	  private WebElement addnew;
	  public WebElement NewCustomer()
	  {
		  return addnew;
		  
	  }
	  //WebEleemnt For createcustomer
	  private WebElement customerLightBox_nameField;
	  public WebElement getName()
	  {
		  return customerLightBox_nameField;
	  }
	  //WebElement for discription
	  private WebElement customerLightBox_descriptionField;
	  public WebElement AddDiscription()
	  {
		  return customerLightBox_descriptionField;
	  }
	  //WebElement for Createcustomer
	  @FindBy(xpath="//span[text()='Create Customer']")
	  private WebElement create;
	  public WebElement createcustomer()
	  {
		  return create;
	  }
		  //WebElement for clickdelete
		  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		  private WebElement clickdelete;
		  public WebElement  customerdelete()
		  {
			  return clickdelete;
		  }
		  //WebElement for Actionbutton
		  @FindBy(xpath="//div[text()='ACTIONS']")
		  private WebElement Action;
		  public WebElement Actionbtn()
		  {
			  return Action;
		  }
		  //WebElement for clickondelete
		  @FindBy(xpath="//div[text()='Delete']")
		  private WebElement clickon;
		  public WebElement clickondelete()
		  {
			  return clickon;
		  }
		  //WebElement for permanentlydelete
		  @FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
		  private WebElement perdelete;
		  public WebElement permanentlydelete()
		  {
			  return perdelete;
		  }
		  //WebElement for modifycustomer
		  @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		  private WebElement clickmodify;
		  public WebElement clickmodifyuser()
		  {
			  return clickmodify;
		  }
		  //WebElement for modifydiscription
		  @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
		  private WebElement cleardiscri;
		  public WebElement modifyDiscription()
		  {
			  return cleardiscri;
		  }
		  //WebElement for addDiscription
		  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
		  private WebElement adddisc ;
		  public WebElement adddiscription()
		  {
			  return adddisc;
		  }
		//WebElement for clickdelete
		  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		  private WebElement clickdeletes;
		  public WebElement  customerdeletes()
		  {
			  return clickdeletes;
		  }
		  //WebElement for Actionbutton
		  @FindBy(xpath="//div[text()='ACTIONS']")
		  private WebElement Actions;
		  public WebElement Actionbtns()
		  {
			  return Actions;
		  }
		  //WebElement for clickondelete
		  @FindBy(xpath="//div[text()='Delete']")
		  private WebElement clickons;
		  public WebElement clickondeletes()
		  {
			  return clickons;
		  }
		  //WebElement for permanentlydelete
		  @FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
		  private WebElement perdeletes;
		  public WebElement permanentlydeletes()
		  {
			  return perdeletes;
		  }
		  //WebElement for projectandcustomer
		  @FindBy(xpath="//div[text()='TASKS']")
		  private WebElement gettask;
		  public WebElement getontask()
		  {
			  return gettask;
		  }
		  //WebElement for Addcustomer
		  @FindBy(xpath="//div[text()='Add New']")
		  private WebElement getaddnew;
		  public WebElement getaddonnew()
		  {
			  return getaddnew;
		  }
		  //WebElement for customer
		  @FindBy(xpath="/html/body/div[14]/div[1]")
		  private WebElement newcustomer;
		  public WebElement getnewcustomer()
		  {
			  return newcustomer;
		  }
		  //WebElement for customentname
		  @FindBy(xpath="//*[@id=\"customerLightBox_nameField\"]")
		  private WebElement customername;
		  public WebElement getcustomername()
		  {
			  return customername;
		  }
		  //WebElement for discription
		  @FindBy(xpath="//*[@id=\"customerLightBox_descriptionField\"]")
		  private WebElement addDiscription;
		  public WebElement getdiscription()
		  {
			  return addDiscription;
		  }
		  //WebElement for createcustomer
		  @FindBy(xpath="//span[text()='Create Customer']")
		  private WebElement createcustomer;
		  public WebElement getCustomer()
		  {
			  return createcustomer;
		  }
		//WebElement for projectTask
		  @FindBy(xpath="//div[text()='TASKS']")
		  private WebElement Taskname;
		  public WebElement TaskonName()
		  {
			  return Taskname;
		  }
		  //WebElement for Addproject
		  @FindBy(xpath="//div[text()='Add New']")
		  private WebElement projectname;
		  public WebElement getprojects()
		  {
			  return projectname;
		  }
		  //WebElement for project
		  @FindBy(xpath="/html/body/div[14]/div[2]")
		  private WebElement clickproject;
		  public WebElement clickonproject()
		  {
			  return clickproject;
			  
		  }
		  //WebElement for projectname
		  private WebElement projectPopup_projectNameField;
		  public WebElement getproject()
		  {
			  return projectPopup_projectNameField;
		  }
		  //WebElement for projectdiscription
		  private WebElement projectDescriptionField;
		  public WebElement projectdiscription()
		  {
			  return projectDescriptionField;
		  }
		  //WebElement for createproject 
		  @FindBy(xpath="//span[text()='Create Project']")
		  private WebElement getproject;
		  public WebElement projectcreated()
		  {
			  return getproject;
		  }
		  //WebElement for deletecustomer
		  @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		  private WebElement dltcustomer;
		  public WebElement getdelete()
		  {
			  return dltcustomer;
		  }
		  //WebElement for Actionclick
		  @FindBy(xpath="//div[text()='ACTIONS']")
		  private WebElement Actionbtn;
		  public WebElement getaction()
		  {
			  return Actionbtn;
			  
		  }
		  //WebElement for deletebuttiom
		  @FindBy(xpath="//div[text()='Delete']")
		  private WebElement getdelete;
		  public WebElement clickdelete()
		  {
			  return getdelete;
			  
		  }
		 //WebElement for permanentlydelete
		  private WebElement customerPanel_deleteConfirm_submitTitle;
		  public WebElement permdelete()
		  {
			  return customerPanel_deleteConfirm_submitTitle;
		  }
		  //WebElement for projectdelete
		  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		  private WebElement projectdelete;
		  public WebElement deleteproject()
		  {
			  return projectdelete;
		  }
		  
		//WebElement for Actionforproject
		  @FindBy(xpath="//div[text()='ACTIONS']")
		  private WebElement actionproject;
		  public WebElement getonproject()
		  {
			  return actionproject;
		  }	  
		  @FindBy(xpath="//div[text()='Delete']")
		  private WebElement projectdeleted;
		  public WebElement getnamedeleted()
		  {
			  return projectdeleted;
		  }
		  //WebElement for permanentlydeleted
		  @FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
		  private WebElement permadeleted;
		  public WebElement cmpltdelete()
		  {
			  return permadeleted;
			  
		  }
		  //WebElement for modifydiscription
		  @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		  private WebElement clearprojectdisc;
		  public WebElement getcleardiscription()
		  {
			  return clearprojectdisc;
		  }
		  //WebElement for addDiscription 
		  @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		  private WebElement addprojectdiscription;
		  public WebElement getprojectdisc()
		  {
			  return addprojectdiscription;
		  }
		  
}

	   
	   

	

