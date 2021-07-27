public class EntradaDeCinema_Q4 {
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

    static void usoSwitch(int dia){
        switch (dia){
            case 1:
                System.out.println("O filme foi assistido no Domingo");
                break;
            case 2:
                System.out.println("O filme foi assistido na Segunda-Feira");
                break;
            case 3:
                System.out.println("O filme foi assistido na Terça-Feira");
                break;
            case 4:
                System.out.println("O filme foi assistido na Quarta-Feira");
                break;
            case 5:
                System.out.println("O filme foi assistido na Quinta-Feira");
                break;
            case 6:
                System.out.println("O filme foi assistido na Sexta-Feira");
                break;
            case 7:
                System.out.println("O filme foi assistido no Sabado");
                break;
            default:
                System.out.println("O filme foi assistido no ");
                break;
        }
    }

    public static void main(String args[]) {
        diaSemana = QUINTA;
        float preco =  calculaPreco(25, diaSemana);

        System.out.println("Preço "+preco);
        usoSwitch(diaSemana);
    }

}
