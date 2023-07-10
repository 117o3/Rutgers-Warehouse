package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

        /*StdIn.setFile("restock.in");
        StdOut.setFile("restock.out");*/

	// Use this file to test restock

    int n = StdIn.readInt();
    
    Warehouse w = new Warehouse();

    for (int i = 0; i < n; i++){
        // .equals("") !!
        if (StdIn.readString().equals("add")){
            int currentDay = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int initalStock = StdIn.readInt();
            int initalDemand = StdIn.readInt();
            w.addProduct(id, name, initalStock, currentDay, initalDemand);
        } else { //(StdIn.readString().equals("restock")) // why?? lol
            int id = StdIn.readInt();
            int restockAmount = StdIn.readInt();
            w.restockProduct(id, restockAmount);
        }
        
    }
    StdOut.println(w);
    }
}
