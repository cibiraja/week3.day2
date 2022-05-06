package week3.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[]args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(3000);
		String totalNumberOfItems=driver.findElement(By.xpath("//div[@class='length']")).getText();
        System.out.println("The count is" + totalNumberOfItems);
		List<WebElement>bagBrandList=driver.findElements(By.className("brand"));
		System.out.println("Size:" + bagBrandList.size());
		System.out.println("Brand Names are:");
		for(WebElement webElement : bagBrandList) {
			String text=webElement.getText();
			System.out.println(text);
		}
		List<WebElement>bagNameList=driver.findElements(By.className("nameCls"));
		System.out.println("Size:" + bagNameList.size());
		System.out.println("Names of the Bags");
		for(WebElement webElement : bagNameList) {
			String text= webElement.getText();
			System.out.println(text);
		}
		driver.close();
			
		
		}
		
		
		
	}
	


