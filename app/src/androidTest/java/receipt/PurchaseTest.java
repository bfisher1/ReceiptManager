package receipt;

import static org.junit.Assert.*;
import org.junit.Test;

public class PurchaseTest {
    Purchase p;
    @Test
    public void testPurchase() {
        p = new Purchase(null, 0, "Product");
        assertEquals(0, (int) p.getCost());
        assertEquals("Product", p.getName());
        try {
            p = new Purchase(null, -1, "Product");
            fail("Made purchase with negative value");
        } catch(IllegalArgumentException e) {
            assertEquals(0, (int) p.getCost());
        }

        try {
            p = new Purchase(null, 10, null);
            fail("Made purchase with no name");
        } catch(IllegalArgumentException e) {
            assertEquals("Product", p.getName());
        }

        try {
            p = new Purchase(null, 10, "");
            fail("Made purchase with no name");
        } catch(IllegalArgumentException e) {
            assertEquals("Product", p.getName());
        }


    }
}
