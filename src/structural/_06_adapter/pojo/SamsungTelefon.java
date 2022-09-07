package structural._06_adapter.pojo;

import structural._06_adapter.adaptee.Telefon;

public class SamsungTelefon implements Telefon {

    private int volt;

    public SamsungTelefon() {
        this.volt = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung Telefon çalışıyor.");
        return volt;
    }
}
