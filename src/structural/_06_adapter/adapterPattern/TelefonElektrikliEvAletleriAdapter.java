package structural._06_adapter.adapterPattern;

import structural._06_adapter.adaptee.ElektrikliEvAletleri;
import structural._06_adapter.adaptee.Telefon;

public class TelefonElektrikliEvAletleriAdapter implements ElektrikliEvAletleri {

    private Telefon telefon;

    public TelefonElektrikliEvAletleriAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}
