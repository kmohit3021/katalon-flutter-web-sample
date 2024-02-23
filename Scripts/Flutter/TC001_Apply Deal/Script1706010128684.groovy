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

WebUI.openBrowser('')

WebUI.maximizeWindow()

not_run: WebUI.setViewPortSize(1400, 750)

WebUI.navigateToUrl('https://gday-parks-app-v2---test.web.app/')

WebUI.delay(2)

WebUI.click(findTestObject('OR Flutter/Button_Deals-link'))

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

WebUI.click(findTestObject('OR Flutter/button_Apply Deal'))

WebUI.delay(2)

// Execute the JavaScript code
jsExecutor.executeScript(jsScript)

//WebUI.click(findTestObject('OR Flutter/button_Remove Deal'))

WebUI.back()

WebUI.delay(2)

WebUI.click(findTestObject('OR Flutter/button_Park Info'))

boxText = WebUI.getAttribute(findTestObject('OR Flutter/text_Box'), 'aria-label')

println('Box Text is: ' + boxText)

WebUI.delay(2)

WebUI.click(findTestObject('OR Flutter/button_See and Do'))

boxText = WebUI.getAttribute(findTestObject('OR Flutter/text_Box'), 'aria-label')

println('Box Text is: ' + boxText)

WebUI.delay(2)

WebUI.click(findTestObject('OR Flutter/button_Groups and Functions'))

boxText = WebUI.getAttribute(findTestObject('OR Flutter/text_Box'), 'aria-label')

println('Box Text is: ' + boxText)

WebUI.delay(2)

WebUI.click(findTestObject('OR Flutter/button_Reviews'))

boxText = WebUI.getAttribute(findTestObject('OR Flutter/text_Box'), 'aria-label')

println('Box Text is: ' + boxText)

WebUI.delay(2)

WebUI.click(findTestObject('OR Flutter/button_Current Deals'))

currentDealsText = WebUI.getAttribute(findTestObject('OR Flutter/text_Current Deals'), 'aria-label')

println('currentDealsText Text is: ' + currentDealsText)

bookingPeriod = CustomKeywords.'webKeywords.ApplicationFunction.extractTextFromContent'(currentDealsText, 'Booking Period')

println('Booking Period is: ' + bookingPeriod)

stayDates = CustomKeywords.'webKeywords.ApplicationFunction.extractTextFromContent'(currentDealsText, 'Stay Dates')

println('Stay Dates is: ' + stayDates)

nightStayRange = CustomKeywords.'webKeywords.ApplicationFunction.extractTextFromContent'(currentDealsText, 'Night Stay Range')

println('Night Stay Range is: ' + nightStayRange)

WebUI.delay(2)

CustomKeywords.'webKeywords.ApplicationFunction.keyword_moveMouseAndClick'(160, 800)

WebUI.delay(5)

WebUI.closeBrowser()

