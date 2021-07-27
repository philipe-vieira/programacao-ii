public class LerArray {
    public int[] arrayA = new int[5], arrayB = new int[5];

    public void preencheArrayB(){
        for(int i = 0; i < 5; i++){
            if ((i%2)==0){
                this.arrayB[i] = this.arrayA[5-i-1] *3;
            }else{
                this.arrayB[i] = this.arrayA[5-i-1];
            }
        }
    }

    public static void main(String args[]){
        LerArray arr1 = new LerArray();

        for (int i = 0; i < 5; i++){
            arr1.arrayA[i] = i + 5;
        }

        arr1.preencheArrayB();

        for (int i = 0; i < 5; i++){
            System.out.println(arr1.arrayB[i]);
        }
    }
}
