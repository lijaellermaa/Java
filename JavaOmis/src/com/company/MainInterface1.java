package com.company;

public class MainInterface1 {
    public static void main(String[] args) {
        PrintCountry country = new CountryInterface("Estonia");
        country.printCapital("Tallinn");

        PrintCountry country1 = new CountryInterface("France");
        country1.printCapital("Paris");
    }
}
