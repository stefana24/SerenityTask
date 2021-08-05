package com.evozon.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {
    @Managed(uniqueSession = true)
    protected WebDriver driver;

    @Before
    public void setup(){
        driver.manage().window().maximize();
        driver.navigate().to("http://qa2.dev.evozon.com/");
    }
}
