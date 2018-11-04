package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Constant;
import utility.ExcelUtils;

public class SignIn_Action {
	
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData, "Sheet2");
	}
	
	public static void SignInTest (WebDriver driver) throws Exception {
	
		String email = ExcelUtils.getCellData(1, 1);
		String password = ExcelUtils.getCellData(1, 2);
		
		driver.findElement(By.id("login-form-email")).sendKeys(email);
		driver.findElement(By.id("login-pass")).sendKeys(password);
		driver.findElement(By.id("login-form-btn")).click();
}
}