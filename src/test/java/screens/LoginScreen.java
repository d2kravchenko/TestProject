package screens;

import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import models.AndroidLocator;
import models.IosLocator;
import org.openqa.selenium.By;
import utils.ActionProcessor;
import utils.LocatorProcessor;

public class LoginScreen extends Form {

	private final ITextBox loginBtn = getElementFactory().getTextBox(LocatorProcessor.getLocator(
			new AndroidLocator(By.xpath("//xpathAndroid")),
			new IosLocator(By.xpath("//xpathIos"))), "Login Button");

	public LoginScreen() {
		super(By.xpath("//loginForm"), "Login Form");
	}

	public void clickLoginButton() {
		ActionProcessor.doForAndroid(loginBtn::click);
		ActionProcessor.doForIos(() -> {
			loginBtn.state().waitForDisplayed();
			loginBtn.click();
		});
	}
}
