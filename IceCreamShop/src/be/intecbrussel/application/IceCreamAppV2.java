package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

import static be.intecbrussel.eatables.Cone.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        // Maak een PriceList instantie aan
        PriceList priceList = new PriceList(2.0, 3.0, 4.0);
        priceList.getBallPrice();
        System.out.println("price list van ball ice cream : "+priceList.getBallPrice());
        System.out.println("price list van rocket ice cream :" +priceList.getRocketPrice());
        System.out.println("price list van magnum van het type with chocolate ice cream : "+priceList.getMagnumStandardPrice(Magnum.MagnumType.WHITECHOCOLATE));
        System.out.println("*****************************************");
        // Maak een Stock instantie aan
        Stock stock = new Stock(3, 1, 2, 4);
        System.out.println("stock van ice rocket :"+stock.getIceRockets());
        System.out.println("stock van cones :" +stock.getCones());
        System.out.println("stock van balls :" +stock.getBalls());
        System.out.println("stock van magni :" +stock.getMagni());
        System.out.println("*****************************************");
        // Maak een IceCreamCar instantie aan met behulp van de prijslijst
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock, 6);
        Magnum magnum1 = iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        System.out.println("ice cream car :"+iceCreamSeller.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE));
        System.out.println("ice cream car :"+magnum1);


        // Bestel meer raketijsjes dan er in je stock zitten
        for (int i = 0; i < 5; i++) { //Bestel 5 raketijsjes
            IceRocket iceRocket = iceCreamSeller.orderIceRocket();
           // iceRocket.eat();
            if (iceRocket == null) { //als in voorraad geen ijseracket zijn
                System.out.println("ik will 6 ice rocket");
                System.out.println("sorry, er zijn geen ice rocket beschikbaar in de stock"+iceCreamSeller.orderIceRocket());//printaf deze meldingen

                break;
            }
            iceRocket.eat();


            }
        System.out.println("profit van verkopen ice cream :");
       // iceCreamCar.getProfit();
        //iceCreamCar.getProfit();

        if (iceCreamSeller instanceof Profitable){
            ((Profitable)iceCreamSeller).getProfit();
        }


        }

    }

