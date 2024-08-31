package week6.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("The firstelement in table is "+val);
		List<WebElement> rows=driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowCount=rows.size();
		System.out.println("The total number of rows in the table is "+rowCount);
		List<WebElement> columns=driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int colCount=columns.size();
		System.out.println("The total number of columns in the table is "+colCount);
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				String data=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data);
			}
		}
			
	}

}
