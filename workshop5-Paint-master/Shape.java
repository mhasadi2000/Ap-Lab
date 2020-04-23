package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**the shape class is used to draw,toString and calculating area and perimeter
 * @author Mohammad Hossein Asadi
 * @version 9/4/2020**/
public class Shape {

    public Shape(Integer... i){}
    /**draw the shape given by printing the name,P and S.
     * @param shape to draw**/
    public void draw(Shape shape) {
        if (shape instanceof Rectangle){
            System.out.println("Rectangle");
            System.out.println("P:"+shape.calculatePerimeter(shape));
            System.out.println("S:"+shape.calculateArea(shape));
        }else if (shape instanceof Triangle){
            System.out.println("Triangle");
            System.out.println("P:"+shape.calculatePerimeter(shape));
            System.out.println("S:"+shape.calculateArea(shape));
        }
    }
    /**calculate the perimeter ao the given shape.
     * @param shape to calculate**/
    public double calculatePerimeter(Shape shape){
        double result=0;
        ArrayList<Integer> sides;
        if (shape instanceof Rectangle){
            sides=((Rectangle) shape).getSides();
            for (int i:sides){
                result+=i;
            }
        }else if (shape instanceof Triangle){
            sides=((Triangle) shape).getSides();
            for (int i:sides){
                result+=i;
            }
        }else if (shape instanceof Circle){
            int radius=((Circle) shape).getRadius();
            result=2*3.14*radius;
        }
        return result;
    }

    /**calculate the area of the given shape
     * @param shape to calculate**/
    public double calculateArea(Shape shape){
        double result=0;
        ArrayList<Integer> sides=new ArrayList<>();
        if (shape instanceof Rectangle){
            sides=((Rectangle) shape).getSides();
            result=sides.get(0)*sides.get(1);
        }else if (shape instanceof Triangle){
            sides=((Triangle) shape).getSides();
            int underSquare = 1;
            for (int i:sides){
                underSquare*=calculatePerimeter(shape)/2-i;
            }
            underSquare*=calculatePerimeter(shape)/2;
            result=Math.sqrt(underSquare);
        }else if (shape instanceof Circle){
            int radius=((Circle) shape).getRadius();
            result=3.14*radius*radius;
        }
        return result;
    }

    public void equals(){

    }

    /**@return sides of the shape by a special format.**/
    public String toString(ArrayList<Integer> sides){
        StringBuilder result = new StringBuilder(new String());
        int temp=0, counter=0;
        Iterator<Integer> ite = sides.iterator();
        if (sides.size()==3){
            result.append("Triangle::");
        }else if (sides.size()==4){
            result.append("Rectangle::");
        }
        while (ite.hasNext()){
            temp=ite.next();
            counter++;

            result.append(" side").append(counter).append(":").append(temp).append(",");
        }
        return result.toString();
    }
}
