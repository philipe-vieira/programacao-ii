/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

import java.util.ArrayList;
import Telas.CadastroAluno;
/**
 *
 * @author Philipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<JavaBeanAluno> aluno = new ArrayList<JavaBeanAluno>();

        // instanciando a tela
        CadastroAluno tela = new CadastroAluno(null, true);
        tela.setVisible(true);
        
        // recupera os dados dos alunos cadastrados
        aluno = tela.getAluno();
        
        System.out.println("Ultimo cadastrado -> "+aluno.get(aluno.size()-1).getNome());
    }
    
}
