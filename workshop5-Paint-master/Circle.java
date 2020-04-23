package com.company;

/**the Circle class extends from Shape class.
 * @author Mohammad Hossein Asadi
 * @version 9/4/2020**/
public class Circle extends Shape {
    private int radius;

    /**construct radius
     * @param radius to construct**/
    public Circle(int radius){
        this.radius=radius;
    }

    /**@return the radius**/
    public int  getRadius(){
        return this.radius;
    }
/*
    public void draw(){
        System.out.println("Circle");
        System.out.println("P:"+calculatePerimeter());
        System.out.println("S:"+calculateArea());
    }

    public double calculatePerimeter(){
        double result;
        result=2*3.14*radius;
        return result;
    }

    public double calculateArea(){
        double result;
        result=3.14*radius*radius;
        return result;
    }*/
}
