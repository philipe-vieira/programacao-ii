/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

import Telas.BuscarAluno;
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
                    
                 /*implementando o botão para abrir outra janela, ainda nao funciona
                 //   irei corrigi o mais rapido possível!
                case 2:
                BuscarAluno buscara = new BuscarAluno();
                buscara.setVisible(true);
                
                    break;      Esboço, @danielbricio.*/
                case 6:
                    obterPrimeiroUltimo(aluno);
                    break;
                    
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (mnu.escolha != 0);
        
        if(aluno.size()!=0)
            System.out.println("Ultimo cadastrado -> "+aluno.get(aluno.size()-1).getCpf());
        
        /* criação do Objeto BuscarAluno da Classe Aluno
        Aluno BuscarAluno = new Aluno();
        
        BuscarAluno.getNome();
        BuscarAluno.getMatricula();
        Esboço, @danielbricio. */
        
        
        System.exit(0);
    }
    
}
