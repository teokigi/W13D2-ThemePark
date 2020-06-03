package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(21,250,100);
        visitor2 = new Visitor(21,190,100);
        visitor3 = new Visitor(11,190,100);
        visitor4 = new Visitor(13,120,100);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test public void priceForOver200HeightVisitor(){
        assertEquals(16.8,rollerCoaster.priceFor(visitor),0.01);
    }

    @Test public void priceForUnder200HeightVisitor(){
        assertEquals(8.40,rollerCoaster.priceFor(visitor2),0.01);
    }

    @Test public void canRide(){assertTrue(rollerCoaster.isAllowedTo(visitor));}

    @Test public void cannotRide(){
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
        assertFalse(rollerCoaster.isAllowedTo(visitor4));
    }
}
