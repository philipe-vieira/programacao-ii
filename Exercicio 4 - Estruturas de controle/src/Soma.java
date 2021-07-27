public class Soma {

    public static void main(String args[]) {
        long soma = 0, pares = 0, impares = 0, somaParesImpares;
        for( int i = 4+1; i < 10000; ++i){
            soma += i;

            if(i % 2 == 0){
                pares += i;
            }else{
                impares += i;
            }
        }

        somaParesImpares = pares+impares;
        System.out.println("Soma final: "+soma);
        System.out.println("Soma pares e impares: "+somaParesImpares);
    }
}
