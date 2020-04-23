package com.company;

import java.util.ArrayList;

/**the Rectangle method extends from Polygon class
 * @author Mohammad Hossein Asadi
 * @version 9/4/2020**/
public class Rectangle extends Polygon {

    /**call the super class constructor.
     * @param sides to make a rectangle.**/
    public Rectangle(Integer... sides) {
        super(sides);
    }
    /**check if the rectangle is a square.
     * @return true if it is.**/
    public boolean isSquare(){
        ArrayList<Integer> sides=super.getSides();
        if (sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2)) && sides.get(0).equals(sides.get(3))){
            return true;
        }
        return false;
    }
}
