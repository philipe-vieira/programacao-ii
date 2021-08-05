public class Circulo implements PrimitivaGrafica{
    private Ponto p = new Ponto();
    private int raio, espessura;

    @Override
    public double area() {
        return 3.14*raio*raio;
    }

    @Override
    public void setEspessura(int e) {
        this.espessura = e;
    }

    @Override
    public String getNome() {
        return "Circulo";
    }
}
