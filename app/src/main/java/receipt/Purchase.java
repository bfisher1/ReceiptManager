package receipt;

public class Purchase {
    /**
     * The receipt that this purchase appears on.
     * Receipt contains its date and location.
     */
    private Receipt receipt;
    private double cost;
    private String name;

    public Purchase(Receipt receipt, double cost, String name) {
        this.receipt = receipt;
        setCost(cost);
        setName(name);
    }

    public void setCost(double cost) {
        if(cost < 0) {
            throw new IllegalArgumentException();
        }
        this.cost = cost;
    }

    public void setName(String name) {
        if(name == null || name.equals("")) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
