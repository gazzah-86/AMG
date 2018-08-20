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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'C:\\Users\\ghetherington\\Katalon Studio\\HSBC AMG\\autoIT\\AMG credentials.exe'

Runtime.getRuntime().exec(autoit_prj)

Thread.sleep(3000)

//Sample URL. Please change it to your authentication URL
WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/en/qualified-investor')

WebUI.maximizeWindow()

WebUI.click(findTestObject('a_Accept'))

WebUI.waitForElementVisible(findTestObject('Page_Fund information and resources/Page_Fund information and resources/Global search icon'), 
    5)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Fund information and resources/Page_Fund information and resources/Global search icon'))

WebUI.setText(findTestObject('Global search/Page_Qualified investors - HSBC Glo/Global search input'), 'fund')

WebUI.sendKeys(findTestObject('Global search/Page_Qualified investors - HSBC Glo/Global search input'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search results H1'), 
    5)

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search all results tab selected'), 
    'aria-selected', 'true', 2)

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search documents not selected'), 
    'aria-selected', 'false', 2)

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search videos not selected'), 
    'aria-selected', 'false', 2)

WebUI.click(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search documents not selected'))

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search documents selected'), 
    'aria-selected', 'true', 2)

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Page_Search Results - HSBC Global A/All results not selected'), 
    'aria-selected', 'false', 2)

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search videos not selected'), 
    'aria-selected', 'false', 2)

WebUI.click(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search videos not selected'))

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search documents not selected'), 
    'aria-selected', 'false', 2)

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Page_Search Results - HSBC Global A/All results not selected'), 
    'aria-selected', 'false', 2)

WebUI.click(findTestObject('Global search/Page_Search Results - HSBC Global A/Page_Search Results - HSBC Global A/All results not selected'))

WebUI.scrollToPosition(266, 4478)

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search previous not selected'), 
    'class', 'pagination__button pagination__button--previous disabled', 2)

WebUI.click(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search next selected'))

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Page 2 selected'), 'class', 
    'pagination__button pagination__button--item pagination__button--selected', 2)

WebUI.verifyElementAttributeValue(findTestObject('Global search/Page_Search Results - HSBC Global A/Global search previous selected'), 
    'class', 'pagination__button pagination__button--previous', 2)

WebUI.closeBrowser()

