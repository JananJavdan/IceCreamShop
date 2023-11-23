package be.intecbrussel.eatables;

import be.intecbrussel.sellers.Stock;

public class IceRocket implements Eatables{
    public IceRocket(){

    }

    @Override
    public void eat() {
        System.out.println("je eet een ice rocket ijse" );
        System.out.println("*****************************");
//De eat methode print af wat je aan het eten bent
    }
}
