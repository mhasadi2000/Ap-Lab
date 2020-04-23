package com.company;

public class Main {

    public static void main(String[] args) {
        Paint paint=new Paint();

        Circle c1=new Circle(5);
        Rectangle r1=new Rectangle(2,5,2,5);
        Triangle t1=new Triangle(3,4,5);
        Shape s4=new Circle(6);
        Shape s5=new Rectangle(6,6,6,6);
        paint.addShape(c1);
        paint.addShape(r1);
        paint.addShape(t1);
        paint.addShape(s4);
        paint.addShape(s5);
        paint.drawAll();
        paint.printAll();
        paint.describeEqualSides();
    }
}
