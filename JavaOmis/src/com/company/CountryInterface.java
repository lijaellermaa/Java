package com.company;

public class CountryInterface implements PrintCountry {
    String country;

    CountryInterface(String country) {
        this.country = country;
    }

    @Override
    public void printCapital(String capital) {
        System.out.println("The capital of " + country + " is " + capital);
    }
}
