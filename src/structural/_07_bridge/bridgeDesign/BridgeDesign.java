package structural._07_bridge.bridgeDesign;

import structural._07_bridge.pojo.Muzik;
import structural._07_bridge.muzikcalar.MuzikCalar;
import structural._07_bridge.sescihazi.SesCihazi;

public abstract class BridgeDesign {

    protected MuzikCalar muzikCalar;
    protected SesCihazi sesCihazi;

    public BridgeDesign() {
    }

    public BridgeDesign(MuzikCalar muzikCalar, SesCihazi sesCihazi) {
        this.muzikCalar = muzikCalar;
        this.sesCihazi = sesCihazi;
    }

    public void muzikCal(Muzik muzik){

        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}
