public class PontoQ3 implements PrimitivaGrafica{

    private double x, y;
    private int espessura;

    PontoQ3(){
        x=1;
        y=1;
    }

    PontoQ3(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setX(String x) {
        x.replaceAll( "," , "." );
        this.x = Double.parseDouble( x );
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setY(String y) {
        y.replaceAll( "," , "." );
        this.y = Double.parseDouble( y );
    }

    public void desloca(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public String toString(){
        return "("+x+","+y+")";
    }

    public  double area(){
        return x*y;
    }
    public void setEspessura(int e){
        this.espessura = e;
    }
    public String getNome(){
        return "Classe PontoQ3";
    }
}
