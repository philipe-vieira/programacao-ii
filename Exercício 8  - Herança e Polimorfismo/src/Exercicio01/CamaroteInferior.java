package Exercicio01;
class CamaroteInferior extends VIP{
    String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalização(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao(){
        System.out.println("Localização -> "+localizacao);
    }
}
