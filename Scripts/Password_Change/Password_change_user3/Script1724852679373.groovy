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

Mobile.tap(findTestObject('Object Repository/Password_Change_user3/android.widget.Button - Log In'), 0)

Mobile.setText(findTestObject('Object Repository/Password_Change_user3/android.widget.EditText'), 'test@user3.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Password_Change_user3/android.widget.EditText (1)'), 'p4y+y39Ir5Oy1MY8jPt0uQ==', 
    0)

Mobile.tap(findTestObject('Object Repository/Password_Change_user3/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Password_Change_user3/android.widget.TextView - Change Password'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Password_Change_user3/android.widget.EditText (2)'), 'p4y+y39Ir5M5s9+buYNYVA==', 
    0)

Mobile.tap(findTestObject('Object Repository/Password_Change_user3/android.widget.ImageButton (1)'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Password_Change_user3/android.widget.EditText (3)'), 'p4y+y39Ir5M5s9+buYNYVA==', 
    0)

Mobile.tap(findTestObject('Object Repository/Password_Change_user3/android.widget.Button - Change Password'), 0)

Mobile.getText(findTestObject('Object Repository/Password_Change_user3/android.widget.TextView - Password changed successfully'), 
    0)

Mobile.tap(findTestObject('Object Repository/Password_Change_user3/android.widget.Button - Okay'), 0)

Mobile.tap(findTestObject('Object Repository/Password_Change_user3/android.widget.LinearLayout (1)'), 0)

Mobile.closeApplication()

