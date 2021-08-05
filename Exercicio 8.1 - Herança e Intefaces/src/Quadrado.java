public class Quadrado implements PrimitivaGrafica{
    private Ponto p1 = new Ponto();
    private Ponto p2 = new Ponto(3,3);
    int espessura;

    @Override
    public double area() {
        return (p1.getX()*p1.getY()) + (p2.getX()*p2.getY());
    }

    @Override
    public void setEspessura(int e) {
        this.espessura = e;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }
}
