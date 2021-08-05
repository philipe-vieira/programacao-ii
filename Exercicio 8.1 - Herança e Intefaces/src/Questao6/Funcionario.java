package Questao6;

public class Funcionario extends Membro{
    private String dtAdmissao, unidade;
    private double salario;

    public String getDtAdmissao() {
        return dtAdmissao;
    }
    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

