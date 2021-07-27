public class QuantidadeStrings {

    QuantidadeStrings(String srt[]){
        System.out.println(srt.length);
        System.out.println(srt[srt.length - 1]);
    }

    public static void main(String args[]){
        String a[] = {"34", "34", "34", "32"};
        QuantidadeStrings strin = new QuantidadeStrings(a);
    }
}
