package com.jdi;

import com.epam.jdi.light.elements.interfaces.complex.IsCombobox;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import jdisite.JDISite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static jdisite.JDISite.homePage;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        initElements(JDISite.class);
        homePage.open();
    }
    @AfterSuite(alwaysRun = true)
    static void teardown() {
        killAllSeleniumDrivers();
    }
}
