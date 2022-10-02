package behavioral._13_chainOfResponsibility.test;

import behavioral._13_chainOfResponsibility.model.EnumIl;
import behavioral._13_chainOfResponsibility.pattern.ChainOfResponsibilityPattern;
import behavioral._13_chainOfResponsibility.pojo.HSKargoSirketi;

public class TestChainOfResponsibility {
    public static void main(String[] args) {

        ChainOfResponsibilityPattern hsKargo = HSKargoSirketi.getHsKargoSirketi();

        System.out.println("------------------------------------");
        hsKargo.getKargolama(EnumIl.ERZURUM);

        System.out.println("------------------------------------");
        hsKargo.getKargolama(EnumIl.ADANA);

        System.out.println("------------------------------------");
        hsKargo.getKargolama(EnumIl.HATAY);
    }
}
