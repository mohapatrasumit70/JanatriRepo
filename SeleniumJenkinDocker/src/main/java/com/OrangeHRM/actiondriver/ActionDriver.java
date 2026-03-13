package com.OrangeHRM.actiondriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrangeHRM.base.BaseClass;

public class ActionDriver {
	private WebDriver driver;
	private WebDriverWait wait;
	public ActionDriver(WebDriver driver) {
		this.driver = driver;
		Integer.parseInt(BaseClass.getprob().getProperty("explicitWait"));
		this.wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("WebDriver Is Created");
		
	}
	
	private void waitForElementToBeClickable(By by) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			System.out.println("waitForElementToBeClickable");
		}
		
	}
	private void waitForElementToBeVisible(By by) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			System.out.println("waitForElementToBeVisible");
		}
	}
	public void click(By by) {
		
		try {
			;
			driver.findElement(by).click();
		
		} catch (Exception e) {
			System.out.println("click");
		}
	}
	public void enterText(By by, String value) {
		try {
			waitForElementToBeVisible(by);
			
			WebElement element = driver.findElement(by);
			element.clear();
			element.sendKeys(value);
			
		} catch (Exception e) {
			System.out.println("SendKey"+ " enterText ");
		}
	}
	public String getText(By by) {
		try {
			waitForElementToBeVisible(by);
			
			return driver.findElement(by).getText();
		} catch (Exception e) {
			
			return "";
		}
	}
	public boolean compareText(By by, String expectedText) {
		try {
			waitForElementToBeVisible(by);
			String actualText = driver.findElement(by).getText();
			if (expectedText.equals(actualText)) {
				
				return true;
			} else {
				
				
				return false;
			}
		} catch (Exception e) {
			
		}
		return false;
	}
	public boolean isDisplayed(By by) {
		try {
			waitForElementToBeVisible(by);
			
			return driver.findElement(by).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void scrollToElement(By by) {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(by);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			System.out.println();
		}
	}

}
