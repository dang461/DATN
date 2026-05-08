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

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_BOOKBUY.VN  Mua Sm Tin Li Sch, Bng V, _861a66/span_Lm p - Sc Khe_search1 icon-ic_search_24px'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_BOOKBUY.VN  Mua Sm Tin Li Sch, Bng V, _861a66/span_Lm p - Sc Khe_search1 icon-ic_search_24px'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Kt qu tm kim/img_Combo Qu Tng Cho B 9_slimmage'), 30)

WebUI.click(findTestObject('Object Repository/Page_Kt qu tm kim/img_Combo Qu Tng Cho B 9_slimmage'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Combo Onikuma 9 (Tai Nghe K9 Pink Chut_bac8c6/button_Thm vo gi hng'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_Combo Onikuma 9 (Tai Nghe K9 Pink Chut_bac8c6/button_Thm vo gi hng'))

WebUI.click(findTestObject('Object Repository/Page_Postcard Art T Mu CMA Studio Giy M Thu_ec4cfa/a_Thanh ton'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton/input__txtEditFullName'), ho_ten)

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton/input__txtOrderEmail'), email)

if (!(tinh_tp.equals(''))) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Thanh ton/select_H Ch MinhH NiHi Phng NngCn ThAn Gian_0e93c8'), 
        '2', true)
}

if (!(quan_huyen.equals(''))) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Thanh ton/select_Ba nhHon KimTy HLong BinCu Giyng aHa_72188f'), 
        '25', true)
}

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton/textarea__txtEditAddr'), dia_chi)

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton/input_S in thoi khng hp l_txtEditTelephone'), di_dong)

WebUI.click(findTestObject('Object Repository/Page_Thanh ton/button_Giao n a ch ny'))

if (thong_bao.equals('Cảm ơn bạn đã mua hàng tại bookbuy.vn')) {
    WebUI.click(findTestObject('Object Repository/Page_Thanh ton/div_Vng,  ti mua thm_md-off'))

    WebUI.click(findTestObject('Object Repository/Page_Thanh ton/div_c u tin x l trc_md-off'))

    WebUI.click(findTestObject('Object Repository/Page_Thanh ton/button_t mua'))

    WebUI.verifyElementText(findTestObject('Object Repository/Page_Thanh ton thnh cng/p_Cm n bn  mua hng ti bookbuy.vn'), 
        'Cảm ơn bạn đã mua hàng tại bookbuy.vn')
} else {
    WebUI.verifyTextPresent(thong_bao, false)
}

WebUI.closeBrowser()

