public class VerificaNumeroPar {
    public int num = 4;

    static boolean numeroPar(int num){
        if((num % 2) == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        int num = 4;
        if(numeroPar(num)){
            System.out.println("O numero " +num+ " é par" );
        }else{
            System.out.println("O numero " +num+ " não é par" );
        }
    }
}
