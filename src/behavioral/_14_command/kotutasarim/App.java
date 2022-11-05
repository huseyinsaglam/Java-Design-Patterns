package behavioral._14_command.kotutasarim;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        BigDecimal toplam = HesapMakinesi.islem(IslemTuru.TOPLAMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal fark = HesapMakinesi.islem(IslemTuru.CIKARMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal ust = HesapMakinesi.islem(IslemTuru.UST, BigDecimal.TEN, BigDecimal.valueOf(2));
        BigDecimal mod = HesapMakinesi.islem(IslemTuru.MOD, BigDecimal.TEN, BigDecimal.valueOf(3));

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Üst: " + ust);
        System.out.println("Mod: " + mod);
    }
}
