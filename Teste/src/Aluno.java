import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Aluno {
    MaskFormatter mascaraData = new MaskFormatter("##/##/####");
    private JTextField matricula;
    private JTextField nome;
    private JTextField idade;
    private JFormattedTextField dataNasc = new JFormattedTextField(mascaraData);
    private JTextField telefone;
    private JTextField cpf;

    public Aluno() throws ParseException {
    }

    public JTextField getMatricula() {
        return matricula;
    }

    public void setMatricula(JTextField matricula) {
        this.matricula = matricula;
    }

    public JTextField getNome() {
        return nome;
    }

    public void setNome(JTextField nome) {
        this.nome = nome;
    }

    public JTextField getIdade() {
        return idade;
    }

    public void setIdade(JTextField idade) {
        this.idade = idade;
    }

    public JFormattedTextField getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(JFormattedTextField dataNasc) {
        this.dataNasc = dataNasc;
    }

    public JTextField getTelefone() {
        return telefone;
    }

    public void setTelefone(JTextField telefone) {
        this.telefone = telefone;
    }

    public JTextField getCpf() {
        return cpf;
    }

    public void setCpf(JTextField cpf) {
        this.cpf = cpf;
    }
}
