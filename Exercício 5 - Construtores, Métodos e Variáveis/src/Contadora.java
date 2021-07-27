public class Contadora {

    Contadora(){
        for(int i=0; i<1000; i++){
            System.out.println(i);
        }
    }
    Contadora(int inicial){
        for(int i=inicial; i<1000; i++){
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        Contadora cont = new Contadora();
        System.out.println("--------------------");
        Contadora cont2 = new Contadora(500);

    }
}
