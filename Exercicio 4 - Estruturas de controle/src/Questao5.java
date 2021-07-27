import java.util.Scanner;

public class Questao5 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = ler.nextInt();

        if( a > b ){
            System.out.println("O primeiro numero é maior");
        } else if( a < b ){
            System.out.println("O segundo numero é maior");
        } else{
            System.out.println("Os numeros são iguais");
        }

    }
}
