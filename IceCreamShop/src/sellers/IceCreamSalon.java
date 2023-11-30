package be.intecbrussel.sellers;
// stelt een ijsjeszaak voor die een ongelimiteerd aantal ijsjes heeft die ze
//zelf produceren
import be.intecbrussel.eatables.*;
// Je kan er ijsjes bestellen en je kan er de winst van opvragen.
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
    public Cone orderCone(Cone.Flavor[] flavors) {
        double price = priceList.getBallPrice()*flavors.length;//de perice van ball isje ophallen vanuit de pricelist voor de berekening van de winst
        Cone cone = new Cone(flavors);
        totalProfit += price * 0.25;//verhoogt totale winstwaarde (total profit) aan de hand van de price list
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
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        double price = priceList.getMagnumStandardPrice(Magnum.MagnumType.BLACKCHOCOLATE);  //Haal de prijs op uit de prijslijst
        totalProfit += price * 0.01;//verhoogt totale winst waarde (total profit) aan de hand van de price list
        return new Magnum(Magnum.MagnumType.BLACKCHOCOLATE); // Retourneer een nieuw Magnum object
    }

    @Override
    public double getProfit() {//get profit bedoel om totale winst waarde van de ijsverkoper te geven
        System.out.println("Total Profit : "+ totalProfit);
        return totalProfit;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }

}
