package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

        /*StdIn.setFile("purchaseproduct.in");
        StdOut.setFile("purchaseproduct.out");*/

	// Use this file to test purchaseProduct

    int n = StdIn.readInt();
    
    Warehouse w = new Warehouse();

    for (int i = 0; i < n; i++){
        if (StdIn.readString().equals("add")){
            int currentDay = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int initalStock = StdIn.readInt();
            int initalDemand = StdIn.readInt();
            w.addProduct(id, name, initalStock, currentDay, initalDemand);
        } else {
            int currentDay = StdIn.readInt();
            int id = StdIn.readInt();
            int amountPurchased = StdIn.readInt();
            w.purchaseProduct(id, currentDay, amountPurchased);
        }
    }

    StdOut.println(w);
    }
}
