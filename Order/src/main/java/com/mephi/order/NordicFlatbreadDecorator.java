/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mephi.order;

/**
 *
 * @author panda
 */
public class NordicFlatbreadDecorator extends BaseDecorator{
    public NordicFlatbreadDecorator(Component component){
        super(component);
    }
    
    public int getAdditionalPrice() {
        return 7;
    } 
 
    public String getModifiersName() {
        return "Нордская лепешка";
    } 
}
