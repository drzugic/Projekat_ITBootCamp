package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.BusinessPage;
import utility.Constant;
import utility.ExcelUtils;

public class BusinessPage_Action {
	
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData, "Sheet1");
	}

	public static void AddNewBusinessTest (WebDriver driver) throws Exception {
		
		Thread.sleep(2000);
		BusinessPage.getBusinessBtn(driver).click();
		BusinessPage.getAddNewBusiness(driver).click();
		
		String businessName = ExcelUtils.getCellData(1, 1);
		String country = ExcelUtils.getCellData(1, 2);
		String city = ExcelUtils.getCellData(1, 3);
		String street = ExcelUtils.getCellData(1, 4);
		String zip = ExcelUtils.getCellData(1, 5);
		String regNumber = ExcelUtils.getCellData(1, 6);
		
		
		Thread.sleep(1000);
        BusinessPage.addBusinessName(driver, businessName);
        BusinessPage.addCountry(driver, country);
        BusinessPage.addCity(driver, city);
        BusinessPage.addStreet(driver, street);
        BusinessPage.addZip(driver, zip);
        BusinessPage.addRegistryNumber(driver, regNumber);
        
        BusinessPage.getAddBankAccount(driver).click();
        
        String bankName = ExcelUtils.getCellData(1, 8);
        String accountName = ExcelUtils.getCellData(1, 9);
        String swiftNumber = ExcelUtils.getCellData(1, 10);
        String paymentInstr = ExcelUtils.getCellData(1, 11);
        String currency = ExcelUtils.getCellData(1, 12);
        
        Thread.sleep(3000);
		BusinessPage.addBankName(driver, bankName);
		BusinessPage.addAccountNumber(driver, accountName);
		BusinessPage.addSwiftNumber(driver, swiftNumber);
		BusinessPage.addPaymentInstr(driver, paymentInstr);
		BusinessPage.getCurrencyLabel(driver);
		BusinessPage.addCurrency(driver, currency);
		BusinessPage.getAddAccount(driver).click();
    
        BusinessPage.getSaveBtn(driver).click();
	}
}