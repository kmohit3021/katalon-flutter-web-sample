package webKeywords

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.event.InputEvent
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.regex.Matcher
import java.util.regex.Pattern

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.interactions.KeyInput
import org.openqa.selenium.interactions.Sequence

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class ApplicationFunction {


	@Keyword(keywordObject='WEB_CUSTOM_KEYWORD')
	public String extractTextFromContent(String msgcontent, String msgtext) {
		Pattern pattern = Pattern.compile(msgtext+"\\s*\\n([^\n]*)");
		Matcher matcher = pattern.matcher(msgcontent);

		if (matcher.find()) {
			return matcher.group(1).trim();
		}

		return null;
	}

	@Keyword(keywordObject='WEB_CUSTOM_KEYWORD')
	def static enhanced_SetViewportSize(int width, int height) {
		WebDriver webDriver = DriverFactory.getWebDriver()
		int browserWidthGap = webDriver.manage().window().getSize().width - Integer.parseInt(WebUiBuiltInKeywords.executeJavaScript('return (window.innerWidth || 0)', null).toString())
		int browserHeightGap = webDriver.manage().window().getSize().height - Integer.parseInt(WebUiBuiltInKeywords.executeJavaScript('return (window.innerHeight || 0)', null).toString())
		float ratio = Float.parseFloat(WebUiBuiltInKeywords.executeJavaScript('return (window.devicePixelRatio || 1)', null).toString())
		int actualWidth = Math.round((width + browserWidthGap * ratio) / ratio)
		int actualHeight = Math.round((height + browserHeightGap * ratio) / ratio)
		WebUiBuiltInKeywords.setViewPortSize(actualWidth, actualHeight)
	}

	@Keyword(keywordObject='WEB_CUSTOM_KEYWORD')
	def keyword_moveMouseAndClick(int x, int y) {
		Robot robot = new Robot()
		robot.mouseMove(2, 30)
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
		Thread.sleep(2000)
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
		robot.mouseMove(x,y)
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
		Thread.sleep(1000)
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
		WebUI.delay(2)
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		System.out.println("Browse button clicked");
		Thread.sleep(2000);
	}
}
