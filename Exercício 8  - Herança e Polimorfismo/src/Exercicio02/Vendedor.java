package Exercicio02;

public class Vendedor extends Empregado {
    float valorVendas, comissao;

    public float getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario()+(valorVendas*comissao/100);
    }
}
