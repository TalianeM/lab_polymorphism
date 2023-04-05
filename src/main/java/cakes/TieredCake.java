package cakes;

public class TieredCake extends  Cake {

    private String frosting;

    public TieredCake(String name, String baseFlavour, String frosting){
        super(name,baseFlavour);
        this.frosting = frosting;
    }


}
