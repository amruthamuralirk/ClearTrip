package com.classPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class page {

	WebDriver driver;
	public page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By train= By.xpath("//li[@class='flightApp']/a[@title='Find flights from and to international destinations around the world']");
	By from= By.xpath("//input[@name='origin']");
	By to= By.xpath("//input[@name='destination']");
	
	By calender=By.xpath("//dl[@class='vertical']/dd/div/a[@class='calendarIcon']/i");
	By adult=By.xpath("//select[@id='Adults']");
	By search=By.xpath("//input[@id='SearchBtn']");
	By slider=By.xpath("//*[@id=\"root\"]/div/main/div/div/div[1]/div/aside/div[4]/div[4]/div[2]/div/div[1]/div/span/span[1]/div");
	public void from(String _from)
	{
		driver.findElement(train).click();
		driver.findElement(from).sendKeys(_from+Keys.ENTER);
	}
	public void destination (String towards)
	{
		driver.findElement(to).sendKeys(towards+Keys.ENTER);
		
	}
	
	public void click_on_calender(String date) {
		driver.findElement(calender).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td/a[text()='"+date+"']")).click();;
	}
	public void adult_passenger_no(String num) {
		Select ne=new Select(driver.findElement(adult));
		ne.selectByVisibleText(num);
		
	}
	public void searchbutton() {
		driver.findElement(search).click();
		
	}
	
}
