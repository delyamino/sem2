/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mephi.order;

/**
 *
 * @author panda
 */
public abstract class BaseDecorator implements Component {
    private Component component;
    
    public BaseDecorator (Component component) {
        this.component=component;
    }
    
    public int getPrice() {
        return component.getPrice() + getAdditionalPrice();
    }
    
    public String getName() {
        return component.getName()+"+"+getModifiersName();
    }
    
    public abstract int getAdditionalPrice();
    public abstract String getModifiersName();
}
