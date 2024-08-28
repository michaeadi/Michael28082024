import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/michaeladinebo/Downloads/QA_Dev_test_test_build.apk', true)

Mobile.getText(findTestObject('Object Repository/affiliate_sign_up/android.widget.Button - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/affiliate_sign_up/android.widget.Button - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/affiliate_sign_up/android.widget.TextView - Sign up as an affiliate'), 0)

Mobile.getText(findTestObject('Object Repository/affiliate_sign_up/android.widget.Button - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/affiliate_sign_up/android.widget.Button - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/affiliate_sign_up/android.widget.TextView - Choose Affiliate'), 0)

Mobile.tap(findTestObject('Object Repository/affiliate_sign_up/android.widget.TextView - Kuye and Co'), 0)

Mobile.setText(findTestObject('Object Repository/affiliate_sign_up/android.widget.EditText'), 'Dell', 0)

Mobile.setText(findTestObject('Object Repository/affiliate_sign_up/android.widget.EditText (1)'), 'Kings', 0)

Mobile.setText(findTestObject('Object Repository/affiliate_sign_up/android.widget.EditText (2)'), 'dellking@gmail.com', 
    0)

Mobile.hideKeyboard()

Mobile.setEncryptedText(findTestObject('Object Repository/affiliate_sign_up/android.widget.EditText (3)'), 'p4y+y39Ir5M5s9+buYNYVA==', 
    0)

Mobile.tap(findTestObject('Object Repository/affiliate_sign_up/android.widget.ImageButton'), 0)

Mobile.hideKeyboard()

Mobile.setEncryptedText(findTestObject('Object Repository/affiliate_sign_up/android.widget.EditText (4)'), 'p4y+y39Ir5M5s9+buYNYVA==', 
    0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Object Repository/affiliate_sign_up/android.widget.Button - Sign Up'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/affiliate_sign_up/android.widget.TextView - Loading, please wait'), 
    0)

Mobile.getText(findTestObject('Object Repository/affiliate_sign_up/android.widget.TextView - Onboarding Successful'), 0)

Mobile.tap(findTestObject('Object Repository/affiliate_sign_up/android.widget.Button - Done'), 0)

Mobile.closeApplication()

