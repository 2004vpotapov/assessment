package com.gsi.tests;

import com.gsi.tests.pages.CalcMathManePage;
import com.gsi.tests.utilities.ConfigurationReader;
import com.gsi.tests.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assignment {

    CalcMathManePage mainPage;

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("calculatorUrl"));
    }


    @Test
    public void task1() {

        mainPage = new CalcMathManePage();

        int a = 2;
        int b = 3;
        int expectedRes = a + b;//expected result
        System.out.println("expectedRes = " + expectedRes);

        mainPage.btn2.click();
        mainPage.btnPlus.click();
        mainPage.btn3.click();
        mainPage.btnCalc.click();

        String actualRes = mainPage.result.getAttribute("title");
        int aRes = Integer.parseInt(actualRes);

        System.out.println("aRes = " + aRes);

        Assert.assertEquals(aRes,expectedRes,"verification for 1st task");

    }
    @Test
    public void task2() {

         mainPage = new CalcMathManePage();

        int a = 10;
        int b = 2;
        int expectedRes2 = a - b;//expected result
        System.out.println("expectedRes2 = " + expectedRes2);

        mainPage.btn1.click();
        mainPage.btn0.click();
        mainPage.btnMinus.click();
        mainPage.btn2.click();
        mainPage.btnCalc.click();

        String actualRes2 = mainPage.result2.getAttribute("title");
        //String actualRes2 = mainPage.result2.getText();


        System.out.println("actualRes2 = " + actualRes2);
        int aRes2 = Integer.parseInt(actualRes2);

        System.out.println("aRes2 = " + aRes2);


        Assert.assertEquals(aRes2,expectedRes2,"verification for 2st task");

    }

    @AfterMethod
    public void teardown(){
         // Driver.getDriver().quit();
    }

}
