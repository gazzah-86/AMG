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
WebUI.navigateToUrl('http://hsbc.amg.sitecore.cd.rs.hwuat.co.uk/en/institutional-investor')

WebUI.maximizeWindow()

WebUI.click(findTestObject('a_Accept'))

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://hsbc.amg.sitecore.cd.rs.hwuat.co.uk/en/institutional-investor/pagedoesnotexist')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, Keys.F5))

WebUI.verifyTextPresent('Sorry, the page you requested could not be found', false)

not_run: WebUI.verifyElementVisible(findTestObject('Page_Institutional investors - HSBC (1)/Page_404 Page not found (1)/GB country flag'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Institutional investors - HSBC (1)/Page_404 Page not found (1)/Swiss country flag'), 
    5)

WebUI.navigateToUrl('http://hsbc.amg.sitecore.cd.rs.hwuat.co.uk/en/institutional-investor/investment-expertise/multi-asset/pagedoesnotexist')

WebUI.verifyTextPresent('Sorry, the page you requested could not be found', false)

WebUI.closeBrowser()

WebUI.openBrowser('')

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'C:\\Users\\ghetherington\\Katalon Studio\\HSBC AMG\\autoIT\\AMG credentials.exe'

Runtime.getRuntime().exec(autoit_prj)

Thread.sleep(3000)

//Sample URL. Please change it to your authentication URL
WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/en/qualified-investor')

WebUI.maximizeWindow()

WebUI.click(findTestObject('a_Accept'))

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/en/qualified-investor/pagedoesnotexist')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, Keys.F5))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Page_Institutional investors - HSBC (1)/Page_404 Page not found/English_404'), 'Sorry, the page you requested could not be found')

WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/en/qualified-investor/investment-expertise/multi-asset/pagedoesnotexist')

WebUI.verifyElementText(findTestObject('Page_Institutional investors - HSBC (1)/Page_404 Page not found/English_404'), 'Sorry, the page you requested could not be found')

WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/de-ch/qualified-investor')

WebUI.click(findTestObject('a_Annehmen'))

WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/de-ch/qualified-investor/pagedoesnotexist')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, Keys.F5))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Page_Institutional investors - HSBC (1)/Page_404 Page not found/Page_404 Page not found/German error message'), 
    'Die von Ihnen angeforderte Seite konnte leider nicht gefunden werden.')

WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/de-ch/qualified-investor/investment-expertise/multi-asset/pagedoesnotexist')

WebUI.verifyElementText(findTestObject('Page_Institutional investors - HSBC (1)/Page_404 Page not found/Page_404 Page not found/German error message'), 
    'Die von Ihnen angeforderte Seite konnte leider nicht gefunden werden.')

WebUI.navigateToUrl(' http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/fr-ch/qualified-investor')

WebUI.click(findTestObject('a_Accepter'))

WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/fr-ch/qualified-investor/pagedoesnotexist')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, Keys.F5))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Page_Institutional investors - HSBC (1)/Page_404 Page not found/Page_404 Page not found/French error page'), 
    'Désolés, la page que vous avez demandée est introuvable')

WebUI.navigateToUrl('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/fr-ch/qualified-investor/investment-expertise/multi-asset/pagedoesnotexist')

WebUI.verifyElementText(findTestObject('Page_Institutional investors - HSBC (1)/Page_404 Page not found/Page_404 Page not found/French error page'), 
    'Désolés, la page que vous avez demandée est introuvable')

WebUI.closeBrowser()

