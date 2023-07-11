package utils;

import models.ServerPlatform;

import static models.ServerPlatform.ANDROID;
import static models.ServerPlatform.IOS;

public class ActionProcessor {

	private static final ServerPlatform CONFIG_PLATFORM = IOS; //get from environment

	private static void doForPlatform(ServerPlatform platform, Runnable action) {
		if (CONFIG_PLATFORM.equals(platform)) {
			action.run();
		}
	}

	public static void doForAndroid(Runnable action) {
		doForPlatform(ANDROID, action);
	}

	public static void doForIos(Runnable action) {
		doForPlatform(IOS, action);
	}
}
