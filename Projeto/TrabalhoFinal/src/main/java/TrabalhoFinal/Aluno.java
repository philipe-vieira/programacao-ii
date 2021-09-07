/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;



/**
 *
 * @author ada
 */
public class Aluno {
   private int matricula;
   private String nome;
   private int idade;
   private String dataNascimento;
   private String telefone;
   private String cpf;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
     @Override public boolean equals(Object obj){
        
        return ((this.nome == null ? ((Aluno) obj).getNome() == null : this.nome.equals(((Aluno) obj).getNome() ))) &&
                (this.cpf == null ? ((Aluno) obj).getCpf() == null : this.cpf.equals(((Aluno) obj).getCpf() )) &&
                (this.dataNascimento == null ? ((Aluno) obj).getDataNascimento() == null : this.dataNascimento.equals(((Aluno) obj).getDataNascimento())) &&
                this.idade == ((Aluno) obj).getIdade() &&
                this.matricula == ((Aluno) obj).getMatricula() &&
                (this.telefone == null ? ((Aluno) obj).getTelefone() == null : this.telefone.equals(((Aluno) obj).getTelefone()));
    }
    
   
    
}
