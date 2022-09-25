package structural._12_proxy.test;

import structural._12_proxy.pojo.Image;
import structural._12_proxy.proxyPattern.ProxyImage;

public class ProxyPatternDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }

}
