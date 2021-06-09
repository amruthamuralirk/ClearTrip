package com.Tests;

import org.testng.annotations.Test;

import com.baseclass.WrapperClass;
import com.classPages.page;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class cleartripTest extends WrapperClass{
  @Test
  public void f() throws InterruptedException {
	  page obj= new page(driver);
	  obj.from("chennai");
	  obj.destination("coimbatore");
	  obj.click_on_calender("20");
	  obj.adult_passenger_no("4");
	  obj.searchbutton();
	  Thread.sleep(5000);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  applaunch("chrome", "https://www.cleartrip.com/");
  }

  @AfterMethod
  public void afterTest() {
	  Quit();
  }

}
