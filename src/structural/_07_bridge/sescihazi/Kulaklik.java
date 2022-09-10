package structural._07_bridge.sescihazi;

public class Kulaklik implements SesCihazi{
    @Override
    public void sesiCal(String ses) {

        System.out.println("Kulaklik ses çalıyor -> " + ses);
    }
}
