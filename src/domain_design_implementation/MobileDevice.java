package domain_design_implementation;

import java.util.ArrayList;

public class MobileDevice {
    protected String brand;
    protected String model;
    protected Double price;
    protected String passcode;

    private ArrayList<Apps> amountApps = new ArrayList<>();
    private AppStore appstore;


    public MobileDevice(String brand, String model, Double price, String passcode, AppStore appstore) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.passcode = passcode;
        this.appstore = appstore;

        //add appstore in to apps
        amountApps.add(appstore);
    }


    public void setPrice( Double price ){this.price = price;}
    public Double getPrice(){return price;}

    /**
     * Add an app in to amountApps
     * @param app
     */
    public void addApp(Apps app) {
        if( getAmountApps().contains(app) ){
            getAmountApps().add(app); // add app to amountApps
        }else{
            System.out.println(app + "is already  in your device");
        }
    }

    /**
     * Remove an app from amountApps
     * @param app
     */
    public void deleteApp (Apps app){
        //check if app is in our device
        if( getAmountApps().contains(app) ){
            getAmountApps().remove(app); // remove app from mobile device (list amountApps)
        }else{
            System.out.println(app + "is not in your device");
        }
    }

    public ArrayList<Apps> getAmountApps() {return amountApps;}

    /**
     * Download an app from appstore, app will be added in to amountApps.
     * @param app
     */
    public String  downloadApp(Apps app){
        if (!amountApps.contains(app)){
            if (appstore.checkBalance(app)){
                amountApps.add(app);
                return ("App is dowloaded. Apps on your devices: " + amountApps);
            }
            return ("Can't purchase app, because you don't have enough in your balance");
        }
        return ("You don't have enough space to download this app");
    }

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
