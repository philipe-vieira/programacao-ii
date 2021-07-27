public class calculaConsumo {


    public float valorAPagar(String nomeConsumidor, float precoLitro, float qntConsumido){
        float totalAPagar = precoLitro*qntConsumido;
        System.out.println("Consumidor"+nomeConsumidor+" pagara $$ "+totalAPagar);
        return totalAPagar;
    }

    public static void main(String args[]) {
        calculaConsumo calc = new calculaConsumo();

        float total = calc.valorAPagar("Pedro", 2.50f, 10.2f);

        System.out.println("retorno = " + total);
    }
}
