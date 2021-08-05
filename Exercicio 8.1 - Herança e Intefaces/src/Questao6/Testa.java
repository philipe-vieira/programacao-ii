package Questao6;

public class Testa {

    public static void main(String[] args) {
        Bolsista joao = new Bolsista();
        Professor ana = new Professor();

        joao.setNome("Joao");
        joao.setMatricula("123a");
        joao.setDtNasc("01/01/1900");
        joao.setCurso("Computação");
        joao.setNomeProjeto("OLX");
        joao.setOrientador("Ana");

        ana.setNome("Namaria Braga");
        ana.setDtNasc("01/01/1800");
        ana.setDtAdmissao("01/01/1900");
        ana.setSalario(3000.99);
        ana.setRegime("CLT");
        ana.setUnidade("Centro");

        System.out.println("Nome " + joao.getNome()+
                "\nData de nascimento " + joao.getDtNasc()+
                "\nMatricula " + joao.getMatricula()+
                "\nCurso " + joao.getCurso()+
                "\nNome do projeto " +joao.getNomeProjeto()+
                "\nOrientador " + joao.getOrientador());

        System.out.println("\n\n");

        System.out.println("Nome " + ana.getNome()+
                ";\nData de Nascimento " + ana.getDtNasc()+
                ";\nData de admissao " + ana.getDtAdmissao()+
                ";\nRegime " + ana.getRegime()+
                ";\nSalario " + ana.getSalario()+
                ";\nUnidade " + ana.getUnidade());

    }
}
