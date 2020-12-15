package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {

        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {

        for (Message i : messages) {
            if (i.getReceiver() == u1 || i.getReceiver() == u2)
                if (i.getSender() == u1 || i.getSender() == u2)
                    System.out.println(i.getSender().getUsername() + ": " + i.getText());
        }
    }
}

