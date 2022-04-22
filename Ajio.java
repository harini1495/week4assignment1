package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
		
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println("The count of the items Found "+count);
		
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		
		for (WebElement webElement : brands) {
			
			String brandstext = webElement.getText();
			
			System.out.println("list of brand of the products displayed in the page "+brandstext);
		}
		
		Thread.sleep(3000);
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
for (WebElement webElement1 : names) {
			
			String namestext = webElement1.getText();
			
			System.out.println("list of names of the bags "+namestext);
		}

	}

}
