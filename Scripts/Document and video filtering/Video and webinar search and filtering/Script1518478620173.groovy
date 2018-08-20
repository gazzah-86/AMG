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
WebUI.navigateToUrl('http://hsbc.amg.sitecore.cd.rs.hwuat.co.uk/en/institutional-investor/investor-resources/videos-and-webinars')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER, Keys.F5))

WebUI.maximizeWindow()

WebUI.click(findTestObject('a_Accept'))

WebUI.refresh()

WebUI.click(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Page_Institutional investors - HSBC/button_Hide breaking news bann'))

WebUI.delay(2)

WebUI.check(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed/Webinar checkbox'))

WebUI.verifyElementText(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed/Webinar no results found'), 
    'No results found.')

WebUI.delay(2)

WebUI.click(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed/Webinar checkbox'))

WebUI.setText(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed/Video and webinar search'), 'Asset')

WebUI.sendKeys(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed/Video and webinar search'), Keys.chord(
        Keys.ENTER))

WebUI.scrollToPosition(727, 987)

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (2)/To 2018 and beyond intro text', 
        [('variable') : 'To 2018 and beyond: Macro and Multi-Asset Outlook']))

WebUI.verifyElementNotVisible(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/To 2018 and beyond Global Equities Outlook'))

WebUI.scrollToPosition(820, 183)

WebUI.click(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Reset link video page'))

WebUI.verifyElementVisible(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/To 2018 and beyond Global Equities Outlook'))

WebUI.setText(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed/Video and webinar search'), 'Income')

WebUI.sendKeys(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed/Video and webinar search'), Keys.chord(
        Keys.ENTER))

WebUI.scrollToPosition(727, 987)

WebUI.verifyElementVisible(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Page_Videos and Webinars - Intermed/To 2018 and beyond Global Fixed Income Outlook summary text'))

WebUI.verifyElementNotVisible(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/To 2018 and beyond Global Equities Outlook'))

WebUI.scrollToPosition(820, 183)

WebUI.click(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Reset link video page'))

WebUI.click(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Page_Videos and Webinars - Intermed (2)/Image To 2018 and beyond Global alternative investments outlook'))

WebUI.scrollToPosition(195, 1246)

WebUI.verifyElementText(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Page_To 2018 and beyond Global Alte/Video page To 2018 and beyond Global alternative investments outlook'), 
    'To 2018 and beyond: Global alternative investments outlook')

WebUI.back()

WebUI.scrollToPosition(384, 870)

WebUI.click(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Page_Videos and Webinars - Intermed (1)/Image To 2018 and beyond Global liquidity outlook'))

WebUI.scrollToPosition(195, 1246)

WebUI.verifyElementText(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Page_To 2018 and beyond Liquidity O/Video page To 2018 and beyond Global liquidity outlook'), 
    'To 2018 and beyond: Global liquidity outlook')

WebUI.back()

WebUI.click(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Page_Videos and Webinars - Intermed (1)/Image To 2018 and beyond Macro and Multi-Asset Outlook'))

WebUI.scrollToPosition(195, 1246)

WebUI.verifyElementText(findTestObject('Video and webinars/Page_Videos and Webinars - Intermed (3)/Page_To 2018 and beyond Macro and M/Video page To 2018 and beyond Macro and Multi-Asset Outlook'), 
    'To 2018 and beyond: Macro and Multi-Asset Outlook')

WebUI.closeBrowser()

