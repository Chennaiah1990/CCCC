package GG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class noukri {
	WebDriver d;
	@BeforeMethod
	public void setUP()
	{
		//lunch the browser
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	@Test
	public void noukriupdate()
	{
		d.get("https://login.naukri.com/nLogin/Login.php");
		//enter  username 
		d.findElement(By.xpath("//input[@id='emailTxt']")).sendKeys("birruchennaiah1990@gmail.com");
		//enter password
		d.findElement(By.xpath("//input[@id='pwd1']")).sendKeys("M1982020@");
		//click submit button
		d.findElement(By.xpath("(//input[@id='sbtLog'])[2]")).click();
		//view profile link
		d.findElement(By.xpath("//a[contains(text(),'View Profile')]")).click();
		//click the fourth edit button
		d.findElement(By.xpath("(//a[contains(text(),'Edit')])[4]")).click();
		//click save chenges button 
		d.findElement(By.xpath("//button[@value='Save Changes']")).click();
		//move to mouse my noukri
		Actions mouseaction=new Actions(d);
		mouseaction.moveToElement(d.findElement(By.xpath("//a[contains(@href, 'https://my.naukri.com/HomePage/view')]"))).perform();
		//click log out button
		d.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	}

}
