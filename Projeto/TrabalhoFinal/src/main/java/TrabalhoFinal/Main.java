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
 * Classe principal do projeto
 * @author Philipe
 */
public class Main {
    /** 
    * Metodo para obter as matrículas do Primeiro e Ultimo alunos da Lista
    * @param alunos ArrayList<Aluno> - Lista de alunos a ser manipulada
    * @author Philipe
    */
    public static void obterPrimeiroUltimo(ArrayList<Aluno> alunos){
        Aluno primeiro = alunos.get(0);
        Aluno ultimo = alunos.get(alunos.size()-1);
        JOptionPane.showInternalMessageDialog(null, 
                "<html>Primeiro -> "+primeiro.getMatricula()+" - "+primeiro.getNome()
                +"<br>Ultimo -> "+ultimo.getMatricula()+" - "+ultimo.getNome()+"</html>"
        );
    }
    
    /** 
    * Metodo para gerar o arquivo csv com os dados dos alunos
    * @param alunos ArrayList<Aluno> - Lista de alunos a ser inseridos no arquivo
    * @author Philipe
    */
    public static void gerarCsv(ArrayList<Aluno> alunos){
        try {
            // Criando e abrindo o arquivo
            Writer writer = Files.newBufferedWriter(Paths.get("ListagemAlunos.csv"));
            StatefulBeanToCsv<Aluno> beanToCsv = new StatefulBeanToCsvBuilder(writer).withApplyQuotesToAll(false).build();
            // Escrevendo os dados no arquivo
            beanToCsv.write(alunos);
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
    * Metodo para imprimir o terceiro aluno cadastrado
    * @param alunos ArrayList<Aluno> - Lista de alunos a ser manipulada
    * @author ada
    */
    public static void imprimeTerceiro(ArrayList<Aluno> alunos){
        if(alunos.size() < 3){
            JOptionPane.showMessageDialog(null, "Quantidade cadastrada insuficiente");
            return;
        }
       
        Aluno terceiro = alunos.get(2);
        int quantidade = alunos.size();
        
        String mensagem = "<html>O terceiro aluno é: " + terceiro.getNome() 
                +"<br>Quantidade de elementos da lista: " + quantidade + "</html>";
       
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    /** 
    * Metodo para gerar obter os dados do aluno mais velho e do mais novo
    * dentre os alunos cadastrados
    * @param alunos ArrayList<Aluno> - Lista de alunos a ser manipulada
    * @author Philipe
    */
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
     * Método para remoção do ultimo elemento da lista de alunos
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
     * Método principal para a execução do programa
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
                    BuscarAluno buscara = new BuscarAluno(null, true, listAlunos);
                    buscara.setVisible(true);
                    break;
                case 3:
                    // INSERIR NA TERCEIRA POSICAO
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
