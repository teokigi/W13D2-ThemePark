package attractions;

import people.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){return 4.50;}

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200){
            return defaultPrice()*2;
        } else{
            return defaultPrice();
        }
    }
}
