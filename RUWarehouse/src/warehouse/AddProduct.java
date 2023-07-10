package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

        /*StdIn.setFile("addtoend.in");
        StdOut.setFile("addtoend.out");*/

        /*StdIn.setFile("fixheap.in");
        StdOut.setFile("fixheap.out");*/

        /*StdIn.setFile("addproduct.in");
        StdOut.setFile("addproduct.out");*/

	// Use this file to test addProduct

    int n = StdIn.readInt();
    
    Warehouse newWarehouse = new Warehouse();

    for (int i = 0; i < n; i++){
        int currentDay = StdIn.readInt();
        int id = StdIn.readInt();
        String name = StdIn.readString();
        int stock = StdIn.readInt();
        int demand = StdIn.readInt();
        newWarehouse.addProduct(id, name, stock, currentDay, demand);
    }

    StdOut.println(newWarehouse);

    }
}
