public class Validacao {

    static boolean ehNomeValido(String nome){
        if( nome != null && nome != "" && nome != " "){
            String palavras[] = nome.split(" ");
//            System.out.println(palavras.length);
            if (palavras.length == 2){
                boolean ehMaiuscula = true;
                for(int i= 0; i < palavras.length; i++){
//                    System.out.println(palavras[i].toUpperCase().charAt(0));
                    if(palavras[i].charAt(0) != palavras[i].toUpperCase().charAt(0)){
                        ehMaiuscula = false;
                    }
                }
                return ehMaiuscula;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(ehNomeValido("Er Fsd"));
    }

}

