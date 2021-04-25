package domain_design_implementation;

import java.util.Objects;

public class Apps {
    private String name;
    private Double price;
    private Double version;

    public Apps (String n, Double p, Double v){
        name = n;
        price = p;
        version = v;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apps)) return false;
        Apps apps = (Apps) o;
        return Objects.equals(getPrice(), apps.getPrice());
    }


    @Override
    public String toString() {
        String s  = "App: "+ name + ", version: " + version +". this app cost "  +  price;
        return s;
    }
}
