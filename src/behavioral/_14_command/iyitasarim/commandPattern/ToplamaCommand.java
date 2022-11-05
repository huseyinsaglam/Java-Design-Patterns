package behavioral._14_command.iyitasarim.commandPattern;

import behavioral._14_command.iyitasarim.commandPattern.Islem;

import java.math.BigDecimal;

public class ToplamaCommand implements Islem {

    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.add(sayi2);
    }
}
