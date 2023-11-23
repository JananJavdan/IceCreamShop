package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller{
//attributes
    PriceList priceList;
    Stock stock;
    double profit;
//constructor
    public IceCreamCar(PriceList priceList, Stock stock, double profit) {
        this.priceList = priceList;
        this.stock = stock;
        this.profit = profit;
    }
//getter en setter
    public PriceList getPriceList() {
        return priceList;
    }

    public Stock getStock() {
        return stock;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        double price = priceList.getBallPrice() * flavors.length;
        profit += price * 0.25;
        return prepareCone(flavors);
    }// De order methoden gaan rekening houden met de profit.

    private Cone prepareCone(Flavor[] flavor){
        if (stock.getCones() == 0){
            System.out.println("No More Ice Cream");
            return null;
        }else {
            return new Cone(flavor);
        }
//in de prepare methode kijk je of nog ijsjes in stock zijn als geen ijsjes meer zijn, geef de methode een boodschap
    }

    @Override
    public IceRocket orderIceRocket() {
        double price = priceList.getRocketPrice();
        if (stock.getIceRockets() > 0){
            stock.setIceRockets(stock.getIceRockets()-1);// verminder het antaal beschikbaar raketijsje in de voorraad
            profit += price * 0.15;
            return prepareRocket();
        }else {
            System.out.println("sorry, er zijn geen ice rocket beschikbaar in de stock");
        }
        return null;
    }

    private IceRocket prepareRocket(){
        if (stock.getIceRockets() == 0){
            System.out.println("No More Ice Cream" +stock.getIceRockets());
            return null;
        }else {
            return new IceRocket();

        }
//als deze smaak beschikbaar zijn in de stock wordt een nieuw object van cone maken als niet beschikbaar zijn
// word een meldingent afgedrukt

    }


    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        double price = priceList.getMagnumStandardPrice(magnumType);
        if (stock.getMagni()>0) {
            stock.setMagni(stock.getMagni() -1);
            profit += price * 0.10;
            return prepareMagnum(magnumType);
        }else {
            System.out.println("sorry, er zijn geen ice rocket beschikbaar in de stock");
        }
        return null;
    }

    private Magnum prepareMagnum(MagnumType magnumType){
        if (stock.getMagni() == 0){
            System.out.println("No More Ice Cream"+stock.getMagni());
            return null;
        }else {
            System.out.println("magnum type");
            return new Magnum(magnumType);


        }
        //in de prepare methode kijk je of nog ijsjes in stock zijn als geen ijsjes meer zijn,
        // geef de methode een boodschap, als alle smaken beschikbaar zijn wordt een nieuw object maken
    }

    @Override
    public void getProfit() {
        System.out.println(" profit " +profit);
       // IceCreamSeller.super.getProfit();
    }

    @Override
    public String toString() {
        return "IceCreamCar{" +
                "priceList=" + priceList +
                ", stock=" + stock +
                ", profit=" + profit +
                '}';
    }
}
