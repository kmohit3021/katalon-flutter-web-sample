import java.sql.Connection as Connection
import java.sql.DriverManager as DriverManager
import java.sql.SQLException as SQLException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.online-calculator.com//html5/simple/index.php?v=10')

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Canvas'), -186, -118)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Canvas'), -190, 214)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Canvas'), 173, -7)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Canvas'), -71, -118)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Canvas'), 46, 104)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Canvas'), 48, 211)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

