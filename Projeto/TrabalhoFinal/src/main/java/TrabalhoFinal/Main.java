/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

import java.util.ArrayList;
import Telas.CadastroAluno;
import Telas.Menu;
import javax.swing.JOptionPane;
/**
 *
 * @author Philipe
 */
public class Main {

    public static void obterPrimeiroUltimo(ArrayList<Aluno> aluno){
        Aluno primeiro = aluno.get(0);
        Aluno ultimo = aluno.get(aluno.size()-1);
        JOptionPane.showInternalMessageDialog(null, 
                "<html>Primeiro -> "+primeiro.getMatricula()+" - "+primeiro.getNome()
                +"<br>Ultimo -> "+ultimo.getMatricula()+" - "+ultimo.getNome()+"</html>"
        );
    }
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Aluno> listAlunos = new ArrayList<Aluno>();
        
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
                    listAlunos = cadastro.getAluno();
                    break;
                case 3:
                    // INSERIR NA TERCEIRA POSI��O
                    // instanciando a tela
                    CadastroAluno cadastroTerceiro = new CadastroAluno(null, true, listAlunos, true);
                    cadastroTerceiro.setVisible(true);
                    // recupera os dados dos alunos cadastrados
                    listAlunos = cadastroTerceiro.getAluno();
                    break;
                case 6:
                    obterPrimeiroUltimo(listAlunos);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (mnu.escolha != 0);
        
        if(listAlunos.size()!=0)
            System.out.println("Ultimo cadastrado -> "+listAlunos.get(listAlunos.size()-1).getCpf());
                
        System.exit(0);
    }
    
}
