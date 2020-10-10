import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShipTest {
    @Test
    public void hitTest(){
        Ship testShip = new Ship(0, 0, 5, true);
        assertTrue(testShip.isInside(3, 0));
    }
}
