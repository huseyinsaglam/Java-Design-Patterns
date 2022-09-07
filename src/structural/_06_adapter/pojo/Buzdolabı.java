package structural._06_adapter.pojo;

import structural._06_adapter.adaptee.ElektrikliEvAletleri;

public class Buzdolabı implements ElektrikliEvAletleri {

    private int volt ;
    public Buzdolabı() {
        volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Buzdolabı çalışıyor.");
        return volt;
    }
}
