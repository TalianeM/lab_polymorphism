package cakes;

public class Cake {


    private String name;
    private String baseFlavour;

    private double price;

    private String toppings;

    public String defrostedage;

    public boolean veganchecker;


public Cake (String name, String flavour, double price, String toppings, String defrostedage, boolean vegan){
    this.name = name;
    this.baseFlavour = flavour;
    this.price = price;
    this.toppings = toppings;
    this.defrostedage = defrostedage;
    this.veganchecker = vegan;

}

// Check to see days between expiry date and current date
public String ExpiryCheck(){
    if (defrostedage <= 5) {
        if (defrostedage <= 5) {
            return "current";
        }
    } else {
        return "expired";
    }

}


// Getters

public String getName(){
    return name;
}

public String getFlavour(String flavour){
    return this.baseFlavour = flavour;
}

public double getPrice (double price){
    return this.price = price;
}

public String getToppings(String toppings){
    return this.toppings = toppings;
}

public boolean isVegan (boolean vegan){
    return  this.isVegan() = vegan;  //Check
}


}
