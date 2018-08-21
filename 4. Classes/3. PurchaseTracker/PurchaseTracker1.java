import java.util.Scanner;

public class PurchaseTracker1 {
    
    private static PurchasedItem1 readPurchasedItem1(Scanner s) {

        System.out.println("Enter the item name, unit price, and quantity purchased, \"done\" to stop:");
        String itemName = s.next();
        // if someone typed "done", we return null and don't try to read the other fields
        if (itemName.equals("done")) return null;
        double unitPrice = s.nextDouble();
        int quantity = s.nextInt();

        return new PurchasedItem1(itemName, unitPrice, quantity);
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        PurchasedItem1 item = readPurchasedItem1(keyboard);

        if (item == null) {
            System.out.println("No valid item purchases entered, exiting...");
            System.exit(0);
        }

        PurchasedItem1 leastExpensiveItem = item;
        PurchasedItem1 mostExpensiveItem = item;
        PurchasedItem1 largestQuantity = item;
        PurchasedItem1 highestTotalCost = item;

        while (item != null) {

            item = readPurchasedItem1(keyboard);
            if (item != null) {
                
                if (item.getUnitPrice() < leastExpensiveItem.getUnitPrice()) {
                    leastExpensiveItem = item;
                }
                
                if (item.getUnitPrice() > mostExpensiveItem.getUnitPrice()) {
                    mostExpensiveItem = item;
                }
                
                if (item.getQuantity() > largestQuantity.getQuantity()) {
                    largestQuantity = item;
                }
                
                if (item.getTotalCost() > highestTotalCost.getTotalCost()) {
                    highestTotalCost = item;
                }
                
            }
        }

        // now report our winners:
        System.out.println("Least expensive item:    " + leastExpensiveItem);
        System.out.println("Most expensive item:     " + mostExpensiveItem);
        System.out.println("Largest quantity item:   " + largestQuantity);
        System.out.println("Highest total cost item: " + highestTotalCost);

    }
}