package structural._07_bridge.muzikcalar;

import structural._07_bridge.pojo.Muzik;

public class Spotify implements MuzikCalar{

    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + "sarkisi caliniyor");
        return muzik.getAdi();
    }
}
