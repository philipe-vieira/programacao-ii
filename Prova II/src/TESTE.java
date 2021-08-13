import Quest03.*;
import Quest04.*;

public class TESTE {

    public static void main(String[] args) {
        AdolescenteOuJovem a = new AdolescenteOuJovem();
        Pessoa b = new Pessoa();

        a.verificaIdade("joao", 15);
        a.verificaIdade("joao 2", 20);
        a.verificaIdade("joao 3", 30);
        b.verificaIdade("joao 4", 22);

        ClasseAbstrata c = new ClasseAbstrata() {
            @Override
            public void metodoAbstrato() {
                System.out.println("nada");
            }
        };

        Subclasse d = new Subclasse();

        c.bomdia();
        c.metodoAbstrato();
        d.bomdia();
        d.metodoAbstrato();
    }

}
