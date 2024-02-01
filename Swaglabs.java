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
		m1.findElement(By.id("APjFqb")).sendKeys("swag labs",Keys.ENTER);
		m1.findElement(By.className("VuuXrf")).click();
		m1.findElement(By.id("user-name")).sendKeys("problem_user");
		m1.findElement(By.id("password")).sendKeys("secret_sauce");
		m1.findElement(By.className("btn_action")).click();
		m1.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
		m1.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[5]/div[3]/button")).click();
		m1.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")).click();
		m1.findElement(By.id("shopping_cart_container")).click();
		m1.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/button")).click();
		m1.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]")).click();
		m1.findElement(By.id("first-name")).sendKeys("Manoj");
		m1.findElement(By.id("last-name")).sendKeys("G");
		m1.findElement(By.id("first-name")).clear();
		m1.findElement(By.id("first-name")).sendKeys("Manoj");
		m1.findElement(By.id("postal-code")).sendKeys("600028");
		m1.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input")).click();
		m1.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")).click();
		m1.findElement(By.className("bm-burger-button")).click();
		m1.findElement(By.id("logout_sidebar_link")).click();
		m1.quit();

	}

}
