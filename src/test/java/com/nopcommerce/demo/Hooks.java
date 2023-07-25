package com.nopcommerce.demo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;


public class Hooks extends Utility
{
    @Before
    public void setUp()
    {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
