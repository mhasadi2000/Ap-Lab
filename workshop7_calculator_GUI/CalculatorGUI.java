package com.company;

import javax.swing.*;
import java.awt.*;
/**the CalculatorGUI class is used to show a calculator in to version:
 * Normal and Engineering throw UI.
 * @author Mohammad Hossein Asadi
 * @version 23/4/2020**/
public class CalculatorGUI {
    JFrame calcFrame;
    JTabbedPane tp;
    JPanel p1;
    JPanel p2;


    /**construct a Jframe and Jtabbedpane with its panels.**/
    public CalculatorGUI() {
        calcFrame = new JFrame();
        calcFrame.setTitle("Calculator");
        calcFrame.setSize(400, 400);
        calcFrame.setLocation(800, 100);
        calcFrame.setLayout(null);

        tp=new JTabbedPane();
        tp.setBounds(10,10,400,400);

        p1=new JPanel();
        p1.setLayout(null);
        normalCal();

        p2=new JPanel();
        p2.setLayout(null);
        engineeringCal();

        tp.add("Normal",p1);
        tp.add("Engineering",p2);
        calcFrame.add(tp);

        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setVisible(true);
    }

    /**to draw a Normal Calculator**/
    public void normalCal(){
        //defining 3 panels
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setBounds(10,110,200,240);
        keyboardPanel.setLayout(new GridLayout(5,3));

        JPanel screen = new JPanel();
        screen.setSize(200,100);
        screen.setLocation(10, 10);
        JPanel operator = new JPanel();

        operator.setBounds(210,15,70,290);
        operator.setLayout(new GridLayout(6,1));

        //add Buttons to keyboardPanel
        for (int i = 9; i > 0; i--) {
            JButton btn = new JButton();
            btn.setText("" + i);
            keyboardPanel.add(btn);
        }
        JButton dotBtn = new JButton(".");
        keyboardPanel.add(dotBtn);
        JButton zeroBtn = new JButton("0");
        keyboardPanel.add(zeroBtn);
        JButton equalBtn = new JButton("=");
        keyboardPanel.add(equalBtn);

        //add Buttons to operator panel
        JButton ceBtn = new JButton("CE");
        operator.add(ceBtn);
        JButton sumBtn = new JButton("+");
        operator.add(sumBtn);
        JButton minBtn = new JButton("-");
        operator.add(minBtn);
        JButton crossBtn = new JButton("x");
        operator.add(crossBtn);
        JButton divBtn = new JButton("/");
        operator.add(divBtn);
        JButton changeBtn = new JButton("%");
        operator.add(changeBtn);


        //make a test area and scrollPane
        JTextArea display = new JTextArea(3,20);
        display.setEditable(false);
        display.setFont(new Font("Arial", 14,14));

        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(200, 100));
        scrollPane.setLocation(120,40);
        screen.add(scrollPane);

        //add panels
        p1.add(screen);
        p1.add(keyboardPanel);
        p1.add(operator);

    }

    /**to draw an Engineering calculator**/
    public void engineeringCal(){
        //defining four panels
        JPanel superOperator = new JPanel();
        superOperator.setBounds(10,110,70,190);
        superOperator.setLayout(new GridLayout(5,1));

        JPanel screen = new JPanel();
        screen.setSize(350,100);
        screen.setLocation(10, 10);

        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setBounds(80,110,210,190);
        keyboardPanel.setLayout(new GridLayout(5,3));

        JPanel operator = new JPanel();
        operator.setBounds(290,110,70,190);
        operator.setLayout(new GridLayout(5,1));

        //add Buttons to superOperator panel
        JButton ceBtn = new JButton("CE");
        superOperator.add(ceBtn);
        JButton sinBtn = new JButton("Sin");
        superOperator.add(sinBtn);
        JButton tanBtn = new JButton("Tan");
        superOperator.add(tanBtn);
        JButton logBtn = new JButton("Log");
        superOperator.add(logBtn);
        JButton modBtn = new JButton("%");
        superOperator.add(modBtn);

        //add Buttons to keyboardPanel
        JButton shiftBtn = new JButton("Shift");
        keyboardPanel.add(shiftBtn);
        JButton pBtn = new JButton("p");
        keyboardPanel.add(pBtn);
        JButton eBtn = new JButton("e");
        keyboardPanel.add(eBtn);
        for (int i = 9; i > 0; i--) {
            JButton btn = new JButton();
            btn.setText("" + i);
            keyboardPanel.add(btn);
        }
        JButton changeBtn = new JButton("+/-");
        keyboardPanel.add(changeBtn);
        JButton zeroBtn = new JButton("0");
        keyboardPanel.add(zeroBtn);
        JButton dotBtn = new JButton(".");
        keyboardPanel.add(dotBtn);

        //add Buttons to operator panel
        JButton sumBtn = new JButton("+");
        operator.add(sumBtn);
        JButton minBtn = new JButton("-");
        operator.add(minBtn);
        JButton crossBtn = new JButton("x");
        operator.add(crossBtn);
        JButton divBtn = new JButton("/");
        operator.add(divBtn);
        JButton equalBtn = new JButton("=");
        operator.add(equalBtn);

        //make a text area and scrollPane
        JTextArea display = new JTextArea(3,20);
        display.setEditable(false);
        display.setFont(new Font("Arial", 14,14));

        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(350, 100));
        scrollPane.setLocation(120,40);
        screen.add(scrollPane);

        //add panels
        p2.add(screen);
        p2.add(superOperator);
        p2.add(keyboardPanel);
        p2.add(operator);

    }
}
