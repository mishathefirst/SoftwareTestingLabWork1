import domainmodel.Lackey;
import domainmodel.Rebel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DomainObjectsTest {
    Rebel rebel1;
    Lackey lackey1;
    @Before
    public void setUp() {
        String[] clothesArray = {"Robe", "belt"};
        rebel1 = new Rebel("Rebel1", "Walk", "Outdoors", clothesArray, "neutral");
        lackey1 = new Lackey("Lackey1", "Stand", "Inside", clothesArray, "neutral");
    }

    @Test
    public void checkVoid1() {
        rebel1.getAngry();
        assertEquals("angry", rebel1.getMood());
    }

    @Test
    public void checkVoid2() {
        rebel1.breakIn();
        assertEquals("Break door", rebel1.getAction());
        assertEquals("Room", rebel1.getLocation());
    }

    @Test
    public void checkVoid3() {
        rebel1.scream();
        assertEquals("scream", rebel1.getAction());
    }

    @Test
    public void checkVoid4() {
        lackey1.becomeWorried();
        assertEquals("worried", lackey1.getMood());
    }

    @Test
    public void checkVoid5() {
        lackey1.blockWay();
        assertEquals("Block the way", lackey1.getAction());
        assertEquals("Doorway", lackey1.getLocation());
    }

}
