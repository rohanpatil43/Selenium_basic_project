package testing1.selenium_mautomation_testing;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blog_Website_project { 
	
	 ChromeDriver driver; //instance varible delecer kelya  te aapan khut pan use karu shkato by varible name;
		
	public static void main(String[] args) throws Exception {  
 
		
		Blog_Website_project actio=new Blog_Website_project();
		//click input box and enter value
		actio.filldata();
		

		//to vrtify the all setions
	//	actio.navbar();
		
		//click on search icon and search the value
	//	actio.sreach();
		
		//click on dynamic button
	//	actio.dynamic();
		
		//alert accpecting
	//	actio.alert();
		
		//action confirmation
	//	actio.confirmationalert();
		
		//text alert
	//	actio.textalert();
			
		//newTab open 
	  //actio.newTab();
		
	//pop windows
	  //   actio.pop();
		
		
		//to copy and pest text
	//	actio.doubleclick();
		
		//drag dop box
	//	actio.dragdrop();
		
		//slider
		actio.slider();
		
		//scrolling dropbox
	//	actio.selectitem();
		
	//Mobiles linkes 
	//	actio.mobilelink();
				
		
		//broken links
	//		actio.brokenlink();
		

	  //file ulolading
	//	actio.fileupload();


		//from fill process
	//		actio.fromaction();
		
		//shadow dom
	//	actio.shadowdom();

			
		//footer links
	//	actio.footerlinks();
		
		//hiden elements
	 //  actio.hiddenElement();
		
		//downlodad files
	//	actio.download();
		
		//last section
	// actio.manageby();
}
	void filldata() throws InterruptedException
	{
		//inalation the chrome browser
		driver=new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 driver.manage().window().maximize();
		 
		 //enter the frist name
		driver.findElement(By.id("name")).sendKeys("Rohan");
		
		//enter email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohan@123");
		
		//Enter phone number
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456578");
		
		//Enetr Address
		driver.findElement(By.xpath("//textarea[contains(@id,'text')]")).sendKeys("Sangli Devarde islampur");
		
		//click radio button select gender
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		//select day radiobutton
		List<WebElement> all=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<all.size();i++)
		{
			all.get(i).click();
		}
		
		
		//Select country 
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		
		sc.selectByValue("india");
		Thread.sleep(1000);
		
		//finding colours using java script method
		//pahila value la select karyach
		WebElement color=driver.findElement(By.xpath("//option[@value='green']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",color);
		
		color.click();
		
		//find shorted list Sorted List:using scroll fincationality
		WebElement shorted=driver.findElement(By.cssSelector("option[value='dog']"));
		
		JavascriptExecutor java=(JavascriptExecutor)driver;
		
		java.executeScript("arguments[0].scrollIntoView(true);",shorted);
		shorted.click();
		
		//selct date
		driver.findElement(By.id("datepicker")).sendKeys("10/12/206");
		Thread.sleep(1000);
		
		//date piker 2
		WebElement ja=driver.findElement(By.cssSelector("#txtDate"));
		JavascriptExecutor s=(JavascriptExecutor)driver;
		s.executeScript("arguments[0].value = '20/12/2029';", ja);	
		
		//date piker 3
		driver.findElement(By.id("start-date")).sendKeys("1022026");	
		
		//date piker4
		driver.findElement(By.id("end-date")).sendKeys("1232026");
		
		Thread.sleep(1000);
}
	
	//verify menu fanctionality
	void navbar() throws InterruptedException//to preform actions on search  menu
{
		 Actions act=new Actions(driver);

         //for to verify Udemy Course display page display or not
		 
		 WebElement xy=driver.findElement(By.linkText("Udemy Courses"));
		 act.moveToElement(xy).click().perform(); 
		 Thread.sleep(1000);
	      driver.navigate().back();
	      
	      //online treannings page lounch
	      Thread.sleep(1000);
	      WebElement online=driver.findElement(By.xpath("//a[text()='Online Trainings']"));
	      act.moveToElement(online).click().perform();
	      Thread.sleep(1000);
	      driver.navigate().back();
	      
	      Thread.sleep(1000);
	      //Blog page is open or not 
	      WebElement blog=driver.findElement(By.linkText("Blog"));
	      act.moveToElement(blog).click().perform();
	      Thread.sleep(1000);
	      driver.navigate().back();
	      
	      Thread.sleep(1000);
	      WebElement Playwright=driver.findElement(By.linkText("PlaywrightPractice"));
	      act.moveToElement(Playwright).click().perform();
	      
	      Thread.sleep(1000);
	      driver.navigate().back();
	      
	      Thread.sleep(1000);
	      
      }
	void sreach() throws InterruptedException //search element uding enter value click and perform 
	{
		Actions act=new Actions(driver);
		//search input box sathivtyat value inter hoil
		WebElement element=driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input"));
		WebElement y=driver.findElement(By.cssSelector(".wikipedia-search-button"));
		
		act.sendKeys(element,"rohan").click(y).perform();
		Thread.sleep(1000);
		
	}
	//dynamic button
	void dynamic() throws InterruptedException
	{
		WebElement dy=driver.findElement(By.name("start"));
		dy.click();
		Thread.sleep(1000);
		
		dy.click();
	}

	//Alert handling
	void alert() throws InterruptedException

	{
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
		Thread.sleep(1000);
		
	}
	void confirmationalert()throws InterruptedException
	{
		driver.findElement(By.cssSelector("#confirmBtn")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(1000);
		a.dismiss();
		Thread.sleep(1000);
	}
	void textalert() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#promptBtn")).click();
		Thread.sleep(1000);
		Alert D=driver.switchTo().alert();
		D.sendKeys("hello potter");
		D.accept();
		Thread.sleep(1000);
	}
	//new Tab open()
	
	void newTab() throws InterruptedException
	{
		String mainwindow=driver.getWindowHandle();
		
	driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		
	//new windo cha url match karat
		Set<String> newwindo=driver.getWindowHandles();
		
		//navin witdow var switch karnya sathi
		 for (String window : newwindo) {
	            if (!window.equals(mainwindow)) {
	                //new window made switch kara
	                driver.switchTo().window(window);
	                break;
	            }
		 }
		 Thread.sleep(1000);
		 //navin tap close krt
		 driver.close();
		 driver.switchTo().window(mainwindow);
	}
	
	//pop boutton
	
	void pop() throws InterruptedException
	{	
     	String window=driver.getWindowHandle();
     	
     	driver.findElement(By.id("PopUp")).click();
     	
     
     	Set<String> newwindo=driver.getWindowHandles();
     	
     	for(String rp:driver.getWindowHandles())
     	{
     		if(!rp.equals(window));
     		{
     			driver.switchTo().window(rp);
     			break;
     		}
     	}
     	
     	driver.switchTo().window(window);
     
     	
	}
	
	//mouseHover action
	void mousehover()
	{
		WebElement mouse=driver.findElement(By.xpath("//button[text()='Point Me'"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).click().perform();
	}
	
	//double click functionlity
	void doubleclick() throws InterruptedException
	{
		WebElement click=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(click).perform();
		
		Thread.sleep(1000);
	}
	
	//silder 
	void slider() throws InterruptedException
	{
		//left side slider handel
		WebElement leftslider=driver.findElement(By.cssSelector("span[tabindex='0']"));
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(leftslider, 80, 0).build().perform();

	}
	
	//drag and drop
	void dragdrop() throws InterruptedException
	{
		WebElement drag=driver.findElement(By.cssSelector("#draggable"));
		WebElement drop=driver.findElement(By.cssSelector("#droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(1000);
	}
	
	//find scrolling element
	void selectitem() throws InterruptedException
	{
		WebElement select=driver.findElement(By.cssSelector("#comboBox"));
		select.click();
		
		Thread.sleep(1000);
		//jo pryaya nivadaycha ahe to select kara
		WebElement item=driver.findElement(By.xpath("//div[text()='Item 3']"));
		
		//javaScriptExecutor cha use kraycha scroll krayala
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",item);
		
		Thread.sleep(1000);
		item.click();
		
		
		}
	
	//Mobile links
	void mobilelink() throws InterruptedException
	{
		WebElement as=driver.findElement(By.xpath("//a[@id='apple']"));
		as.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("#lenovo")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("#dell")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
	}
	
	//Broken links
	void brokenlink() throws InterruptedException
	{
		
		List<WebElement> open=driver.findElements(By.partialLinkText("Errorcode"));
		
		for(int i=0;i<=open.size();i++)
		{
			open.get(i).click();
			Thread.sleep(1000);
			driver.navigate().back();
		}
		
	}
	
	//from filling
	void fromaction()
	{
		WebElement from=driver.findElement(By.id("input1"));
		WebElement submit=driver.findElement(By.cssSelector("#btn1"));
		Actions act=new Actions(driver);
		act.sendKeys(from,"Rohan").click(submit).perform();
		
		//input 2 fill
		WebElement fo=driver.findElement(By.cssSelector("#input2"));
		
		WebElement btn=driver.findElement(By.id("btn2"));
		
		act.sendKeys(fo,"Patil").click(btn).perform();
		
		//input 3 fill
		WebElement thrid=driver.findElement(By.id("input3"));
		thrid.sendKeys("ADity");
		
		driver.findElement(By.id("btn3")).click();
		
	}
	
	//Shadow dom
	void shadowdom() throws InterruptedException
	{
//		driver.findElement(By.xpath("//a[@href='https://www.pavantestingtools.com/']")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
		
		//seacrch
//		WebElement s=driver.findElement(By.xpath("//*[@id=\"shadow_host\"]//input[1]"));
//		s.click();
//				Actions act=new Actions(driver);
//    	act.moveToElement(s).click().perform();
//		s.sendKeys("rohan");

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
	    WebElement send=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='file']")));
	     send.sendKeys("C:\\Users\\Rohan patil\\Downloads\\Tree of Testing_ Quality Software.png");
	
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
//		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/@sdetpavan/videos']")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
	}
	
	//file uploading
	void fileupload() throws InterruptedException
	{
		//single file sathi
		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\Rohan patil\\OneDrive\\Pictures\\WhatsApp Image 2026-06-30 at 10.02.22 PM.jpeg");
		driver.findElement(By.cssSelector("button[type='submit'")).click();
		
		//Multiple file sathi 
	WebElement file2=driver.findElement(By.id("multipleFilesInput"));
	file2.sendKeys("C:\\Users\\Rohan patil\\OneDrive\\Pictures\\134295959011347902.jpg\n"+"C:\\Users\\Rohan patil\\OneDrive\\Pictures\\134302441377872032.jpg");
	
	driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
	}
	
	//footer link
	
	void footerlinks() throws InterruptedException
	{
		
      	driver.findElement(By.xpath("//a[@href='https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html']")).click();
		Thread.sleep(1000);

	}
	
	//Hidden Elements & AJAX
	void hiddenElement() throws InterruptedException
	{
		driver.findElement(By.id("input1")).sendKeys("Ajaly");
		
		driver.findElement(By.id("toggleInput")).click();
		
		driver.findElement(By.id("input2")).sendKeys("element");
		
		driver.findElement(By.id("checkbox1")).click();
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		driver.findElement(By.id("checkbox2")).click();
		
		driver.findElement(By.id("loadContent")).click();
		
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	//download files
	
	void download() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Download Files']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("inputText")).sendKeys("Hello I am Autoation Tester");
		
		Thread.sleep(1000);
		driver.findElement(By.id("generateTxt")).click();
    	
//		String window=driver.getWindowHandle();
//		 WebElement tab=driver.findElement(By.xpath("//button[text()='Download PDF File']"));
//			tab.click();
//			
//			Set<String> all=driver.getWindowHandles();
//			for(String rp:all)
//			{
//				if(!rp.equals(all))
//				{
//					driver.switchTo().window(rp);
//					break;
//				}
//			}
//			driver.switchTo().window(window);
//	    	Thread.sleep(1000);
//		
	
	}
	
	//Last link section
	void manageby() throws InterruptedException
	{
		String all=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='merrymoonmary']")).click();
		Set<String> tap=driver.getWindowHandles();
		
		for(String win:tap)
		{
			if(!win.equals(tap))
			{
				driver.switchTo().window(win);
				break;
			}
		}
		
		driver.switchTo().window(all);
		
		Thread.sleep(5000);
		
       String a=driver.getWindowHandle();
       driver.findElement(By.xpath("//a[text()='Blogger']")).click();
       
		Set<String> t=driver.getWindowHandles();
		
		for(String win:t)
		{
			if(!win.equals(t))
			{
				driver.switchTo().window(win);
				break;
			}
		}
    	driver.switchTo().window(a);
		
	}
}
