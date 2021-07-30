package Exercicio02;

public class Teste3 {

    public static void main(String args[]){
        Administrador col = new Administrador();

        col.setNome("Silva");
        col.setIdade("21 anos");
        col.setEndereco("Amarante - PI");
        col.setCodigoSetor(4);
        col.setSalarioBase(1540.9f);
        col.setImposto(12);
        col.setAjuda(300);

        String msg = "";
        msg += "Administrador "+col.getNome()+";\n";
        msg += "Idade "+col.getIdade()+";\n";
        msg += "Endereco "+col.getEndereco()+"; \n";
        msg += "Setor "+col.getCodigoSetor()+"; \n";
        msg += "Salario Bruto "+col.getSalarioBase()
                +"; Imposto "+col.getImposto()
                +"; Salario Liquido "+col.calcularSalario()+";\n";

        System.out.println(msg);
    }
}
