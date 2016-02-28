/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudra.spring.page.pane.value;

/**
 *
 * @author hemant
 */
public class HeaderMenu {
    private String displayValue;
    private String url;
    
    public HeaderMenu(String url, String displayValue){
        this.displayValue= displayValue;
        this.url= url;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
