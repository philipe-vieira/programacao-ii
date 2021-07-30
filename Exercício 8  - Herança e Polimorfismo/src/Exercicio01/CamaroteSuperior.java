package Exercicio01;
public class CamaroteSuperior extends VIP{
    float valor_adicional = 20;

    public float getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(float valor_adicional) {
        this.valor_adicional = valor_adicional;
    }

    @Override
    public float getValor() {
        return super.getValor() + valor_adicional;
    }
}
