package org.ait.qa25.org.ait.qa25.org_2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends  TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        // click on Log out link - //a[text()='Log out'] - xpath
        if (isElementPresent(By.xpath("//a[text()='Log out']"))) {
            click(By.xpath("//a[text()='Log out']"));
        }
        click(By.xpath("//a[text()='Log in']"));
    }

    @Test
    public void loginTest() {
        // click on login link - //a[text()='Log in'] - xpath
        click(By.xpath("//a[text()='Log in']"));

        // enter email - .email - css
        click(By.cssSelector(".email"));
        driver.findElement(By.cssSelector(".email")).clear();
        driver.findElement(By.cssSelector(".email")).sendKeys("student9@gmail.com");

        // enter password - .password - css
        click(By.cssSelector(".password"));
        driver.findElement(By.cssSelector(".password")).clear();
        driver.findElement(By.cssSelector(".password")).sendKeys("Student12345$");

        // click on registration button - [value='Log in'] - css
        click(By.cssSelector("[value='Log in']"));

        // assert Log out button displayed - //a[text()='Log out'] - xpath
        Assert.assertTrue(isElementPresent2(By.xpath("//a[text()='Log out']")));
    }
}
