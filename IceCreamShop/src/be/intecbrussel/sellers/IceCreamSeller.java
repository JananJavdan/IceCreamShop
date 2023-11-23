package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable{
      default Cone orderCone(Flavor[] flavors) {
          return null;
      }
     default IceRocket orderIceRocket(){
         return null;
     }

    default Magnum orderMagnum(MagnumType magnumType) {
        return null;
    }


}
