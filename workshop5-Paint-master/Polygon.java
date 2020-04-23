package com.company;

import java.util.ArrayList;

/**the Polygon class extends from Shape class and it is itself
 * the super class of Rectangle and Triangle.
 * @author Mohammad Hssein Asadi
 * @version 9/4/2020**/
public class Polygon extends Shape {
    private ArrayList<Integer> sides;

    /**get 3 or 4 integers and construct side arraylist
     * and add the integers to it.
     * @param s the varargs**/
    public Polygon(Integer... s){
        sides=new ArrayList<>();

        for (Integer ite:s) {
            sides.add(ite);
        }
    }

    /**@return sides of the polygon**/
    public ArrayList<Integer> getSides(){
        return this.sides;
    }

    /**an override method that return the method of super class.**/
    public String toString(){
        return super.toString(sides);
    }
}
