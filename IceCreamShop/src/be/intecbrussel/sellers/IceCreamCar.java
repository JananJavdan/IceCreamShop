package be.intecbrussel.sellers;
//order methode: ice cream salon : om ijsje te bestellen en winst op de vragen
import be.intecbrussel.eatables.*;
//prepare methoden: ice cream car: kijk of nog ijsje in stock zijn indien er geen ijsje meer zijn ,
// geef de method en boodschap weer ( NO MORE ICE CREAM)
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
//order methode om ijsje te bestellen en winst op de vragen
    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {//de price van bolletje ijs ophallen en vermenigvuldig met het aantal bolletjes
        double price = priceList.getBallPrice() * flavors.length;//bereken de prijs van ijshoorntje op basis van de lengte van smaak aaray,
        profit += price * 0.25;//verhoogt de winst 25%
        stock.setBalls(stock.getBalls()-flavors.length);//verminderd balls
        return prepareCone(flavors);//dit geeft een ijshoorntje terug aangemakt van smaaken
    }// De order methoden gaan rekening houden met de profit.

    private Cone prepareCone(Cone.Flavor[] flavor){
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
        double price = priceList.getRocketPrice();//de price van rocket isje ophaleen vanuit de price list voor de berekening van de winst
        if (stock.getIceRockets() > 0){//controleert of er nog raketijse beschikbaar zijn in de voorraad
            stock.setIceRockets(stock.getIceRockets()-1);// verminder het antaal beschikbaar raketijsje in de voorraad
            profit += price * 0.15;//verhoogt de winst met 15% van de prijs van het raketijse
            return prepareRocket();//voorbereid raketisje om te geserveerd
        }else {
            System.out.println("sorry, er zijn geen ice rocket beschikbaar in de stock");
        }//als er geen raketijse meer beschikbaar zijn in voorraad , wordt deze boodschap afgedrukt worden
        return null;//
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
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
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

    private Magnum prepareMagnum(Magnum.MagnumType magnumType){
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
    public double getProfit() {
        System.out.println(" profit " +profit);
        return profit;
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
