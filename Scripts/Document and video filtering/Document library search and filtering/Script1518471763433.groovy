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
WebUI.navigateToUrl('http://hsbc.amg.sitecore.cd.rs.hwuat.co.uk/en/intermediary/investor-resources')

WebUI.maximizeWindow()

WebUI.click(findTestObject('a_Accept'))

WebUI.scrollToPosition(184, 523)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Fund information and resources/Document and library search'))

WebUI.setText(findTestObject('Page_Fund information and resources/Document and library search'), 'Govern')

WebUI.sendKeys(findTestObject('Page_Fund information and resources/Document and library search'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_Fund information and resources (1)/Doc and video clear button'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Fund information and resources (1)/Reset button'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Fund information and resources (1)/Global Investor Letter G7 G20 governments', 
        [('variable') : 'Global Investor Letter G7 G20 governments']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Fund information and resources (1)/Corporate Governance Global Voting Guidelines', 
        [('variable') : 'Corporate Governance Global Voting Guidelines']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('Page_Fund information and resources/Climate change policy article/Climate Change Policy', 
        [('variable') : 'Climate Change Policy']))

WebUI.click(findTestObject('Page_Fund information and resources (1)/Doc and video clear button'))

WebUI.verifyElementVisible(findTestObject('Page_Fund information and resources/Climate change policy article/Climate Change Policy'))

WebUI.click(findTestObject('Page_Fund information and resources/Document and library search'))

WebUI.setText(findTestObject('Page_Fund information and resources/Document and library search'), 'Guide')

WebUI.sendKeys(findTestObject('Page_Fund information and resources/Document and library search'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Page_Fund information and resources/Page_Fund information and resources (2)/GLF admin guide article'))

WebUI.verifyElementVisible(findTestObject('Page_Fund information and resources/Page_Fund information and resources (2)/GLF portal user guide'))

WebUI.verifyElementVisible(findTestObject('Page_Fund information and resources/Page_Fund information and resources (2)/Corporate governance global'))

WebUI.verifyElementNotVisible(findTestObject('Page_Fund information and resources/Climate change policy article/Climate Change Policy', 
        [('variable') : 'Climate Change Policy']))

WebUI.click(findTestObject('Page_Fund information and resources (1)/Reset button'))

WebUI.setText(findTestObject('Page_Fund information and resources/Document and library search'), 'Nothing to find')

WebUI.sendKeys(findTestObject('Page_Fund information and resources/Document and library search'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_Fund information and resources/Page_Fund information and resources (3)/No results found text'), 
    'No results found.')

WebUI.click(findTestObject('Page_Fund information and resources (1)/Reset button'))

WebUI.closeBrowser()

