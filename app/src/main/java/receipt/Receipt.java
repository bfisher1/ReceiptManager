package receipt;

import java.time.LocalDateTime;
import java.util.List;

public class Receipt {
    private List<Purchase> purchases;
    private LocalDateTime time;
    private Location location;
    private double total;

    public Receipt(List<Purchase> purchases, LocalDateTime time, Location location) {
        this.purchases = purchases;
        this.time = time;
        this.location = location;
        /**
         * TODO add up all purchases into total
         */
        this.total = calcTotal();
    }

    private double calcTotal() {
        double total = 0;
        for(Purchase purchase : this.purchases) {
            total += purchase.getCost();
        }
        return total;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Location getLocation() {
        return location;
    }

    public double getTotal() {
        return total;
    }
}
