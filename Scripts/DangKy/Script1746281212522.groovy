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

WebUI.click(findTestObject('Object Repository/Page_BOOKBUY.VN  Mua Sm Tin Li Sch, Bng V, _861a66/a_ng k'))

if (!gioi_tinh.equals("")) {
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ng k thnh vin/select_AnhChChAnhLGBT'), '1', true)
}

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin/input_hoc ng k dng email_FullName'), ho_ten)

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin/input_hoc ng k dng email_UserName'), email)

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin/input_hoc ng k dng email_Birthday'), ngay_sinh)

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin/input_hoc ng k dng email_Password'), mat_khau)

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin/input_hoc ng k dng email_ConfirmPassword'), nhap_lai_mat_khau)

WebUI.click(findTestObject('Object Repository/Page_ng k thnh vin/input_hoc ng k dng email_btn-register'))

WebUI.takeFullPageScreenshot('.//Reports//DangKy//' + id + '.png')

if (thong_bao.equals('Đăng ký thành công')) {
    WebUI.verifyElementText(findTestObject('Object Repository/Page_ng k thnh cng/div_Ch mt bc na thi bn i Kim tra Email v kc_f0af87'), 
        'Chỉ một bước nữa thôi bạn ơi! Kiểm tra Email và kích hoạt theo hướng dẫn để hoàn tất đăng ký tài khoản nhé! (hoặc xem trong Spam/Bulk nếu không có trong Inbox).\n \n Cám ơn bạn đã tham gia BookBuy.')
} else {
    WebUI.verifyElementText(findTestObject('Object Repository/Page_ng k thnh vin/li_Mt khu khng khp'), thong_bao)
}

WebUI.closeBrowser()

