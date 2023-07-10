package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

        /*StdIn.setFile("deleteproduct.in");
        StdOut.setFile("deleteproduct.out");*/

	// Use this file to test deleteProduct

        int n = StdIn.readInt();
    
        Warehouse w = new Warehouse();

        for (int i = 0; i < n; i++){
            // String input = StdIn.readString();
            if (StdIn.readString().equals("add")){
            // if (input.equals("add")){
                int currentDay = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int initalStock = StdIn.readInt();
                int initalDemand = StdIn.readInt();
                w.addProduct(id, name, initalStock, currentDay, initalDemand);
            } else /* if (input.equals("delete")){ */{
                int id = StdIn.readInt();
                w.deleteProduct(id);
            }

        }

        StdOut.println(w);
    }
}
