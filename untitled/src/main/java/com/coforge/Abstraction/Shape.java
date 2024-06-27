package com.coforge.Abstraction;

public abstract class Shape {

        private String color;

    public String getColor() {
        return color;
    }

    abstract void draw();
        abstract void area();

    public Shape(String color) {
        this.color = color;
    }

    void info(){
       System.out.println("Shape abstract superclass");
   }

}


class Rectangle extends Shape{
    private float width;
    private float length;

    public Rectangle(String color, float width, float length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    void area() {
        System.out.println("area of rectangle is "+length*width);

    }
}
