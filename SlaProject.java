package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlaProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
    WebDriver w1=new ChromeDriver(); 
    w1.get("https://www.google.com/");
    w1.manage().window().maximize();
    w1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Softlogic systems",Keys.ENTER);
    w1.findElement(By.xpath("/html/body/div[5]/div/div[9]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
    WebDriverWait v1=new WebDriverWait(w1,Duration.ofSeconds(24000));
    WebElement c1=v1.until(ExpectedConditions.visibilityOfElementLocated(By.id("close")));
    c1.click();
	}

}
