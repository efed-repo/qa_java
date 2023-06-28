package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    // new
    private Food food;

    public Lion (Food food) {
        this.food = food;
    }
    // end of new


    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    /* public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }*/

    // new

    public List<String> getFood () {
        return food.getFood("Хищник");
    }
    // end of new
}
