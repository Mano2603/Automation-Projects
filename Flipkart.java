package someExamples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.className("gLFyf")).sendKeys("Flipkart",Keys.ENTER);
		driver.findElement(By.className("VuuXrf")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.navigate().back();
		WebDriverWait v1=new WebDriverWait(driver,Duration.ofSeconds(3000));
		WebElement m1 = v1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/span")));
		m1.click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("realme 4k tv stick",Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]")).click();
		String Parentwindow = driver.getWindowHandle();
		System.out.println("Parent Window Link = "+driver.getCurrentUrl());
		Set<String> childwindow = driver.getWindowHandles();
		for (String window1 : childwindow) {
			if (!Parentwindow.equals(window1)) {
			driver.switchTo().window(window1);
			String window2 = driver.getCurrentUrl();
			System.out.println("Child Window Link = "+window2);
		driver.findElement(By.id("pincodeInputId")).sendKeys("635001",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button")).click();
		driver.close();
		driver.switchTo().window(Parentwindow);
		String oldwindow = driver.getCurrentUrl();
		System.out.println("Parent Window Link = "+oldwindow);
		Thread.sleep(2000);
		driver.quit();
		

		}
		}
	}
}