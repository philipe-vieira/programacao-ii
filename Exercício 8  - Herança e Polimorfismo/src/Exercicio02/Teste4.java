package Exercicio02;

public class Teste4 {
    public static void main(String args[]){
        Operario col = new Operario();

        col.setNome("Silva");
        col.setIdade("21 anos");
        col.setEndereco("Amarante - PI");
        col.setCodigoSetor(4);
        col.setSalarioBase(1540.9f);
        col.setImposto(12);
        col.setValorProducao(300000);
        col.setComissao(0.5f);

        String msg = "";
        msg += "Operario "+col.getNome()+";\n";
        msg += "Idade "+col.getIdade()+";\n";
        msg += "Endereco "+col.getEndereco()+"; \n";
        msg += "Setor "+col.getCodigoSetor()+"; \n";
        msg += "Salario Bruto "+col.getSalarioBase()
                +"; comissao "+col.getComissao()+"%"
                +"; Salario Liquido "+col.calcularSalario()+";\n";

        System.out.println(msg);
    }
}
