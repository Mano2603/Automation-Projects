package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver m1=new ChromeDriver();
		m1.manage().window().maximize();
		m1.get("https://www.google.com/");
		Thread.sleep(3000);
		m1.findElement(By.id("APjFqb")).sendKeys("swag labs",Keys.ENTER);
		Thread.sleep(5000);
		m1.findElement(By.className("VuuXrf")).click();
		Thread.sleep(5000);
		m1.findElement(By.id("user-name")).sendKeys("problem_user");
		m1.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		m1.findElement(By.className("btn_action")).click();
		Thread.sleep(3000);
		m1.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
		Thread.sleep(3000);
		m1.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[5]/div[3]/button")).click();
		Thread.sleep(3000);
		m1.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")).click();
		Thread.sleep(3000);
		m1.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(3000);
		m1.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		m1.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]")).click();
		Thread.sleep(3000);
		m1.findElement(By.id("first-name")).sendKeys("Manoj");
		Thread.sleep(5000);
		m1.findElement(By.id("last-name")).sendKeys("G");
		Thread.sleep(2000);
		m1.findElement(By.id("first-name")).clear();
		Thread.sleep(5000);
		m1.findElement(By.id("first-name")).sendKeys("Manoj");
		Thread.sleep(5000);
		m1.findElement(By.id("postal-code")).sendKeys("600028");
		Thread.sleep(5000);
		m1.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input")).click();
		Thread.sleep(8000);
		m1.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")).click();
		Thread.sleep(6000);
		m1.findElement(By.className("bm-burger-button")).click();
		Thread.sleep(6000);
		m1.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(6000);
		m1.quit();

	}

}
