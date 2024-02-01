package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver m1=new ChromeDriver();
		m1.get("https://www.google.com/");
		m1.manage().window().maximize();
		m1.findElement(By.id("APjFqb")).sendKeys("adactin",Keys.ENTER);
		m1.findElement(By.className("byrV5b")).click();
		m1.findElement(By.className("login_register")).click();
		m1.findElement(By.id("username")).sendKeys("Manoj9616",Keys.ENTER);
		m1.findElement(By.id("password")).sendKeys("Manoj@1324",Keys.ENTER);
		m1.findElement(By.id("re_password")).sendKeys("Manoj@1324",Keys.ENTER);
		m1.findElement(By.id("full_name")).sendKeys("Manoj",Keys.ENTER);
		m1.findElement(By.id("email_add")).sendKeys("mak@gmail.com",Keys.ENTER);
		m1.findElement(By.id("captcha-form")).click();
		Thread.sleep(10000);
		m1.findElement(By.id("tnc_box")).click();
		m1.findElement(By.id("Submit")).click();
		m1.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")).click();
		m1.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Manoj9616",Keys.ENTER);
		m1.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Manoj@1324",Keys.ENTER);
		m1.findElement(By.id("login")).click();
		m1.close();
		
	}

}
