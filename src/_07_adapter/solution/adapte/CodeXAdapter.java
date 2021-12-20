package _07_adapter.solution.adapte;

import _07_adapter.solution.pojo.Crypt;

public class CodeXAdapter implements Crypt {

    CodeX codex;

    public CodeXAdapter (CodeX codex) {
        this.codex = codex;
    }

    @Override
    public void encrypt(String text) {
        codex.textToCode(text);
    }

    @Override
    public void decrypt(String text) {
        codex.codeToText(text);
    }
}
