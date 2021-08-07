package Teste;
import Sistema.Conta;

public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.deposita(1000);
        System.out.println(c.getSaldo());
    }
}
