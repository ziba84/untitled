package com.cybertek.Pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AdidasPage {
    public AdidasPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
