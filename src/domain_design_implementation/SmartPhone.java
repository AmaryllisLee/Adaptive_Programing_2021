package domain_design_implementation;
import java.util.HashMap;

public class SmartPhone extends MobileDevice implements Phonecall{
    private  String phonenumber;
    private String  provider;
    private HashMap<String, TextMessage> log = new HashMap<>();


    public SmartPhone (String b,  String  m,   Double p, String ps, String sn, AppStore as,  String number, String pr){
        super(b,m,p,ps,sn, as);
        phonenumber = number;
        provider    = pr;
    }
    public HashMap<String, TextMessage> getLog() {return log;}

    public String ring(){return ("Ring ring ring  !");}


    /**
     * add phonenumber and TextMessage to the log of contact. Send a texmessage to another SmartPhone.
     * @param contact
     * @param subject
     * @param message
     */
    public void send (SmartPhone contact, String subject, String message){
        // create text Message
        TextMessage text = new TextMessage(subject,message);
        if (text.equals(" ")){ // check if message is empty)
            System.out.println("content of text message is empty");
        }else{
            contact.log.put(phonenumber, text); // send text,  add text to other smartphone log
        }
    }
}
