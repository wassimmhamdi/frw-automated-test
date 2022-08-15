package com.e2eTests.automatedTests.steps;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

import com.e2eTests.automatedTests.utilis.Setup;

import cucumber.api.java.en.Given;

public class CommonSteps {

	public static Properties prop;

	@Given("^Je me connecte à l'application Arvea$")
	public void jeMeConnecteÀLApplicationArvea() throws Throwable {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/profiles/recette/profile.properties");
		prop.load(fis);
		Setup.driver.get(prop.getProperty("home.url"));
	}

	@Given("^I access to orange application$")
	public void jeMeConnecteÀLApplicationOrange() throws Throwable {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/profiles/recette/profile.properties");
		prop.load(fis);
		Setup.driver.get(prop.getProperty("home.url1"));
	}


	@Given("^J'accède à l'application$")
	public void jaccde_lapplication() throws Throwable {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/profiles/recette/profile.properties");
		prop.load(fis);
		Setup.driver.get(prop.getProperty("home.url2"));

	}













































	public void uploadFileWithRobot(String imagePath) {
		StringSelection stringSelection = new StringSelection(imagePath);
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.setContents(stringSelection, null);

		Robot robot = null;
		try {
			robot = new Robot();
		}catch(AWTException e){
			e.printStackTrace();
		}
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
