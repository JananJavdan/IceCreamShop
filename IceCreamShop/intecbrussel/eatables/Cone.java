package be.intecbrussel.eatables;

import java.util.ArrayList;
import java.util.Arrays;

import static be.intecbrussel.eatables.Cone.*;

public class Cone implements Eatables {

    public Flavor[] balls;

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    public Flavor[] getBalls() {
        return balls;
    }

    public void setBalls(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("je eet een ball ice met de volgende smaak");
        for (Flavor flavor : balls) {//bedoel elke element in de array ball opslaan
            System.out.println("- " + flavor); //en afdruk elke element van de array ball

//De eat methode print af wat je aan het eten bent.
        }
        System.out.println("****************************");


    }
    public enum Flavor{
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;
    }
}



