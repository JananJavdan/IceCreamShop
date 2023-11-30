package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
// attributes ( class price list : prijzen van de ijsjes bijhouden)
    double ballPrice;
    double rocketPrice;
    double magnumStandardPrice;

    public PriceList() {
    }
//constructor
    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }
//getter en setter
    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumStandardPrice(Magnum.MagnumType magnumType) {
        if (magnumType == Magnum.MagnumType.ALPINENUTS) {
            return magnumStandardPrice * 1.5;
        } else {
            return magnumStandardPrice;
        }
//De getmagnumprice methode zal aan de hand van een gegeven MagnumType en een
//algemeen opgegeven magnumStandardPrice teruggeven wat de prijs van zo’n magnum zal
//zijn.
    }
        public void setMagnumStandardPrice(double magnumStandardPrice){
            this.magnumStandardPrice = magnumStandardPrice;
        }
}
