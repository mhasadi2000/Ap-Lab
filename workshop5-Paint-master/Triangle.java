package com.company;

import java.util.ArrayList;

/**the Triangle class extends from Polygon class.
 * @author Mohammad Hossein Asadi
 * @version 9/4/2020**/
public class Triangle extends Polygon {

    /**call the super class.
     * @param sides of the Triangle.**/
    public Triangle(Integer... sides) {
        super(sides);
    }

    /**check if the shape is Equilateral.
     * @return true if is Equilateral.**/
    public boolean isEquilateral(){
        ArrayList<Integer> sides=super.getSides();
        if (sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2))){
            return true;
        }
        return false;
    }
}
