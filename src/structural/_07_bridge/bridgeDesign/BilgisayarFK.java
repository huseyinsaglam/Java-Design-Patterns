package structural._07_bridge.bridgeDesign;

import structural._07_bridge.muzikcalar.Fizy;
import structural._07_bridge.pojo.Muzik;
import structural._07_bridge.sescihazi.Kulaklik;

public class BilgisayarFK extends BridgeDesign {

    public BilgisayarFK() {
        muzikCalar = new Fizy();
        sesCihazi = new Kulaklik();
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar Muzik Caliyor");
        super.muzikCal(muzik);
    }
}
