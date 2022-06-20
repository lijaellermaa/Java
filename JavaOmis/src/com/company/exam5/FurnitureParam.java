package com.company.exam5;

public class FurnitureParam {
    class Bed {
        String color = "red";

        public void hotel() {
            System.out.println(color);
        }

        public void house() {
            color = "orange";
            System.out.println(color);
        }
    }

    class Table {
        String type;

        public void hotel() {
            type = "coffee table";
            System.out.println(type);
        }

        public void house() {
            type = "dinner table";
            System.out.println(type);
        }
    }

    class Wardrobe {
        String material = "wood";

        public void hotel() {
            System.out.println(material);
        }

        public void house() {
            material = "plastic";
            System.out.println(material);
        }
    }

    Bed bed = new Bed();
    Table table = new Table();
    Wardrobe wardrobe = new Wardrobe();
}
