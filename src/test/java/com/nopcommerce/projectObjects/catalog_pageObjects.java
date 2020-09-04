package com.nopcommerce.projectObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class catalog_pageObjects {
    public WebDriver ldriver;
    public catalog_pageObjects(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    By lnkCatalog_menu = By.xpath("//a[@href='#']//span[contains(text(),'Catalog')]");
    By lnk_products = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Products')]");
    By lnk_categories = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Categories')]");
    By lnk_manufactures = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Manufacturers')]");
    By lnk_product_Reviews = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Product reviews')]");
    By lnk_productTags = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Product tags')]");
    By lnk_Attributes = By.xpath("//a[@href='#' ]//span[contains(text(),'Attributes')]");
    //insideAttribteLink
    By lnk_ProductAttributes = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Product attributes')]");
    By lnk_SpecificaesAttributes = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Specification attributes')]  ");
    By lnk_CheckoutAttributes = By.xpath("//span[@class='menu-item-title' ][contains(text(),'Checkout attributes')]  ");
    By txt_ProductSearchByProductName = By.xpath("//input[@id='SearchProductName']");
    By select_productCatagory = By.xpath("//select[@id='SearchCategoryId']");
    By click_Searchsubcatagories = By.xpath("//input[@id='SearchIncludeSubCategories']");
    By select_SearchManufactures = By.xpath("//select[@id='SearchManufacturerId']");
    By select_Searchvendor = By.xpath("//select[@id='SearchVendorId']");
    By select_SearchWharehouse = By.xpath("//select[@id='SearchWarehouseId']");
    By select_searchProductType= By.xpath("//select[@id='SearchProductTypeId']");
    By select_searchPublish = By.xpath("//select[@id='SearchPublishedId']");
    By txt_SearchproductSKU = By.xpath("//input[@id='GoDirectlyToSku']");
    By click_SearchproductSKU = By.xpath("//button[@id='go-to-product-by-sku']");
    By click_ProductSearch = By.xpath("//button[@id='search-products']");
    //Inside SKU
    By clickONProductInfo = By.xpath("//i[@class='toggle-icon fa fa-minus']");
    By txt_ProductName = By.xpath("//input[@name = 'Name']");
    By txt_ProductDiscription = By.xpath("//textarea[@name = 'ShortDescription']");
    By click_FIle = By.xpath("//button[@id = 'mce_44-open']");
    By click_NewDocument = By.xpath("//span[@id = 'mce_68-text']");
    By click_Insert = By.xpath("//button[@id = 'mce_46-open']");
    By click_SelectDate = By.xpath("//span[contains(text(),'Insert date/time')]");
    By selected_date = By.xpath("//span[@id='mce_81-text']");
    By click_View = By.xpath("//button[@id = 'mce_47-open']");
    By click_SelectPreview = By.xpath("//div[@id='mce_87']");
    By click_PreviewClose = By.xpath("//div[@class='mce-widget mce-btn mce-first mce-last mce-abs-layout-item']");
    By click_Format = By.xpath("//button[@id = 'mce_48-open']");
    By click_SelectFormetBold = By.xpath("//span[contains(text(),'Bold')]");

    By click_InsertTable = By.xpath("//button[@id = 'mce_49-open']//span[contains(text(),'Table')]");
    By click_tableData = By.xpath("//span[contains(text(),'Insert table')]");
    By select_TableClmn = By.xpath("//div[@id = 'mce_105']");
    By tableSize = By.xpath("//*[@id='mcegrid36']");
    //to get text inside the popupbox
    By selectTool = By.xpath("//button[@id='mce_50-open']");
    By SourceCode = By.xpath("//span[contains(text(),'Source code')]");
    By textAreaInSidePopup = By.xpath("//button[contains(text(),'Ok')]");

    By txtStyleleft = By.xpath("//div[@id='mce_21']");
    By txtStyleRight = By.xpath("//div[@id='mce_22']");
    By txtBold = By.xpath("//div[@id = 'mce_28']");
    By txtformet = By.xpath("//div[@id = 'mce_25']");
    By txtHedder = By.xpath("//span[contains(text(),'Headers')]");
    By txtHeaderSize = By.xpath("//span[contains(text(),'Header 3')]");
    By txtStyle = By.xpath("//button[@id = 'mce_26-open']");
    By txtStyleFormet = By.xpath("//span[contains(text(),'Times New Roman')]");
    By fontSizeBtn = By.xpath("//button[@id = 'mce_27-open']");
    By fontSize = By.xpath("//span[contains(text(),'26pt')]");
    By txt_ColourSelect = By.xpath("//div[@id='mce_30']");
    By txtColour = By.xpath("//*[@id='mce_30']/button[2]");
    By txtBulletlist = By.xpath("//div[@id='mce_36'][@aria-haspopup='true']");

    By linkEdit = By.xpath("//div[@id='mce_40']");
    By linkURL = By.xpath("//input[contains(@class,'mce-textbox mce-place')]");
    By linkTxtDiscription = By.xpath("//input[contains(@class,'mce-textbox mce-last mce-abs-layout-item')]");

    By imagelink = By.xpath("//div[@id='mce_41']");
    By imageSource = By.xpath("//input[contains(@class,'mce-textbox mce-placeholder')]");
    By imageDiscription = By.xpath("//input[contains(@class,'mce-textbox mce-last mce-abs-layout-item')]");
    By imageDimensions1 = By.xpath("//input[contains(@class,'mce-textbox mce-first mce-abs-layout-item')]");
    By imageDimensions2 = By.xpath("//input[contains(@class,'mce-textbox mce-abs-layout-item')]");
    By imageCheckbox = By.xpath("//i[@class='mce-ico mce-i-checkbox']");

    By txtInsideFrame = By.xpath("//body[@id='tinymce']");
    By txtBoxDrag = By.xpath("//div[@id='mce_66']");
    By txtSku = By.xpath("//input[@id='Sku']");
    By txtCatagory =By.xpath("//span[contains(text(),'delete')]");
    By selectCatagory = By.xpath("//select[@id='SelectedCategoryIds']");
    By txtComp = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='1']");
    By txtCompNotebook = By.xpath("//option[contains(text(),'Computers >> Notebooks')]");
    By txtCompSoftare = By.xpath("//option[contains(text(),'Computers >> Software')]");
    By txtElectronics = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='5']");
    By txtElectCamaraAndPhoto = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='6']");
    By txtElectCell = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='7']");
    By txtApprealShoes = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='10']");
    By txtApprealCloting = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='11']");
    By txtApprealAscrries = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='12']");
    By txtDigitalDwld = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='13']");
    By txtbooks = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='14']");
    By txtjwls = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='15']");
    By txtGifcards = By.xpath("//select[@id='SelectedCategoryIds']//option[@value='16']");

    By txtselectCatagories = By.xpath("//select[@id='SelectedCategoryIds']");
    By txtSelectManufacture = By.xpath("//span[contains(text(),'Apple')]");
    By optionApple = By.xpath("//select[@id='SelectedManufacturerIds']//option[@value='1']");
    By optionsNike = By.xpath("//select[@id='SelectedManufacturerIds']//option[@value='3']");
    By optionsHp=By.xpath("//select[@id='SelectedManufacturerIds']//option[@value='2']");
    By checkboxPublished = By.xpath("//div[@class='col-md-9']//input[@name='Published']");
    By txtProductTags = By.xpath("//ul[@class='tag-editor ui-sortable']");
        By txtGTIN = By.xpath("//input[@id='Gtin']");
    By txtManufacturePartNum = By.xpath("//input[@id='ManufacturerPartNumber']");
    By checkBox_ShowHomePage = By.xpath("//input[@id='ShowOnHomepage']");
    By SelectProduct_Type = By.xpath("//select[@id='ProductTypeId']");
    By checkBoxVisibleIndividually = By.xpath("//input[@id='VisibleIndividually']");
    By selectCostumerRoles = By.xpath("//select[@id='SelectedCustomerRoleIds']");
    By txtLimitedStores = By.xpath("//select[@id='SelectedStoreIds']");
    By SelectVendors = By.xpath("//select[@id='VendorId']");
    By checkBoxRequireAnotherProduct = By.xpath("//input[@id='RequireOtherProducts']");
    By checkBoxCostomerReview = By.xpath("//input[@id='AllowCustomerReviews']");
    By txtStertDate = By.xpath("//input[@id='AvailableStartDateTimeUtc']");
    By txt_EndDate = By.xpath("//input[@id='AvailableEndDateTimeUtc']");
    By checkBoxMarkAsNew = By.xpath("//input[@id='MarkAsNew']");
    By txtAdminComment = By.xpath("//textarea[@id='AdminComment']");
    By btnSaveAndContinue = By.xpath("//button[@name='save-continue']");
    /*By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");
    By x = By.xpath("");*/

    public void setclickOnCatalog() {
        ldriver.findElement(lnkCatalog_menu).click();

    }
    public void setclickOnCatalogProducts() {
        ldriver.findElement(lnk_products).click();

    }
    public void setclickOnCatalogManufacture() {
        ldriver.findElement(lnk_manufactures).click();

    }
    public void setclickOnCatalogProductReviews() {
        ldriver.findElement(lnk_product_Reviews).click();

    }
    public void setclickOnCatalogProductTags() {
        ldriver.findElement(lnk_productTags).click();

    }
    public void setclickOnCatalogProductAttributes() {
        ldriver.findElement(lnk_Attributes).click();

    }
    public void setclickOnAttributeProduct() {
        ldriver.findElement(lnk_ProductAttributes).click();

    }
    public void setclickOnAttributeProductSpecification() {
        ldriver.findElement(lnk_SpecificaesAttributes).click();

    }
    public void setclickProductAttributeCheckout() {
        ldriver.findElement(lnk_CheckoutAttributes).click();

    }

    public void setProductSearchByName(String SearchName) {
        ldriver.findElement(txt_ProductSearchByProductName).sendKeys(SearchName);

    }
    public void setSelect_productCatagory(String pCatagory) {
        Select drpdwn = new Select(ldriver.findElement(select_productCatagory));
        drpdwn.selectByVisibleText(pCatagory);
    }
    public void setclicksubCatagories() {
        ldriver.findElement(click_Searchsubcatagories).click();

    }
    public void setSearchManufactures(String sManufacture) {
        Select drpdwn = new Select(ldriver.findElement(select_SearchManufactures));
        drpdwn.selectByVisibleText(sManufacture);
    }
    public void setSeatchVendor(String sVendor) {
        Select drpdwn = new Select(ldriver.findElement(select_Searchvendor));
        drpdwn.selectByVisibleText(sVendor);
    }
    public void setSearchWhwrehouse(String sWharehouse) {
        Select drpdwn = new Select(ldriver.findElement(select_SearchWharehouse));
        drpdwn.selectByVisibleText(sWharehouse);
    }
    public void setSearchProducttype(String sProducttype) {
        Select drpdwn = new Select(ldriver.findElement(select_searchProductType));
        drpdwn.selectByVisibleText(sProducttype);
    }
    public void setSearchPublish(String sPublish) {
        Select drpdwn = new Select(ldriver.findElement(select_searchPublish));
        drpdwn.selectByVisibleText(sPublish);
    }
    public void setTxtSearchSKU(String sSKU) {
        ldriver.findElement(txt_SearchproductSKU).sendKeys(sSKU);

    }
    public void clickOnSearchSKU() {
        ldriver.findElement(click_SearchproductSKU).click();
        //ldriver.findElement(By.xpath("//a[@href='Edit/17']")).click();
    }
    public void clickOnSearchProduct() {
        ldriver.findElement(click_ProductSearch).click();

    }
    public void setclickONProductInfo() {
        ldriver.findElement(clickONProductInfo).click();

    }
    public void setProductName(String PName) {
        ldriver.findElement(txt_ProductName).sendKeys(PName);


    }
    public void setProductDiscription(String PDiscription) {
        ldriver.findElement(txt_ProductDiscription).sendKeys(PDiscription);

    }
    public void setclick_FIle() {
        //Select drpdwn=new Select(ldriver.findElement(click_FIle));
        //drpdwn.selectByVisibleText("New document");
        ldriver.findElement(click_FIle).click();

    }
    public void setclick_NewDocument() {
        ldriver.findElement(click_NewDocument).click();

    }
    public void setclick_Insert() {
        ldriver.findElement(click_Insert).click();
    }
    public void setclick_SelectDate() {
        ldriver.findElement(click_SelectDate).click();

    }
    public void setselected_date() {
        ldriver.findElement(selected_date).click();


    }
    public void setclick_View() {
        ldriver.findElement(click_View).click();

    }
    public void setSelectPreview() {
        ldriver.findElement(click_SelectPreview).click();
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }
    public void setPreviewClose() {
        ldriver.findElement(click_PreviewClose).click();

    }
    public void setFormat() {
        ldriver.findElement(click_Format).click();
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }
    public void setSelectFormetBold() {
        ldriver.findElement(click_SelectFormetBold).click();

    }
    public void settableData() {
        ldriver.findElement(click_InsertTable).click();

    }
    public void setInsertTable() {
        ldriver.findElement(click_tableData).click();
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }
    public void setTableClmn() {
        //ldriver.findElement(select_TableClmn).click();
        ldriver.findElement(tableSize).click();
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    public void setselectTool() {
        ldriver.findElement(selectTool).click();

    }
    public void setSourceCode() {
        ldriver.findElement(SourceCode).click();
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }
    public void settextAreaInSidePopup() {
        ldriver.findElement(textAreaInSidePopup).click();
        ldriver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    }
    public void settxtStyleleft() {
        ldriver.findElement(txtStyleleft).click();
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }
    public void settxtStyleRight() {
        ldriver.findElement(txtStyleRight).click();

    }
    public void settxtBold() {
        ldriver.findElement(txtBold).click();

    }
    public void settxtformet() {
        ldriver.findElement(txtformet).click();

    }
    public void settxtHedder() {
        ldriver.findElement(txtHedder).click();

    }
    public void settxtHeaderSize() {
        ldriver.findElement(txtHeaderSize).click();
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }
    public void settxtStyle() {
        ldriver.findElement(txtStyle).click();

    }
    public void settxtStyleFormet() {
        ldriver.findElement(txtStyleFormet).click();

    }
    public void setfontSizeBtn() {
        ldriver.findElement(fontSizeBtn).click();

    }
    public void setfontSize() {
        ldriver.findElement(fontSize).click();

    }
    public void setColourSelect() {
        ldriver.findElement(txt_ColourSelect).click();

    }
    public void setColour() {
        ldriver.findElement(txtColour).click();

    }
    public void settxtBulletlist() {
        ldriver.findElement(txtBulletlist).click();

    }
    public void setlinkEdit() {
        ldriver.findElement(linkEdit).click();

    }
    public void setlinkURL(String URLlink) {
        ldriver.findElement(linkURL).sendKeys(URLlink);

    }
    public void setlinkTxtDiscription(String Discription) throws AWTException {
        ldriver.findElement(linkTxtDiscription).sendKeys(Discription);
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);

    }
    public void setimagelink() {
        ldriver.findElement(imagelink).click();

    }
    public void setimageSource(String imgPath) {
        ldriver.findElement(imageSource).sendKeys(imgPath);

    }
    public void setimageDiscription(String imgDiscription) {
        ldriver.findElement(imageDiscription).sendKeys(imgDiscription);

    }
    public void setimageDimensions1(String D1) {
        ldriver.findElement(imageDimensions1).sendKeys(D1);

    }
    public void setimageDimensions2(String D2) throws AWTException {
        ldriver.findElement(imageDimensions2).sendKeys(D2);
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        ldriver.findElement(imageCheckbox).click();
        ldriver.findElement(imageCheckbox).click();
        ldriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);

    }
    public void settxtInsideFrame(String txtcomment) {
        ldriver.switchTo().frame("FullDescription_ifr");
        ldriver.findElement(txtInsideFrame).sendKeys(txtcomment);
        ldriver.switchTo().defaultContent();
    }
    public void settxtBoxDrag() {
       WebElement drag =  ldriver.findElement(txtBoxDrag);
        Actions act = new Actions(ldriver);
        act.moveToElement(drag).click().dragAndDropBy(drag, 30, 0).build().perform();
    }
    public void settxtSku(String SkuName) {
        ldriver.findElement(txtSku).sendKeys(SkuName);
    }
    public void settxtselectCatagories(String catagory) throws AWTException {
        ldriver.findElement(txtCatagory).click();
        ldriver.findElement(txtCatagory).clear();
        ldriver.findElement(txtCatagory).sendKeys(catagory);
        ldriver.findElement(txtselectCatagories).click();



    }
   public void settxtSelectManufacture() throws AWTException {

        ldriver.findElement(txtSelectManufacture).click();

        //ldriver.findElement(txtSelectManufacture).sendKeys(Manufacture);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CLEAR);
            robot.keyPress(KeyEvent.VK_ENTER);
            }
    public void setcheckboxPublished() {
        ldriver.findElement(checkboxPublished).click();
        ldriver.findElement(checkboxPublished).click();
    }
    public  void settxtProductTags(String pTags) {
        //ldriver.findElement(txtProductTags).sendKeys(pTags);

        ldriver.findElement(By.xpath("//li[@class='placeholder']")).sendKeys(pTags);
    }
    public void settxtGTIN(String GTIN) {
        ldriver.findElement(txtGTIN).sendKeys(GTIN);
    }
    public void settxtManufacturePartNum(String partNum) {
        ldriver.findElement(txtManufacturePartNum).sendKeys(partNum);
    }
    public void setcheckBox_ShowHomePage() {
        ldriver.findElement(checkBox_ShowHomePage).click();

        ldriver.findElement(By.xpath("//div[@id=\"pnlDisplayOrder\"]/div[2]/span[1]/span/input[1]")).clear();
        ldriver.findElement(By.xpath("//input[@name='DisplayOrder']")).sendKeys("2");
    }
    public void setSelectProduct_Type(String ptype) {
        Select drpdwn = new Select(ldriver.findElement(SelectProduct_Type));
        drpdwn.selectByVisibleText(ptype);
    }
    public void setcheckBoxVisibleIndividually() {
        ldriver.findElement(checkBoxVisibleIndividually).click();
    }
    public void setselectCostumerRoles(String cRole) throws AWTException {
        ldriver.findElement(By.xpath("//*[@id=\"product-info\"]/div[2]/div/div[15]/div[2]/div/div[1]/div")).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
    }


    public void settxtLimitedStores () throws AWTException {
        ldriver.findElement(txtLimitedStores).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public void seSelectVendors(String vendor) {
        Select drpdwn = new Select(ldriver.findElement(SelectVendors));
        drpdwn.selectByVisibleText(vendor);
    }
    public void setcheckBoxRequireAnotherProduct() {
        ldriver.findElement(checkBoxRequireAnotherProduct).click();
    }
    public void setcheckBoxCostomerReview() {
        ldriver.findElement(checkBoxCostomerReview).click();
        ldriver.findElement(checkBoxCostomerReview).click();
    }
    public void settxtStertDate(String sDate) {
        ldriver.findElement(txtStertDate).sendKeys(sDate);
    }
    public void settxt_EndDate(String eDate) {
        ldriver.findElement(txt_EndDate).sendKeys(eDate);
    }
    public void setcheckBoxMarkAsNew() {
        ldriver.findElement(checkBoxMarkAsNew).click();
    }
    public void settxtAdminComment(String aComment) {
        ldriver.findElement(txtAdminComment).sendKeys(aComment);

}
    public void setbtnSaveandContinue() {
        ldriver.findElement(btnSaveAndContinue).click();
}
    public void buttonSave()
    {
        ldriver.findElement(By.xpath("//button[@name='save']")).click();
    }
}

