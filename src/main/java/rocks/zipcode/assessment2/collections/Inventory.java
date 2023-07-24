package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */


public class Inventory {
    Map<String, Integer> inventory;
    ArrayList inventoryArr;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
    for(String p: strings)
    {
        inventory.put(p,0);
    }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
         inventory = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

    inventory.put(item,inventory.get(item)+1);


    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return null;
    }
}
