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
//        for (int i = 0; i < messages.size(); i++)
//            if (messages.get(i).getReceiver().getUsername().equals(u1.getUsername()) || messages.get(i).getReceiver().getUsername().equals(u2.getUsername()))
//                if (messages.get(i).getSender().getUsername().equals(u1.getUsername()) || messages.get(i).getSender().getUsername().equals(u2.getUsername()))
//                    System.out.println(messages.get(i).getSender().getUsername() + ": " + messages.get(i).getText());
        for (Message i : messages) {
            if (i.getReceiver().getUsername().equals(u1.getUsername()) || i.getReceiver().getUsername().equals(u2.getUsername()))
                if (i.getSender().getUsername().equals(u1.getUsername()) || i.getSender().getUsername().equals(u2.getUsername()))
                    System.out.println(i.getSender().getUsername() + ": " + i.getText());
        }
    }
}

