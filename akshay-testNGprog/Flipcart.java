package locatorsANDbasics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipcart 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Downloads\\\\Compressed\\\\chromedriver.exe") ;
	WebDriver driver8= new ChromeDriver();
	driver8.manage().window().maximize();
	driver8.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
driver8.get("https://www.flipkart.com");
driver8.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//driver8.findElement(By.xpath("//div[text()='Toys R us, Hot Wheels & more']")).click();
driver8.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi mobiles");
driver8.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//driver8.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']//following-sibling::div//div//div//following-sibling::div[@class='_4921Z t0pPfW' and @title='realme']")).click();
driver8.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']//following-sibling::div//div//div//following-sibling::div[@class='_4921Z t0pPfW' and @title='APPLE']")).click();

//here we are just changing title name i.e. Mi, realme, APPLE,etc

}
}




