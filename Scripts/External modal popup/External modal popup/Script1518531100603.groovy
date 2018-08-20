import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'C:\\Users\\ghetherington\\Katalon Studio\\HSBC AMG\\autoIT\\AMG credentials.exe'

Runtime.getRuntime().exec(autoit_prj)

Thread.sleep(3000)

//Sample URL. Please change it to your authentication URL
WebUI.navigateToUrl('http://hsbc.amg.sitecore.global.cd.rs.hwuat.co.uk/canada')

WebUI.maximizeWindow()

WebUI.scrollToPosition(328, 1694)

WebUI.click(findTestObject('External modal/Page_HSBC Global Asset Management C/RIA page link'))

WebUI.focus(findTestObject('External modal/Page_HSBC Global Asset Management C/External modal close'))

WebUI.click(findTestObject('External modal/Page_HSBC Global Asset Management C/External modal close'))

WebUI.scrollToPosition(328, 1694)

WebUI.delay(1)

WebUI.click(findTestObject('External modal/Page_HSBC Global Asset Management C/RIA page link'))

WebUI.focus(findTestObject('External modal/Page_HSBC Global Asset Management C/External modal cancel'))

WebUI.click(findTestObject('External modal/Page_HSBC Global Asset Management C/External modal cancel'))

WebUI.refresh()

WebUI.scrollToPosition(328, 1694)

WebUI.focus(findTestObject('External modal/Page_HSBC Global Asset Management C/RIA page link'))

WebUI.click(findTestObject('External modal/Page_HSBC Global Asset Management C/RIA page link'))

WebUI.focus(findTestObject('External modal/Page_HSBC Global Asset Management C (1)/External proceed'))

WebUI.click(findTestObject('External modal/Page_HSBC Global Asset Management C (1)/External proceed'))

WebUI.switchToWindowUrl('https://www.riacanada.ca/hsbc-gam-joins-ria/')

WebUI.waitForElementVisible(findTestObject('External modal/Page_HSBC Global Asset Management J/RIA H1'), 10)

WebUI.verifyElementPresent(findTestObject('External modal/Page_HSBC Global Asset Management J/RIA H1'), 10)

WebUI.closeBrowser()

