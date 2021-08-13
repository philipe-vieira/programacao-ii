package Quest03;

public class AdolescenteOuJovem extends Pessoa {

    public void verificaIdade(String nome, int idade){
        if (idade < 18 ){
            System.out.println("Criança/Adolescente");
            System.out.println(nome+" "+idade+" anos");
        } else if (idade < 25){
            System.out.println("Jovem");
            System.out.println(nome+" "+idade+" anos");
        }
    }
}
