package creational._04_builder.test;

import creational._04_builder.pattern.EvBuilder;
import creational._04_builder.pojo.Ev;

public class TestBuilder {

    public static void main(String[] args) {

        Ev ev = EvBuilder.startBuild()
                .setIl("İstanbul")
                .setIlce("Umraniye")
                .setMahalle("Yamanevler")
                .setBinaYili(2018)
                .setBinaYili(4)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .build();

        printEv(ev);

    }

    private static  void printEv(Ev ev){

        System.out.println();

        System.out.println("Ev eklendi -> " + ev);

        System.out.println();
    }
}
