package Exercicio02;

public class Teste2 {

    public static void main(String args[]){
        Empregado col = new Empregado();

        col.setNome("Silva");
        col.setIdade("21 anos");
        col.setEndereco("Amarante - PI");
        col.setCodigoSetor(4);
        col.setSalarioBase(1540.9f);
        col.setImposto(12);

        String msg = "";
        msg += "Funcionario "+col.getNome()+";\n";
        msg += "Idade "+col.getIdade()+";\n";
        msg += "Endereco "+col.getEndereco()+"; \n";
        msg += "Setor "+col.getCodigoSetor()+"; \n";
        msg += "Salario Bruto "+col.getSalarioBase()
                +"; Imposto "+col.getImposto()
                +"; Salario Liquido "+col.calcularSalario()+";\n";

        System.out.println(msg);
    }
}
