package structural._12_proxy.proxyPattern;

import structural._12_proxy.pojo.Image;
import structural._12_proxy.pojo.RealImage;

public class ProxyImage implements Image {

    RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        if (realImage == null){
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
