import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);

    }
}

public class ArrayLists {

    public static void main(String[] args) {

        // Object[] groceryArray = new Object[3];
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        // groceryArray[2] = ("5 oranges");
        groceryArray[2] =new GroceryItem("oranges", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray));
        // [GroceryItem[name=milk, type=DAIRY, count=1], GroceryItem[name=apples, type=PRODUCE, count=6], 5 oranges]

        //[GroceryItem[name=milk, type=DAIRY, count=1], GroceryItem[name=apples, type=PRODUCE, count=6], GroceryItem[name=oranges, type=PRODUCE, count=5]]

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
    }
}
