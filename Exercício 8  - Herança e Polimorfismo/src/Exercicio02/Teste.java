package Exercicio02;

public class Teste {

    public static void main(String args[]){
        Fornecedor comercial = new Fornecedor();

        comercial.setNome("Silva");
        comercial.setIdade("21 anos");
        comercial.setEndereco("Amarante - PI");
        comercial.setValorCredito(1000.99f);
        comercial.setValorDivida(500);

        String msg = "Fornecedor "+comercial.getNome()
                +", "+comercial.getIdade()+" anos, localizado em "
                +comercial.getEndereco()+".\nSaldo "+comercial.obterSaldo();
        System.out.println(msg);
    }
}
