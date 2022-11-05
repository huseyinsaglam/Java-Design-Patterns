package behavioral._14_command.iyitasarim.testCommand;

import behavioral._14_command.iyitasarim.hesapMakineApp.HesapMakinesi;
import behavioral._14_command.iyitasarim.commandPattern.CarpmaCommand;
import behavioral._14_command.iyitasarim.commandPattern.CikarmaCommand;
import behavioral._14_command.iyitasarim.commandPattern.ToplamaCommand;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        BigDecimal sayi1 = BigDecimal.TEN;
        BigDecimal sayi2 = BigDecimal.valueOf(2);

        BigDecimal toplam = HesapMakinesi.islem(new ToplamaCommand(), sayi1, sayi2);
        BigDecimal cikarma = HesapMakinesi.islem(new CikarmaCommand(), sayi1, sayi2);
        BigDecimal carpma = HesapMakinesi.islem(new CarpmaCommand(), sayi1, sayi2);

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + cikarma);
        System.out.println("Çarpma: " + carpma);

    }
}
