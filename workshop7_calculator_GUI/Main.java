package com.company;

import javax.swing.*;
/**the Main class includes main method
 * @author Mohammad Hossein Asadi
 * @version 23/4/2020**/
public class Main {

    /**set a Nimbus Look and feel and make a calculator object**/
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }

        CalculatorGUI calculator = new CalculatorGUI();
    }
}
