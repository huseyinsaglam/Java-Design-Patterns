package behavioral._13_chainOfResponsibility.pattern;

import behavioral._13_chainOfResponsibility.model.EnumIl;

public abstract class  ChainOfResponsibilityPattern {

    // istanbul - ankara - adana - hatay
    // istanbulda cikan kargo ankara gidecek ise ankarada kalacak yoksa bir sonraki adana ya yola cikacak
    // Kendisi
    // Bir sonraki

    EnumIl enumIl;   // suan ki il
    ChainOfResponsibilityPattern nextIl;            // bir sonraki gidecek yere olan kargo

    public ChainOfResponsibilityPattern(EnumIl enumIl) {
        this.enumIl = enumIl;
    }

    public void getKargolama(EnumIl enumIl) {

        gelenKargoBilgileriYazdir(enumIl);

        if (enumIl.equals(this.enumIl)){
            kargoTeslimBilgileriYazdir();
        }
        else if (getNextIl() != null){
            getNextIl().getKargolama(enumIl);
        }
        else {
            hizmetAlaniDisiYazdir(enumIl);
        }
    }

    public ChainOfResponsibilityPattern getNextIl() {
        return nextIl;
    }

    public ChainOfResponsibilityPattern setNextIl(ChainOfResponsibilityPattern nextIl) {
        this.nextIl = nextIl;
        return this;
    }


    private void kargoTeslimBilgileriYazdir() {
        System.out.println(this.enumIl + " şube teslim aldı.");
    }


    private void hizmetAlaniDisiYazdir(EnumIl enumIl) {
        System.out.println(enumIl.getValue() + " hizmet alanının dışındadır!");
    }
    private void gelenKargoBilgileriYazdir(EnumIl enumIl) {

        System.out.println(enumIl.getValue() + " iline gidecek kargo "
                + this.enumIl.getValue() + " şubesine geldi.");
    }
}
