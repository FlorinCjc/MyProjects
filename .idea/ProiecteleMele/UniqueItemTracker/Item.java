package comGoogle.UniqueItemTracker;

import java.util.Objects;
//https://github.com/4PEAT/advanced-features/blob/main/Day05/Task01.md

public class Item {
    private int id;
    private String name;
    private String itemType;
    private int quantity;

    public Item(int id, String name, String itemType, int quantity) {
        this.id = id;
        this.name = name;
        this.itemType = itemType;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Item setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public String getItemType() {
        return itemType;
    }

    public Item setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Item setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass())return false;
        Item item = (Item) obj;
        return id == item.id && name.equals(item.name);
    }
    public int hashCode(){
        return Objects.hash(id);
    }



    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itemType='" + itemType + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
