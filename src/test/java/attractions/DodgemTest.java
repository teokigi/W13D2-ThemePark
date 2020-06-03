package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(21,250,100);
        visitor2 = new Visitor(11,250,100);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test public void hasTicketPrice(){
        assertEquals(4.50,dodgems.defaultPrice(),0.01);
    }

    @Test public void priceForOver12HeightVisitor(){
        assertEquals(4.50,dodgems.priceFor(visitor),0.01);
    }

    @Test public void priceForUnder12HeightVisitor(){
        assertEquals(2.25,dodgems.priceFor(visitor2),0.01);
    }
}
