package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

import static be.intecbrussel.eatables.Flavor.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        // Maak een PriceList instantie aan
        PriceList priceList = new PriceList(2.0, 3.0, 4.0);
        priceList.getBallPrice();
        System.out.println("price list van ball ice cream : "+priceList.getBallPrice());
        System.out.println("price list van rocket ice cream :" +priceList.getRocketPrice());
        System.out.println("price list van magnum van het type with chocolate ice cream : "+priceList.getMagnumStandardPrice(MagnumType.WHITECHOCOLATE));
        System.out.println("*****************************************");
        // Maak een Stock instantie aan
        Stock stock = new Stock(0, 1, 2, 0);
        System.out.println("stock van ice rocket :"+stock.getIceRockets());
        System.out.println("stock van cones :" +stock.getCones());
        System.out.println("stock van balls :" +stock.getBalls());
        System.out.println("stock van magni :" +stock.getMagni());
        System.out.println("*****************************************");
        // Maak een IceCreamCar instantie aan met behulp van de prijslijst
        IceCreamSeller iceCreamCar = new IceCreamCar(priceList, stock, 0);
        iceCreamCar.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES);
        System.out.println("ice cream car :"+iceCreamCar.orderMagnum(MagnumType.MILKCHOCOLATE));
        System.out.println("ice cream car :");


        // Bestel meer raketijsjes dan er in je stock zitten
        for (int i = 0; i < 5; i++) { //Bestel 5 raketijsjes
            IceRocket iceRocket = iceCreamCar.orderIceRocket();
           // iceRocket.eat();
            if (iceRocket == null) { //als in voorraad geen ijseracket zijn
                System.out.println("ik will 6 ice rocket");
                System.out.println("sorry, er zijn geen ice rocket beschikbaar in de stock"+iceCreamCar.orderIceRocket());//printaf deze meldingen

                break;
            }
            iceRocket.eat();


            }
        System.out.println("profit van verkopen ice cream :");
        iceCreamCar.getProfit();
        iceCreamCar.getProfit();


        }

    }

