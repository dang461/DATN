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

WebUI.setText(findTestObject('Object Repository/Page_BOOKBUY.VN  Mua Sm Tin Li Sch, Bng V, _861a66/input_Lm p - Sc Khe_Term'), 
    'Combo Quà Tặng Cho Bé 9')

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_BOOKBUY.VN  Mua Sm Tin Li Sch, Bng V, _861a66/span_Lm p - Sc Khe_search1 icon-ic_search_24px'), 30)

WebUI.click(findTestObject('Object Repository/Page_BOOKBUY.VN  Mua Sm Tin Li Sch, Bng V, _861a66/span_Lm p - Sc Khe_search1 icon-ic_search_24px'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Kt qu tm kim/img_Combo Qu Tng Cho B 9_slimmage'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_Kt qu tm kim/img_Combo Qu Tng Cho B 9_slimmage'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Postcard Art T Mu CMA Studio Giy M Thu_ec4cfa/input_S lng_quantity'), 
    30)

WebUI.clearText(findTestObject('Object Repository/Page_Postcard Art T Mu CMA Studio Giy M Thu_ec4cfa/input_S lng_quantity'))

WebUI.setText(findTestObject('Object Repository/Page_Postcard Art T Mu CMA Studio Giy M Thu_ec4cfa/input_S lng_quantity'), 
    so_luong)

WebUI.click(findTestObject('Object Repository/Page_Postcard Art T Mu CMA Studio Giy M Thu_ec4cfa/button_Thm vo gi hng'))

WebUI.takeFullPageScreenshot(('.//Reports//ThemVaoGioHang//' + id) + '.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Postcard Art T Mu CMA Studio Giy M Thu_ec4cfa/h5_2 sn phm va c thm vo gi hng'), 
    thong_bao)

