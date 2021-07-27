import java.util.Scanner;

public class ImpressaoMeuNome {

    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = ler.next();
        for (int i = 0; i < 10; i++){
            System.out.println(nome + " "+(i+1));
        }
    }
}
