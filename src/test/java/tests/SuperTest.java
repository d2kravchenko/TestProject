package tests;

import org.testng.annotations.Test;


public class SuperTest {

	@Test
	public void someTest() {


		System.out.println(System.getProperty("DATA") == null ?
				"NO DATA <<<"
				: System.getProperty("DATA")
		);
	}
}
