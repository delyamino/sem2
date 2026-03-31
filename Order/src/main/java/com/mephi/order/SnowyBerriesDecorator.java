/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mephi.order;

/**
 *
 * @author panda
 */
public class SnowyBerriesDecorator extends BaseDecorator{
    public SnowyBerriesDecorator(Component component){
        super(component);
    }
    
    public int getAdditionalPrice() {
        return 5;
    } 
 
    public String getModifiersName() {
        return "Снежные ягоды";
    } 
}
