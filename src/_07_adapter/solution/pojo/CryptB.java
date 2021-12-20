package _07_adapter.solution.pojo;

public class CryptB implements Crypt{

    @Override
    public void encrypt(String text) {
        System.out.println("CryptB # encrypt");
    }

    @Override
    public void decrypt(String text) {
        System.out.println("CryptB # encrypt");
    }
}
