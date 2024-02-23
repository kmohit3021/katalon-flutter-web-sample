import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.support.Color as Color

WebUI.openBrowser('')

//WebUI.maximizeWindow()
WebUI.setViewPortSize(1400, 750)

WebUI.navigateToUrl('https://gday-parks-app-v2---test.web.app/')

WebUI.delay(2)

WebUI.click(findTestObject('OR Flutter/button_Deal Results'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

// Cast the WebDriver instance to JavascriptExecutor
//JavascriptExecutor jsExecutor = (JavascriptExecutor)driver
JavascriptExecutor jsExecutor = (JavascriptExecutor)driver

// Execute JavaScript code to interact with Shadow DOM
String jsScript = 'const shadowDOM = document.querySelector(\'flt-glass-pane\').shadowRoot;\n const hiddenButton = shadowDOM.querySelector(\'[aria-label="Enable accessibility"]\');\n hiddenButton.click();'

// Execute the JavaScript code
jsExecutor.executeScript(jsScript)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('OR Flutter/View Full Condition - Belmont (Geelong)'), -60, 90)

WebUI.delay(2)

WebUI.click(findTestObject('OR Flutter/Button_closeModal'))

WebUI.clickOffset(findTestObject('OR Flutter/View Full Condition - Halls Gap'), -60, 110)

WebUI.click(findTestObject('OR Flutter/Button_closeModal'))

WebUI.delay(2)

String textcloor = WebUI.getCSSValue(findTestObject('OR Flutter/button_Apply Deal'), 'color')

String backcolor = WebUI.getCSSValue(findTestObject('OR Flutter/button_Apply Deal'), 'background-color')

String textcolorvalue2 = Color.fromString(textcloor).asHex()

String backcolorvalue2 = Color.fromString(backcolor).asHex()

println('Apply button color Value: ' + textcolorvalue2)

System.out.println('Hex code for color:' + backcolorvalue2)

WebUI.click(findTestObject('OR Flutter/button_Apply Deal'))

WebUI.delay(2)

WebUI.delay(2)

not_run: WebUI.closeBrowser()

