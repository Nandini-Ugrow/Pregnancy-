package stepDefinitions;

import org.openqa.selenium.Dimension;

import Common.CommonMembers;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BabyOptions extends CommonMembers {
	public static String Me= "navigation_me";
	public static String MeText= "Me";
	public static String Guides= "Guides";
	public static String Weight= "My Weight";
	public static String Belly= "My Belly";
	public static String BirthPlan= "Birth Plan";
	public static String Appointments= "Appointments";
	public static String Todo= "To Do";
	public static String Food = "What to eat";
	public static String Close = "iv_back";
	public static String Lbs = "tv_weight_text";
	public static String Ruler =  "rv_second_ruler";
	public static String SaveWt = "btn_submit_weight";
	public static String Goback = "back";
	public static int n;
	

	public static void MeNav()
	{
		driver.findElementById(Me).click();
	}
	public static void MeScreen()
	{
		driver.findElementByName(MeText);
	}
	public static void MeTrackerOptions()
    {
    String opt= driver.findElementByName(Guides).getText();
    if(opt.equalsIgnoreCase("Guides"))
    System.out.println(opt+ "element is present");
    else
    	System.out.println("not present");
   
    String opt1= driver.findElementByName(Weight).getText();
    if(opt1.equalsIgnoreCase("My Weight"))
    System.out.println(opt+ " element is present");
    else
    	System.out.println(opt1+ " not present");
    
    String opt2= driver.findElementByName(Belly).getText();
    if(opt2.equalsIgnoreCase("My Belly"))
    System.out.println(opt2+ " element is present");
    else
    	System.out.println("not present");
    String opt3= driver.findElementByName(BirthPlan).getText();
    if(opt3.equalsIgnoreCase("Birth Plan"))
    System.out.println(opt3+ " element is present");
    else
    	System.out.println("not present");
    String opt4= driver.findElementByName(Appointments).getText();
    if(opt4.equalsIgnoreCase("Appointments"))
    System.out.println(opt4+ " element is present");
    else
    	System.out.println("not present");
    String opt5= driver.findElementByName(Todo).getText();
    if(opt5.equalsIgnoreCase("To Do"))
    System.out.println(opt5+ " element is present");
    else
    	System.out.println("not present");
    driver.navigate().back();
    driver.findElementByXPath(Trackers.Yes).click();
    
    }
   
	@SuppressWarnings("rawtypes")
	public static void BabyTrackerOptions() throws InterruptedException
    {
		//driver.findElementByName(Guides).click();
		//driver.findElementByName(Food).click();
		//for(int i=0;i<=1;i++) {
			
		//driver.executeScript("experitest:client.swipe(\"Down\", 0, 500)");}
		
		//driver.executeScript("experitest:client.swipe(\"Up\", 0, 500)");
		
		//driver.findElementById(Close).click();
		//driver.findElementById(Close).click();
		//for(int i=0;i<=1;i++) {
		//driver.navigate().back();}
		driver.findElementByName(Weight).click();
		
		
		driver.findElementById(Lbs).click();
		driver.findElementById(Ruler).click();
		
		new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(886, 1700)).moveTo(PointOption.point(300, 1700)).release().perform();
		
		
		driver.executeScript("experitest:client.swipe(\"Right\", 0, 500)");
		driver.findElementById(SaveWt).click();
		driver.findElementById(Goback).click();
		for(int i=0;i<=1;i++) {
		driver.navigate().back();}
		Thread.sleep(1000);
		driver.findElementByXPath(Trackers.Yes).click();
    }
}

