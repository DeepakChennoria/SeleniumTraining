package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.commonfunctions.element;
import com.objectrepository.OR;

public class DraganddropPage {

	
	WebDriver driver;
	element welement;
	
	
	
	public DraganddropPage(WebDriver driver)
	{
		this.driver=driver;
		welement = new element(driver);
		
	}
	
	public String getTextDragandDrop()
	{
		return welement.getText(OR.verifytextDraganddrop);
	}
	public void draganddrop()
	{
		welement.draganddrop(OR.DragA,OR.DropB);
	}
	
	public void DragAndDropExample() {
		driver.get("https://demoqa.com/droppable/");
		welement.draganddrop(By.xpath("//div[contains(@class,'ui-draggable')]//p"),By.xpath("//div[contains(@class,'ui-droppable')]//p"));
	}
	
	public void DragAndDropWithMouseActionsExample() {
		driver.get("https://demoqa.com/droppable/");
		welement.DragAndDropWithMouseActions(By.xpath("//div[contains(@class,'ui-draggable')]//p"),By.xpath("//div[contains(@class,'ui-droppable')]//p"));	
	}
	public void DragAndDropWithMouseKeysExample() {
		driver.get("https://demoqa.com/droppable/");
		welement.DragAndDropWithKeys(By.xpath("//div[contains(@class,'ui-draggable')]//p"),By.xpath("//div[contains(@class,'ui-droppable')]//p"));	
	}
	public void DragAndDropWithOffsetExample() {
		driver.get("https://demoqa.com/droppable/");
		welement.draganddropWithOffsets(By.xpath("//div[contains(@class,'ui-draggable')]//p"),By.xpath("//div[contains(@class,'ui-droppable')]//p"));	
	}
}
