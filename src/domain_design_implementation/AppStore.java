package domain_design_implementation;

public class AppStore {
    private String username;
    private String password;
    private Double  balance;


    public AppStore(String us,  String pw, Double b){
        super(); //TODO: check error
        username  = us;
        password  = pw;
        balance   = b;
    }

    public void download(Apps app, MobileDevice device){//TODO : alternative ways to get amountApps whith addingg device as a parameter
        if  ((app.getPrice() > balance) & (!device.getAmountApps().contains(app))){
            device.getAmountApps().add(app);
        }

    }
}
