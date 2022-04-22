package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu",Keys.TAB);

		Thread.sleep(2000);
		
		
		List<WebElement> trainames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		
		int size = trainames.size();
		
		System.out.println("Total train size"+size);
		
		List<String> train = new ArrayList<String>();
		
		for (int i = 1; i <= size; i++) {
			
			String names = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
		
			train.add(names);
			
			
		}
		//System.out.println(train);
		
		int listSize = train.size();
		
		System.out.println("ListSize"+listSize);
		
		Set<String> setnames = new LinkedHashSet<String>(train);
		
		int setSize = setnames.size();
		
		System.out.println("SetSize"+setSize);
		
		if(listSize==setSize) {
			
			System.out.println("No duplicates");
		}
		else {
			System.out.println("Duplicates Available");
		}
	

	}


	}

