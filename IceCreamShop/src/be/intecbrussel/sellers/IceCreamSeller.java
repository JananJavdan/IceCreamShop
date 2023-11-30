package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable{
    //order methode om ijsje te bestellen en winst op de vragen
    Cone orderCone(Cone.Flavor[] flavors);// De order methoden gaan rekening houden met de profit.

      IceRocket orderIceRocket();


     Magnum orderMagnum(Magnum.MagnumType magnumType);



}
