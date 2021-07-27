public class Pessoa {
    int idade = 25;
    String nome =  "Joao";

    public void verificaIdade(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
        System.out.println("Nome "+nome+"; Idade "+idade);
    }

    public void verificaIdade(){
        System.out.println("Nome "+this.nome+"; Idade "+this.idade );
    }

    public static void main(String args[]){
        Pessoa p1 = new Pessoa();

        p1.verificaIdade();
        p1.verificaIdade(18, "Maria");
    }
}
