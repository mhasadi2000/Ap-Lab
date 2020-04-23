package com.company;

/**The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The
 * range of the clock is 00:00:00 (midnight) to 23:59 (one minute before
 * midnight).
 * The clock display receives "ticks" (via the timeTick method) every second
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increment when minutes roll over to zero and
 * the minute increments when the second roll over to zero.
 * @author Mohammad Hossein Asadi
 * **/

public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String displayString;

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at 00:00:00.
     */
    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the
     * parameters.
     */
    public ClockDisplay(int hour, int minute,int second) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }
    /**
     * Set the time of the display to the specified hour and
     * minute and second.
     */
    public void setTime(int hours, int minutes,int second){
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
        this.seconds.setValue(second);

    }

    /**
     * This method should get called once every second - it makes
     * the clock display go one second forward.
     */
    public void timeTick() {
        seconds.increment();
        if (seconds.getValue() == 0) {
            minutes.increment();
            if (minutes.getValue()==0){
                hours.increment();
            }
        }
        updateDisplay();
    }

    /**
     * Update the internal string that represents the display.
     */
    public void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue()+":"+seconds.getDisplayValue();
    }
    /**print displayString**/
    public void print(){
        System.out.println(displayString);
    }
}
