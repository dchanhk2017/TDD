package udemy.discount;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class DiscountApplierTest {

    private DiscountApplier applier;

    @Before
    public void setUp() {
        applier = new DiscountApplier();
    }

    @Test
    public void discountForMacAndIphoneTogether() {
        //Item mac = new Item("MACBOOK", 1, 100);
        //Item iphone = new Item("IPHONE", 1, 50);
        //Basket basket = new Basket(Arrays.asList(mac, iphone));
        Basket basket = new BasketBuilder()
                .w("MACBOOK", 100)
                .w("IPHONE", 50)
                .build();
        applier.apply(basket);

        double expected = (100 + 50) * 0.85;
        Assert.assertEquals(expected, basket.getAmount(), 0.0001);
    }

    @Test
    public void discountForNoteBookAndWindowsPhoneTogether() {
        //Item notebook = new Item("NOTEBOOK", 1, 100);
        //Item wphone = new Item("WINDOWS PHONE", 1, 50);
        //Basket basket = new Basket(Arrays.asList(notebook, wphone));
        Basket basket = new BasketBuilder()
                .w("NOTEBOOK", 100)
                .w("WINDOWS PHONE", 50)
                .build();
        applier.apply(basket);

        double expected = (100 + 50) * 0.88;
        Assert.assertEquals(expected, basket.getAmount(), 0.0001);
    }

    @Test
    public void discountForXbox() {
        //Item xbox = new Item("XBOX", 1, 100);
        //Basket basket = new Basket(Arrays.asList(xbox));
        Basket basket = new BasketBuilder()
                .w("XBOX", 100)
                .build();
        applier.apply(basket);

        double expected = 100 * 0.3;
        Assert.assertEquals(expected, basket.getAmount(), 0.0001);

    }

    @Test
    public void discountFor3Or4Products() {
        //Item refrigerator = new Item("REFRIGERATOR", 1, 3000);
        //Item dishwasher = new Item("DISHWASHER", 1, 500);
        //Item trashcan = new Item("TRASHCAN", 1, 100);
        //Basket basket = new Basket(Arrays.asList(refrigerator, dishwasher, trashcan));
        Basket basket = new BasketBuilder()
                .w("REFRIGERATOR", 3000)
                .w("DISHWASHER", 500)
                .w("TRASHCAN", 100)
                .build();
        applier.apply(basket);

        double expected = (3000 + 500 + 100) * 0.95;
        Assert.assertEquals(expected, basket.getAmount(), 0.0001);

    }
}