package Exercicio02;

public class Administrador extends Empregado{
    private int ajuda;

    public int getAjuda() {
        return ajuda;
    }

    public void setAjuda(int ajuda) {
        this.ajuda = ajuda;
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario()+ajuda;
    }
}
