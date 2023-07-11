package utils;

import models.AndroidLocator;
import models.ServerPlatform;
import models.IosLocator;
import org.openqa.selenium.By;

import static models.ServerPlatform.IOS;


public class LocatorProcessor {

	private static final ServerPlatform CONFIG_PLATFORM = IOS; //get from environment
	public static By getLocator(AndroidLocator androidLocator, IosLocator iosLocator) {
		switch (CONFIG_PLATFORM) {
			case ANDROID:
				return androidLocator.getLocator();
			case IOS:
				return iosLocator.getLocator();
			default:
				throw new RuntimeException(String.format("Platform '%s' is not supported. Can't get locator for element.",
						CONFIG_PLATFORM));
		}
	}
}
