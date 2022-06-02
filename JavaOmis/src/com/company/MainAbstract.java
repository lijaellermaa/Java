package com.company;

public class MainAbstract {
    public static void main(String[] args) {
        FigureAbstract circle = new CircleAbstract();
        circle.draw();

        FigureAbstract triangle = new TriangleAbstract();
        triangle.draw();
    }
}
