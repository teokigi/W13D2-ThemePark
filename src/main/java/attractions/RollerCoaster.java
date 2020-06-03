package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){ return 8.40;}

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200){
            return defaultPrice()*2;
        } else{
            return defaultPrice();
        }
    }
}
