package bakery;

import cakes.Cake;
import cakes.CheeseCake;

import java.util.ArrayList;

import java.util.List;

public class Bakery {
    private String name;
    private static ArrayList<Cake> cakes;

    public Bakery(String name, String baseFlavour) {
        this.name = name;
        this.cakes = new ArrayList<>();
==}


    //    Size : int
    public int cakeCount() {
        return this.cakes.size();   // size . int
    }


    public void addCake(Cake cake){
        this.cakes.add(cake);
    }

//    Getters and setters

    public String getName() {
        return name;
    }


    public void setName(String newName) {
        this.name = newName;
    }

//
}




