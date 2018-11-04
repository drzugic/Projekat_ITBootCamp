package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class ClientsPage_Action {

	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData, "Sheet3");
	}

	public static void AddNewClientTest (WebDriver driver) throws Exception {
		
		Thread.sleep(2000);
		ClientsPage.getClientList(driver).click();
		Thread.sleep(2000);
		ClientsPage.getAddNewClient(driver).click();
		
		String clientName = ExcelUtils.getCellData(1, 1);
		String contactName = ExcelUtils.getCellData(1, 2);
		String Email = ExcelUtils.getCellData(1, 3);
		String regNumber = ExcelUtils.getCellData(1, 4);
		String countryName = ExcelUtils.getCellData(1, 5);
		String city = ExcelUtils.getCellData(1, 6);
		String street = ExcelUtils.getCellData(1, 7);
		String zip = ExcelUtils.getCellData(1, 8);
		String code = ExcelUtils.getCellData(1, 9);
		String status = ExcelUtils.getCellData(1, 10);
		
		Thread.sleep(2000);
		ClientsPage.addClientName(driver, clientName);
		ClientsPage.addContactName(driver, contactName);
		ClientsPage.addEmail(driver, Email);
		ClientsPage.addRegNumber(driver, regNumber);
		ClientsPage.addCountry(driver, countryName);
		ClientsPage.addCity(driver, city);
		ClientsPage.addStreet(driver, street);
		ClientsPage.addZip(driver, zip);
		ClientsPage.addCode(driver, code);
		ClientsPage.addStatus(driver, status);
		ClientsPage.getSave(driver).click();
}
}