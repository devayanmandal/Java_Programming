import java.text.DecimalFormat;

public class PurchasedItem1 {
    
    private String name;
    private double unitPrice;
    private int quantity;

    private static DecimalFormat currency = new DecimalFormat("$0.00");

    public PurchasedItem1(String name, double unitPrice, int quantity) {

        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString() {

        return name + ": " + quantity + " @ " + currency.format(unitPrice) +
        " = " + currency.format(unitPrice * quantity);
    }

    public double getUnitPrice() {

        return unitPrice;
    }

    public int getQuantity() {

        return quantity;
    }

    public double getTotalCost() {

        return unitPrice * quantity;
    }
}