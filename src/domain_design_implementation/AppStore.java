package domain_design_implementation;

import java.util.ArrayList;

public class AppStore extends Apps{
    private String username;
    private String password;
    private Double  balance;


    private ArrayList<Apps> apps = new ArrayList<>();



    public AppStore(String name, Double price, Double version, String us,  String pw, Double b){
        super(name, price, version);
        username  = us;
        password  = pw;
        balance   = b;
    }

    public boolean checkBalance(Apps app){
        if  (app.getPrice() > balance){
           return true;
        }
        return false;
    }

    public void addApps(Apps app) {
        this.apps.add(app);
    }
}
