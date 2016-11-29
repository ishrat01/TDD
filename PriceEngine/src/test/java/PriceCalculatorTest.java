import Domain.Product;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TUSHAR on 29-11-2016.
 */
public class PriceCalculatorTest {

    @Test
    public void shoulsGiveMinimum() throws Exception {
        List<Product> products=InputReader.read();
        PriceCalculator.CalculatePrice(products.get(0));
        assertEquals(10,products.get(0).getPrice());

    }

    @Test
    public void shoulsGiveMaxFrequency() throws Exception {
        List<Product> products=InputReader.read();


    }
}