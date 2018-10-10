package receipt;

import static org.junit.Assert.*;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReceiptTest {
    Receipt r;
    @Test
    public void testConstructor() {
        Purchase p1 = new Purchase(null, 10, "Product 1");
        Purchase p2 = new Purchase(null, 25.2, "Product 2");
        List<Purchase> plist = new ArrayList<Purchase>();
        plist.add(p1);
        plist.add(p2);

        LocalDateTime t = LocalDateTime.of(2018, 12, 25, 20, 10, 30);

        Location l = new Location("Somewhere");
        r = new Receipt(plist, t, l);

        assertEquals(plist, r.getPurchases());
        assertEquals(t, r.getTime());
        assertEquals(l, r.getLocation());
        assertEquals(35, (int) r.getTotal());
    }
}
