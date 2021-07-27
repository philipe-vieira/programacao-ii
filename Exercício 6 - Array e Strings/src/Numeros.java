public class Numeros {

    public void verificaMaiorValor(){
        int v1 = 3, v2 = 4, v3 = 5;

        if(v1 >= v2 && v1 >= v3){
            System.out.println("Maior valor é => "+v1);
        } else if (v2 >= v1 && v2 >= v3){
            System.out.println("Maior valor é => "+v2);
        }else if (v3 >= v1 && v3 >= v2){
            System.out.println("Maior valor é => "+v3);
        }

        if(v1 <= v2 && v1 <= v3){
            System.out.println("Menor valor é => "+v1);
        } else if (v2 <= v1 && v2 <= v3){
            System.out.println("Menor valor é => "+v2);
        }else if (v3 <= v1 && v3 <= v2){
            System.out.println("Menor valor é => "+v3);
        }
    }

    public static void main(String args[]){
        Numeros n1 = new Numeros();
        n1.verificaMaiorValor();
    }
}
