import Domain.Competetor;
import Domain.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by TUSHAR on 29-11-2016.
 */
public class InputReader {

    static File file = new File("input.txt");
    static BufferedReader br ;
    static List<Product> products=new ArrayList<Product>();
    static List<Competetor> competetors=new ArrayList<Competetor>() ;
    static HashMap<String,Product> competetorMapping=new HashMap<String, Product>() ;

    public InputReader() throws FileNotFoundException {
    }

    public static List<Product> read() throws Exception {
        br=new BufferedReader(new FileReader(file)) ;
        readProduct();

        readCompetitor() ;
        for(Product product:products)
        {
            System.out.println(product.getName()+product.getDemand()+product.getSupply()+product.getCompetetors());
        }

        return products ;


    }

    public static void readProduct() throws Exception {



        String inputLine;
        int numberOfProducts;

        if ((inputLine = br.readLine()) != null) {
            numberOfProducts = Integer.parseInt(inputLine);

            while (numberOfProducts-- > 0) {
                Product product=new Product();
                if ((inputLine = br.readLine()) == null) {
                    throw new Exception();
                }
                else
                {


                    String productLine[]=inputLine.split(" ") ;

                    if(productLine.length!=3){
                        throw new Exception() ;
                    }
                    else
                    {
                        product.setName(productLine[0]);
                       competetorMapping.put(productLine[0],product) ;
                        if ((productLine[1].equals("H")||productLine[1].equals("L"))&&(productLine[2].equals("H")||productLine[2].equals("L")))
                        {
                            product.setDemand(productLine[1]);
                            product.setSupply(productLine[2]);
                            product.setCompetetors(new ArrayList<Competetor>());

                         }
                         else {
                            throw new Exception();
                        }
                    }
                }

                products.add(product) ;

            }
        }


    }


    public static void readCompetitor() throws Exception {

        String inputLine;
        int numberOfProducts;
        if ((inputLine = br.readLine()) != null) {
            numberOfProducts = Integer.parseInt(inputLine);

            while (numberOfProducts-- > 0) {
                Competetor competetor=new Competetor() ;
                if ((inputLine = br.readLine()) == null) {
                    throw new Exception();
                }
                else
                {
                    System.out.println("INSIDE ELSE");
                    System.out.println(inputLine);
                    String competetorLine[]=inputLine.split(" ") ;

                    if(competetorLine.length!=3){
                        throw new Exception() ;
                    }
                    else
                    {
                        competetor.setName(competetorLine[0]);
                        competetor.setRetailer(competetorLine[1]);

                        competetor.setPrice(Integer.parseInt(competetorLine[2]));
                        competetorMapping.get(competetorLine[0]).getCompetetors().add(competetor) ;
                         ;
                    }
                }
            }








        }


    }

}