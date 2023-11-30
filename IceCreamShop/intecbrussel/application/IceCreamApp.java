package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatables;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Profitable;

public class IceCreamApp {
    public static void main(String[] args) {
        System.out.println("weelcom to ice cream shop");
        System.out.println("price list van ice cream");
//Maak een PriceList instantie aan
        PriceList priceList = new PriceList(2.0, 3.0, 4.0);
        System.out.println("ball price : "+priceList.getBallPrice());
        System.out.println("rocket price : "+priceList.getRocketPrice());
        System.out.println("magnum price:"+priceList.getMagnumStandardPrice(Magnum.MagnumType.BLACKCHOCOLATE));
        System.out.println("***********************************************");
//Maak een IceCreamSalon instantie aan met behulp van de pricelist
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList, 0);
//Bestel enkele ijsjes (order methoden), steek deze in een array van Eatable
        Eatables[] orderedIceCreams = new Eatables[7];
        orderedIceCreams[0] = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.LEMON, Cone.Flavor.MOKKA});
        orderedIceCreams[1] = iceCreamSeller.orderIceRocket();
        orderedIceCreams[2] = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        orderedIceCreams[3] = iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        orderedIceCreams[4] = iceCreamSeller.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        orderedIceCreams[5] = iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        orderedIceCreams[6] = iceCreamSeller.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);
// Roep van deze ijsjes de eat methode aan (eat-methode aanroept voor elk ijsje )
    for (Eatables iceCream : orderedIceCreams){
        iceCream.eat();
    }
//print de profit af van de ice cream seller (get profit methode gebruikt om de winst van de ice cream salon af te druken
        System.out.println("******************************************");
        System.out.println("total paroft van ice cream verkopen");
    if (iceCreamSeller instanceof Profitable){
        ((Profitable)iceCreamSeller).getProfit();
    }

    }
}