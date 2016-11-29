package Domain;

import java.util.List;

/**
 * Created by TUSHAR on 29-11-2016.
 */
public class Product {
    String name ;
    String demand ;
    String supply ;
    int price ;
    List<Competetor> competetors ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Competetor> getCompetetors() {
        return competetors;
    }

    public void setCompetetors(List<Competetor> competetors) {
        this.competetors = competetors;
    }
}
