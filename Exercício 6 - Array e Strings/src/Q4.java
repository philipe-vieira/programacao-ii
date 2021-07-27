import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a cadeira de caracteres: ");
        String leitura =ler.next();

        System.out.println("String possui "+leitura.length()+" caracteres");

        System.out.println("Ultima ocorrencia da letra A na posicao "+leitura.lastIndexOf("a"));

        String[] arrayChar = leitura.split("");
        String inverso = "";
        for(int i=leitura.length()-1; i >= 0; i--){
            inverso += String.valueOf(arrayChar[i]);
        }
        System.out.println("Inverso => "+inverso);
    }
}
