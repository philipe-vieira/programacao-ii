public class EntradaDeCinema {
    private static int diaSemana;
    private static final int DOMINGO = 1;
    private static final int SEGUNDA = 2;
    private static final int TERCA = 3;
    private static final int QUARTA = 4;
    private static final int QUINTA = 5 ;
    private static final int SEXTA = 6;
    private static final int SABADO = 7;

    static float calculaPreco(int idade, int dia){
        if(idade < 14 || idade > 65){
            return 6.0f;
        } else if ( dia == 3 || dia == 4) {
            return 6.0f;
        } else {
            return 12.00f;
        }
    }

    public static void main(String args[]) {
        diaSemana = QUARTA;
        float preco =  calculaPreco(25, diaSemana);

        System.out.println("Preço "+preco);
    }
}
