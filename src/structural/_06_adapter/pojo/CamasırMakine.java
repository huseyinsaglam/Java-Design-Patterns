package structural._06_adapter.pojo;

import structural._06_adapter.adaptee.ElektrikliEvAletleri;

public class CamasırMakine implements ElektrikliEvAletleri {

    private int volt;

    public CamasırMakine() {
        volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {
        System.out.println("CamasırMakine çalışıyor.");
        return volt;
    }
}
