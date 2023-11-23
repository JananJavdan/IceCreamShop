package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    //attributes
    PriceList priceList;
    double totalProfit;
//constructor
    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        this.totalProfit = totalProfit;
    }
//medthod om ijsejes te bestellen en winst  opvragen
    @Override
    public Cone orderCone(Flavor[] flavors) {
        double price = priceList.getBallPrice();
        Cone cone = new Cone(flavors);
        totalProfit += price * 0.25;
        return cone;
//daarrom een nieuw ijse maak op basis van smaak flavor(een nieuwe cone maken) en verhoogt totale winstwaarde(total profit) aan de hand van price list
    }

    @Override
    public IceRocket orderIceRocket() {
        double price = priceList.getRocketPrice();
               totalProfit += price * 0.20;
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        double price = priceList.getMagnumStandardPrice(magnumType);  //Haal de prijs op uit de prijslijst
        totalProfit += price * 0.01;
        return new Magnum(magnumType); // Retourneer een nieuw Magnum object
    }

    @Override
    public void getProfit() {
        System.out.println("Total Profit : "+ totalProfit);
        IceCreamSeller.super.getProfit();
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
