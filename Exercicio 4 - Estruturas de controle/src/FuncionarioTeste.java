public class FuncionarioTeste {

    public static void main(String args[]) {
        Funcionario func = new Funcionario( "Jose", "Financeiro", "21/05", "123");

        func.bonifica(15);
        func.demite();

        String status = func.ativo ? "ativo" : "inativo";
        System.out.println("Funcionario "+func.nome+"; RG "+func.RG+"; Departamento "+func.departamento
            + "; \nEstá "+status+" com Salário de "+func.salario);

    }
}
