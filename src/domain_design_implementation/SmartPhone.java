package domain_design_implementation;
import java.util.HashMap;

public class SmartPhone extends MobileDevice{
    private  String phonenumber;
    private String  provider;
    private HashMap<String, TextMessage> log;


    public SmartPhone (String b,  String  m,   Double p, String ps, String number, String pr){
        super(b,m,p,ps); //TODO: check equals
        phonenumber = number;
        provider    = pr;
    }

    public String ring(){return ("Ring ring ring  !");}

    public void send (SmartPhone contact, String subject, String message){
        // create text Message
        TextMessage text = new TextMessage(subject,message);
        if (text.equals(" ")){ // check if message contains bad word  (in htis cas f**)
            System.out.println("content of text message is empty");
        }else{
            contact.log.put(subject, text); // send text,  add text to other smartphone log
        }
    }
}
