/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mephi.order;

/**
 *
 * @author panda
 */
public class FireSouceDecorator extends BaseDecorator {
    public FireSouceDecorator(Component component){
        super(component);
    }
    
    public int getAdditionalPrice() {
        return 10;
    } 
 
    public String getModifiersName() {
        return "Огненный соус";
    } 
}
