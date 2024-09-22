package comGoogle.UniqueItemTracker;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Item> items = new HashSet<>();
        Item item1 = new Item(1, "Laptop", "Electronics", 100);
        Item item2 = new Item(2, "Phone", "Electronics", 2000);
        Item item3 = new Item(3, "TV", "Electronics", 123);
        Item item4 = new Item(4, "Drill", "Electrics", 15);
        Item item5 = new Item(1, "Laptop", "Electrics", 154);

        addItems(items,item1);
        addItems(items,item2);
        addItems(items,item3);
        addItems(items,item4);
        addItems(items,item5);
        System.out.println("The Set of items contains: ");
        removeItems(items,item4);
        itemFindByName(items, item1);
        for (Item item : items) {
            System.out.println(item);
        }

    }

    public static void addItems(Set<Item> itemSet, Item item) {
        if (itemSet.contains(item)) {
            System.out.println("Item with ID " + item.getId() + " Already exists");
        } else {
            itemSet.add(item);
            System.out.println("Item added: " + item);
        }
    }
    public static void removeItems(Set<Item> itemSet, Item item){
        if(itemSet.remove(item)){
            System.out.println("Item removed: " + item);
        }else{
            System.out.println("Item with ID: " + item.getId() + " Wasn't found");
        }
    }
  public static void itemFindByName(Set<Item> itemSet, Item item){
        if(itemSet.contains(item)){
            System.out.println("Item with name: " + item.getName() + " Is on the list");
        }else {
            System.out.println("The item doesn't exists");
        }
  }
}
