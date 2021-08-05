public class Ponto {
    private double x, y;

    Ponto(){
        x=1;
        y=1;
    }

    Ponto(double x, double y){
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
        // "3,8" ERROR
        // "3.8" PASS
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
}
