package cakes;

public class CupCake extends Cake {

    private String sprinkles;

    public CupCake(String name, String flavour, String sprinkles){
        super(name, flavour );
        this.sprinkles = sprinkles;
    }
}
