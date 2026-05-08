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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseURL)

// Resize window để tránh lỗi headless
WebUI.setViewPortSize(1920,1080)

WebUI.click(findTestObject('Object Repository/Page_BOOKBUY.VN  Mua Sm Tin Li Sch, Bng V, _861a66/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp/input_hoc ng nhp dng email_UserName'), email)

WebUI.setText(findTestObject('Object Repository/Page_ng nhp/input_hoc ng nhp dng email_Password'), mat_khau)

WebUI.click(findTestObject('Object Repository/Page_ng nhp/input_hoc ng nhp dng email_btn-login'))

WebUI.takeFullPageScreenshot('.//Reports//DangNhap//' + id + '.png')

if (thong_bao.equals('Đăng nhập thành công')) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BOOKBUY.VN  Mua Sm Tin Li Sch, Bng V, _861a66/span_Kim tra n hng_glyphicon glyphicon-user'), 
        30)
} else {
    WebUI.verifyElementText(findTestObject('Object Repository/Page_ng nhp/li_The Password field is required'), thong_bao)
}

WebUI.closeBrowser()

