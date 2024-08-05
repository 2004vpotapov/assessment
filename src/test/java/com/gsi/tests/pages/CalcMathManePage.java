package com.gsi.tests.pages;

import com.gsi.tests.Assignment;
import com.gsi.tests.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcMathManePage {

    public CalcMathManePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = "#Btn2")
    public WebElement btn2;

    @FindBy(css = "#BtnPlus")
    public WebElement btnPlus;

    @FindBy(css = "#Btn3")
    public WebElement btn3;

    @FindBy(css = "#BtnCalc")
    public WebElement btnCalc;

    @FindBy(xpath = "//li/p")
    public WebElement result;

    //================================================================================================

    @FindBy(css = "#Btn1")
    public WebElement btn1;

    @FindBy(css = "#Btn0")
    public WebElement btn0;

    @FindBy(css = "#BtnMinus")
    public WebElement btnMinus;

  //  @FindBy(xpath = "//li/p")
  //  public WebElement result2;
    @FindBy(xpath = "//li/p")
    public WebElement result2;


}
