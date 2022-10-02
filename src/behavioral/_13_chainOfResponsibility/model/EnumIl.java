package behavioral._13_chainOfResponsibility.model;

public enum EnumIl {

    ISTANBUL("Istanbul"),
    ANKARA("Ankara"),
    ADANA("Adana"),
    HATAY("Hatay"),
    ERZURUM("Erzurum");

    private String value;

    EnumIl(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
