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
            StatefulBeanToCsv<Aluno> beanToCsv = new StatefulBeanToCsvBuilder(writer).withApplyQuotesToAll(false).build();
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
        
    public static void imprimeTerceiro(ArrayList<Aluno> aluno){
       if(aluno.size() < 3){
           JOptionPane.showMessageDialog(null, "Quantidade cadastrada insuficiente");
           return;
        }
       
        Aluno terceiro = aluno.get(2);
        int quantidade = aluno.size();
        
        String mensagem = "<html>O terceiro aluno é: " + terceiro.getNome() 
                +"<br>Quantidade de elementos da lista: " + quantidade + "</html>";
       
       JOptionPane.showMessageDialog(null, mensagem);
       
   }
    
    public static void obterMaisNovoEMaisVelho(ArrayList<Aluno> aluno){
        Aluno novo = new Aluno();
        Aluno velho = new Aluno();

        for(Aluno i: aluno){
            if(novo.getIdade() == 0 && velho.getIdade() == 0){
                novo = velho = i;
            }else if (i.getIdade() < novo.getIdade()){
                novo = i;
            }else if (i.getIdade() > velho.getIdade()){
                velho = i;
            }
        }

        String msg = "<html>"+novo.getNome()+" é o aluno(a) mais novo(a)"
                     +"<br>"+velho.getNome()+" é o aluno(a) mais velho(a)"+"</html>";
        JOptionPane.showMessageDialog(null, msg);
    }
    
    /**
     * Função para remoção do ultimo elemento da lista de alunos
     * @param alunos ArrayList<Aluno> - Lista de alunos cadastrados
     * @return ArrayList<Aluno>
     * @author Philipe
     */
    public static ArrayList<Aluno> removerUltimo(ArrayList<Aluno> alunos){
        if(alunos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista de alunos vazia!");
            return alunos;
        }
        int ultimo = alunos.size() - 1;
        alunos.remove(ultimo);
        JOptionPane.showMessageDialog(null, "Ultimo Elemento removido com sucesso!");
        return alunos;
    }
    
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Aluno> listAlunos = new ArrayList<Aluno>();
        
        // instanciando a tela de menu
        Menu mnu = new Menu(null, true);
        
        do{
            mnu.setVisible(true);
            
            switch(mnu.escolha){
                case 0:
                    // SAIR
                    break;
                case 1:
                    // instanciando a tela
                    CadastroAluno cadastro = new CadastroAluno(null, true, listAlunos);
                    cadastro.setVisible(true);
                    // recupera os dados dos alunos cadastrados
                    listAlunos = cadastro.getAluno();
                    break;
                   
                case 2:
                    BuscarAluno buscara = new BuscarAluno(null, true);
                    buscara.setVisible(true);
                    break;
                    
                case 3:
                    // INSERIR NA TERCEIRA POSIï¿½ï¿½O
                    // instanciando a tela
                    CadastroAluno cadastroTerceiro = new CadastroAluno(null, true, listAlunos, true);
                    cadastroTerceiro.setVisible(true);
                    // recupera os dados dos alunos cadastrados
                    listAlunos = cadastroTerceiro.getAluno();
                    break;
                    
                case 4:
                    imprimeTerceiro(listAlunos);
                    break;
                case 5:
                    listAlunos = removerUltimo(listAlunos);
                    break;
                case 6:
                    obterPrimeiroUltimo(listAlunos);
                    break;
                case 7:
                    gerarCsv(listAlunos);
                    break;
                case 8:
                    obterMaisNovoEMaisVelho(listAlunos);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (mnu.escolha != 0);
        
        if(!listAlunos.isEmpty())
            System.out.println("Ultimo cadastrado -> "+listAlunos.get(listAlunos.size()-1).getCpf());
        
        System.exit(0);
    }
    
}
