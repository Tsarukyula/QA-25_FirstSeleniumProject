package org.ait.qa25.org.ait.qa25.org_2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    // precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        // click on Register link - //a[text()='Register'] - xpath
        if (!isElementPresent(By.xpath("//a[text()='Register']"))) {
            click(By.xpath("//a[text()='Log out']"));
        }
        click(By.xpath("//a[text()='Register']"));
    }

    @Test
    public void newUserRegistrationPositiveTest() {
        // choose Male/Female - //label[text()='Female'] - xpath
        click(By.xpath("//label[text()='Female']"));
        //driver.findElement(By.xpath("//label[text()='Female']")).sendKeys("Female");

        // enter First name - //input[@id='FirstName'] - xpath
        type(By.xpath("//input[@id='FirstName']"), "Maria");

        // enter Last name - //input[@id='LastName'] - xpath
        type(By.xpath("//input[@id='LastName']"), "Wolf");

        // enter email - //input[@id='Email'] - xpath
        type(By.xpath("//input[@id='Email']"), "student9@gmail.com");

        // enter password - //input[@id='Password'] - xpath
        type(By.xpath("//input[@id='Password']"), "Student12345$");

        // enter confirmed password - //input[@id='ConfirmPassword'] - xpath
        type(By.xpath("//input[@id='ConfirmPassword']"), "Student12345$");

        // click on registration button - //input[@id='register-button'] - xpath
        click(By.xpath("//input[@id='register-button']"));

        // assert Sign out button displayed - //a[text()='Log out'] - xpath
        Assert.assertTrue(isElementPresent2(By.xpath("//a[text()='Log out']")));
    }

}
