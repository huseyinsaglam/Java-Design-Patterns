package structural._07_bridge.sescihazi;

public class Hoparlor implements SesCihazi{
    @Override
    public void sesiCal(String ses) {

        System.out.println("Hoparlor ses çalıyor -> " + ses);
    }
}
