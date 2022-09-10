package structural._07_bridge.testBridge;

import structural._07_bridge.bridgeDesign.BilgisayarFK;
import structural._07_bridge.bridgeDesign.Telefon;
import structural._07_bridge.muzikcalar.Spotify;
import structural._07_bridge.pojo.Muzik;
import structural._07_bridge.sescihazi.Hoparlor;

public class TestBridge {
    public static void main(String[] args) {

        Muzik muzik = new Muzik("Volkan Konak","Aleni aleni");

        BilgisayarFK bilgisayarFK = new BilgisayarFK();
        bilgisayarFK.muzikCal(muzik);

        System.out.println("***********************************");
        Telefon telefon = new Telefon(new Spotify(), new Hoparlor());
        telefon.muzikCal(muzik);

    }
}
