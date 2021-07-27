import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a cadeira de caracteres: ");
        String leitura =ler.next();

        String[] arrayChar = leitura.split("");

        for(int i=0; i < leitura.length(); i++){
            switch (arrayChar[i].toLowerCase()){
                case "a":
                    System.out.println("\""+arrayChar[i]+"\" é uma vogal");
                    break;

                case "e":
                    System.out.println("\""+arrayChar[i]+"\" é uma vogal");
                    break;

                case "i":
                    System.out.println("\""+arrayChar[i]+"\" é uma vogal");
                    break;

                case "o":
                    System.out.println("\""+arrayChar[i]+"\" é uma vogal");
                    break;

                case "u":
                    System.out.println("\""+arrayChar[i]+"\" é uma vogal");
                    break;
                default:
                    System.out.println("\""+arrayChar[i]+"\" é uma consoante");
                    break;
            }
        }
    }
}
