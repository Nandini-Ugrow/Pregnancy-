package stepDefinitions;

import Common.CommonMembers;

public class FAQs extends CommonMembers{
	
	public static String FAQs = "FAQs";

	
	public static void FAQsQuest()
	{
		driver.findElementByName(FAQs).click();
	}
	public static void NavBack()
	{
		for(int i=0;i<=1;i++) {
		    driver.navigate().back();}
		    driver.findElementByXPath(Trackers.Yes).click();
	}

}
