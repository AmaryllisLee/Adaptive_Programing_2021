package domain_design_implementation;

import java.util.ArrayList;

public class MobileDevice {
    protected String brand;
    protected String model;
    protected Double price;
    protected String passcode;

    private ArrayList<Apps> amountApps;
    private AppStore appstore;

    public MobileDevice(String b,  String  m,   Double p, String ps){
        brand = b;
        model = m;
        price = p;
        passcode = ps;
    }


    public void setPrice( Double price ){this.price = price;}
    public Double getPrice(){return price;}

    public void addApp(Apps app) {amountApps.add(app);} // add App to amountapps
    public ArrayList<Apps> getAmountApps() {return amountApps;}


    /**
     * Compare inputSring to password, thus opening phone.
     * @return true or false
     */

//    @Override
//    public boolean equals( String inpuString) {
//        if (this.passcode == inpuString){
//            return true;
//        }else{
//            return false;
//        }
//    }




    @Override
    public String toString() {
        String s = model +" from the brand " + brand  + ". This device cost $ " + price;
        return s;
    }
}
