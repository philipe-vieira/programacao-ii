public class CalculaPeso {

    static boolean pesoIsIdeal(String sexo, float altura){
        if( sexo == "M" || sexo == "m" ){
            float i = (72.7f*altura)-58;
            if (i >= 71 && i <= 82){
                return true;
            }
        } else if ( sexo == "F" || sexo == "f"){
            float i = (62.1f*altura)-44.7f;
            if (i >= 46 && i <= 54){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(pesoIsIdeal("M", 1.92f));
    }
}
