package com.coforge.Abstraction;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape=new Rectangle("red",234.45f,45.6f);
        shape.area();
        shape.draw();
        shape.info();
    }
}
