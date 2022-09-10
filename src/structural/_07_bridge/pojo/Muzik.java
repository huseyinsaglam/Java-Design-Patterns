package structural._07_bridge.pojo;

public class Muzik {

    private String soyleyenKisi;
    private String adi;

    public Muzik(String soyleyenKisi, String adi) {
        this.soyleyenKisi = soyleyenKisi;
        this.adi = adi;
    }

    public String getSoyleyenKisi() {
        return soyleyenKisi;
    }

    public void setSoyleyenKisi(String soyleyenKisi) {
        this.soyleyenKisi = soyleyenKisi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "Muzik{" +
                "soyleyenKisi='" + soyleyenKisi + '\'' +
                ", adi='" + adi + '\'' +
                '}';
    }
}
