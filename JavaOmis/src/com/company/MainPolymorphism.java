package com.company;

public class MainPolymorphism {
    public static void main(String[] args) {
//        Figure circle = new Circle();
//        circle.draw();
//
//        Figure triangle = new Triangle();
//        triangle.draw();
//
//        Figure ellipse = new Ellipse();
//        ellipse.draw();

        Figure[] f = new Figure[]{new Circle(), new Triangle(), new Ellipse()};

        for (int i = 0; i < f.length; i++) {
            f[i].draw();
        }
    }
}
