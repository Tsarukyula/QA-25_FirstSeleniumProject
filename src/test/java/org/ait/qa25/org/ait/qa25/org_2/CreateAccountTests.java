package org.ait.qa25.org.ait.qa25.org_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    // precondition: user should be logged out

    @BeforeMethod
    public void ensurePrecondition() {
        // click on Register link - //a[text()='Register'] - css
        if (!isElementPresent(By.xpath("//a[text()='Register']"))) {
            driver.findElement(By.xpath("//a[text()='Log out']")).click();
        }
        driver.findElement(By.xpath("//a[text()='Register']")).click();
    }

    // =========================================================

    // click on login link - //a[text()='Log in'] - xpath
    // enter email - .email - css
    // enter password - .password - css
    // click on registration button - [value='Log in'] - css
    // assert Sign out button displayed

    // =========================================================

    @Test
    public void newUserRegistrationPositiveTest() {
        // choose Male/Female - //label[text()='Female'] - xpath
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        //driver.findElement(By.xpath("//label[text()='Female']")).sendKeys("Female");

        // enter First name - //input[@id='FirstName'] - xpath
        driver.findElement(By.xpath("//input[@id='FirstName']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Maria");

        // enter Last name - //input[@id='LastName'] - xpath
        driver.findElement(By.xpath("//input[@id='LastName']")).click();
        driver.findElement(By.xpath("//input[@id='LastName']")).clear();
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Wolf");

        // enter email - //input[@id='Email'] - xpath
        driver.findElement(By.xpath("//input[@id='Email']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("student9@gmail.com");

        // enter password - //input[@id='Password'] - xpath
        driver.findElement(By.xpath("//input[@id='Password']")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Student12345$");

        // enter confirmed password - //input[@id='ConfirmPassword'] - xpath
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).click();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).clear();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Student12345$");

        // click on registration button - //input[@id='register-button'] - xpath
        driver.findElement(By.xpath("//input[@id='register-button']")).click();

        // assert Sign out button displayed - //a[text()='Log out'] - xpath
        Assert.assertTrue(isElementPresent2(By.xpath("//a[text()='Log out']")));
    }












}
