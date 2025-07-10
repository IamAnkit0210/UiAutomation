package org.TestNG;

import org.testng.annotations.*;

public class LandingPage {

    @Test(description = "Validate logo of company")
    public void TC01_ValidateLogo()
    {
        System.out.println("This is logo validation test");
    }


    //enabled = false is used to skip a test case
    @Test(description = "Validate FAQ of company", enabled = true,priority = 1)
    public void TC02_ValidateFAQs()
    {
        System.out.println("This is FAQ validation test");
    }

    @BeforeTest
    public void TC_Cleanup()
    {
        System.out.println("This is cleanup test P1");
    }

    @AfterTest
    public void TC_ClosingConnection()
    {
        System.out.println("This is closing test");
    }

    @BeforeClass
    public void TC_Cleanup123()
    {
        System.out.println("This is before class test P2");
    }

    @AfterClass
    public void TC_Cleanup1234()
    {
        System.out.println("This is after class test");
    }

    @BeforeMethod
    public void TC_Cleanup12345()
    {
        System.out.println("This is before method test P3");
    }

    @AfterMethod
    public void TC_Cleanup123456()
    {
        System.out.println("This is after method test");
    }

    @BeforeSuite
    public void TC_Cleanup1234567()
    {
        System.out.println("This is before suite");
    }

    @AfterSuite
    public void TC_Cleanup12345678()
    {
        System.out.println("This is after suite");
    }

}

//STCM MCTS
