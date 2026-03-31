/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mephi.order;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
/**
 *
 * @author panda
 */
public class OrderMenu extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = 
        java.util.logging.Logger.getLogger(OrderMenu.class.getName());

    private JCheckBox fireSauce = new JCheckBox("Огненный соус (+10)");
    private JCheckBox dPVension = new JCheckBox("Двойная порция оленины (+20)");
    private JCheckBox snowyBerries = new JCheckBox("Снежные ягоды (+5)");
    private JCheckBox nordicFlatbread = new JCheckBox("Нордская лепёшка (+7)");
    private JCheckBox[] checkBoxes = {fireSauce, dPVension, snowyBerries, nordicFlatbread};

    private DefaultTableModel table = new DefaultTableModel(new String[]{"Время", "Заказ", "Цена"}, 0);

    public OrderMenu() {
        setTitle("Заказ нордского рагу");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLayout(new BorderLayout());

        add(new JScrollPane(new JTable(table)), BorderLayout.CENTER);

        JPanel cbPanel = new JPanel(new GridLayout(4, 1));
        for (JCheckBox cb : checkBoxes) {
            cb.addActionListener(e -> {
                int selected = 0;
                for (JCheckBox c : checkBoxes) {
                    if (c.isSelected()) {
                        selected++;
                    }
                }
                for (JCheckBox c : checkBoxes) {
                    if (!c.isSelected()) {
                        if (selected < 3) {
                            c.setEnabled(true);
                        }
                        else {
                            c.setEnabled(false);
                        }
                    }
                }
            });
            cbPanel.add(cb);
        }
        JPanel right = new JPanel(new BorderLayout());
        right.add(cbPanel, BorderLayout.CENTER);
        add(right, BorderLayout.EAST);

        JButton btn = new JButton("Оформить заказ");
        btn.addActionListener(e -> {
            Component dish = new NordicStew();
            if (fireSauce.isSelected()) {
                dish = new FireSouceDecorator(dish);
            }
            if (dPVension.isSelected()) {
                dish = new DoublePortionVenisonDecorator(dish);
            }
            if (snowyBerries.isSelected()) {
                dish = new SnowyBerriesDecorator(dish);
            }
            if (nordicFlatbread.isSelected()) {
                dish = new NordicFlatbreadDecorator(dish);
            }
            OrderInfo order = new OrderInfo(dish.getName(), dish.getPrice());
            table.addRow(new Object[]{order.getTime(), order.getName(), order.getPrice()});
            for (JCheckBox cb : checkBoxes) { 
                cb.setSelected(false); 
            }
        });
        add(btn, BorderLayout.SOUTH);
    }
}
