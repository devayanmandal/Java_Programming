import java.text.DecimalFormat;

public class PurchasedItem2 {

    private String name;
    private int quantity;
    private double itemPrice;

    DecimalFormat formatter = new DecimalFormat("$###.##");

    public PurchasedItem2(String name, double itemPrice, int quantity) {

        this.name = name;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public String toString() {

        return name + ": " + quantity + " @ " + itemPrice + 
        " is equal to " + (itemPrice * quantity);
    }

    public double getItemPrice() {

        return itemPrice;
    }
    
    public int getQuantity() {
        
        return quantity;
    }

    public double getTotalCost() {

        return itemPrice * quantity;
    }

}