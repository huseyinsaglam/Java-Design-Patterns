package structural._07_bridge.bridgeDesign;

import structural._07_bridge.muzikcalar.MuzikCalar;
import structural._07_bridge.pojo.Muzik;
import structural._07_bridge.sescihazi.SesCihazi;

public class Telefon extends BridgeDesign {

    public Telefon(MuzikCalar muzikCalar, SesCihazi sesCihazi) {
        super(muzikCalar, sesCihazi);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon Muzik Caliyor");
        super.muzikCal(muzik);
    }
}
