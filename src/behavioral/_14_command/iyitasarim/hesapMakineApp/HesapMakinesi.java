package behavioral._14_command.iyitasarim.hesapMakineApp;

import behavioral._14_command.iyitasarim.commandPattern.Islem;

import java.math.BigDecimal;

public class HesapMakinesi {

    public static BigDecimal islem(Islem islem, BigDecimal sayi1, BigDecimal sayi2){
        return islem.islem(sayi1, sayi2);
    }
}
