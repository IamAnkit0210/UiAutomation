package org.TestNG;


import org.testng.ITestListener;
import org.testng.ITestResult;

//implemented using ITestListener interface
public class Listeners implements ITestListener {

    @Override
    public void  onTestStart(ITestResult result)
    {
        System.out.println("Test Started: " + result);
    }

}
