public class Funcionario {

    String nome, departamento, dataEntrada, RG;
    double salario;
    boolean ativo;

    Funcionario(String nome, String departamento, String dataEntrada, String RG){
        this.nome = nome;
        this.departamento = departamento;
        this.dataEntrada = dataEntrada;
        this.RG = RG;
        this.salario = 1000;
        this.ativo = true;
    }

    void bonifica(int percent){
        salario += (percent*salario)/100;
    }

    void bonifica(){
        if(salario >= 1500 && salario < 1750){
            salario += (12*salario)/100;
        } else if (salario >= 1750 && salario < 2000){
            salario += (10*salario)/100;
        }else if (salario >= 2000 && salario < 3000){
            salario += (7*salario)/100;
        }else if (salario >= 3000){
            salario += (7*salario)/100;
        } else {
            salario += (15*salario)/100;
        }
    }

    void demite (){
        ativo = false;
    }
}
