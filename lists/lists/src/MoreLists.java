import java.util.ArrayList;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        // [apples, bananas, milk, eggs]

        //System.out.println(list.getClass().getName());
        // java.util.ImmutableCollections$ListN
        //! list.add("yogurt");  // error

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        // [apples, bananas, milk, eggs, yogurt]

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);
        // [pickles, mustard, cheese]

        groceries.addAll(nextList);
        System.out.println(groceries);
        //[apples, bananas, milk, eggs, yogurt, pickles, mustard, cheese]
    }
}
