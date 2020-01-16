import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manaa\\OneDrive\\Desktop\\Selenium work\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.commbank.com.au/");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"gloNavUnauth\"]/nav[1]/div/div/ul[2]/li[2]"));
		String text=element.getText();

		//For printing the text in console output

		System.out.println("Text obtained is "+text);
		// For verification use if else (conditional statements)

		if(text.contains("Log on")) {

		System.out.println("Expected text is obtained");

		}else{

		System.out.println("Expected text is not obtained");

		}
		
		//to find image size
		
		WebElement image= driver.findElement(By.xpath("//*[@id=\"gloNavUnauth\"]/nav[1]/div/ul/li[2]/a/img"));
		int ImageWidth = image.getSize().getWidth();
		System.out.println("Image width is "+ImageWidth+" pixels");
		int ImageHeight = image.getSize().getHeight();        
        System.out.println("Image height is "+ImageHeight+" pixels");
        
        //to verify presence of an element - negative scenario
        if(driver.findElements(By.tagName("New")).size() != 0){
        	System.out.println("Element is Present");
        	}else{
        	System.out.println("Element is Absent");
        	}
        
        //Clicking on Logon and closing browser
		driver.findElement(By.xpath("//*[@id=\"gloNavUnauth\"]/nav[1]/div/div/ul[2]/li[2]")).click();
		driver.close();
		
	}

}
