/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

import java.util.ArrayList;
import Telas.CadastroAluno;
import Telas.Menu;
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
        ArrayList<Aluno> aluno = new ArrayList<Aluno>();
        
        // instanciando a tela
        Menu mnu = new Menu(null, true);
        
        do{
            mnu.setVisible(true);
            
            switch(mnu.escolha){
                case 0:
                    // SAIR
                    break;
                case 1:
                    // instanciando a tela
                    CadastroAluno cadastro = new CadastroAluno(null, true);
                    cadastro.setVisible(true);
                    // recupera os dados dos alunos cadastrados
                    aluno = cadastro.getAluno();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (mnu.escolha != 0);
        
        if(aluno.size()!=0)
            System.out.println("Ultimo cadastrado -> "+aluno.get(aluno.size()-1).getCpf());
        
    }
    
}
