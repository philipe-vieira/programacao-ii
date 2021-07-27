public class Q2 {
    static void somentePares(int[] vetor){
        for (int i =0; i<15; i++){
            if ((vetor[i] % 2) == 0){
                System.out.println("Vetor["+i+"] => "+vetor[i]);
            }
        }
    }

    static void imprimeInverso(int[] vetor){
        for (int i =15-1; i>=0; i--){
            System.out.println("Vetor["+i+"] => "+vetor[i]);
        }
    }

    static void maiorValor(int[] vetor){
        int maior=0, posicao=-1;

        for (int i =0; i<15; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
                posicao=i;
            }
        }

        System.out.println("O maior é o Vetor["+posicao+"] => "+maior);
    }

    static void menorValor(int[] vetor){
        int menor=9999999, posicao=-1;

        for (int i =0; i<15; i++){
            if (vetor[i] < menor){
                menor = vetor[i];
                posicao=i;
            }
        }

        System.out.println("O menor é o Vetor["+posicao+"] => "+menor);
    }

    static int[] invertePosicoes(int[] vetor){
        int[] vetor2 = new int[15];

        for (int i =0; i<15; i++){
            vetor2[i] = vetor[15-i-1];
        }
        return vetor2;
    }

    public static void main(String args[]){
        int tam = 15;
        int[] vetor = new int[tam];

        for (int i=0; i<tam; i++) {
            vetor[i] = i;
        }
        somentePares(vetor);

        imprimeInverso(vetor);
        maiorValor(vetor);
        menorValor(vetor);

        int[] vetorInvetido = invertePosicoes(vetor);
        imprimeInverso(vetorInvetido);
    }
}
