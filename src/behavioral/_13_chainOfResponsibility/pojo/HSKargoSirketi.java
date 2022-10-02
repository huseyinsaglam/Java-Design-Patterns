package behavioral._13_chainOfResponsibility.pojo;

import behavioral._13_chainOfResponsibility.pattern.ChainOfResponsibilityPattern;

public class HSKargoSirketi {

    public static ChainOfResponsibilityPattern getHsKargoSirketi(){

        Istanbul istanbul = new Istanbul();
        Ankara ankara = new Ankara();
        Adana adana = new Adana();
        Hatay hatay = new Hatay();

        ChainOfResponsibilityPattern chain = istanbul.setNextIl(ankara.setNextIl(adana.setNextIl(hatay)));
        return chain;

    }
}
