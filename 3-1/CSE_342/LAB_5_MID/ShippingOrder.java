
public abstract class ShippingOrder {

    protected double baseShippingCost;
    protected static final double USD_TO_BDT = 121.82;

    public ShippingOrder(double baseShippingCost) {
        this.baseShippingCost = baseShippingCost;
    }

    public abstract double calculateFinalCost();

    public abstract String shippingType();
}

class StandardShipping extends ShippingOrder {

    public StandardShipping(double baseShippingCost) {
        super(baseShippingCost);
    }

    @Override
    public double calculateFinalCost() {
        double costInUSD = baseShippingCost * 1.10;
        return costInUSD * USD_TO_BDT;
    }

    @Override
    public String shippingType() {
        return "Standard Shipping";
    }
}

class ExpressShipping extends ShippingOrder {

    public ExpressShipping(double baseShippingCost) {
        super(baseShippingCost);
    }

    @Override
    public double calculateFinalCost() {
        double costInUSD = (baseShippingCost * 1.30) + 15;
        return costInUSD * USD_TO_BDT;
    }

    @Override
    public String shippingType() {
        return "Express Shipping";
    }
}

class BulkShipping extends ShippingOrder {

    private int itemCount;

    public BulkShipping(double baseShippingCost, int itemCount) {
        super(baseShippingCost);
        this.itemCount = itemCount;
    }

    @Override
    public double calculateFinalCost() {
        double costInUSD;
        if (itemCount > 20) {
            costInUSD = baseShippingCost * 0.75;
        } else {
            costInUSD = baseShippingCost + 50;
        }
        return costInUSD * USD_TO_BDT;
    }

    @Override
    public String shippingType() {
        return "Bulk Shipping";
    }
}

class MainShipping {

    public static void main(String[] args) {
        ShippingOrder order;

        order = new StandardShipping(100.0);
        System.out.printf("Type: %s | Final Cost: %.2f BDT%n", order.shippingType(), order.calculateFinalCost());

        order = new ExpressShipping(100.0);
        System.out.printf("Type: %s | Final Cost: %.2f BDT%n", order.shippingType(), order.calculateFinalCost());

        order = new BulkShipping(100.0, 25);
        System.out.printf("Type: %s | Final Cost: %.2f BDT%n", order.shippingType(), order.calculateFinalCost());
    }
}
