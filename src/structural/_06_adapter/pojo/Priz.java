package structural._06_adapter.pojo;

import structural._06_adapter.adaptee.ElektrikliEvAletleri;

public class Priz {

    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){

        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden " + volt + " volt alınıyor");

    }

}
