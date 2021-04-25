package domain_design_implementation;

import java.util.Objects;

public class TextMessage {
    private String subject;
    private String content;

    public   TextMessage( String s, String m){
        subject  = s;
        content  = m;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TextMessage)) return false;
        TextMessage that = (TextMessage) o;
        return Objects.equals(subject, that.subject) && Objects.equals(content, that.content);
    }


    @Override
    public String toString() {
        String subjectContent = " Subject: "+ subject;
        String messageContent = "Message:  \n"  + content;
        return (subjectContent + "\n" + messageContent);

    }
}
