package com.company;

enum level {
    Low,
    Medium,
    Hard
}

public class MainContainer {
    public static void main(String[] args) {
        level var = level.Low;
        System.out.println(var);

        switch (var) {
            case Low:
                System.out.println("Level is low");
                break;
            case Medium:
                System.out.println("Level is medium");
                break;
            case Hard:
                System.out.println("Level is hard");
                break;
        }
    }
}
