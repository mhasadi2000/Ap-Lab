package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**the Paint class is used to monitor shapes.
 * @author Mohammad Hossein Asadi
 * @version 9/4/2020**/
public class Paint {

    private ArrayList<Shape> shapes;
    /**construct shapes arraylist**/
    public Paint(){
        shapes=new ArrayList<>();
    }

    /**add a shape
     * @param shape to add**/
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**check and print a shape if be equalSide**/
    public void describeEqualSides(){
        Shape temp = null;
        Iterator<Shape> ite = shapes.iterator();
        while (ite.hasNext()){
            temp=ite.next();
            if (temp instanceof Rectangle){
                if (((Rectangle) temp).isSquare()){
                    System.out.println("Square");
                    System.out.println(temp.toString());
                }
            }else if (temp instanceof Triangle){
                if (((Triangle) temp).isEquilateral()){
                    System.out.println("Equilateral");
                    System.out.println(temp.toString());
                }
            }
        }
    }

    /**draw all the shapes by using draw method.**/
    public void drawAll(){
        Shape temp;
        Iterator<Shape> ite=shapes.iterator();
        while (ite.hasNext()){
            temp=ite.next();
            if (!(temp instanceof Circle)){
                temp.draw(temp);
                System.out.println();
            }
        }
    }

    /**print all the shapes by using toString method**/
    public void printAll(){
        Shape temp;
        Iterator<Shape> ite=shapes.iterator();
        while (ite.hasNext()){
            temp=ite.next();
            if (!(temp instanceof Circle)){
                System.out.println(temp.toString());
                System.out.println();
            }
        }
    }

}
