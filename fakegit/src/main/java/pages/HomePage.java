package pages;

import org.openqa.selenium.By;


import commonmethods.BaseClass;
public class HomePage extends BaseClass

  
{
	
	public void productFilter() {
		
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		
	}
	
	public void productLowToHigh() {
		
		
		driver.findElement(By.xpath("//option[@value='lohi']")).click();
	}
	
	public void selectProduct() 
	{
		driver.findElement(By.xpath("//div[text()[normalize-space() = 'Test.allTheThings() T-Shirt (Red)']] ")).click();
	}
	
	public void addToCart() {
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add to cart']]")).click();
	}
	public void backToProduct() {
		driver.findElement(By.id("back-to-products")).click();
	}
	public void clickOnMenu() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
	}
	public void clickOnCross() {
		driver.findElement(By.id("react-burger-cross-btn")).click();
	}
		
	}
	

