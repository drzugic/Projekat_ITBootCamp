package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {
	
	public static WebElement getBusinessBtn(WebDriver driver) {
		WebElement business = driver.findElement(By.id("nav-bar-business"));
		return business;
	}
	public static WebElement getAddNewBusiness(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement addNewBusiness = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']")));
        return addNewBusiness;
	}

	/*public static WebElement getBusinessName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='business-form-name']")));
		return name;
	}*/
	public static WebElement getBusinessName(WebDriver driver) {
		WebElement name = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return name;
	}

	public static void addBusinessName(WebDriver driver, String businessName) {
		getBusinessName(driver).sendKeys(businessName);
	}

	public static WebElement getCountries(WebDriver driver) {
		WebElement country = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return country;
	}

	public static void addCountry(WebDriver driver, String countryName) throws InterruptedException
	{   
	Actions builder = new Actions(driver);
	Actions country = builder
	.moveToElement(getCountries(driver))
	.click()
	.sendKeys(countryName);
	country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
	country.perform();
	}
	
	public static WebElement getCity(WebDriver driver) {
		WebElement city = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return city;
	}

	public static void addCity (WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}
	
	public static WebElement getStreet(WebDriver driver) {
		WebElement street = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return street;
	}

	public static void addStreet (WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}
	
	public static WebElement getZip(WebDriver driver) {
		WebElement zip = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		return zip;
	}

	public static void addZip (WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}
	
	public static WebElement getRegistryNumber(WebDriver driver) {
		WebElement regNumber = driver.findElement(By.id("business-form-reg-num"));
		return regNumber;
	}

	public static void addRegistryNumber (WebDriver driver, String regNumber) {
		getRegistryNumber(driver).sendKeys(regNumber);
	}
	
	public static WebElement getAddBankAccount(WebDriver driver) {
		WebElement bankAccount = driver
				.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		return bankAccount;
	}
	
	
	public static WebElement getBankName(WebDriver driver) {
		WebElement bankName = driver.findElement(By.id("bank-dialog-name"));
		return bankName;
	}

	public static void addBankName(WebDriver driver, String bankName) {
		getBankName(driver).sendKeys(bankName);
	}
	
	public static WebElement getAccountNumber(WebDriver driver) {
		WebElement accountNumber = driver.findElement(By.id("bank-dialog-num"));
		return accountNumber;
	}

	public static void addAccountNumber (WebDriver driver, String accountNumber) {
		getAccountNumber(driver).sendKeys(accountNumber);
	}
	
	public static WebElement getSwiftNumber(WebDriver driver) {
		WebElement swiftNumber = driver.findElement(By.id("bank-dialog-swf-num"));
		return swiftNumber;
	}

	public static void addSwiftNumber (WebDriver driver, String swiftNumber) {
		getSwiftNumber(driver).sendKeys(swiftNumber);
	}
	
	public static WebElement getPaymentInstr(WebDriver driver) {
		WebElement paymentInstr = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return paymentInstr;
	}

	public static void addPaymentInstr (WebDriver driver, String paymentInstr) {
		getPaymentInstr(driver).sendKeys(paymentInstr);
	}

	public static void getCurrencyLabel(WebDriver driver) {
		WebElement currency = driver.findElement(By.xpath("//label[contains(text(),'Currency')]"));
		currency.click();
	}
	public static WebElement getCurrency(WebDriver driver, String currenncies) {
		WebElement currency = driver.findElement(By.xpath("//div[contains(text(),'" + currenncies + "')]"));
		return currency;
	}
	public static void addCurrency(WebDriver driver, String currencies ) {
		getCurrency(driver, currencies).click();
	}
	
	public static WebElement getAddAccount(WebDriver driver) {
		WebElement addAccount = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return addAccount;
	}

	public static WebElement getSaveBtn(WebDriver driver) {
		WebElement saveBtn = driver.findElement(By.cssSelector("#business-form-save-btn > div"));
		return saveBtn;
	}

}




