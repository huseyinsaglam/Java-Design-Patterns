package structural._06_adapter.test;

import structural._06_adapter.adapterPattern.TelefonElektrikliEvAletleriAdapter;
import structural._06_adapter.pojo.Buzdolabı;
import structural._06_adapter.pojo.CamasırMakine;
import structural._06_adapter.pojo.Priz;
import structural._06_adapter.pojo.SamsungTelefon;

public class TestAdapter {

    public static void main(String[] args) {

        Priz priz = new Priz();

        CamasırMakine utu = new CamasırMakine();
        Buzdolabı buzdolabı = new Buzdolabı();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabı);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonElektrikliEvAletleriAdapter adapter = new TelefonElektrikliEvAletleriAdapter(samsungTelefon);

        priz.elektrikVer(adapter);
    }
}
