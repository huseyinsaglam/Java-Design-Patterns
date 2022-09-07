package structural._06_adapter.pojo;

import structural._06_adapter.adaptee.Telefon;

public class RedmiTelefon implements Telefon {

    private int volt;

    public RedmiTelefon(int volt) {
        this.volt = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Redmi Telefon çalışıyor.");
        return volt;
    }
}
