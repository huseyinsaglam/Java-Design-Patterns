package behavioral._17_mediator.mediatorDesign;

import behavioral._17_mediator.pojo.User;

import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getAdi() + "] : " + message);
    }

}
