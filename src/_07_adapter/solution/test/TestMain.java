package _07_adapter.solution.test;

import _07_adapter.solution.adapte.CodeX;
import _07_adapter.solution.adapte.CodeXAdapter;
import _07_adapter.solution.pojo.Crypt;
import _07_adapter.solution.pojo.CryptA;
import _07_adapter.solution.pojo.CryptB;

public class TestMain {

    public static void main(String[] args) {


        Crypt crypt = new CryptA();
        crypt.encrypt("Design");
        crypt.decrypt("Pattern");

        System.out.println("-------------");

        crypt = new CryptB();
        crypt.encrypt("Software");
        crypt.decrypt("Engineer");

        System.out.println("-------------");

        CodeX codeX = new CodeX();

        crypt = new CodeXAdapter(codeX);
        crypt.encrypt("Product");
        crypt.decrypt("Manager");
    }
}
