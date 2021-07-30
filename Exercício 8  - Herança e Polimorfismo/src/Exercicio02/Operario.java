package Exercicio02;

public class Operario extends Empregado {
    float valorProducao, comissao;

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario()+(valorProducao*comissao/100);
    }
}
