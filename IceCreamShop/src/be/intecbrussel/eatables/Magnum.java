package be.intecbrussel.eatables;

import static be.intecbrussel.eatables.MagnumType.*;

public class Magnum implements Eatables {

    public MagnumType type;

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }

    public void setType(MagnumType type) {
        this.type = type;
    }


        @Override
        public void eat() {
            System.out.println("je eet Magnum Ice Cream Van Het Type "+type.toString()+ " "+"Magnum");
        }
//De eat methode print af wat je aan het eten bent
    }

