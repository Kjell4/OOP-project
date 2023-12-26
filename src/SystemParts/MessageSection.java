package SystemParts;

import Users.*;

import java.util.Date;

public class MessageSection {

    public MessageSection() {

    }

    public void writeMessage(String content, User from, User to, Date date) {
        Message message = new Message(content, from.getId(), to.getId(), date);
        to.pm.add(message);
        System.out.println("Your message was send to "+  to.getName());
    }
}
