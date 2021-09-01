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
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public static void gerarCsv(ArrayList<Aluno> listAlunos){
        try {
            // Criando e abrindo o arquivo
            Writer writer = Files.newBufferedWriter(Paths.get("ListagemAlunos.csv"));
            StatefulBeanToCsv<Aluno> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            // Escrevendo os dados no arquivo
            beanToCsv.write(listAlunos);
            // Fechando o arquivo
            writer.flush();
            writer.close();
            // Imprimindo mensagem de sucesso;
            JOptionPane.showMessageDialog(null, "CSV gerado com sucesso!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvDataTypeMismatchException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvRequiredFieldEmptyException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                   
                case 2:
                BuscarAluno buscara = new BuscarAluno(null, true);
                buscara.setVisible(true);
                    break;
                    
                case 6:
                    obterPrimeiroUltimo(listAlunos);
                    break;
                case 7:
                    gerarCsv(listAlunos);
                    break;
                    
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (mnu.escolha != 0);
        
        if(listAlunos.isEmpty())
            System.out.println("Ultimo cadastrado -> "+listAlunos.get(listAlunos.size()-1).getCpf());
        
        /* cria��o do Objeto BuscarAluno da Classe Aluno
        Aluno BuscarAluno = new Aluno();
        
        BuscarAluno.getNome();
        BuscarAluno.getMatricula();
        Esbo�o, @danielbricio. */
        
        
        System.exit(0);
    }
    
}
