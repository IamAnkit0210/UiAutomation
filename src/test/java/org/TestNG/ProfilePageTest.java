package org.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfilePageTest {

    @Test
    public void TC01_ValidateFirstName()
    {
        System.out.println("This is first name validation test");
    }

    @Test
    public void TC02_ValidateAddress()
    {
        System.out.println("This is Address validation test");
    }

    @Test
    public void TC03_ValidateContactNumber()
    {
        System.out.println("This is contact number validation test");
    }
}
