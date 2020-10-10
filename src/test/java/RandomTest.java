import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RandomTest {
    @Test
    public void testNumbers(){
        Random random = new Random();
        random.setSeed(42);

        assertEquals(0, random.nextInt(10));
        assertEquals(3, random.nextInt(10));
    }
}
