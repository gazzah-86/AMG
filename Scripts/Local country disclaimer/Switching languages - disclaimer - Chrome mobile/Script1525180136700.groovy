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

WebUI.authenticate('http://hsbc.amg.sitecore.ch.cd.rs.hwuat.co.uk/en/qualified-investor', 'client.uat', 'He4thw4ll4ce', 
    10)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('h3_Terms and conditions'), 'Terms and conditions')

WebUI.click(findTestObject('a_Accept'))

WebUI.maximizeWindow()

WebUI.refresh()

WebUI.click(findTestObject('Country_switcher'))

WebUI.click(findTestObject('a_Deutsch'))

WebUI.verifyElementPresent(findTestObject('h3_Nutzungsbedingungen'), 2)

WebUI.click(findTestObject('a_Annehmen', [('variable') : '']))

WebUI.verifyElementClickable(findTestObject('a_Emerging Markets Investor Gu'))

WebUI.waitForElementVisible(findTestObject('Country_switcher'), 5)

WebUI.verifyElementClickable(findTestObject('Country_switcher'), FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.click(findTestObject('Country_switcher'))

WebUI.click(findTestObject('a_Franais'))

WebUI.verifyElementPresent(findTestObject('h3_Conditions gnrales'), 2)

WebUI.click(findTestObject('a_Accepter'))

WebUI.closeBrowser()

