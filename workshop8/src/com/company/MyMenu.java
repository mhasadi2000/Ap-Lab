package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyMenu {
    JMenuBar menuBar;
    public static String copyOfText;
    public MyMenu(){
        menuBar=new JMenuBar();
        //CalculatorGUI.calcFrame.setMenuBar(menuBar);

        JMenu menu=new JMenu("Menu");
        menu.setMnemonic('M');
        menuBar.add(menu);

        JMenuItem exit=new JMenuItem("Exit");
        menu.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorGUI.calcFrame.setExtendedState(JFrame.HIDE_ON_CLOSE);
            }
        });

        JMenuItem copy=new JMenuItem("Copy");
        menu.add(copy);
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyOfText=CalculatorGUI.textArea.getText();
            }
        });
    }
}
