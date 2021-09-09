/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

/**
 * Classe JavaBean para representar a entidade aluno
 * @author ada
 */
public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private String dataNascimento;
    private String telefone;
    private String cpf;

    /*
    * Método para obter matricula do aluno
    * @return int - Valor da matricula
    * @author ada
    */
    public int getMatricula() {
        return matricula;
    }

    /*
    * Método para alterar matricula do aluno
    * @param matricula int - valor a ser atribuido à matricula
    * @author ada
    */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /*
    * Método para obter nome do aluno
    * @return String - Valor do nome
    * @author ada
    */
    public String getNome() {
        return nome;
    }

    /*
    * Método para alterar nome do aluno
    * @param nome String - valor a ser a tribuido ao nome
    * @author ada
    */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    * Método para obter idade do aluno
    * @return int - Valor da idade
    * @author ada
    */
    public int getIdade() {
        return idade;
    }

    /*
    * Método para alterar idade do aluno
    * @param idade int - valor a ser atribuido à idade
    * @author ada
    */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*
    * Método para obter matricula do aluno
    * @return String - Valor da data de nascimento
    * @author ada
    */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /*
    * Método para alterar data de nascimento do aluno
    * @param dataNascimento String - valor a ser atribuido à data de nascimento
    * @author ada
    */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /*
    * Método para obter telefone do aluno
    * @return String - Valor do telefone
    * @author ada
    */
    public String getTelefone() {
        return telefone;
    }

    /*
    * Método para alterar telefone do aluno
    * @param telefone String - valor a ser atribuido ao telefone
    * @author ada
    */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /*
    * Método para obter cpf do aluno
    * @return String - Valor do CPF
    * @author ada
    */
    public String getCpf() {
        return cpf;
    }

    /*
    * Método para alterar cpf do aluno
    * @param cpf String - valor a ser atribuido ao cpf
    * @author ada
    */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /*
    * Sobrescrita do método equals do java.util
    * Implementada a comparação do objeto Aluno
    * @param obj Object - Valor do objeto a ser comparado com o objeto atual
    * @author Philipe
    */
    @Override public boolean equals(Object obj){
        return ((this.nome == null ? ((Aluno) obj).getNome() == null : this.nome.equals(((Aluno) obj).getNome() ))) &&
                (this.cpf == null ? ((Aluno) obj).getCpf() == null : this.cpf.equals(((Aluno) obj).getCpf() )) &&
                (this.dataNascimento == null ? ((Aluno) obj).getDataNascimento() == null : this.dataNascimento.equals(((Aluno) obj).getDataNascimento())) &&
                this.idade == ((Aluno) obj).getIdade() &&
                this.matricula == ((Aluno) obj).getMatricula() &&
                (this.telefone == null ? ((Aluno) obj).getTelefone() == null : this.telefone.equals(((Aluno) obj).getTelefone()));
    }
    
   
    
}
