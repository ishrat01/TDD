import Domain.Competetor;
import Domain.Product;

import java.util.List;

/**
 * Created by TUSHAR on 29-11-2016.
 */
public class PriceCalculator {

    static void CalculatePrice(Product product)
    {
       product.setPrice(findMinimum(product.getCompetetors())) ;

    }
    static int findMinimum(List<Competetor> competetors)
    {
        int minimum=competetors.get(0).getPrice() ;
        for(Competetor competetor:competetors)
        {

            if(competetor.getPrice()<minimum)
            {
                minimum=competetor.getPrice() ;
            }
        }
        return minimum ;
    }
}
