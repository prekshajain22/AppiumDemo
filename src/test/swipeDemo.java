package test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class swipeDemo extends base  {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElement(By.xpath("//android.widget.TextView[@text ='Date Widgets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text ='2. Inline']")).click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		TouchAction t = new TouchAction(driver);
		WebElement fifteen = driver.findElement(By.xpath("//*[@content-desc='15']"));
		WebElement fortyFive = driver.findElement(By.xpath("//*[@content-desc='45']"));
		t.longPress(longPressOptions().withElement(element(fifteen)).withDuration(ofSeconds(2))).moveTo(element(fortyFive)).release().perform();

	}

}
