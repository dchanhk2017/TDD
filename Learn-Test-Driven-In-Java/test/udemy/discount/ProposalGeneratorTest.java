package udemy.discount;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProposalGeneratorTest {

    @Test
    public void discountWhenChristmas(){
        Basket basket = new BasketBuilder().w("MACBOOK", 1000).build();

        Calendar jan = new GregorianCalendar(2015, Calendar.DECEMBER, 2);
        Clock fakeClock = Mockito.mock(Clock.class);
        Mockito.when(fakeClock.now()).thenReturn(jan);

        ProposalGenerator generator = new ProposalGenerator(fakeClock);
        double finalAmount = generator.calculateDiscount(basket);

        Assert.assertEquals(1000*0.15, finalAmount, 0.0001);
    }
}
