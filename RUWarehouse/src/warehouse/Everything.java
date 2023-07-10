package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        /*StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);*/

        StdIn.setFile("everything.in");
        StdOut.setFile("everything.out");

	// Use this file to test all methods

    int n = StdIn.readInt();
    
    Warehouse w = new Warehouse();

    for (int i = 0; i < n; i++){
        String input = StdIn.readString();
        if (input.equals("add")){
            int currentDay = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int initalStock = StdIn.readInt();
            int initalDemand = StdIn.readInt();
            w.addProduct(id, name, initalStock, currentDay, initalDemand);
        } else if (input.equals("restock")) {
            int id = StdIn.readInt();
            int restockAmount = StdIn.readInt();
            w.restockProduct(id, restockAmount);
        } else if (input.equals("purchase")) {
            int currentDay = StdIn.readInt();
            int id = StdIn.readInt();
            int amountPurchased = StdIn.readInt();
            w.purchaseProduct(id, currentDay, amountPurchased);
        } else if (input.equals("delete")) {
            int id = StdIn.readInt();
            w.deleteProduct(id);
        }
    }

    StdOut.println(w);
    }
}
