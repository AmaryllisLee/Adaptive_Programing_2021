package domain_design_implementation;

import java.util.ArrayList;

public class AppStore extends Apps{
    private String username;
    private String password;
    private Double  balance;


    private ArrayList<Apps> apps = new ArrayList<>();



    public AppStore(String n, Double p, Double v, String us,  String pw, Double b){
        super(n, p, v);
        username  = us;
        password  = pw;
        balance   = b;
    }

    public void addApps(Apps app) {
        this.apps.add(app);
    }

    /**
     * Check if ther is enough money in balance to purchase app.
     * @param app
     * @return true or false
     */
    public boolean checkBalance(Apps app){
        if  (app.getPrice() > balance){
           return true;
        }
        return false;
    }

}
