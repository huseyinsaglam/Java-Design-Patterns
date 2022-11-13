package behavioral._17_mediator.pojo;

import behavioral._17_mediator.mediatorDesign.ChatRoom;

public class User {

    private String adi;

    public User(String adi) {
        this.adi = adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
