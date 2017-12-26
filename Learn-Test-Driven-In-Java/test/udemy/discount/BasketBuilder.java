package udemy.discount;

import java.util.ArrayList;
import java.util.List;

public class BasketBuilder {
    private List<Item> items;

    public BasketBuilder() {
        this.items = new ArrayList<Item>();
    }

    public BasketBuilder w(String name, double price) {
        items.add(new Item(name, 1, price));
        return this;
    }

    public Basket build() {
        return new Basket(items);
    }
}
