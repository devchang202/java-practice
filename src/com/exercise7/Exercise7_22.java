package com.exercise7;

abstract class Shape {
    Point p;
    Shape() {
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}
class Point {
    int x;
    int y;
    Point() {
        this(0,0);
    }
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}

class Circle extends Shape
{
    double r;
    Circle() {
        this(0.0);
    }
    Circle (double r)
    {
        this.r = r;
    }
    double calcArea() {
        return r * r * Math.PI;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle() {
        this(0.0, 0.0);
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        return width == height;
    }
}

class Exercise7_22
{
    /*
    (1) sumArea메서드를 작성하시오.
    */
    public static double sumArea(Shape[] shapes)
    {
        double sum = 0.0;
        for (int i = 0; i < shapes.length; i++)
        {
            sum += shapes[i].calcArea();
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합:"+sumArea(arr));
    }
}