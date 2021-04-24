package domain_design_implementation;

public class TextMessage {
    private String subject;
    private String content;

    public   TextMessage( String s, String m){
        subject  = s;
        content  = m;
    }

    /**
     * Check if content of TextMessage is equal  of less  than maximInteger.
     * @param error
     * @return bool
     */
//    @Override
//    public boolean equals(String error) {
//        if (content.contains(error)) {
//            return true;
//        }
//        return false;
//    }

    @Override
    public String toString() {
        String subjectContent = "Subject: "+ subject;
        String messageContent = "Message:  \n"  + content;
        return (subjectContent + "\n" + messageContent);

    }
}
