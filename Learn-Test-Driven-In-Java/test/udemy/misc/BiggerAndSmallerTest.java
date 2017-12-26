package udemy.misc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BiggerAndSmallerTest {

    private BiggerAndSmaller algorithm;
    private int[] nums(int ...ns){
        return ns;
    }

    private void assertNumbers(int bigger, int smaller) {
        Assert.assertEquals(bigger, algorithm.getBigger());
        Assert.assertEquals(smaller, algorithm.getSmaller());
    }

    @Before
    public void setUp(){
        algorithm = new BiggerAndSmaller();
    }

    @Test
    public void numbersInIncreasingOrder() {
        algorithm.find(nums(2, 3, 4));
        assertNumbers(4, 2);
    }

    @Test
    public void numbersInDecreasingOrder() {
        algorithm.find(nums(4, 3, 2));
        assertNumbers(4, 2);
    }

    @Test
    public void numbersInAnyOrder() {
        algorithm.find(nums(5, 2, 2, 5, 7, 1, 72));
        assertNumbers(72, 1);

    }

    @Test
    public void repeatedNumbers() {
        algorithm.find(nums(5, 2, 2, 5, 7, 1, 72));
        assertNumbers(72, 1);
    }
}
