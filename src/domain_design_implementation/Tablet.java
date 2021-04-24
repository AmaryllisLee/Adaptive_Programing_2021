package domain_design_implementation;

public class Tablet extends MobileDevice{

    public Tablet(String b,  String  m,   Double p, String ps){super(b,m,p,ps);}

    public void delete(Apps app){
        //check if app is in our device
        if( getAmountApps().contains(app) ){
            getAmountApps().remove(app); // remove app from mobile device (list amountApps)
        }else{
            System.out.println(app + "is not in your device");
        }
    }
}
