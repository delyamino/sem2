/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mephi.order;

/**
 *
 * @author panda
 */
public class DoublePortionVenisonDecorator extends BaseDecorator {
    public DoublePortionVenisonDecorator(Component component){
        super(component);
    }
    
    public int getAdditionalPrice() {
        return 20;
    } 
 
    public String getModifiersName() {
        return "Двойная порция оленины";
    } 
}
