/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mephi.order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author panda
 */
public class OrderInfo {
    private String name;
    private String time;
    private DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
    private int price;
    
    public OrderInfo (String name, int price) {
        this.name=name;
        this.price=price;
        this.time = LocalDateTime.now().format(myFormatObj);
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getTime() {
        return time;
    }
}
