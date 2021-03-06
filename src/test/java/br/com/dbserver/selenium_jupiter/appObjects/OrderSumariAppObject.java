package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class OrderSumariAppObject {
	private WebDriver driver;
	
	public OrderSumariAppObject(WebDriver driver) {
		this.driver = driver;
	}	
	public WebElement getIconfirmButton() {
		return ElementsTools.waitForElement(this.driver, By.cssSelector("button.button-medium > span"));
	}
}
