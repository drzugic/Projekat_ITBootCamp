package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import appModules.BusinessPage_Action;
import appModules.ClientsPage_Action;
import appModules.SignIn_Action;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);
		
        SignIn_Action.SetUpExcel();
        SignIn_Action.SignInTest(driver);
        ExcelUtils.setCellData("Pass", 1, 3);
        
        BusinessPage_Action.SetUpExcel();
        BusinessPage_Action.AddNewBusinessTest(driver);
        ExcelUtils.setCellData("Pass", 1, 13);
        
        ClientsPage_Action.SetUpExcel();
        ClientsPage_Action.AddNewClientTest(driver);
        ExcelUtils.setCellData("Pass", 1, 11);
        
        driver.findElement(By.xpath("//i[@class='v-icon material-icons material-icons']")).click();
        driver.findElement(By.xpath("//div[@class='v-btn__content'][contains(text(),'Logout')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).click();
	}
}