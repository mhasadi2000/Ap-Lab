package com.company;

/**The Main class that includes main method
 * is used to test the digital clock
 * @author Mohammad Hossein Asadi
 * **/
public class Main {

    /**The main method**/
    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay();
        clock.setTime(6,59,59);
        clock.timeTick();
        clock.print();
    }
}
