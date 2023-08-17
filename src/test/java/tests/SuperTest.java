package tests;

import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SuperTest {

	@Test
	@Story("Lalala")
	public static void someTest() {
		System.out.println(">>>TEST");
		Assert.assertTrue(true);
	}


}
