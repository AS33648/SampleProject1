package test;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BasicValidationTest extends Base{
	@Test
	public void verifyUrl() {
		String expectedUrl= "https://en-gb.facebook.com/";
		String actualUrl= driver.getCurrentUrl();
		assertTrue(actualUrl.equals(expectedUrl), "Url validation failed");

	}
	@Test
	public void verifyTitle() {
		String expectedTitle= "Facebook – log in or sign up";
		String actualTitle= driver.getTitle();
		assertTrue(actualTitle.equals(expectedTitle), "Title validation failed");

	}
}
